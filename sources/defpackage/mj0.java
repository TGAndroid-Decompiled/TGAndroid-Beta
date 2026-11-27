package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
public class mj0 extends nhc {
    public Executor b;
    public rsd c;
    public ij0 d;
    public hj0 e;
    public w40 f;
    public lh2 g;
    public lj0 h;
    public String i;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public rj7 p;
    public rj7 q;
    public rj7 r;
    public rj7 s;
    public rj7 t;
    public rj7 v;
    public rj7 x;
    public rj7 y;
    public byte j = 0;
    public boolean u = true;
    public int w = 0;

    public static void f(rj7 rj7Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            rj7Var.i(obj);
        } else {
            rj7Var.g(obj);
        }
    }

    public final int c() {
        ij0 ij0Var = this.d;
        if (ij0Var != null) {
            return nrd.a(ij0Var, this.e);
        }
        return 0;
    }

    public final void d(int i) {
        rj7 rj7Var = this.x;
        if (rj7Var == null) {
            rj7Var = new rj7();
            this.x = rj7Var;
        }
        f(rj7Var, Integer.valueOf(i));
    }

    public final void e(boolean z) {
        rj7 rj7Var = this.t;
        if (rj7Var == null) {
            rj7Var = new rj7();
            this.t = rj7Var;
        }
        f(rj7Var, Boolean.valueOf(z));
    }
}
