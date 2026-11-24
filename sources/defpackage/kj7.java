package defpackage;

import android.os.Looper;
import java.util.Map;
public class kj7 {
    public static final Object k = new Object();
    public final Object a = new Object();
    public final xq9 b = new xq9();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final o04 j;

    public kj7() {
        Object obj = k;
        this.f = obj;
        this.j = new o04(this, (byte) 21);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        xs.a().getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        dq9.m(kt6.o("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(n96 n96Var) {
        if (n96Var.b) {
            if (!n96Var.e()) {
                n96Var.a(false);
                return;
            }
            int i = n96Var.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            n96Var.c = i2;
            n96Var.a.j1(this.e);
        }
    }

    public final void c(n96 n96Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (n96Var != null) {
                b(n96Var);
                n96Var = null;
            } else {
                xq9 xq9Var = this.b;
                vq9 vq9Var = new vq9(xq9Var);
                xq9Var.c.put(vq9Var, Boolean.FALSE);
                while (vq9Var.hasNext()) {
                    b((n96) ((Map.Entry) vq9Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(e36 e36Var, fq7 fq7Var) {
        Object obj;
        a("observe");
        if (e36Var.m().b != v26.a) {
            m96 m96Var = new m96(this, e36Var, fq7Var);
            xq9 xq9Var = this.b;
            uq9 h = xq9Var.h(fq7Var);
            if (h != null) {
                obj = h.b;
            } else {
                uq9 uq9Var = new uq9(fq7Var, m96Var);
                xq9Var.d++;
                uq9 uq9Var2 = xq9Var.b;
                if (uq9Var2 == null) {
                    xq9Var.a = uq9Var;
                    xq9Var.b = uq9Var;
                } else {
                    uq9Var2.c = uq9Var;
                    uq9Var.d = uq9Var2;
                    xq9Var.b = uq9Var;
                }
                obj = null;
            }
            n96 n96Var = (n96) obj;
            if (n96Var != null) {
                if (n96Var.d(e36Var)) {
                    return;
                }
                u36.j("Cannot add the same observer with different lifecycles");
                return;
            }
            e36Var.m().a(m96Var);
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
        xs.a().b(this.j);
    }

    public void h(fq7 fq7Var) {
        a("removeObserver");
        n96 n96Var = (n96) this.b.i(fq7Var);
        if (n96Var == null) {
            return;
        }
        n96Var.c();
        n96Var.a(false);
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
