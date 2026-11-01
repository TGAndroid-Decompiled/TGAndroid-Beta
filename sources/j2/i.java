package j2;

import a3.s;
import b2.l1;
import b2.n1;
import b2.o1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import u2.g0;
public final class i {
    public static final s h = new s(4);
    public static final Random f9363i = new Random();
    public j d;
    public String f9367f;
    public final n1 f9364a = new n1();
    public final l1 f9365b = new l1();
    public final HashMap f9366c = new HashMap();
    public o1 e = o1.f2172a;
    public long f9368g = -1;

    public final void a(h hVar) {
        long j10 = hVar.f9360c;
        if (j10 != -1 && hVar.e) {
            this.f9368g = j10;
        }
        this.f9367f = null;
    }

    public final synchronized void b(a aVar) {
        j jVar;
        try {
            String str = this.f9367f;
            if (str != null) {
                h hVar = (h) this.f9366c.get(str);
                hVar.getClass();
                a(hVar);
            }
            Iterator it = this.f9366c.values().iterator();
            while (it.hasNext()) {
                h hVar2 = (h) it.next();
                it.remove();
                if (hVar2.e && (jVar = this.d) != null) {
                    jVar.p(aVar, hVar2.f9358a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final j2.h c(int r19, u2.g0 r20) {
        throw new UnsupportedOperationException("Method not decompiled: j2.i.c(int, u2.g0):j2.h");
    }

    public final synchronized String d(o1 o1Var, g0 g0Var) {
        return c(o1Var.g(g0Var.f49889a, this.f9365b).f2109c, g0Var).f9358a;
    }

    public final void e(a aVar) {
        g0 g0Var;
        o1 o1Var = aVar.f9337b;
        int i10 = aVar.f9338c;
        g0 g0Var2 = aVar.d;
        boolean p5 = o1Var.p();
        HashMap hashMap = this.f9366c;
        if (p5) {
            String str = this.f9367f;
            if (str != null) {
                h hVar = (h) hashMap.get(str);
                hVar.getClass();
                a(hVar);
                return;
            }
            return;
        }
        h hVar2 = (h) hashMap.get(this.f9367f);
        this.f9367f = c(i10, g0Var2).f9358a;
        f(aVar);
        if (g0Var2 != null) {
            long j10 = g0Var2.d;
            if (g0Var2.b()) {
                if (hVar2 == null || hVar2.f9360c != j10 || (g0Var = hVar2.d) == null || g0Var.f49890b != g0Var2.f49890b || g0Var.f49891c != g0Var2.f49891c) {
                    c(i10, new g0(g0Var2.f49889a, j10));
                    this.d.getClass();
                }
            }
        }
    }

    public final synchronized void f(j2.a r10) {
        throw new UnsupportedOperationException("Method not decompiled: j2.i.f(j2.a):void");
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
            Iterator it = this.f9366c.values().iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (hVar.a(aVar)) {
                    it.remove();
                    boolean equals = hVar.f9358a.equals(this.f9367f);
                    if (equals) {
                        a(hVar);
                    }
                    if (hVar.e) {
                        if (z10 && equals) {
                            boolean z11 = hVar.f9361f;
                        }
                        this.d.p(aVar, hVar.f9358a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
