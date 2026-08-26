package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeap;

public abstract class EventLoopImplBase extends EventLoopImplPlatform implements Delay {
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile = 0;
    private volatile Object _queue$volatile;
    public static final AtomicReferenceFieldUpdater _queue$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue$volatile");
    public static final AtomicReferenceFieldUpdater _delayed$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed$volatile");
    public static final AtomicIntegerFieldUpdater _isCompleted$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(EventLoopImplBase.class, "_isCompleted$volatile");

    public final class DelayedResumeTask extends DelayedTask {
        public final CancellableContinuationImpl cont;

        public DelayedResumeTask(long j, CancellableContinuationImpl cancellableContinuationImpl) {
            super(j);
            this.cont = cancellableContinuationImpl;
        }

        @Override
        public final void run() {
            this.cont.resumeUndispatched(EventLoopImplBase.this);
        }

        @Override
        public final String toString() {
            return super.toString() + this.cont;
        }
    }

    public final class DelayedRunnableTask extends DelayedTask {
        public final TimeoutCoroutine block;

        public DelayedRunnableTask(long j, TimeoutCoroutine timeoutCoroutine) {
            super(j);
            this.block = timeoutCoroutine;
        }

        @Override
        public final void run() {
            this.block.run();
        }

        @Override
        public final String toString() {
            return super.toString() + this.block;
        }
    }

    public abstract class DelayedTask implements Runnable, Comparable, DisposableHandle {
        private volatile Object _heap;
        public int index = -1;
        public long nanoTime;

        public DelayedTask(long j) {
            this.nanoTime = j;
        }

