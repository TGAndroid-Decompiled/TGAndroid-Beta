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
    public static final Random f20526i = new Random();
    public g d;
    public String f20531f;
    public final k1 f20527a = new k1();
    public final i1 f20528b = new i1();
    public final HashMap f20529c = new HashMap();
    public l1 f20530e = l1.f10534a;
    public long f20532g = -1;

    public final void a(e eVar) {
        long j3 = eVar.f20522c;
        if (j3 != -1 && eVar.f20523e) {
            this.f20532g = j3;
        }
        this.f20531f = null;
    }

    public final synchronized void b(a aVar) {
        g gVar;
        try {
            String str = this.f20531f;
            if (str != null) {
                e eVar = (e) this.f20529c.get(str);
                eVar.getClass();
                a(eVar);
            }
            Iterator it = this.f20529c.values().iterator();
            while (it.hasNext()) {
                e eVar2 = (e) it.next();
                it.remove();
                if (eVar2.f20523e && (gVar = this.d) != null) {
                    gVar.n(aVar, eVar2.f20520a);
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
        return c(l1Var.g(g0Var.f60129a, this.f20528b).f10462c, g0Var).f20520a;
    }

    public final void e(a aVar) {
        g0 g0Var;
        l1 l1Var = aVar.f20505b;
        int i7 = aVar.f20506c;
        g0 g0Var2 = aVar.d;
        boolean p10 = l1Var.p();
        HashMap hashMap = this.f20529c;
        if (p10) {
            String str = this.f20531f;
            if (str != null) {
                e eVar = (e) hashMap.get(str);
                eVar.getClass();
                a(eVar);
                return;
            }
            return;
        }
        e eVar2 = (e) hashMap.get(this.f20531f);
        this.f20531f = c(i7, g0Var2).f20520a;
        f(aVar);
        if (g0Var2 != null) {
            long j3 = g0Var2.d;
            if (g0Var2.b()) {
                if (eVar2 == null || eVar2.f20522c != j3 || (g0Var = eVar2.d) == null || g0Var.f60130b != g0Var2.f60130b || g0Var.f60131c != g0Var2.f60131c) {
                    c(i7, new g0(g0Var2.f60129a, j3));
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
            Iterator it = this.f20529c.values().iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar.a(aVar)) {
                    it.remove();
                    boolean equals = eVar.f20520a.equals(this.f20531f);
                    if (equals) {
                        a(eVar);
                    }
                    if (eVar.f20523e) {
                        if (z10 && equals) {
                            boolean z11 = eVar.f20524f;
                        }
                        this.d.n(aVar, eVar.f20520a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
