package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DebugKt;
public final class WorkQueue {
    private static final AtomicReferenceFieldUpdater lastScheduledTask$FU = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask");
    private static final AtomicIntegerFieldUpdater producerIndex$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex");
    private static final AtomicIntegerFieldUpdater consumerIndex$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex");
    private static final AtomicIntegerFieldUpdater blockingTasksInBuffer$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer");
    private final AtomicReferenceArray<Task> buffer = new AtomicReferenceArray<>(128);
    private volatile Object lastScheduledTask = null;
    private volatile int producerIndex = 0;
    private volatile int consumerIndex = 0;
    private volatile int blockingTasksInBuffer = 0;

    public final int getBufferSize$kotlinx_coroutines_core() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int getSize$kotlinx_coroutines_core() {
        return this.lastScheduledTask != null ? getBufferSize$kotlinx_coroutines_core() + 1 : getBufferSize$kotlinx_coroutines_core();
    }

    public final Task poll() {
        Task task = (Task) lastScheduledTask$FU.getAndSet(this, null);
        return task == null ? pollBuffer() : task;
    }

    public static Task add$default(WorkQueue workQueue, Task task, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return workQueue.add(task, z);
    }

    public final Task add(Task task, boolean z) {
        if (z) {
            return addLast(task);
        }
        Task task2 = (Task) lastScheduledTask$FU.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return addLast(task2);
    }

    private final Task addLast(Task task) {
        if (task.taskContext.getTaskMode() == 1) {
            blockingTasksInBuffer$FU.incrementAndGet(this);
        }
        if (getBufferSize$kotlinx_coroutines_core() == 127) {
            return task;
        }
        int i = this.producerIndex & 127;
        while (this.buffer.get(i) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i, task);
        producerIndex$FU.incrementAndGet(this);
        return null;
    }

    private final void decrementIfBlocking(Task task) {
        if (task != null) {
            if (task.taskContext.getTaskMode() == 1) {
                int decrementAndGet = blockingTasksInBuffer$FU.decrementAndGet(this);
                if (DebugKt.getASSERTIONS_ENABLED()) {
                    if (!(decrementAndGet >= 0)) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    public final long tryStealFrom(WorkQueue workQueue) {
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(getBufferSize$kotlinx_coroutines_core() == 0)) {
                throw new AssertionError();
            }
        }
        Task pollBuffer = workQueue.pollBuffer();
        if (pollBuffer != null) {
            Task add$default = add$default(this, pollBuffer, false, 2, null);
            if (DebugKt.getASSERTIONS_ENABLED()) {
                if (add$default == null) {
                    return -1L;
                }
                throw new AssertionError();
            }
            return -1L;
        }
        return tryStealLastScheduled(workQueue, false);
    }

    public final long tryStealBlockingFrom(WorkQueue workQueue) {
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(getBufferSize$kotlinx_coroutines_core() == 0)) {
                throw new AssertionError();
            }
        }
        int i = workQueue.producerIndex;
        AtomicReferenceArray<Task> atomicReferenceArray = workQueue.buffer;
        for (int i2 = workQueue.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (workQueue.blockingTasksInBuffer == 0) {
                break;
            }
            Task task = atomicReferenceArray.get(i3);
            if (task != null) {
                if ((task.taskContext.getTaskMode() == 1) && atomicReferenceArray.compareAndSet(i3, task, null)) {
                    blockingTasksInBuffer$FU.decrementAndGet(workQueue);
                    add$default(this, task, false, 2, null);
                    return -1L;
                }
            }
        }
        return tryStealLastScheduled(workQueue, true);
    }

    public final void offloadAllWorkTo(GlobalQueue globalQueue) {
        Task task = (Task) lastScheduledTask$FU.getAndSet(this, null);
        if (task != null) {
            globalQueue.addLast(task);
        }
        do {
        } while (pollTo(globalQueue));
    }

    private final long tryStealLastScheduled(WorkQueue workQueue, boolean z) {
        Task task;
        do {
            task = (Task) workQueue.lastScheduledTask;
            if (task == null) {
                return -2L;
            }
            if (z) {
                if (!(task.taskContext.getTaskMode() == 1)) {
                    return -2L;
                }
            }
            long nanoTime = TasksKt.schedulerTimeSource.nanoTime() - task.submissionTime;
            long j = TasksKt.WORK_STEALING_TIME_RESOLUTION_NS;
            if (nanoTime < j) {
                return j - nanoTime;
            }
        } while (!lastScheduledTask$FU.compareAndSet(workQueue, task, null));
        add$default(this, task, false, 2, null);
        return -1L;
    }

    private final boolean pollTo(GlobalQueue globalQueue) {
        Task pollBuffer = pollBuffer();
        if (pollBuffer == null) {
            return false;
        }
        globalQueue.addLast(pollBuffer);
        return true;
    }

    private final Task pollBuffer() {
        Task andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (consumerIndex$FU.compareAndSet(this, i, i + 1) && (andSet = this.buffer.getAndSet(i2, null)) != null) {
                decrementIfBlocking(andSet);
                return andSet;
            }
        }
    }
}
