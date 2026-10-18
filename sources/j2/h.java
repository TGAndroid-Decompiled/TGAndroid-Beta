package j2;

import a3.s;
import b2.l1;
import b2.n1;
import b2.o1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import u2.f0;
public final class h {
    public static final s h = new s(4);
    public static final Random f13952i = new Random();
    public i d;
    public String f13956f;
    public final n1 f13953a = new n1();
    public final l1 f13954b = new l1();
    public final HashMap f13955c = new HashMap();
    public o1 e = o1.f3894a;
    public long f13957g = -1;

    public final void a(g gVar) {
        long j10 = gVar.f13949c;
        if (j10 != -1 && gVar.e) {
            this.f13957g = j10;
        }
        this.f13956f = null;
    }

    public final synchronized void b(a aVar) {
        i iVar;
        try {
            String str = this.f13956f;
            if (str != null) {
                g gVar = (g) this.f13955c.get(str);
                gVar.getClass();
                a(gVar);
            }
            Iterator it = this.f13955c.values().iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                it.remove();
                if (gVar2.e && (iVar = this.d) != null) {
                    iVar.t(aVar, gVar2.f13947a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final j2.g c(int r19, u2.f0 r20) {
        throw new UnsupportedOperationException("Method not decompiled: j2.h.c(int, u2.f0):j2.g");
    }

    public final synchronized String d(o1 o1Var, f0 f0Var) {
        return c(o1Var.g(f0Var.f47347a, this.f13954b).f3826c, f0Var).f13947a;
    }

    public final void e(a aVar) {
        f0 f0Var;
        o1 o1Var = aVar.f13930b;
        int i10 = aVar.f13931c;
        f0 f0Var2 = aVar.d;
        boolean p5 = o1Var.p();
        HashMap hashMap = this.f13955c;
        if (p5) {
            String str = this.f13956f;
            if (str != null) {
                g gVar = (g) hashMap.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) hashMap.get(this.f13956f);
        this.f13956f = c(i10, f0Var2).f13947a;
        f(aVar);
        if (f0Var2 != null) {
            long j10 = f0Var2.d;
            if (f0Var2.b()) {
                if (gVar2 == null || gVar2.f13949c != j10 || (f0Var = gVar2.d) == null || f0Var.f47348b != f0Var2.f47348b || f0Var.f47349c != f0Var2.f47349c) {
                    c(i10, new f0(f0Var2.f47347a, j10));
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
            Iterator it = this.f13955c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    boolean equals = gVar.f13947a.equals(this.f13956f);
                    if (equals) {
                        a(gVar);
                    }
                    if (gVar.e) {
                        if (z10 && equals) {
                            boolean z11 = gVar.f13950f;
                        }
                        this.d.t(aVar, gVar.f13947a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
