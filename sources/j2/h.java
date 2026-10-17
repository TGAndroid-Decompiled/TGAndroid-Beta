package j2;

import a3.s;
import b2.l1;
import b2.n1;
import b2.o1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import u2.g0;
public final class h {
    public static final s h = new s(4);
    public static final Random f13945i = new Random();
    public i d;
    public String f13949f;
    public final n1 f13946a = new n1();
    public final l1 f13947b = new l1();
    public final HashMap f13948c = new HashMap();
    public o1 e = o1.f3893a;
    public long f13950g = -1;

    public final void a(g gVar) {
        long j10 = gVar.f13942c;
        if (j10 != -1 && gVar.e) {
            this.f13950g = j10;
        }
        this.f13949f = null;
    }

    public final synchronized void b(a aVar) {
        i iVar;
        try {
            String str = this.f13949f;
            if (str != null) {
                g gVar = (g) this.f13948c.get(str);
                gVar.getClass();
                a(gVar);
            }
            Iterator it = this.f13948c.values().iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                it.remove();
                if (gVar2.e && (iVar = this.d) != null) {
                    iVar.t(aVar, gVar2.f13940a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final j2.g c(int r19, u2.g0 r20) {
        throw new UnsupportedOperationException("Method not decompiled: j2.h.c(int, u2.g0):j2.g");
    }

    public final synchronized String d(o1 o1Var, g0 g0Var) {
        return c(o1Var.g(g0Var.f47327a, this.f13947b).f3825c, g0Var).f13940a;
    }

    public final void e(a aVar) {
        g0 g0Var;
        o1 o1Var = aVar.f13923b;
        int i10 = aVar.f13924c;
        g0 g0Var2 = aVar.d;
        boolean p5 = o1Var.p();
        HashMap hashMap = this.f13948c;
        if (p5) {
            String str = this.f13949f;
            if (str != null) {
                g gVar = (g) hashMap.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) hashMap.get(this.f13949f);
        this.f13949f = c(i10, g0Var2).f13940a;
        f(aVar);
        if (g0Var2 != null) {
            long j10 = g0Var2.d;
            if (g0Var2.b()) {
                if (gVar2 == null || gVar2.f13942c != j10 || (g0Var = gVar2.d) == null || g0Var.f47328b != g0Var2.f47328b || g0Var.f47329c != g0Var2.f47329c) {
                    c(i10, new g0(g0Var2.f47327a, j10));
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
            Iterator it = this.f13948c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    boolean equals = gVar.f13940a.equals(this.f13949f);
                    if (equals) {
                        a(gVar);
                    }
                    if (gVar.e) {
                        if (z10 && equals) {
                            boolean z11 = gVar.f13943f;
                        }
                        this.d.t(aVar, gVar.f13940a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
