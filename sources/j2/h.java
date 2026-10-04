package j2;

import a3.s;
import b2.h1;
import b2.j1;
import b2.k1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import u2.f0;
public final class h {
    public static final s h = new s(4);
    public static final Random f13665i = new Random();
    public i d;
    public String f13670f;
    public final j1 f13666a = new j1();
    public final h1 f13667b = new h1();
    public final HashMap f13668c = new HashMap();
    public k1 f13669e = k1.f3325a;
    public long f13671g = -1;

    public final void a(g gVar) {
        long j3 = gVar.f13661c;
        if (j3 != -1) {
            this.f13671g = j3;
        }
        this.f13670f = null;
    }

    public final synchronized void b(a aVar) {
        i iVar;
        try {
            String str = this.f13670f;
            if (str != null) {
                g gVar = (g) this.f13668c.get(str);
                gVar.getClass();
                a(gVar);
            }
            Iterator it = this.f13668c.values().iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                it.remove();
                if (gVar2.f13662e && (iVar = this.d) != null) {
                    iVar.t(aVar, gVar2.f13659a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final j2.g c(int r19, u2.f0 r20) {
        throw new UnsupportedOperationException("Method not decompiled: j2.h.c(int, u2.f0):j2.g");
    }

    public final synchronized String d(k1 k1Var, f0 f0Var) {
        return c(k1Var.g(f0Var.f47255a, this.f13667b).f3250c, f0Var).f13659a;
    }

    public final void e(a aVar) {
        f0 f0Var;
        k1 k1Var = aVar.f13640b;
        int i10 = aVar.f13641c;
        f0 f0Var2 = aVar.d;
        boolean p5 = k1Var.p();
        HashMap hashMap = this.f13668c;
        if (p5) {
            String str = this.f13670f;
            if (str != null) {
                g gVar = (g) hashMap.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) hashMap.get(this.f13670f);
        this.f13670f = c(i10, f0Var2).f13659a;
        f(aVar);
        if (f0Var2 != null) {
            long j3 = f0Var2.d;
            if (f0Var2.b()) {
                if (gVar2 == null || gVar2.f13661c != j3 || (f0Var = gVar2.d) == null || f0Var.f47256b != f0Var2.f47256b || f0Var.f47257c != f0Var2.f47257c) {
                    c(i10, new f0(f0Var2.f47255a, j3));
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
            Iterator it = this.f13668c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    if (gVar.f13662e) {
                        boolean equals = gVar.f13659a.equals(this.f13670f);
                        if (z10 && equals) {
                            boolean z11 = gVar.f13663f;
                        }
                        if (equals) {
                            a(gVar);
                        }
                        this.d.t(aVar, gVar.f13659a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
