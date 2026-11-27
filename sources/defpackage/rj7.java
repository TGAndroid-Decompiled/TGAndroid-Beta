package defpackage;

import android.os.Looper;
import java.util.Map;
public class rj7 {
    public static final Object k = new Object();
    public final Object a = new Object();
    public final os9 b = new os9();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final zz3 j;

    public rj7() {
        Object obj = k;
        this.f = obj;
        this.j = new zz3(this, (byte) 21);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        yr.a().getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        grb.i(qd4.y("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(r96 r96Var) {
        if (r96Var.b) {
            if (!r96Var.e()) {
                r96Var.a(false);
                return;
            }
            int i = r96Var.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            r96Var.c = i2;
            r96Var.a.S0(this.e);
        }
    }

    public final void c(r96 r96Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (r96Var != null) {
                b(r96Var);
                r96Var = null;
            } else {
                os9 os9Var = this.b;
                ms9 ms9Var = new ms9(os9Var);
                os9Var.c.put(ms9Var, Boolean.FALSE);
                while (ms9Var.hasNext()) {
                    b((r96) ((Map.Entry) ms9Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(i36 i36Var, cr7 cr7Var) {
        Object obj;
        a("observe");
        if (i36Var.m().b != z26.a) {
            q96 q96Var = new q96(this, i36Var, cr7Var);
            os9 os9Var = this.b;
            ls9 h = os9Var.h(cr7Var);
            if (h != null) {
                obj = h.b;
            } else {
                ls9 ls9Var = new ls9(cr7Var, q96Var);
                os9Var.d++;
                ls9 ls9Var2 = os9Var.b;
                if (ls9Var2 == null) {
                    os9Var.a = ls9Var;
                    os9Var.b = ls9Var;
                } else {
                    ls9Var2.c = ls9Var;
                    ls9Var.d = ls9Var2;
                    os9Var.b = ls9Var;
                }
                obj = null;
            }
            r96 r96Var = (r96) obj;
            if (r96Var != null) {
                if (r96Var.d(i36Var)) {
                    return;
                }
                lq5.j("Cannot add the same observer with different lifecycles");
                return;
            }
            i36Var.m().a(q96Var);
        }
    }

    public final void g(Object obj) {
        boolean z;
        synchronized (this.a) {
            if (this.f == k) {
                z = true;
            } else {
                z = false;
            }
            this.f = obj;
        }
        if (!z) {
            return;
        }
        yr.a().b(this.j);
    }

    public void h(cr7 cr7Var) {
        a("removeObserver");
        r96 r96Var = (r96) this.b.i(cr7Var);
        if (r96Var == null) {
            return;
        }
        r96Var.c();
        r96Var.a(false);
    }

    public final void i(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public void e() {
    }

    public void f() {
    }
}
