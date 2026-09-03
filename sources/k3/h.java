package k3;

import j3.m2;
import j3.n2;
import j3.o2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import o4.u;
import o4.v;
public final class h {
    public static final e h = new e(7);
    public static final Random f9698i = new Random();
    public i d;
    public String f9702f;
    public final n2 f9699a = new n2();
    public final m2 f9700b = new m2();
    public final HashMap f9701c = new HashMap();
    public o2 e = o2.f8748a;
    public long f9703g = -1;

    public final void a(g gVar) {
        long j10 = gVar.f9695c;
        if (j10 != -1) {
            this.f9703g = j10;
        }
        this.f9702f = null;
    }

    public final synchronized void b(a aVar) {
        i iVar;
        try {
            String str = this.f9702f;
            if (str != null) {
                g gVar = (g) this.f9701c.get(str);
                gVar.getClass();
                a(gVar);
            }
            Iterator it = this.f9701c.values().iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                it.remove();
                if (gVar2.e && (iVar = this.d) != null) {
                    iVar.m(aVar, gVar2.f9693a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final k3.g c(int r19, o4.v r20) {
        throw new UnsupportedOperationException("Method not decompiled: k3.h.c(int, o4.v):k3.g");
    }

    public final synchronized String d(o2 o2Var, v vVar) {
        return c(o2Var.g(vVar.f16406a, this.f9700b).f8686c, vVar).f9693a;
    }

    public final void e(a aVar) {
        v vVar;
        o2 o2Var = aVar.f9676b;
        int i10 = aVar.f9677c;
        v vVar2 = aVar.d;
        boolean p10 = o2Var.p();
        HashMap hashMap = this.f9701c;
        if (p10) {
            String str = this.f9702f;
            if (str != null) {
                g gVar = (g) hashMap.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) hashMap.get(this.f9702f);
        this.f9702f = c(i10, vVar2).f9693a;
        f(aVar);
        if (vVar2 != null) {
            long j10 = vVar2.d;
            if (vVar2.a()) {
                if (gVar2 == null || gVar2.f9695c != j10 || (vVar = gVar2.d) == null || vVar.f16407b != vVar2.f16407b || vVar.f16408c != vVar2.f16408c) {
                    c(i10, new u(vVar2.f16406a, j10));
                    this.d.getClass();
                }
            }
        }
    }

    public final synchronized void f(k3.a r10) {
        throw new UnsupportedOperationException("Method not decompiled: k3.h.f(k3.a):void");
    }

    public final synchronized void g(a aVar, int i10) {
        boolean z4;
        try {
            this.d.getClass();
            if (i10 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            Iterator it = this.f9701c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    if (gVar.e) {
                        boolean equals = gVar.f9693a.equals(this.f9702f);
                        if (z4 && equals) {
                            boolean z10 = gVar.f9696f;
                        }
                        if (equals) {
                            a(gVar);
                        }
                        this.d.m(aVar, gVar.f9693a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
