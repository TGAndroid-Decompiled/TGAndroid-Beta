package j2;

import a3.s;
import b2.l1;
import b2.n1;
import b2.o1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import u2.h0;
public final class g {
    public static final s h = new s(4);
    public static final Random f13995i = new Random();
    public h d;
    public String f13999f;
    public final n1 f13996a = new n1();
    public final l1 f13997b = new l1();
    public final HashMap f13998c = new HashMap();
    public o1 e = o1.f3897a;
    public long f14000g = -1;

    public final void a(f fVar) {
        long j10 = fVar.f13992c;
        if (j10 != -1 && fVar.e) {
            this.f14000g = j10;
        }
        this.f13999f = null;
    }

    public final synchronized void b(a aVar) {
        h hVar;
        try {
            String str = this.f13999f;
            if (str != null) {
                f fVar = (f) this.f13998c.get(str);
                fVar.getClass();
                a(fVar);
            }
            Iterator it = this.f13998c.values().iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                it.remove();
                if (fVar2.e && (hVar = this.d) != null) {
                    hVar.t(aVar, fVar2.f13990a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final j2.f c(int r19, u2.h0 r20) {
        throw new UnsupportedOperationException("Method not decompiled: j2.g.c(int, u2.h0):j2.f");
    }

    public final synchronized String d(o1 o1Var, h0 h0Var) {
        return c(o1Var.g(h0Var.f47767a, this.f13997b).f3829c, h0Var).f13990a;
    }

    public final void e(a aVar) {
        h0 h0Var;
        o1 o1Var = aVar.f13974b;
        int i10 = aVar.f13975c;
        h0 h0Var2 = aVar.d;
        boolean p5 = o1Var.p();
        HashMap hashMap = this.f13998c;
        if (p5) {
            String str = this.f13999f;
            if (str != null) {
                f fVar = (f) hashMap.get(str);
                fVar.getClass();
                a(fVar);
                return;
            }
            return;
        }
        f fVar2 = (f) hashMap.get(this.f13999f);
        this.f13999f = c(i10, h0Var2).f13990a;
        f(aVar);
        if (h0Var2 != null) {
            long j10 = h0Var2.d;
            if (h0Var2.b()) {
                if (fVar2 == null || fVar2.f13992c != j10 || (h0Var = fVar2.d) == null || h0Var.f47768b != h0Var2.f47768b || h0Var.f47769c != h0Var2.f47769c) {
                    c(i10, new h0(h0Var2.f47767a, j10));
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
            Iterator it = this.f13998c.values().iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                if (fVar.a(aVar)) {
                    it.remove();
                    boolean equals = fVar.f13990a.equals(this.f13999f);
                    if (equals) {
                        a(fVar);
                    }
                    if (fVar.e) {
                        if (z10 && equals) {
                            boolean z11 = fVar.f13993f;
                        }
                        this.d.t(aVar, fVar.f13990a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
