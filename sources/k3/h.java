package k3;

import j3.p2;
import j3.q;
import j3.q2;
import j3.r2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import l4.a0;
import l4.c0;
public final class h {
    public static final q f13426g = new q(1);
    public static final Random h = new Random();
    public i d;
    public String f13431f;
    public final q2 f13427a = new q2();
    public final p2 f13428b = new p2();
    public final HashMap f13429c = new HashMap();
    public r2 f13430e = r2.f10729a;

    public final synchronized void a(a aVar) {
        i iVar;
        this.f13431f = null;
        Iterator it = this.f13429c.values().iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            if (gVar.f13423e && (iVar = this.d) != null) {
                iVar.n(aVar, gVar.f13420a);
            }
        }
    }

    public final k3.g b(int r18, l4.c0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: k3.h.b(int, l4.c0):k3.g");
    }

    public final synchronized String c(r2 r2Var, c0 c0Var) {
        return b(r2Var.g(c0Var.f14262a, this.f13428b).f10676c, c0Var).f13420a;
    }

    public final void d(a aVar) {
        c0 c0Var;
        r2 r2Var = aVar.f13400b;
        int i10 = aVar.f13401c;
        c0 c0Var2 = aVar.d;
        if (r2Var.p()) {
            this.f13431f = null;
            return;
        }
        g gVar = (g) this.f13429c.get(this.f13431f);
        this.f13431f = b(i10, c0Var2).f13420a;
        e(aVar);
        if (c0Var2 != null) {
            long j10 = c0Var2.d;
            if (c0Var2.a()) {
                if (gVar == null || gVar.f13422c != j10 || (c0Var = gVar.d) == null || c0Var.f14263b != c0Var2.f14263b || c0Var.f14264c != c0Var2.f14264c) {
                    b(i10, new a0(c0Var2.f14262a, j10));
                    this.d.getClass();
                }
            }
        }
    }

    public final synchronized void e(k3.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: k3.h.e(k3.a):void");
    }

    public final synchronized void f(a aVar, int i10) {
        boolean z10;
        try {
            this.d.getClass();
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iterator it = this.f13429c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    if (gVar.f13423e) {
                        boolean equals = gVar.f13420a.equals(this.f13431f);
                        if (z10 && equals) {
                            boolean z11 = gVar.f13424f;
                        }
                        if (equals) {
                            this.f13431f = null;
                        }
                        this.d.n(aVar, gVar.f13420a);
                    }
                }
            }
            d(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
