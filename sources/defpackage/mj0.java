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
    public qj7 p;
    public qj7 q;
    public qj7 r;
    public qj7 s;
    public qj7 t;
    public qj7 v;
    public qj7 x;
    public qj7 y;
    public byte j = 0;
    public boolean u = true;
    public int w = 0;

    public static void f(qj7 qj7Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            qj7Var.i(obj);
        } else {
            qj7Var.g(obj);
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
        qj7 qj7Var = this.x;
        if (qj7Var == null) {
            qj7Var = new qj7();
            this.x = qj7Var;
        }
        f(qj7Var, Integer.valueOf(i));
    }

    public final void e(boolean z) {
        qj7 qj7Var = this.t;
        if (qj7Var == null) {
            qj7Var = new qj7();
            this.t = qj7Var;
        }
        f(qj7Var, Boolean.valueOf(z));
    }
}
