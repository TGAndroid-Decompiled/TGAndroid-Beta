package l2;

import c3.q;
import d2.k1;
import d2.m1;
import d2.n1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import w2.g0;
public final class h {
    public static final q h = new q(4);
    public static final Random f17707i = new Random();
    public i d;
    public String f17712f;
    public final m1 f17708a = new m1();
    public final k1 f17709b = new k1();
    public final HashMap f17710c = new HashMap();
    public n1 f17711e = n1.f8245a;
    public long f17713g = -1;

    public final void a(g gVar) {
        long j10 = gVar.f17703c;
        if (j10 != -1 && gVar.f17704e) {
            this.f17713g = j10;
        }
        this.f17712f = null;
    }

    public final synchronized void b(a aVar) {
        i iVar;
        try {
            String str = this.f17712f;
            if (str != null) {
                g gVar = (g) this.f17710c.get(str);
                gVar.getClass();
                a(gVar);
            }
            Iterator it = this.f17710c.values().iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                it.remove();
                if (gVar2.f17704e && (iVar = this.d) != null) {
                    iVar.o(aVar, gVar2.f17701a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final l2.g c(int r19, w2.g0 r20) {
        throw new UnsupportedOperationException("Method not decompiled: l2.h.c(int, w2.g0):l2.g");
    }

    public final synchronized String d(n1 n1Var, g0 g0Var) {
        return c(n1Var.g(g0Var.f57081a, this.f17709b).f8163c, g0Var).f17701a;
    }

    public final void e(a aVar) {
        g0 g0Var;
        n1 n1Var = aVar.f17680b;
        int i3 = aVar.f17681c;
        g0 g0Var2 = aVar.d;
        boolean p10 = n1Var.p();
        HashMap hashMap = this.f17710c;
        if (p10) {
            String str = this.f17712f;
            if (str != null) {
                g gVar = (g) hashMap.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) hashMap.get(this.f17712f);
        this.f17712f = c(i3, g0Var2).f17701a;
        f(aVar);
        if (g0Var2 != null) {
            long j10 = g0Var2.d;
            if (g0Var2.b()) {
                if (gVar2 == null || gVar2.f17703c != j10 || (g0Var = gVar2.d) == null || g0Var.f57082b != g0Var2.f57082b || g0Var.f57083c != g0Var2.f57083c) {
                    c(i3, new g0(g0Var2.f57081a, j10));
                    this.d.getClass();
                }
            }
        }
    }

    public final synchronized void f(l2.a r10) {
        throw new UnsupportedOperationException("Method not decompiled: l2.h.f(l2.a):void");
    }

    public final synchronized void g(a aVar, int i3) {
        boolean z10;
        try {
            this.d.getClass();
            if (i3 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iterator it = this.f17710c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    boolean equals = gVar.f17701a.equals(this.f17712f);
                    if (equals) {
                        a(gVar);
                    }
                    if (gVar.f17704e) {
                        if (z10 && equals) {
                            boolean z11 = gVar.f17705f;
                        }
                        this.d.o(aVar, gVar.f17701a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
