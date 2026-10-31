package a3;

import java.util.concurrent.Executor;
public final class b implements Executor {
    public final int f68a;

    public b(int i10) {
        this.f68a = i10;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f68a) {
            case 0:
                return;
            case 1:
                org.telegram.messenger.i0.g3(runnable);
                return;
            case 2:
                org.telegram.messenger.i0.g3(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }

    private final void a(Runnable runnable) {
    }
}
