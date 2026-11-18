package m2;

import d3.p;
import e2.i1;
import e2.k1;
import e2.l1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import x2.g0;
public final class f {
    public static final p h = new p(4);
    public static final Random f20501i = new Random();
    public g d;
    public String f20506f;
    public final k1 f20502a = new k1();
    public final i1 f20503b = new i1();
    public final HashMap f20504c = new HashMap();
    public l1 f20505e = l1.f10508a;
    public long f20507g = -1;

    public final void a(e eVar) {
        long j3 = eVar.f20497c;
        if (j3 != -1 && eVar.f20498e) {
            this.f20507g = j3;
        }
        this.f20506f = null;
    }

    public final synchronized void b(a aVar) {
        g gVar;
        try {
            String str = this.f20506f;
            if (str != null) {
                e eVar = (e) this.f20504c.get(str);
                eVar.getClass();
                a(eVar);
            }
            Iterator it = this.f20504c.values().iterator();
            while (it.hasNext()) {
                e eVar2 = (e) it.next();
                it.remove();
                if (eVar2.f20498e && (gVar = this.d) != null) {
                    gVar.n(aVar, eVar2.f20495a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final m2.e c(int r19, x2.g0 r20) {
        throw new UnsupportedOperationException("Method not decompiled: m2.f.c(int, x2.g0):m2.e");
    }

    public final synchronized String d(l1 l1Var, g0 g0Var) {
        return c(l1Var.g(g0Var.f60087a, this.f20503b).f10436c, g0Var).f20495a;
    }

    public final void e(a aVar) {
        g0 g0Var;
        l1 l1Var = aVar.f20480b;
        int i7 = aVar.f20481c;
        g0 g0Var2 = aVar.d;
        boolean p10 = l1Var.p();
        HashMap hashMap = this.f20504c;
        if (p10) {
            String str = this.f20506f;
            if (str != null) {
                e eVar = (e) hashMap.get(str);
                eVar.getClass();
                a(eVar);
                return;
            }
            return;
        }
        e eVar2 = (e) hashMap.get(this.f20506f);
        this.f20506f = c(i7, g0Var2).f20495a;
        f(aVar);
        if (g0Var2 != null) {
            long j3 = g0Var2.d;
            if (g0Var2.b()) {
                if (eVar2 == null || eVar2.f20497c != j3 || (g0Var = eVar2.d) == null || g0Var.f60088b != g0Var2.f60088b || g0Var.f60089c != g0Var2.f60089c) {
                    c(i7, new g0(g0Var2.f60087a, j3));
                    this.d.getClass();
                }
            }
        }
    }

    public final synchronized void f(m2.a r10) {
        throw new UnsupportedOperationException("Method not decompiled: m2.f.f(m2.a):void");
    }

    public final synchronized void g(a aVar, int i7) {
        boolean z10;
        try {
            this.d.getClass();
            if (i7 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iterator it = this.f20504c.values().iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar.a(aVar)) {
                    it.remove();
                    boolean equals = eVar.f20495a.equals(this.f20506f);
                    if (equals) {
                        a(eVar);
                    }
                    if (eVar.f20498e) {
                        if (z10 && equals) {
                            boolean z11 = eVar.f20499f;
                        }
                        this.d.n(aVar, eVar.f20495a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
