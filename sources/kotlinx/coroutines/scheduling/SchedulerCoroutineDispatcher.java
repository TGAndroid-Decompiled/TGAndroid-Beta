package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

public abstract class SchedulerCoroutineDispatcher extends ExecutorCoroutineDispatcher {
    public CoroutineScheduler coroutineScheduler;

    @Override
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler coroutineScheduler = this.coroutineScheduler;
        AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.parkedWorkersStack$volatile$FU;
        coroutineScheduler.dispatch(runnable, TasksKt.NonBlockingContext);
    }
}
