package m2;

import d3.p;
import e2.i1;
import e2.k1;
import e2.l1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import x2.f0;
public final class g {
    public static final p h = new p(4);
    public static final Random f20137i = new Random();
    public h d;
    public String f20142f;
    public final k1 f20138a = new k1();
    public final i1 f20139b = new i1();
    public final HashMap f20140c = new HashMap();
    public l1 f20141e = l1.f10190a;
    public long f20143g = -1;

    public final void a(f fVar) {
        long j3 = fVar.f20133c;
        if (j3 != -1 && fVar.f20134e) {
            this.f20143g = j3;
        }
        this.f20142f = null;
    }

    public final synchronized void b(a aVar) {
        h hVar;
        try {
            String str = this.f20142f;
            if (str != null) {
                f fVar = (f) this.f20140c.get(str);
                fVar.getClass();
                a(fVar);
            }
            Iterator it = this.f20140c.values().iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                it.remove();
                if (fVar2.f20134e && (hVar = this.d) != null) {
                    hVar.m(aVar, fVar2.f20131a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final m2.f c(int r19, x2.f0 r20) {
        throw new UnsupportedOperationException("Method not decompiled: m2.g.c(int, x2.f0):m2.f");
    }

    public final synchronized String d(l1 l1Var, f0 f0Var) {
        return c(l1Var.g(f0Var.f59523a, this.f20139b).f10118c, f0Var).f20131a;
    }

    public final void e(a aVar) {
        f0 f0Var;
        l1 l1Var = aVar.f20113b;
        int i7 = aVar.f20114c;
        f0 f0Var2 = aVar.d;
        boolean p10 = l1Var.p();
        HashMap hashMap = this.f20140c;
        if (p10) {
            String str = this.f20142f;
            if (str != null) {
                f fVar = (f) hashMap.get(str);
                fVar.getClass();
                a(fVar);
                return;
            }
            return;
        }
        f fVar2 = (f) hashMap.get(this.f20142f);
        this.f20142f = c(i7, f0Var2).f20131a;
        f(aVar);
        if (f0Var2 != null) {
            long j3 = f0Var2.d;
            if (f0Var2.b()) {
                if (fVar2 == null || fVar2.f20133c != j3 || (f0Var = fVar2.d) == null || f0Var.f59524b != f0Var2.f59524b || f0Var.f59525c != f0Var2.f59525c) {
                    c(i7, new f0(f0Var2.f59523a, j3));
                    this.d.getClass();
                }
            }
        }
    }

    public final synchronized void f(m2.a r10) {
        throw new UnsupportedOperationException("Method not decompiled: m2.g.f(m2.a):void");
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
            Iterator it = this.f20140c.values().iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                if (fVar.a(aVar)) {
                    it.remove();
                    boolean equals = fVar.f20131a.equals(this.f20142f);
                    if (equals) {
                        a(fVar);
                    }
                    if (fVar.f20134e) {
                        if (z10 && equals) {
                            boolean z11 = fVar.f20135f;
                        }
                        this.d.m(aVar, fVar.f20131a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
