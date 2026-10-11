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
    public static final Random f13702i = new Random();
    public i d;
    public String f13707f;
    public final j1 f13703a = new j1();
    public final h1 f13704b = new h1();
    public final HashMap f13705c = new HashMap();
    public k1 f13706e = k1.f3404a;
    public long f13708g = -1;

    public final void a(g gVar) {
        long j3 = gVar.f13698c;
        if (j3 != -1) {
            this.f13708g = j3;
        }
        this.f13707f = null;
    }

    public final synchronized void b(a aVar) {
        i iVar;
        try {
            String str = this.f13707f;
            if (str != null) {
                g gVar = (g) this.f13705c.get(str);
                gVar.getClass();
                a(gVar);
            }
            Iterator it = this.f13705c.values().iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                it.remove();
                if (gVar2.f13699e && (iVar = this.d) != null) {
                    iVar.t(aVar, gVar2.f13696a);
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
        return c(k1Var.g(f0Var.f48674a, this.f13704b).f3329c, f0Var).f13696a;
    }

    public final void e(a aVar) {
        f0 f0Var;
        k1 k1Var = aVar.f13677b;
        int i10 = aVar.f13678c;
        f0 f0Var2 = aVar.d;
        boolean p5 = k1Var.p();
        HashMap hashMap = this.f13705c;
        if (p5) {
            String str = this.f13707f;
            if (str != null) {
                g gVar = (g) hashMap.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) hashMap.get(this.f13707f);
        this.f13707f = c(i10, f0Var2).f13696a;
        f(aVar);
        if (f0Var2 != null) {
            long j3 = f0Var2.d;
            if (f0Var2.b()) {
                if (gVar2 == null || gVar2.f13698c != j3 || (f0Var = gVar2.d) == null || f0Var.f48675b != f0Var2.f48675b || f0Var.f48676c != f0Var2.f48676c) {
                    c(i10, new f0(f0Var2.f48674a, j3));
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
            Iterator it = this.f13705c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    if (gVar.f13699e) {
                        boolean equals = gVar.f13696a.equals(this.f13707f);
                        if (z10 && equals) {
                            boolean z11 = gVar.f13700f;
                        }
                        if (equals) {
                            a(gVar);
                        }
                        this.d.t(aVar, gVar.f13696a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
