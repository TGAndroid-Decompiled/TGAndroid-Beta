package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
public class lj0 extends odc {
    public Executor b;
    public aod c;
    public hj0 d;
    public gj0 e;
    public u40 f;
    public tg2 g;
    public kj0 h;
    public String i;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public hh7 p;
    public hh7 q;
    public hh7 r;
    public hh7 s;
    public hh7 t;
    public hh7 v;
    public hh7 x;
    public hh7 y;
    public byte j = 0;
    public boolean u = true;
    public int w = 0;

    public static void f(hh7 hh7Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            hh7Var.i(obj);
        } else {
            hh7Var.g(obj);
        }
    }

    public final int c() {
        hj0 hj0Var = this.d;
        if (hj0Var != null) {
            return wmd.a(hj0Var, this.e);
        }
        return 0;
    }

    public final void d(int i) {
        hh7 hh7Var = this.x;
        if (hh7Var == null) {
            hh7Var = new hh7();
            this.x = hh7Var;
        }
        f(hh7Var, Integer.valueOf(i));
    }

    public final void e(boolean z) {
        hh7 hh7Var = this.t;
        if (hh7Var == null) {
            hh7Var = new hh7();
            this.t = hh7Var;
        }
        f(hh7Var, Boolean.valueOf(z));
    }
}
