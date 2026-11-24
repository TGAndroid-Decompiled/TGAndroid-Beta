package defpackage;

import java.util.concurrent.Executor;
public final class mjd {
    public static final mjd d = new mjd();
    public final Runnable a;
    public final Executor b;
    public mjd c;

    public mjd() {
        this.a = null;
        this.b = null;
    }

    public mjd(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
