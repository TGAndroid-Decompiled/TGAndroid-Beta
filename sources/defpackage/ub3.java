package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
public final class ub3 {
    public static final k40 h = new k40((byte) 2);
    public static final Random i = new Random();
    public qr6 d;
    public String f;
    public final znb a = new znb();
    public final xnb b = new xnb();
    public final HashMap c = new HashMap();
    public aob e = aob.a;
    public long g = -1;

    public final void a(tb3 tb3Var) {
        long j = tb3Var.c;
        if (j != -1 && tb3Var.e) {
            this.g = j;
        }
        this.f = null;
    }

    public final synchronized void b(tj tjVar) {
        qr6 qr6Var;
        String str = this.f;
        if (str != null) {
            tb3 tb3Var = (tb3) this.c.get(str);
            tb3Var.getClass();
            a(tb3Var);
        }
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            tb3 tb3Var2 = (tb3) it.next();
            it.remove();
            if (tb3Var2.e && (qr6Var = this.d) != null) {
                qr6Var.p(tjVar, tb3Var2.a);
            }
        }
    }

    public final defpackage.tb3 c(int r19, defpackage.rx6 r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub3.c(int, rx6):tb3");
    }

    public final synchronized String d(aob aobVar, rx6 rx6Var) {
        return c(aobVar.g(rx6Var.a, this.b).c, rx6Var).a;
    }

    public final void e(tj tjVar) {
        rx6 rx6Var;
        aob aobVar = tjVar.b;
        int i2 = tjVar.c;
        rx6 rx6Var2 = tjVar.d;
        boolean p = aobVar.p();
        String str = this.f;
        HashMap hashMap = this.c;
        if (p) {
            if (str != null) {
                tb3 tb3Var = (tb3) hashMap.get(str);
                tb3Var.getClass();
                a(tb3Var);
                return;
            }
            return;
        }
        tb3 tb3Var2 = (tb3) hashMap.get(str);
        this.f = c(i2, rx6Var2).a;
        f(tjVar);
        if (rx6Var2 != null) {
            long j = rx6Var2.d;
            if (rx6Var2.c()) {
                if (tb3Var2 == null || tb3Var2.c != j || (rx6Var = tb3Var2.d) == null || rx6Var.b != rx6Var2.b || rx6Var.c != rx6Var2.c) {
                    c(i2, new rx6(rx6Var2.a, j));
                    this.d.getClass();
                }
            }
        }
    }

    public final synchronized void f(defpackage.tj r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub3.f(tj):void");
    }

    public final synchronized void g(tj tjVar, int i2) {
        boolean z;
        this.d.getClass();
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            tb3 tb3Var = (tb3) it.next();
            if (tb3Var.a(tjVar)) {
                it.remove();
                boolean equals = tb3Var.a.equals(this.f);
                if (equals) {
                    a(tb3Var);
                }
                if (tb3Var.e) {
                    if (z && equals) {
                        boolean z2 = tb3Var.f;
                    }
                    this.d.p(tjVar, tb3Var.a);
                }
            }
        }
        e(tjVar);
    }
}
