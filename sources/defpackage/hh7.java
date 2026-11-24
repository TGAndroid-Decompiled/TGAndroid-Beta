package defpackage;

import android.os.Looper;
import java.util.Map;
public class hh7 {
    public static final Object k = new Object();
    public final Object a = new Object();
    public final wo9 b = new wo9();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final ez3 j;

    public hh7() {
        Object obj = k;
        this.f = obj;
        this.j = new ez3(this, (byte) 21);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        xr.a().getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        sc8.j(tb4.y("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(n76 n76Var) {
        if (n76Var.b) {
            if (!n76Var.e()) {
                n76Var.a(false);
                return;
            }
            int i = n76Var.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            n76Var.c = i2;
            n76Var.a.D2(this.e);
        }
    }

    public final void c(n76 n76Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (n76Var != null) {
                b(n76Var);
                n76Var = null;
            } else {
                wo9 wo9Var = this.b;
                uo9 uo9Var = new uo9(wo9Var);
                wo9Var.c.put(uo9Var, Boolean.FALSE);
                while (uo9Var.hasNext()) {
                    b((n76) ((Map.Entry) uo9Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(e16 e16Var, co7 co7Var) {
        Object obj;
        a("observe");
        if (e16Var.m().b != v06.a) {
            m76 m76Var = new m76(this, e16Var, co7Var);
            wo9 wo9Var = this.b;
            to9 h = wo9Var.h(co7Var);
            if (h != null) {
                obj = h.b;
            } else {
                to9 to9Var = new to9(co7Var, m76Var);
                wo9Var.d++;
                to9 to9Var2 = wo9Var.b;
                if (to9Var2 == null) {
                    wo9Var.a = to9Var;
                    wo9Var.b = to9Var;
                } else {
                    to9Var2.c = to9Var;
                    to9Var.d = to9Var2;
                    wo9Var.b = to9Var;
                }
                obj = null;
            }
            n76 n76Var = (n76) obj;
            if (n76Var != null) {
                if (n76Var.d(e16Var)) {
                    return;
                }
                w26.j("Cannot add the same observer with different lifecycles");
                return;
            }
            e16Var.m().a(m76Var);
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
        xr.a().b(this.j);
    }

    public void h(co7 co7Var) {
        a("removeObserver");
        n76 n76Var = (n76) this.b.i(co7Var);
        if (n76Var == null) {
            return;
        }
        n76Var.c();
        n76Var.a(false);
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
