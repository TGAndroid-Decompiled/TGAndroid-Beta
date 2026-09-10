package j2;

import a3.s;
import b2.h1;
import b2.j1;
import b2.k1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import u2.g0;
public final class g {
    public static final s h = new s(4);
    public static final Random f11473i = new Random();
    public i d;
    public String f11477f;
    public final j1 f11474a = new j1();
    public final h1 f11475b = new h1();
    public final HashMap f11476c = new HashMap();
    public k1 e = k1.f1774a;
    public long f11478g = -1;

    public final void a(f fVar) {
        long j3 = fVar.f11470c;
        if (j3 != -1) {
            this.f11478g = j3;
        }
        this.f11477f = null;
    }

    public final synchronized void b(a aVar) {
        i iVar;
        try {
            String str = this.f11477f;
            if (str != null) {
                f fVar = (f) this.f11476c.get(str);
                fVar.getClass();
                a(fVar);
            }
            Iterator it = this.f11476c.values().iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                it.remove();
                if (fVar2.e && (iVar = this.d) != null) {
                    iVar.t(aVar, fVar2.f11468a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final j2.f c(int r19, u2.g0 r20) {
        throw new UnsupportedOperationException("Method not decompiled: j2.g.c(int, u2.g0):j2.f");
    }

    public final synchronized String d(k1 k1Var, g0 g0Var) {
        return c(k1Var.g(g0Var.f42324a, this.f11475b).f1707c, g0Var).f11468a;
    }

    public final void e(a aVar) {
        g0 g0Var;
        k1 k1Var = aVar.f11452b;
        int i10 = aVar.f11453c;
        g0 g0Var2 = aVar.d;
        boolean p5 = k1Var.p();
        HashMap hashMap = this.f11476c;
        if (p5) {
            String str = this.f11477f;
            if (str != null) {
                f fVar = (f) hashMap.get(str);
                fVar.getClass();
                a(fVar);
                return;
            }
            return;
        }
        f fVar2 = (f) hashMap.get(this.f11477f);
        this.f11477f = c(i10, g0Var2).f11468a;
        f(aVar);
        if (g0Var2 != null) {
            long j3 = g0Var2.d;
            if (g0Var2.b()) {
                if (fVar2 == null || fVar2.f11470c != j3 || (g0Var = fVar2.d) == null || g0Var.f42325b != g0Var2.f42325b || g0Var.f42326c != g0Var2.f42326c) {
                    c(i10, new g0(g0Var2.f42324a, j3));
                    this.d.getClass();
                }
            }
        }
    }

    public final synchronized void f(j2.a r10) {
        throw new UnsupportedOperationException("Method not decompiled: j2.g.f(j2.a):void");
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
            Iterator it = this.f11476c.values().iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                if (fVar.a(aVar)) {
                    it.remove();
                    if (fVar.e) {
                        boolean equals = fVar.f11468a.equals(this.f11477f);
                        if (z10 && equals) {
                            boolean z11 = fVar.f11471f;
                        }
                        if (equals) {
                            a(fVar);
                        }
                        this.d.t(aVar, fVar.f11468a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
