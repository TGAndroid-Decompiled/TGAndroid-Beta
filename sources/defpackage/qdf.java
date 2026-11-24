package defpackage;

import java.util.concurrent.Executor;
public final class qdf {
    public static final qdf d = new qdf();
    public final Runnable a;
    public final Executor b;
    public qdf c;

    public qdf() {
        this.a = null;
        this.b = null;
    }

    public qdf(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
