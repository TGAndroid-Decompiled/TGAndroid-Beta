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
    public static final Random f12585i = new Random();
    public i d;
    public String f12589f;
    public final j1 f12586a = new j1();
    public final h1 f12587b = new h1();
    public final HashMap f12588c = new HashMap();
    public k1 e = k1.f3078a;
    public long f12590g = -1;

    public final void a(g gVar) {
        long j3 = gVar.f12582c;
        if (j3 != -1) {
            this.f12590g = j3;
        }
        this.f12589f = null;
    }

    public final synchronized void b(a aVar) {
        i iVar;
        try {
            String str = this.f12589f;
            if (str != null) {
                g gVar = (g) this.f12588c.get(str);
                gVar.getClass();
                a(gVar);
            }
            Iterator it = this.f12588c.values().iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                it.remove();
                if (gVar2.e && (iVar = this.d) != null) {
                    iVar.t(aVar, gVar2.f12580a);
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
        return c(k1Var.g(f0Var.f43353a, this.f12587b).f3011c, f0Var).f12580a;
    }

    public final void e(a aVar) {
        f0 f0Var;
        k1 k1Var = aVar.f12563b;
        int i10 = aVar.f12564c;
        f0 f0Var2 = aVar.d;
        boolean p5 = k1Var.p();
        HashMap hashMap = this.f12588c;
        if (p5) {
            String str = this.f12589f;
            if (str != null) {
                g gVar = (g) hashMap.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) hashMap.get(this.f12589f);
        this.f12589f = c(i10, f0Var2).f12580a;
        f(aVar);
        if (f0Var2 != null) {
            long j3 = f0Var2.d;
            if (f0Var2.b()) {
                if (gVar2 == null || gVar2.f12582c != j3 || (f0Var = gVar2.d) == null || f0Var.f43354b != f0Var2.f43354b || f0Var.f43355c != f0Var2.f43355c) {
                    c(i10, new f0(f0Var2.f43353a, j3));
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
            Iterator it = this.f12588c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    if (gVar.e) {
                        boolean equals = gVar.f12580a.equals(this.f12589f);
                        if (z10 && equals) {
                            boolean z11 = gVar.f12583f;
                        }
                        if (equals) {
                            a(gVar);
                        }
                        this.d.t(aVar, gVar.f12580a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
