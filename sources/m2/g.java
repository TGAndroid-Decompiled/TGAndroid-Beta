package m2;

import d3.q;
import e2.i1;
import e2.k1;
import e2.l1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import x2.f0;
public final class g {
    public static final q h = new q(4);
    public static final Random f19546i = new Random();
    public h d;
    public String f19551f;
    public final k1 f19547a = new k1();
    public final i1 f19548b = new i1();
    public final HashMap f19549c = new HashMap();
    public l1 f19550e = l1.f10359a;
    public long f19552g = -1;

    public final void a(f fVar) {
        long j3 = fVar.f19542c;
        if (j3 != -1 && fVar.f19543e) {
            this.f19552g = j3;
        }
        this.f19551f = null;
    }

    public final synchronized void b(a aVar) {
        h hVar;
        try {
            String str = this.f19551f;
            if (str != null) {
                f fVar = (f) this.f19549c.get(str);
                fVar.getClass();
                a(fVar);
            }
            Iterator it = this.f19549c.values().iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                it.remove();
                if (fVar2.f19543e && (hVar = this.d) != null) {
                    hVar.n(aVar, fVar2.f19540a);
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
        return c(l1Var.g(f0Var.f58342a, this.f19548b).f10287c, f0Var).f19540a;
    }

    public final void e(a aVar) {
        f0 f0Var;
        l1 l1Var = aVar.f19524b;
        int i7 = aVar.f19525c;
        f0 f0Var2 = aVar.d;
        boolean p10 = l1Var.p();
        HashMap hashMap = this.f19549c;
        if (p10) {
            String str = this.f19551f;
            if (str != null) {
                f fVar = (f) hashMap.get(str);
                fVar.getClass();
                a(fVar);
                return;
            }
            return;
        }
        f fVar2 = (f) hashMap.get(this.f19551f);
        this.f19551f = c(i7, f0Var2).f19540a;
        f(aVar);
        if (f0Var2 != null) {
            long j3 = f0Var2.d;
            if (f0Var2.b()) {
                if (fVar2 == null || fVar2.f19542c != j3 || (f0Var = fVar2.d) == null || f0Var.f58343b != f0Var2.f58343b || f0Var.f58344c != f0Var2.f58344c) {
                    c(i7, new f0(f0Var2.f58342a, j3));
                    this.d.getClass();
                }
            }
        }
    }

    public final synchronized void f(m2.a r10) {
        throw new UnsupportedOperationException("Method not decompiled: m2.g.f(m2.a):void");
    }

    public final synchronized void g(a aVar, int i7) {
        boolean z9;
        try {
            this.d.getClass();
            if (i7 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            Iterator it = this.f19549c.values().iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                if (fVar.a(aVar)) {
                    it.remove();
                    boolean equals = fVar.f19540a.equals(this.f19551f);
                    if (equals) {
                        a(fVar);
                    }
                    if (fVar.f19543e) {
                        if (z9 && equals) {
                            boolean z10 = fVar.f19544f;
                        }
                        this.d.n(aVar, fVar.f19540a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
