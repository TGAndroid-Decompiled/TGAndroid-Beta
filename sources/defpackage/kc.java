package defpackage;

import java.util.concurrent.Executor;
public final class kc implements Executor {
    public final byte a;

    public kc(byte b) {
        this.a = b;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                gm.c3(runnable);
                return;
            case 1:
                runnable.run();
                return;
            default:
                return;
        }
    }

    private final void a(Runnable runnable) {
    }
}
