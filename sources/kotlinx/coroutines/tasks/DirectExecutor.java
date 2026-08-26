package kotlinx.coroutines.tasks;

import java.util.concurrent.Executor;

public final class DirectExecutor implements Executor {
    public static final DirectExecutor INSTANCE = new DirectExecutor();

    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
