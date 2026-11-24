package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
public class lk0 extends pfc {
    public Executor b;
    public dqd c;
    public hk0 d;
    public gk0 e;
    public u50 f;
    public lx6 g;
    public kk0 h;
    public String i;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public kj7 p;
    public kj7 q;
    public kj7 r;
    public kj7 s;
    public kj7 t;
    public kj7 v;
    public kj7 x;
    public kj7 y;
    public byte j = 0;
    public boolean u = true;
    public int w = 0;

    public static void f(kj7 kj7Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            kj7Var.i(obj);
        } else {
            kj7Var.g(obj);
        }
    }

    public final int c() {
        hk0 hk0Var = this.d;
        if (hk0Var != null) {
            return zod.a(hk0Var, this.e);
        }
        return 0;
    }

    public final void d(int i) {
        kj7 kj7Var = this.x;
        if (kj7Var == null) {
            kj7Var = new kj7();
            this.x = kj7Var;
        }
        f(kj7Var, Integer.valueOf(i));
    }

    public final void e(boolean z) {
        kj7 kj7Var = this.t;
        if (kj7Var == null) {
            kj7Var = new kj7();
            this.t = kj7Var;
        }
        f(kj7Var, Boolean.valueOf(z));
    }
}
