package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
public final class gd3 {
    public static final k50 h = new k50((byte) 2);
    public static final Random i = new Random();
    public rt6 d;
    public String f;
    public final aqb a = new aqb();
    public final ypb b = new ypb();
    public final HashMap c = new HashMap();
    public bqb e = bqb.a;
    public long g = -1;

    public final void a(fd3 fd3Var) {
        long j = fd3Var.c;
        if (j != -1 && fd3Var.e) {
            this.g = j;
        }
        this.f = null;
    }

    public final synchronized void b(tk tkVar) {
        rt6 rt6Var;
        String str = this.f;
        if (str != null) {
            fd3 fd3Var = (fd3) this.c.get(str);
            fd3Var.getClass();
            a(fd3Var);
        }
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            fd3 fd3Var2 = (fd3) it.next();
            it.remove();
            if (fd3Var2.e && (rt6Var = this.d) != null) {
                rt6Var.p(tkVar, fd3Var2.a);
            }
        }
    }

    public final defpackage.fd3 c(int r19, defpackage.rz6 r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd3.c(int, rz6):fd3");
    }

    public final synchronized String d(bqb bqbVar, rz6 rz6Var) {
        return c(bqbVar.g(rz6Var.a, this.b).c, rz6Var).a;
    }

    public final void e(tk tkVar) {
        rz6 rz6Var;
        bqb bqbVar = tkVar.b;
        int i2 = tkVar.c;
        rz6 rz6Var2 = tkVar.d;
        boolean p = bqbVar.p();
        String str = this.f;
        HashMap hashMap = this.c;
        if (p) {
            if (str != null) {
                fd3 fd3Var = (fd3) hashMap.get(str);
                fd3Var.getClass();
                a(fd3Var);
                return;
            }
            return;
        }
        fd3 fd3Var2 = (fd3) hashMap.get(str);
        this.f = c(i2, rz6Var2).a;
        f(tkVar);
        if (rz6Var2 != null) {
            long j = rz6Var2.d;
            if (rz6Var2.c()) {
                if (fd3Var2 == null || fd3Var2.c != j || (rz6Var = fd3Var2.d) == null || rz6Var.b != rz6Var2.b || rz6Var.c != rz6Var2.c) {
                    c(i2, new rz6(rz6Var2.a, j));
                    this.d.getClass();
                }
            }
        }
    }

    public final synchronized void f(defpackage.tk r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd3.f(tk):void");
    }

    public final synchronized void g(tk tkVar, int i2) {
        boolean z;
        this.d.getClass();
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            fd3 fd3Var = (fd3) it.next();
            if (fd3Var.a(tkVar)) {
                it.remove();
                boolean equals = fd3Var.a.equals(this.f);
                if (equals) {
                    a(fd3Var);
                }
                if (fd3Var.e) {
                    if (z && equals) {
                        boolean z2 = fd3Var.f;
                    }
                    this.d.p(tkVar, fd3Var.a);
                }
            }
        }
        e(tkVar);
    }
}
