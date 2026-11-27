package defpackage;

import java.util.concurrent.Executor;
public final class ic implements Executor {
    public final byte a;

    public ic(byte b) {
        this.a = b;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                hl.c3(runnable);
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
