package kotlinx.coroutines.tasks;

import java.util.concurrent.Executor;

final class DirectExecutor implements Executor {
    public static final DirectExecutor INSTANCE = new DirectExecutor();

    private DirectExecutor() {
    }

    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
