package defpackage;

import java.util.concurrent.Executor;
public final class pbf {
    public static final pbf d = new pbf();
    public final Runnable a;
    public final Executor b;
    public pbf c;

    public pbf() {
        this.a = null;
        this.b = null;
    }

    public pbf(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
