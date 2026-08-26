package kotlinx.coroutines.scheduling;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.dynamite.zzn;
import com.google.common.base.Joiner;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ResizableAtomicArray;

public final class CoroutineScheduler implements Executor, Closeable, AutoCloseable {
    private volatile int _isTerminated$volatile;
    private volatile long controlState$volatile;
    public final int corePoolSize;
    public final GlobalQueue globalBlockingQueue;
    public final GlobalQueue globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    private volatile long parkedWorkersStack$volatile;
    public final String schedulerName;
    public final ResizableAtomicArray workers;
    public static final AtomicLongFieldUpdater parkedWorkersStack$volatile$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");
    public static final AtomicLongFieldUpdater controlState$volatile$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");
    public static final AtomicIntegerFieldUpdater _isTerminated$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");
    public static final Joiner NOT_IN_STACK = new Joiner("NOT_IN_STACK", 2);

    public final class Worker extends Thread {
        public static final AtomicIntegerFieldUpdater workerCtl$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl$volatile");
        private volatile int indexInArray;
        public final WorkQueue localQueue;
        public boolean mayHaveLocalTasks;
        public long minDelayUntilStealableTaskNs;
        private volatile Object nextParkedWorker;
        public int rngState;
        public WorkerState state;
        public final Ref$ObjectRef stolenTask;
        public long terminationDeadline;
        private volatile int workerCtl$volatile;

        public Worker(int i) {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.localQueue = new WorkQueue();
            this.stolenTask = new Ref$ObjectRef();
            this.state = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.NOT_IN_STACK;
            int iNanoTime = (int) System.nanoTime();
            this.rngState = iNanoTime == 0 ? 42 : iNanoTime;
            setIndexInArray(i);
        }

