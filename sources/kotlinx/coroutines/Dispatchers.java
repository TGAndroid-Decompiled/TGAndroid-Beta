package kotlinx.coroutines;

import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
public final class Dispatchers {
    private static final CoroutineDispatcher IO;

    private Dispatchers() {
    }

    static {
        new Dispatchers();
        DefaultScheduler defaultScheduler = DefaultScheduler.INSTANCE;
        Unconfined unconfined = Unconfined.INSTANCE;
        IO = DefaultIoScheduler.INSTANCE;
    }

    public static final MainCoroutineDispatcher getMain() {
        return MainDispatcherLoader.dispatcher;
    }

    public static final CoroutineDispatcher getIO() {
        return IO;
    }
}
