package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
public final class nc3 {
    public static final m40 h = new m40((byte) 2);
    public static final Random i = new Random();
    public vt6 d;
    public String f;
    public final zrb a = new zrb();
    public final xrb b = new xrb();
    public final HashMap c = new HashMap();
    public asb e = asb.a;
    public long g = -1;

    public final void a(mc3 mc3Var) {
        long j = mc3Var.c;
        if (j != -1 && mc3Var.e) {
            this.g = j;
        }
        this.f = null;
    }

    public final synchronized void b(uj ujVar) {
        vt6 vt6Var;
        String str = this.f;
        if (str != null) {
            mc3 mc3Var = (mc3) this.c.get(str);
            mc3Var.getClass();
            a(mc3Var);
        }
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            mc3 mc3Var2 = (mc3) it.next();
            it.remove();
            if (mc3Var2.e && (vt6Var = this.d) != null) {
                vt6Var.p(ujVar, mc3Var2.a);
            }
        }
    }

    public final defpackage.mc3 c(int r19, defpackage.vz6 r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc3.c(int, vz6):mc3");
    }

    public final synchronized String d(asb asbVar, vz6 vz6Var) {
        return c(asbVar.g(vz6Var.a, this.b).c, vz6Var).a;
    }

    public final void e(uj ujVar) {
        vz6 vz6Var;
        asb asbVar = ujVar.b;
        int i2 = ujVar.c;
        vz6 vz6Var2 = ujVar.d;
        boolean p = asbVar.p();
        String str = this.f;
        HashMap hashMap = this.c;
        if (p) {
            if (str != null) {
                mc3 mc3Var = (mc3) hashMap.get(str);
                mc3Var.getClass();
                a(mc3Var);
                return;
            }
            return;
        }
        mc3 mc3Var2 = (mc3) hashMap.get(str);
        this.f = c(i2, vz6Var2).a;
        f(ujVar);
        if (vz6Var2 != null) {
            long j = vz6Var2.d;
            if (vz6Var2.c()) {
                if (mc3Var2 == null || mc3Var2.c != j || (vz6Var = mc3Var2.d) == null || vz6Var.b != vz6Var2.b || vz6Var.c != vz6Var2.c) {
                    c(i2, new vz6(j, vz6Var2.a));
                    this.d.getClass();
                }
            }
        }
    }

    public final synchronized void f(defpackage.uj r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc3.f(uj):void");
    }

    public final synchronized void g(uj ujVar, int i2) {
        boolean z;
        this.d.getClass();
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            mc3 mc3Var = (mc3) it.next();
            if (mc3Var.a(ujVar)) {
                it.remove();
                boolean equals = mc3Var.a.equals(this.f);
                if (equals) {
                    a(mc3Var);
                }
                if (mc3Var.e) {
                    if (z && equals) {
                        boolean z2 = mc3Var.f;
                    }
                    this.d.p(ujVar, mc3Var.a);
                }
            }
        }
        e(ujVar);
    }
}
