package kotlinx.coroutines.internal;

import com.google.android.gms.wearable.zzy;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.TimeoutCoroutine;
import kotlinx.coroutines.scheduling.UnlimitedIoScheduler;

public final class LimitedDispatcher extends CoroutineDispatcher implements Delay {
    public static final AtomicIntegerFieldUpdater runningWorkers$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(LimitedDispatcher.class, "runningWorkers$volatile");
    public final Delay $$delegate_0;
    public final UnlimitedIoScheduler dispatcher;
    public final int parallelism;
    public final LockFreeTaskQueue queue;
    private volatile int runningWorkers$volatile;
    public final Object workerAllocationLock;

    public LimitedDispatcher(UnlimitedIoScheduler unlimitedIoScheduler, int i) {
        this.dispatcher = unlimitedIoScheduler;
        this.parallelism = i;
        Delay delay = unlimitedIoScheduler instanceof Delay ? (Delay) unlimitedIoScheduler : null;
        this.$$delegate_0 = delay == null ? DefaultExecutorKt.DefaultDelay : delay;
        this.queue = new LockFreeTaskQueue();
        this.workerAllocationLock = new Object();
    }

    @Override
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        this.queue.addLast(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = runningWorkers$volatile$FU;
        if (atomicIntegerFieldUpdater.get(this) < this.parallelism) {
            synchronized (this.workerAllocationLock) {
                if (atomicIntegerFieldUpdater.get(this) >= this.parallelism) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker();
                if (runnableObtainTaskOrDeallocateWorker == null) {
                    return;
                }
                this.dispatcher.dispatch(this, new zzy(9, this, runnableObtainTaskOrDeallocateWorker));
            }
        }
    }

    @Override
    public final DisposableHandle invokeOnTimeout(long j, TimeoutCoroutine timeoutCoroutine, CoroutineContext coroutineContext) {
        return this.$$delegate_0.invokeOnTimeout(j, timeoutCoroutine, coroutineContext);
    }

    public final Runnable obtainTaskOrDeallocateWorker() {
        while (true) {
            Runnable runnable = (Runnable) this.queue.removeFirstOrNull();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.workerAllocationLock) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = runningWorkers$volatile$FU;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.queue.getSize() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override
    public final void scheduleResumeAfterDelay(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        this.$$delegate_0.scheduleResumeAfterDelay(j, cancellableContinuationImpl);
    }
}
