package i3;

import h3.p2;
import h3.q;
import h3.q2;
import h3.r2;
import j4.b0;
import j4.d0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
public final class h {
    public static final q f10902g = new q(1);
    public static final Random h = new Random();
    public j d;
    public String f10907f;
    public final q2 f10903a = new q2();
    public final p2 f10904b = new p2();
    public final HashMap f10905c = new HashMap();
    public r2 f10906e = r2.f9692a;

    public final synchronized void a(a aVar) {
        j jVar;
        this.f10907f = null;
        Iterator it = this.f10905c.values().iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            if (gVar.f10899e && (jVar = this.d) != null) {
                jVar.n(aVar, gVar.f10896a);
            }
        }
    }

    public final i3.g b(int r18, j4.d0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: i3.h.b(int, j4.d0):i3.g");
    }

    public final synchronized String c(r2 r2Var, d0 d0Var) {
        return b(r2Var.g(d0Var.f13426a, this.f10904b).f9639c, d0Var).f10896a;
    }

    public final void d(a aVar) {
        d0 d0Var;
        r2 r2Var = aVar.f10876b;
        int i9 = aVar.f10877c;
        d0 d0Var2 = aVar.d;
        if (r2Var.p()) {
            this.f10907f = null;
            return;
        }
        g gVar = (g) this.f10905c.get(this.f10907f);
        this.f10907f = b(i9, d0Var2).f10896a;
        e(aVar);
        if (d0Var2 != null) {
            long j10 = d0Var2.d;
            if (d0Var2.a()) {
                if (gVar == null || gVar.f10898c != j10 || (d0Var = gVar.d) == null || d0Var.f13427b != d0Var2.f13427b || d0Var.f13428c != d0Var2.f13428c) {
                    b(i9, new b0(d0Var2.f13426a, j10));
                    this.d.getClass();
                }
            }
        }
    }

    public final synchronized void e(i3.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: i3.h.e(i3.a):void");
    }

    public final synchronized void f(a aVar, int i9) {
        boolean z10;
        try {
            this.d.getClass();
            if (i9 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iterator it = this.f10905c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    if (gVar.f10899e) {
                        boolean equals = gVar.f10896a.equals(this.f10907f);
                        if (z10 && equals) {
                            boolean z11 = gVar.f10900f;
                        }
                        if (equals) {
                            this.f10907f = null;
                        }
                        this.d.n(aVar, gVar.f10896a);
                    }
                }
            }
            d(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
