package defpackage;

import java.util.concurrent.Executor;
public final class fgf {
    public static final fgf d = new fgf();
    public final Runnable a;
    public final Executor b;
    public fgf c;

    public fgf() {
        this.a = null;
        this.b = null;
    }

    public fgf(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
