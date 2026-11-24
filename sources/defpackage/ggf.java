package defpackage;

import java.util.concurrent.Executor;
public final class ggf {
    public final Executor a;
    public final Runnable b;

    public ggf(Runnable runnable, Executor executor) {
        this.a = executor;
        this.b = runnable;
    }
}
