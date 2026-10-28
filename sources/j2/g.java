package j2;

import a3.s;
import b2.m1;
import b2.o1;
import b2.p1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import u2.g0;
public final class g {
    public static final s h = new s(4);
    public static final Random f15207i = new Random();
    public h d;
    public String f15211f;
    public final o1 f15208a = new o1();
    public final m1 f15209b = new m1();
    public final HashMap f15210c = new HashMap();
    public p1 e = p1.f3348a;
    public long f15212g = -1;

    public final void a(f fVar) {
        long j10 = fVar.f15204c;
        if (j10 != -1 && fVar.e) {
            this.f15212g = j10;
        }
        this.f15211f = null;
    }

    public final synchronized void b(a aVar) {
        h hVar;
        try {
            String str = this.f15211f;
            if (str != null) {
                f fVar = (f) this.f15210c.get(str);
                fVar.getClass();
                a(fVar);
            }
            Iterator it = this.f15210c.values().iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                it.remove();
                if (fVar2.e && (hVar = this.d) != null) {
                    hVar.t(aVar, fVar2.f15202a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final j2.f c(int r19, u2.g0 r20) {
        throw new UnsupportedOperationException("Method not decompiled: j2.g.c(int, u2.g0):j2.f");
    }

    public final synchronized String d(p1 p1Var, g0 g0Var) {
        return c(p1Var.g(g0Var.f49332a, this.f15209b).f3280c, g0Var).f15202a;
    }

    public final void e(a aVar) {
        g0 g0Var;
        p1 p1Var = aVar.f15186b;
        int i10 = aVar.f15187c;
        g0 g0Var2 = aVar.d;
        boolean p10 = p1Var.p();
        HashMap hashMap = this.f15210c;
        if (p10) {
            String str = this.f15211f;
            if (str != null) {
                f fVar = (f) hashMap.get(str);
                fVar.getClass();
                a(fVar);
                return;
            }
            return;
        }
        f fVar2 = (f) hashMap.get(this.f15211f);
        this.f15211f = c(i10, g0Var2).f15202a;
        f(aVar);
        if (g0Var2 != null) {
            long j10 = g0Var2.d;
            if (g0Var2.b()) {
                if (fVar2 == null || fVar2.f15204c != j10 || (g0Var = fVar2.d) == null || g0Var.f49333b != g0Var2.f49333b || g0Var.f49334c != g0Var2.f49334c) {
                    c(i10, new g0(g0Var2.f49332a, j10));
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
            Iterator it = this.f15210c.values().iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                if (fVar.a(aVar)) {
                    it.remove();
                    boolean equals = fVar.f15202a.equals(this.f15211f);
                    if (equals) {
                        a(fVar);
                    }
                    if (fVar.e) {
                        if (z10 && equals) {
                            boolean z11 = fVar.f15205f;
                        }
                        this.d.t(aVar, fVar.f15202a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
