package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public abstract class ExecutorsKt {
    public static final CoroutineDispatcher from(Executor executor) {
        return new ExecutorCoroutineDispatcherImpl(executor);
    }

    public static final ExecutorCoroutineDispatcher from(ExecutorService executorService) {
        return new ExecutorCoroutineDispatcherImpl(executorService);
    }
}