        public final Task findTask(boolean z) {
            Task taskPollGlobalQueues;
            Task taskPollGlobalQueues2;
            CoroutineScheduler coroutineScheduler;
            long j;
            WorkerState workerState = this.state;
            WorkerState workerState2 = WorkerState.CPU_ACQUIRED;
            Task task = null;
            WorkQueue workQueue = this.localQueue;
            CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
            if (workerState != workerState2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.controlState$volatile$FU;
                do {
                    coroutineScheduler = CoroutineScheduler.this;
                    j = atomicLongFieldUpdater.get(coroutineScheduler);
                    if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                        workQueue.getClass();
                        loop1: while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = WorkQueue.lastScheduledTask$volatile$FU;
                            Task task2 = (Task) atomicReferenceFieldUpdater.get(workQueue);
                            if (task2 == null || task2.taskContext.zza != 1) {
                                int i = WorkQueue.consumerIndex$volatile$FU.get(workQueue);
                                int i2 = WorkQueue.producerIndex$volatile$FU.get(workQueue);
                                while (i != i2 && WorkQueue.blockingTasksInBuffer$volatile$FU.get(workQueue) != 0) {
                                    i2--;
                                    Task taskTryExtractFromTheMiddle = workQueue.tryExtractFromTheMiddle(i2, true);
                                    if (taskTryExtractFromTheMiddle != null) {
                                        task = taskTryExtractFromTheMiddle;
                                        break;
                                    }
                                }
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(workQueue, task2, null)) {
                                    task = task2;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(workQueue) == task2);
                        }
                        if (task != null) {
                            return task;
                        }
                        Task task3 = (Task) coroutineScheduler2.globalBlockingQueue.removeFirstOrNull();
                        return task3 == null ? trySteal(1) : task3;
                    }
                } while (!CoroutineScheduler.controlState$volatile$FU.compareAndSet(coroutineScheduler, j, j - 4398046511104L));
                this.state = WorkerState.CPU_ACQUIRED;
            }
            if (z) {
                boolean z2 = nextInt(coroutineScheduler2.corePoolSize * 2) == 0;
                if (z2 && (taskPollGlobalQueues2 = pollGlobalQueues()) != null) {
                    return taskPollGlobalQueues2;
                }
                workQueue.getClass();
                Task taskPollBuffer = (Task) WorkQueue.lastScheduledTask$volatile$FU.getAndSet(workQueue, null);
                if (taskPollBuffer == null) {
                    taskPollBuffer = workQueue.pollBuffer();
                }
                if (taskPollBuffer != null) {
                    return taskPollBuffer;
                }
                if (!z2 && (taskPollGlobalQueues = pollGlobalQueues()) != null) {
                    return taskPollGlobalQueues;
                }
            } else {
                Task taskPollGlobalQueues3 = pollGlobalQueues();
                if (taskPollGlobalQueues3 != null) {
                    return taskPollGlobalQueues3;
                }
            }
            return trySteal(3);
        }

        public final int getIndexInArray() {
            return this.indexInArray;
        }

        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final int nextInt(int i) {
            int i2 = this.rngState;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.rngState = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        public final Task pollGlobalQueues() {
            int iNextInt = nextInt(2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            if (iNextInt == 0) {
                Task task = (Task) coroutineScheduler.globalCpuQueue.removeFirstOrNull();
                return task != null ? task : (Task) coroutineScheduler.globalBlockingQueue.removeFirstOrNull();
            }
            Task task2 = (Task) coroutineScheduler.globalBlockingQueue.removeFirstOrNull();
            return task2 != null ? task2 : (Task) coroutineScheduler.globalCpuQueue.removeFirstOrNull();
        }

        @Override
        public final void run() {
            AtomicLongFieldUpdater atomicLongFieldUpdater;
            long j;
            int i;
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                    coroutineScheduler.getClass();
                    if (CoroutineScheduler._isTerminated$volatile$FU.get(coroutineScheduler) == 0) {
                        WorkerState workerState = this.state;
                        WorkerState workerState2 = WorkerState.TERMINATED;
                        if (workerState == workerState2) {
                            break loop0;
                        }
                        Task taskFindTask = findTask(this.mayHaveLocalTasks);
                        if (taskFindTask == null) {
                            this.mayHaveLocalTasks = false;
                            if (this.minDelayUntilStealableTaskNs == 0) {
                                Object obj = this.nextParkedWorker;
                                Joiner joiner = CoroutineScheduler.NOT_IN_STACK;
                                long j2 = 2097151;
                                if (obj != joiner) {
                                    workerCtl$volatile$FU.set(this, -1);
                                    while (this.nextParkedWorker != CoroutineScheduler.NOT_IN_STACK) {
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = workerCtl$volatile$FU;
                                        if (atomicIntegerFieldUpdater.get(this) != -1) {
                                            break;
                                        }
                                        CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
                                        coroutineScheduler2.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = CoroutineScheduler._isTerminated$volatile$FU;
                                        if (atomicIntegerFieldUpdater2.get(coroutineScheduler2) != 0) {
                                            break;
                                        }
                                        WorkerState workerState3 = this.state;
                                        WorkerState workerState4 = WorkerState.TERMINATED;
                                        if (workerState3 == workerState4) {
                                            break;
                                        }
                                        tryReleaseCpu(WorkerState.PARKING);
                                        Thread.interrupted();
                                        if (this.terminationDeadline == 0) {
                                            this.terminationDeadline = System.nanoTime() + CoroutineScheduler.this.idleWorkerKeepAliveNs;
                                        }
                                        LockSupport.parkNanos(CoroutineScheduler.this.idleWorkerKeepAliveNs);
                                        if (System.nanoTime() - this.terminationDeadline >= 0) {
                                            this.terminationDeadline = 0L;
                                            CoroutineScheduler coroutineScheduler3 = CoroutineScheduler.this;
                                            synchronized (coroutineScheduler3.workers) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater2.get(coroutineScheduler3) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = CoroutineScheduler.controlState$volatile$FU;
                                                        if (((int) (atomicLongFieldUpdater2.get(coroutineScheduler3) & j2)) > coroutineScheduler3.corePoolSize) {
                                                            if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                int i2 = this.indexInArray;
                                                                setIndexInArray(0);
                                                                coroutineScheduler3.parkedWorkersStackTopUpdate(this, i2, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(coroutineScheduler3) & j2);
                                                                if (andDecrement != i2) {
                                                                    Object obj2 = coroutineScheduler3.workers.get(andDecrement);
                                                                    Intrinsics.checkNotNull(obj2);
                                                                    Worker worker = (Worker) obj2;
                                                                    coroutineScheduler3.workers.setSynchronized(i2, worker);
                                                                    worker.setIndexInArray(i2);
                                                                    coroutineScheduler3.parkedWorkersStackTopUpdate(worker, andDecrement, i2);
                                                                }
                                                                coroutineScheduler3.workers.setSynchronized(andDecrement, null);
                                                                this.state = workerState4;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                        }
                                        j2 = j2;
                                    }
                                } else {
                                    CoroutineScheduler coroutineScheduler4 = CoroutineScheduler.this;
                                    coroutineScheduler4.getClass();
                                    if (this.nextParkedWorker == joiner) {
                                        do {
                                            atomicLongFieldUpdater = CoroutineScheduler.parkedWorkersStack$volatile$FU;
                                            j = atomicLongFieldUpdater.get(coroutineScheduler4);
                                            i = this.indexInArray;
                                            this.nextParkedWorker = coroutineScheduler4.workers.get((int) (j & 2097151));
                                        } while (!atomicLongFieldUpdater.compareAndSet(coroutineScheduler4, j, ((2097152 + j) & (-2097152)) | ((long) i)));
                                    }
                                }
                            } else {
                                if (z) {
                                    tryReleaseCpu(WorkerState.PARKING);
                                    Thread.interrupted();
                                    LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                                    this.minDelayUntilStealableTaskNs = 0L;
                                    break;
                                }
                                z = true;
                            }
                        } else {
                            this.minDelayUntilStealableTaskNs = 0L;
                            int i3 = taskFindTask.taskContext.zza;
                            this.terminationDeadline = 0L;
                            if (this.state == WorkerState.PARKING) {
                                this.state = WorkerState.BLOCKING;
                            }
                            CoroutineScheduler coroutineScheduler5 = CoroutineScheduler.this;
                            if (i3 != 0 && tryReleaseCpu(WorkerState.BLOCKING) && !coroutineScheduler5.tryUnpark() && !coroutineScheduler5.tryCreateWorker(CoroutineScheduler.controlState$volatile$FU.get(coroutineScheduler5))) {
                                coroutineScheduler5.tryUnpark();
                            }
                            coroutineScheduler5.getClass();
                            try {
                                taskFindTask.run();
                            } catch (Throwable th2) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                            }
                            if (i3 != 0) {
                                CoroutineScheduler.controlState$volatile$FU.addAndGet(coroutineScheduler5, -2097152L);
                                if (this.state == workerState2) {
                                    break;
                                }
                                this.state = WorkerState.DORMANT;
                                break;
                            }
                            break;
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            tryReleaseCpu(WorkerState.TERMINATED);
        }

        public final void setIndexInArray(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.schedulerName);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void setNextParkedWorker(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean tryReleaseCpu(WorkerState workerState) {
            WorkerState workerState2 = this.state;
            boolean z = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.controlState$volatile$FU.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.state = workerState;
            }
            return z;
        }

        public final Task trySteal(int i) {
            int i2;
            long j;
            Task taskTryExtractFromTheMiddle;
            long j2;
            long j3;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.controlState$volatile$FU;
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            int i3 = (int) (atomicLongFieldUpdater.get(coroutineScheduler) & 2097151);
            Task task = null;
            if (i3 < 2) {
                return null;
            }
            int iNextInt = nextInt(i3);
            int i4 = 0;
            long jMin = Long.MAX_VALUE;
            while (i4 < i3) {
                int i5 = iNextInt + 1;
                if (i5 > i3) {
                    i5 = 1;
                }
                Worker worker = (Worker) coroutineScheduler.workers.get(i5);
                if (worker == null || worker == this) {
                    i2 = i5;
                } else {
                    WorkQueue workQueue = worker.localQueue;
                    if (i != 3) {
                        workQueue.getClass();
                        int i6 = WorkQueue.consumerIndex$volatile$FU.get(workQueue);
                        int i7 = WorkQueue.producerIndex$volatile$FU.get(workQueue);
                        boolean z = i == 1;
                        while (true) {
                            if (i6 != i7) {
                                j = 0;
                                if (!z || WorkQueue.blockingTasksInBuffer$volatile$FU.get(workQueue) != 0) {
                                    int i8 = i6 + 1;
                                    taskTryExtractFromTheMiddle = workQueue.tryExtractFromTheMiddle(i6, z);
                                    if (taskTryExtractFromTheMiddle != null) {
                                        break;
                                    }
                                    i6 = i8;
                                }
                            } else {
                                j = 0;
                            }
                            taskTryExtractFromTheMiddle = task;
                            break;
                        }
                    } else {
                        taskTryExtractFromTheMiddle = workQueue.pollBuffer();
                        j = 0;
                    }
                    Ref$ObjectRef ref$ObjectRef = this.stolenTask;
                    if (taskTryExtractFromTheMiddle == null) {
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = WorkQueue.lastScheduledTask$volatile$FU;
                            Task task2 = (Task) atomicReferenceFieldUpdater.get(workQueue);
                            if (task2 == null) {
                                j2 = -1;
                            } else {
                                j2 = -1;
                                if (((task2.taskContext.zza == 1 ? 1 : 2) & i) != 0) {
                                    TasksKt.schedulerTimeSource.getClass();
                                    i2 = i5;
                                    long jNanoTime = System.nanoTime() - task2.submissionTime;
                                    long j4 = TasksKt.WORK_STEALING_TIME_RESOLUTION_NS;
                                    if (jNanoTime < j4) {
                                        j3 = j4 - jNanoTime;
                                        task = null;
                                        break;
                                    }
                                    do {
                                        task = null;
                                        if (atomicReferenceFieldUpdater.compareAndSet(workQueue, task2, null)) {
                                            ref$ObjectRef.element = task2;
                                            j3 = -1;
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater.get(workQueue) == task2);
                                    i5 = i2;
                                    task = null;
                                }
                            }
                            j3 = -2;
                            i2 = i5;
                            break;
                        }
                    } else {
                        ref$ObjectRef.element = taskTryExtractFromTheMiddle;
                        i2 = i5;
                        j3 = -1;
                        j2 = -1;
                    }
                    if (j3 == j2) {
                        Task task3 = (Task) ref$ObjectRef.element;
                        ref$ObjectRef.element = task;
                        return task3;
                    }
                    if (j3 > j) {
                        jMin = Math.min(jMin, j3);
                    }
                }
                i4++;
                iNextInt = i2;
                task = null;
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.minDelayUntilStealableTaskNs = jMin;
            return null;
        }
    }

    public final class WorkerState {
        public static final WorkerState[] $VALUES;
        public static final WorkerState BLOCKING;
        public static final WorkerState CPU_ACQUIRED;
        public static final WorkerState DORMANT;
        public static final WorkerState PARKING;
        public static final WorkerState TERMINATED;

        static {
            WorkerState workerState = new WorkerState("CPU_ACQUIRED", 0);
            CPU_ACQUIRED = workerState;
            WorkerState workerState2 = new WorkerState("BLOCKING", 1);
            BLOCKING = workerState2;
            WorkerState workerState3 = new WorkerState("PARKING", 2);
            PARKING = workerState3;
            WorkerState workerState4 = new WorkerState("DORMANT", 3);
            DORMANT = workerState4;
            WorkerState workerState5 = new WorkerState("TERMINATED", 4);
            TERMINATED = workerState5;
            WorkerState[] workerStateArr = {workerState, workerState2, workerState3, workerState4, workerState5};
            $VALUES = workerStateArr;
            EnumEntriesKt.enumEntries(workerStateArr);
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) $VALUES.clone();
        }
    }

    public CoroutineScheduler(int i, int i2, long j, String str) {
        this.corePoolSize = i;
        this.maxPoolSize = i2;
        this.idleWorkerKeepAliveNs = j;
        this.schedulerName = str;
        if (i < 1) {
            throw new IllegalArgumentException(Fragment$$ExternalSyntheticOutline0.m(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(Fragment$$ExternalSyntheticOutline0.m(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(Fragment$$ExternalSyntheticOutline0.m(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(RendererCapabilities.CC.m(j, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.globalCpuQueue = new GlobalQueue();
        this.globalBlockingQueue = new GlobalQueue();
        this.workers = new ResizableAtomicArray((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    @Override
    public final void close() throws InterruptedException {
        int i;
        Task taskFindTask;
        if (_isTerminated$volatile$FU.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            Worker worker = threadCurrentThread instanceof Worker ? (Worker) threadCurrentThread : null;
            if (worker == null || !Intrinsics.areEqual(CoroutineScheduler.this, this)) {
                worker = null;
            }
            synchronized (this.workers) {
                i = (int) (controlState$volatile$FU.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object obj = this.workers.get(i2);
                    Intrinsics.checkNotNull(obj);
                    Worker worker2 = (Worker) obj;
                    if (worker2 != worker) {
                        while (worker2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(worker2);
                            worker2.join(10000L);
                        }
                        WorkQueue workQueue = worker2.localQueue;
                        GlobalQueue globalQueue = this.globalBlockingQueue;
                        workQueue.getClass();
                        Task task = (Task) WorkQueue.lastScheduledTask$volatile$FU.getAndSet(workQueue, null);
                        if (task != null) {
                            globalQueue.addLast(task);
                        }
                        while (true) {
                            Task taskPollBuffer = workQueue.pollBuffer();
                            if (taskPollBuffer == null) {
                                break;
                            } else {
                                globalQueue.addLast(taskPollBuffer);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.globalBlockingQueue.close();
            this.globalCpuQueue.close();
            while (true) {
                if (worker != null) {
                    taskFindTask = worker.findTask(true);
                    if (taskFindTask == null) {
                        taskFindTask = (Task) this.globalCpuQueue.removeFirstOrNull();
                        if (taskFindTask == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    taskFindTask = (Task) this.globalCpuQueue.removeFirstOrNull();
                    if (taskFindTask == null && (taskFindTask = (Task) this.globalBlockingQueue.removeFirstOrNull()) == null) {
                        break;
                    }
                }
                try {
                    taskFindTask.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (worker != null) {
                worker.tryReleaseCpu(WorkerState.TERMINATED);
            }
            parkedWorkersStack$volatile$FU.set(this, 0L);
            controlState$volatile$FU.set(this, 0L);
        }
    }

    public final int createNewWorker() {
        synchronized (this.workers) {
            try {
                if (_isTerminated$volatile$FU.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = controlState$volatile$FU;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.corePoolSize) {
                    return 0;
                }
                if (i >= this.maxPoolSize) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.workers.get(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Worker worker = new Worker(i3);
                this.workers.setSynchronized(i3, worker);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                worker.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void dispatch(Runnable runnable, zzn zznVar) {
        Task taskImpl;
        WorkerState workerState;
        AtomicReferenceArray atomicReferenceArray;
        TasksKt.schedulerTimeSource.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof Task) {
            taskImpl = (Task) runnable;
            taskImpl.submissionTime = jNanoTime;
            taskImpl.taskContext = zznVar;
        } else {
            taskImpl = new TaskImpl(runnable, jNanoTime, zznVar);
        }
        boolean z = taskImpl.taskContext.zza == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = controlState$volatile$FU;
        long jAddAndGet = z ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        Worker worker = threadCurrentThread instanceof Worker ? (Worker) threadCurrentThread : null;
        if (worker == null || !Intrinsics.areEqual(CoroutineScheduler.this, this)) {
            worker = null;
        }
        if (worker != null && (workerState = worker.state) != WorkerState.TERMINATED && (taskImpl.taskContext.zza != 0 || workerState != WorkerState.BLOCKING)) {
            worker.mayHaveLocalTasks = true;
            WorkQueue workQueue = worker.localQueue;
            workQueue.getClass();
            taskImpl = (Task) WorkQueue.lastScheduledTask$volatile$FU.getAndSet(workQueue, taskImpl);
            if (taskImpl == null) {
                taskImpl = null;
            } else {
                workQueue.getClass();
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = WorkQueue.producerIndex$volatile$FU;
                if (atomicIntegerFieldUpdater.get(workQueue) - WorkQueue.consumerIndex$volatile$FU.get(workQueue) != 127) {
                    if (taskImpl.taskContext.zza == 1) {
                        WorkQueue.blockingTasksInBuffer$volatile$FU.incrementAndGet(workQueue);
                    }
                    int i = atomicIntegerFieldUpdater.get(workQueue) & 127;
                    while (true) {
                        atomicReferenceArray = workQueue.buffer;
                        if (atomicReferenceArray.get(i) == null) {
                            break;
                        } else {
                            Thread.yield();
                        }
                    }
                    atomicReferenceArray.lazySet(i, taskImpl);
                    atomicIntegerFieldUpdater.incrementAndGet(workQueue);
                    taskImpl = null;
                }
            }
        }
        if (taskImpl != null) {
            if (!(taskImpl.taskContext.zza == 1 ? this.globalBlockingQueue.addLast(taskImpl) : this.globalCpuQueue.addLast(taskImpl))) {
                throw new RejectedExecutionException(Fragment$$ExternalSyntheticOutline0.m(new StringBuilder(), this.schedulerName, " was terminated"));
            }
        }
        if (z) {
            if (tryUnpark() || tryCreateWorker(jAddAndGet)) {
                return;
            }
            tryUnpark();
            return;
        }
        if (tryUnpark() || tryCreateWorker(atomicLongFieldUpdater.get(this))) {
            return;
        }
        tryUnpark();
    }

    @Override
    public final void execute(Runnable runnable) {
        dispatch(runnable, TasksKt.NonBlockingContext);
    }

    public final void parkedWorkersStackTopUpdate(Worker worker, int i, int i2) {
        while (true) {
            long j = parkedWorkersStack$volatile$FU.get(this);
            int indexInArray = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (indexInArray == i) {
                if (i2 == 0) {
                    Object nextParkedWorker = worker.getNextParkedWorker();
                    while (true) {
                        if (nextParkedWorker == NOT_IN_STACK) {
                            indexInArray = -1;
                            break;
                        }
                        if (nextParkedWorker == null) {
                            indexInArray = 0;
                            break;
                        }
                        Worker worker2 = (Worker) nextParkedWorker;
                        indexInArray = worker2.getIndexInArray();
                        if (indexInArray != 0) {
                            break;
                        } else {
                            nextParkedWorker = worker2.getNextParkedWorker();
                        }
                    }
                } else {
                    indexInArray = i2;
                }
            }
            if (indexInArray >= 0) {
                if (parkedWorkersStack$volatile$FU.compareAndSet(this, j, j2 | ((long) indexInArray))) {
                    return;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResizableAtomicArray resizableAtomicArray = this.workers;
        int iCurrentLength = resizableAtomicArray.currentLength();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iCurrentLength; i6++) {
            Worker worker = (Worker) resizableAtomicArray.get(i6);
            if (worker != null) {
                WorkQueue workQueue = worker.localQueue;
                workQueue.getClass();
                int i7 = WorkQueue.lastScheduledTask$volatile$FU.get(workQueue) != null ? (WorkQueue.producerIndex$volatile$FU.get(workQueue) - WorkQueue.consumerIndex$volatile$FU.get(workQueue)) + 1 : WorkQueue.producerIndex$volatile$FU.get(workQueue) - WorkQueue.consumerIndex$volatile$FU.get(workQueue);
                int iOrdinal = worker.state.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iOrdinal == 4) {
                    i5++;
                }
            }
        }
        long j = controlState$volatile$FU.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.schedulerName);
        sb4.append('@');
        sb4.append(JobKt.getHexAddress(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.corePoolSize;
        sb4.append(i8);
        sb4.append(", max = ");
        Fragment$$ExternalSyntheticOutline0.m(sb4, this.maxPoolSize, "}, Worker States {CPU = ", i, ", blocking = ");
        Fragment$$ExternalSyntheticOutline0.m(sb4, i2, ", parked = ", i3, ", dormant = ");
        Fragment$$ExternalSyntheticOutline0.m(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.globalCpuQueue.getSize());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.globalBlockingQueue.getSize());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean tryCreateWorker(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.corePoolSize;
        if (i < i2) {
            int iCreateNewWorker = createNewWorker();
            if (iCreateNewWorker == 1 && i2 > 1) {
                createNewWorker();
            }
            if (iCreateNewWorker > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean tryUnpark() {
        Joiner joiner;
        int indexInArray;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$volatile$FU;
            long j = atomicLongFieldUpdater.get(this);
            Worker worker = (Worker) this.workers.get((int) (2097151 & j));
            if (worker == null) {
                worker = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object nextParkedWorker = worker.getNextParkedWorker();
                while (true) {
                    joiner = NOT_IN_STACK;
                    if (nextParkedWorker == joiner) {
                        indexInArray = -1;
                        break;
                    }
                    if (nextParkedWorker == null) {
                        indexInArray = 0;
                        break;
                    }
                    Worker worker2 = (Worker) nextParkedWorker;
                    indexInArray = worker2.getIndexInArray();
                    if (indexInArray != 0) {
                        break;
                    }
                    nextParkedWorker = worker2.getNextParkedWorker();
                }
                if (indexInArray >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j2 | ((long) indexInArray))) {
                    worker.setNextParkedWorker(joiner);
                }
            }
            if (worker == null) {
                return false;
            }
            if (Worker.workerCtl$volatile$FU.compareAndSet(worker, -1, 0)) {
                LockSupport.unpark(worker);
                return true;
            }
        }
    }
}
