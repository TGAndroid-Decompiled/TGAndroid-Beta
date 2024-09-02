package kotlinx.coroutines;

import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

public final class Dispatchers {
    public static final Dispatchers INSTANCE = new Dispatchers();
    private static final CoroutineDispatcher Default = DefaultScheduler.INSTANCE;
    private static final CoroutineDispatcher Unconfined = Unconfined.INSTANCE;
    private static final CoroutineDispatcher IO = DefaultIoScheduler.INSTANCE;

    private Dispatchers() {
    }

    public static final MainCoroutineDispatcher getMain() {
        return MainDispatcherLoader.dispatcher;
    }

    public static final CoroutineDispatcher getIO() {
        return IO;
    }
}
