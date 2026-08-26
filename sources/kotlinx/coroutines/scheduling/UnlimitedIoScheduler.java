package kotlinx.coroutines.scheduling;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

public final class UnlimitedIoScheduler extends CoroutineDispatcher {
    public static final UnlimitedIoScheduler INSTANCE = new UnlimitedIoScheduler();

    @Override
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        DefaultScheduler defaultScheduler = DefaultScheduler.INSTANCE;
        defaultScheduler.coroutineScheduler.dispatch(runnable, TasksKt.BlockingContext);
    }
}
