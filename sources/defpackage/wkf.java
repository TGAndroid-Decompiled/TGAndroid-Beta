package defpackage;

import java.util.concurrent.Executor;
public final class wkf {
    public final Executor a;
    public final Runnable b;

    public wkf(Runnable runnable, Executor executor) {
        this.a = executor;
        this.b = runnable;
    }
}
