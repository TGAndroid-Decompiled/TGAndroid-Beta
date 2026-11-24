package defpackage;

import java.util.concurrent.Executor;
public final class gce {
    public static final gce d = new gce(null, null);
    public final Runnable a;
    public final Executor b;
    public gce c;

    public gce(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
