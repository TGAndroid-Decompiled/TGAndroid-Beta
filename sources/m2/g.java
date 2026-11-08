package m2;

import d3.q;
import e2.i1;
import e2.k1;
import e2.l1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import x2.g0;
public final class g {
    public static final q h = new q(4);
    public static final Random f19541i = new Random();
    public h d;
    public String f19546f;
    public final k1 f19542a = new k1();
    public final i1 f19543b = new i1();
    public final HashMap f19544c = new HashMap();
    public l1 f19545e = l1.f10354a;
    public long f19547g = -1;

    public final void a(f fVar) {
        long j3 = fVar.f19537c;
        if (j3 != -1 && fVar.f19538e) {
            this.f19547g = j3;
        }
        this.f19546f = null;
    }

    public final synchronized void b(a aVar) {
        h hVar;
        try {
            String str = this.f19546f;
            if (str != null) {
                f fVar = (f) this.f19544c.get(str);
                fVar.getClass();
                a(fVar);
            }
            Iterator it = this.f19544c.values().iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                it.remove();
                if (fVar2.f19538e && (hVar = this.d) != null) {
                    hVar.n(aVar, fVar2.f19535a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final m2.f c(int r19, x2.g0 r20) {
        throw new UnsupportedOperationException("Method not decompiled: m2.g.c(int, x2.g0):m2.f");
    }

    public final synchronized String d(l1 l1Var, g0 g0Var) {
        return c(l1Var.g(g0Var.f58330a, this.f19543b).f10282c, g0Var).f19535a;
    }

    public final void e(a aVar) {
        g0 g0Var;
        l1 l1Var = aVar.f19519b;
        int i7 = aVar.f19520c;
        g0 g0Var2 = aVar.d;
        boolean p10 = l1Var.p();
        HashMap hashMap = this.f19544c;
        if (p10) {
            String str = this.f19546f;
            if (str != null) {
                f fVar = (f) hashMap.get(str);
                fVar.getClass();
                a(fVar);
                return;
            }
            return;
        }
        f fVar2 = (f) hashMap.get(this.f19546f);
        this.f19546f = c(i7, g0Var2).f19535a;
        f(aVar);
        if (g0Var2 != null) {
            long j3 = g0Var2.d;
            if (g0Var2.b()) {
                if (fVar2 == null || fVar2.f19537c != j3 || (g0Var = fVar2.d) == null || g0Var.f58331b != g0Var2.f58331b || g0Var.f58332c != g0Var2.f58332c) {
                    c(i7, new g0(g0Var2.f58330a, j3));
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
            Iterator it = this.f19544c.values().iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                if (fVar.a(aVar)) {
                    it.remove();
                    boolean equals = fVar.f19535a.equals(this.f19546f);
                    if (equals) {
                        a(fVar);
                    }
                    if (fVar.f19538e) {
                        if (z9 && equals) {
                            boolean z10 = fVar.f19539f;
                        }
                        this.d.n(aVar, fVar.f19535a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
