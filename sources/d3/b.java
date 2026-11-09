package d3;

import java.util.concurrent.Executor;
public final class b implements Executor {
    public final int f7962a;

    public b(int i7) {
        this.f7962a = i7;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f7962a) {
            case 0:
                return;
            case 1:
                org.telegram.messenger.g0.h3(runnable);
                return;
            case 2:
                org.telegram.messenger.g0.h3(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }

    private final void a(Runnable runnable) {
    }
}
