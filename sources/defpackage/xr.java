package defpackage;

import android.os.Looper;
public final class xr extends bve {
    public static volatile xr b;
    public final ec3 a = new ec3();

    public static xr a() {
        if (b != null) {
            return b;
        }
        synchronized (xr.class) {
            if (b == null) {
                b = new xr();
            }
        }
        return b;
    }

    public final void b(Runnable runnable) {
        ec3 ec3Var = this.a;
        if (ec3Var.c == null) {
            synchronized (ec3Var.a) {
                if (ec3Var.c == null) {
                    ec3Var.c = ec3.a(Looper.getMainLooper());
                }
            }
        }
        ec3Var.c.post(runnable);
    }
}
