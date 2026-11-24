package defpackage;

import java.util.concurrent.Executor;
public final class old {
    public static final old d = new old();
    public final Runnable a;
    public final Executor b;
    public old c;

    public old() {
        this.a = null;
        this.b = null;
    }

    public old(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
