package d3;

import java.util.concurrent.Executor;
public final class b implements Executor {
    public final int f7661a;

    public b(int i7) {
        this.f7661a = i7;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f7661a) {
            case 0:
                return;
            case 1:
                org.telegram.messenger.g0.g3(runnable);
                return;
            case 2:
                org.telegram.messenger.g0.g3(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }

    private final void a(Runnable runnable) {
    }
}
