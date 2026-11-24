package defpackage;

import java.util.concurrent.Executor;
public final class hif {
    public final Executor a;
    public final Runnable b;

    public hif(Runnable runnable, Executor executor) {
        this.a = executor;
        this.b = runnable;
    }
}
