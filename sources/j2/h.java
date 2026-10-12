package j2;

import a3.s;
import b2.m1;
import b2.o1;
import b2.p1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import u2.g0;
public final class h {
    public static final s h = new s(4);
    public static final Random f12536i = new Random();
    public i d;
    public String f12540f;
    public final o1 f12537a = new o1();
    public final m1 f12538b = new m1();
    public final HashMap f12539c = new HashMap();
    public p1 e = p1.f2281a;
    public long f12541g = -1;

    public final void a(g gVar) {
        long j10 = gVar.f12533c;
        if (j10 != -1 && gVar.e) {
            this.f12541g = j10;
        }
        this.f12540f = null;
    }

    public final synchronized void b(a aVar) {
        i iVar;
        try {
            String str = this.f12540f;
            if (str != null) {
                g gVar = (g) this.f12539c.get(str);
                gVar.getClass();
                a(gVar);
            }
            Iterator it = this.f12539c.values().iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                it.remove();
                if (gVar2.e && (iVar = this.d) != null) {
                    iVar.t(aVar, gVar2.f12531a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final j2.g c(int r19, u2.g0 r20) {
        throw new UnsupportedOperationException("Method not decompiled: j2.h.c(int, u2.g0):j2.g");
    }

    public final synchronized String d(p1 p1Var, g0 g0Var) {
        return c(p1Var.g(g0Var.f45920a, this.f12538b).f2213c, g0Var).f12531a;
    }

    public final void e(a aVar) {
        g0 g0Var;
        p1 p1Var = aVar.f12514b;
        int i10 = aVar.f12515c;
        g0 g0Var2 = aVar.d;
        boolean p5 = p1Var.p();
        HashMap hashMap = this.f12539c;
        if (p5) {
            String str = this.f12540f;
            if (str != null) {
                g gVar = (g) hashMap.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) hashMap.get(this.f12540f);
        this.f12540f = c(i10, g0Var2).f12531a;
        f(aVar);
        if (g0Var2 != null) {
            long j10 = g0Var2.d;
            if (g0Var2.b()) {
                if (gVar2 == null || gVar2.f12533c != j10 || (g0Var = gVar2.d) == null || g0Var.f45921b != g0Var2.f45921b || g0Var.f45922c != g0Var2.f45922c) {
                    c(i10, new g0(g0Var2.f45920a, j10));
                    this.d.getClass();
                }
            }
        }
    }

    public final synchronized void f(j2.a r10) {
        throw new UnsupportedOperationException("Method not decompiled: j2.h.f(j2.a):void");
    }

    public final synchronized void g(a aVar, int i10) {
        boolean z10;
        try {
            this.d.getClass();
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iterator it = this.f12539c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    boolean equals = gVar.f12531a.equals(this.f12540f);
                    if (equals) {
                        a(gVar);
                    }
                    if (gVar.e) {
                        if (z10 && equals) {
                            boolean z11 = gVar.f12534f;
                        }
                        this.d.t(aVar, gVar.f12531a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
