package defpackage;

import java.util.concurrent.Executor;
public final class l2 {
    public static final l2 d = new l2();
    public final Runnable a;
    public final Executor b;
    public l2 c;

    public l2() {
        this.a = null;
        this.b = null;
    }

    public l2(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
