package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
public final class LimitedDispatcher extends CoroutineDispatcher implements Runnable, Delay {
    private final Delay $$delegate_0;
    private final CoroutineDispatcher dispatcher;
    private final int parallelism;
    private final LockFreeTaskQueue<Runnable> queue;
    private volatile int runningWorkers;
    private final Object workerAllocationLock;

    public LimitedDispatcher(CoroutineDispatcher coroutineDispatcher, int i) {
        this.dispatcher = coroutineDispatcher;
        this.parallelism = i;
        Delay delay = coroutineDispatcher instanceof Delay ? (Delay) coroutineDispatcher : null;
        this.$$delegate_0 = delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
        this.queue = new LockFreeTaskQueue<>(false);
        this.workerAllocationLock = new Object();
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LimitedDispatcher.run():void");
    }

    @Override
    public void mo160dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        if (!addAndTryDispatching(runnable) && tryAllocateWorker()) {
            this.dispatcher.mo160dispatch(this, this);
        }
    }

    private final boolean tryAllocateWorker() {
        synchronized (this.workerAllocationLock) {
            if (this.runningWorkers >= this.parallelism) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    private final boolean addAndTryDispatching(Runnable runnable) {
        this.queue.addLast(runnable);
        return this.runningWorkers >= this.parallelism;
    }
}
