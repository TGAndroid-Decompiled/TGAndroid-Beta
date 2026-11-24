package defpackage;

import java.util.concurrent.Executor;
public final class k2 {
    public static final k2 d = new k2();
    public final Runnable a;
    public final Executor b;
    public k2 c;

    public k2() {
        this.a = null;
        this.b = null;
    }

    public k2(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