        @Override
        public final int compareTo(Object obj) {
            long j = this.nanoTime - ((DelayedTask) obj).nanoTime;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        @Override
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    Symbol symbol = JobKt.DISPOSED_TASK;
                    if (obj == symbol) {
                        return;
                    }
                    DelayedTaskQueue delayedTaskQueue = obj instanceof DelayedTaskQueue ? (DelayedTaskQueue) obj : null;
                    if (delayedTaskQueue != null) {
                        delayedTaskQueue.remove(this);
                    }
                    this._heap = symbol;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final ThreadSafeHeap getHeap() {
            Object obj = this._heap;
            if (obj instanceof ThreadSafeHeap) {
                return (ThreadSafeHeap) obj;
            }
            return null;
        }

        public final int scheduleTask(long j, DelayedTaskQueue delayedTaskQueue, EventLoopImplBase eventLoopImplBase) {
            synchronized (this) {
                if (this._heap == JobKt.DISPOSED_TASK) {
                    return 2;
                }
                synchronized (delayedTaskQueue) {
                    try {
                        DelayedTask[] delayedTaskArr = delayedTaskQueue.a;
                        DelayedTask delayedTask = delayedTaskArr != null ? delayedTaskArr[0] : null;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = EventLoopImplBase._queue$volatile$FU;
                        eventLoopImplBase.getClass();
                        if (EventLoopImplBase._isCompleted$volatile$FU.get(eventLoopImplBase) != 0) {
                            return 1;
                        }
                        if (delayedTask == null) {
                            delayedTaskQueue.timeNow = j;
                        } else {
                            long j2 = delayedTask.nanoTime;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            if (j - delayedTaskQueue.timeNow > 0) {
                                delayedTaskQueue.timeNow = j;
                            }
                        }
                        long j3 = this.nanoTime;
                        long j4 = delayedTaskQueue.timeNow;
                        if (j3 - j4 < 0) {
                            this.nanoTime = j4;
                        }
                        delayedTaskQueue.addImpl(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final void setHeap(DelayedTaskQueue delayedTaskQueue) {
            if (this._heap == JobKt.DISPOSED_TASK) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = delayedTaskQueue;
        }

        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }
    }

    public final class DelayedTaskQueue extends ThreadSafeHeap {
        public long timeNow;
    }

    @Override
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        enqueue(runnable);
    }

    public void enqueue(Runnable runnable) {
        if (!enqueueImpl(runnable)) {
            DefaultExecutor.INSTANCE.enqueue(runnable);
            return;
        }
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
            LockSupport.unpark(thread);
        }
    }

    public final boolean enqueueImpl(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$volatile$FU;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (_isCompleted$volatile$FU.get(this) != 0) {
                break;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof LockFreeTaskQueueCore)) {
                if (obj == JobKt.CLOSED_EMPTY) {
                    break;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                lockFreeTaskQueueCore.addLast((Runnable) obj);
                lockFreeTaskQueueCore.addLast(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore2 = (LockFreeTaskQueueCore) obj;
            int iAddLast = lockFreeTaskQueueCore2.addLast(runnable);
            if (iAddLast == 0) {
                return true;
            }
            if (iAddLast == 1) {
                LockFreeTaskQueueCore next = lockFreeTaskQueueCore2.next();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, next) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iAddLast == 2) {
                break;
            }
        }
        return false;
    }

    public DisposableHandle invokeOnTimeout(long j, TimeoutCoroutine timeoutCoroutine, CoroutineContext coroutineContext) {
        return DefaultExecutorKt.DefaultDelay.invokeOnTimeout(j, timeoutCoroutine, coroutineContext);
    }

    public final boolean isEmpty() {
        DelayedTaskQueue delayedTaskQueue;
        ArrayDeque arrayDeque = this.unconfinedQueue;
        if (!(arrayDeque != null ? arrayDeque.isEmpty() : true) || ((delayedTaskQueue = (DelayedTaskQueue) _delayed$volatile$FU.get(this)) != null && ThreadSafeHeap._size$volatile$FU.get(delayedTaskQueue) != 0)) {
            return false;
        }
        Object obj = _queue$volatile$FU.get(this);
        if (obj != null) {
            if (obj instanceof LockFreeTaskQueueCore) {
                long j = LockFreeTaskQueueCore._state$volatile$FU.get((LockFreeTaskQueueCore) obj);
                return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
            }
            if (obj != JobKt.CLOSED_EMPTY) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final long processNextEvent() {
        DelayedTask delayedTaskPeek;
        DelayedTask delayedTaskRemoveAtImpl;
        if (!processUnconfinedEvent()) {
            DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$volatile$FU.get(this);
            Runnable runnable = null;
            if (delayedTaskQueue != null && ThreadSafeHeap._size$volatile$FU.get(delayedTaskQueue) != 0) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (delayedTaskQueue) {
                        try {
                            DelayedTask[] delayedTaskArr = delayedTaskQueue.a;
                            DelayedTask delayedTask = delayedTaskArr != null ? delayedTaskArr[0] : null;
                            if (delayedTask == null) {
                                delayedTaskRemoveAtImpl = null;
                            } else {
                                delayedTaskRemoveAtImpl = ((jNanoTime - delayedTask.nanoTime) > 0L ? 1 : ((jNanoTime - delayedTask.nanoTime) == 0L ? 0 : -1)) >= 0 ? enqueueImpl(delayedTask) : false ? delayedTaskQueue.removeAtImpl(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (delayedTaskRemoveAtImpl != null);
            }
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$volatile$FU;
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (obj instanceof LockFreeTaskQueueCore) {
                    LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
                    Object objRemoveFirstOrNull = lockFreeTaskQueueCore.removeFirstOrNull();
                    if (objRemoveFirstOrNull != LockFreeTaskQueueCore.REMOVE_FROZEN) {
                        runnable = (Runnable) objRemoveFirstOrNull;
                        break;
                    }
                    LockFreeTaskQueueCore next = lockFreeTaskQueueCore.next();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, next) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == JobKt.CLOSED_EMPTY) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            runnable = (Runnable) obj;
                            break loop1;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            ArrayDeque arrayDeque = this.unconfinedQueue;
            if (((arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = _queue$volatile$FU.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof LockFreeTaskQueueCore) {
                        long j = LockFreeTaskQueueCore._state$volatile$FU.get((LockFreeTaskQueueCore) obj2);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                        }
                    } else if (obj2 == JobKt.CLOSED_EMPTY) {
                        return Long.MAX_VALUE;
                    }
                }
                DelayedTaskQueue delayedTaskQueue2 = (DelayedTaskQueue) _delayed$volatile$FU.get(this);
                if (delayedTaskQueue2 != null && (delayedTaskPeek = delayedTaskQueue2.peek()) != null) {
                    long jNanoTime2 = delayedTaskPeek.nanoTime - System.nanoTime();
                    if (jNanoTime2 >= 0) {
                        return jNanoTime2;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public final void schedule(long j, DelayedTask delayedTask) {
        int iScheduleTask;
        Thread thread;
        boolean z = _isCompleted$volatile$FU.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _delayed$volatile$FU;
        if (z) {
            iScheduleTask = 1;
        } else {
            DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) atomicReferenceFieldUpdater.get(this);
            if (delayedTaskQueue == null) {
                DelayedTaskQueue delayedTaskQueue2 = new DelayedTaskQueue();
                delayedTaskQueue2.timeNow = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, delayedTaskQueue2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.checkNotNull(obj);
                delayedTaskQueue = (DelayedTaskQueue) obj;
            }
            iScheduleTask = delayedTask.scheduleTask(j, delayedTaskQueue, this);
        }
        if (iScheduleTask != 0) {
            if (iScheduleTask == 1) {
                reschedule(j, delayedTask);
                return;
            } else {
                if (iScheduleTask != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        DelayedTaskQueue delayedTaskQueue3 = (DelayedTaskQueue) atomicReferenceFieldUpdater.get(this);
        if ((delayedTaskQueue3 != null ? delayedTaskQueue3.peek() : null) != delayedTask || Thread.currentThread() == (thread = getThread())) {
            return;
        }
        LockSupport.unpark(thread);
    }

    @Override
    public final void scheduleResumeAfterDelay(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            DelayedResumeTask delayedResumeTask = new DelayedResumeTask(j2 + jNanoTime, cancellableContinuationImpl);
            schedule(jNanoTime, delayedResumeTask);
            cancellableContinuationImpl.invokeOnCancellationImpl(new DisposeOnCancel(delayedResumeTask, 0));
        }
    }

    @Override
    public void shutdown() {
        DelayedTask delayedTaskRemoveAtImpl;
        ThreadLocalEventLoop.ref.set(null);
        _isCompleted$volatile$FU.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$volatile$FU;
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = JobKt.CLOSED_EMPTY;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, symbol)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof LockFreeTaskQueueCore) {
                ((LockFreeTaskQueueCore) obj).close();
                break;
            } else {
                if (obj == symbol) {
                    break;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                lockFreeTaskQueueCore.addLast((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (processNextEvent() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$volatile$FU.get(this);
            if (delayedTaskQueue == null) {
                return;
            }
            synchronized (delayedTaskQueue) {
                delayedTaskRemoveAtImpl = ThreadSafeHeap._size$volatile$FU.get(delayedTaskQueue) > 0 ? delayedTaskQueue.removeAtImpl(0) : null;
            }
            if (delayedTaskRemoveAtImpl == null) {
                return;
            } else {
                reschedule(jNanoTime, delayedTaskRemoveAtImpl);
            }
        }
    }
}
