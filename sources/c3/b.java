package c3;

import java.util.concurrent.Executor;
public final class b implements Executor {
    public final int f3986a;

    public b(int i3) {
        this.f3986a = i3;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f3986a) {
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
