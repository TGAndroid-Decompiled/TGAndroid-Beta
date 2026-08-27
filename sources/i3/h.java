package i3;

import d5.g0;
import h3.p2;
import h3.q;
import h3.r2;
import h3.s2;
import j4.c0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public final class h {

    public static final q f10543g = new q(1);
    public static final Random h = new Random();
    public i d;

    public String f10548f;

    public final r2 f10544a = new r2();

    public final p2 f10545b = new p2();

    public final HashMap f10546c = new HashMap();

    public s2 f10547e = s2.f8156a;

    public final synchronized void a(a aVar) {
        i iVar;
        this.f10548f = null;
        Iterator it = this.f10546c.values().iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            if (gVar.f10540e && (iVar = this.d) != null) {
                iVar.n(aVar, gVar.f10537a);
            }
        }
    }

    public final g b(int i10, c0 c0Var) {
        long j10;
        HashMap map = this.f10546c;
        g gVar = null;
        long j11 = Long.MAX_VALUE;
        for (g gVar2 : map.values()) {
            long j12 = gVar2.f10539c;
            c0 c0Var2 = gVar2.d;
            if (j12 == -1 && i10 == gVar2.f10538b && c0Var != null) {
                gVar2.f10539c = c0Var.d;
            }
            if (c0Var != null) {
                long j13 = c0Var.d;
                if (c0Var2 == null) {
                    if (!c0Var.a() && j13 == gVar2.f10539c) {
                        j10 = gVar2.f10539c;
                        if (j10 != -1) {
                        }
                        gVar = gVar2;
                        j11 = j10;
                    }
                } else if (j13 == c0Var2.d && c0Var.f12504b == c0Var2.f12504b && c0Var.f12505c == c0Var2.f12505c) {
                    j10 = gVar2.f10539c;
                    if (j10 != -1) {
                    }
                    gVar = gVar2;
                    j11 = j10;
                }
            } else if (i10 == gVar2.f10538b) {
                j10 = gVar2.f10539c;
                if (j10 != -1 || j10 < j11) {
                    gVar = gVar2;
                    j11 = j10;
                } else if (j10 == j11) {
                    int i11 = g0.f4795a;
                    if (gVar.d != null && c0Var2 != null) {
                        gVar = gVar2;
                    }
                }
            }
        }
        if (gVar != null) {
            return gVar;
        }
        String str = (String) f10543g.get();
        g gVar3 = new g(this, str, i10, c0Var);
        map.put(str, gVar3);
        return gVar3;
    }

    public final synchronized String c(s2 s2Var, c0 c0Var) {
        return b(s2Var.g(c0Var.f12503a, this.f10545b).f8069c, c0Var).f10537a;
    }

    public final void d(a aVar) {
        c0 c0Var;
        s2 s2Var = aVar.f10517b;
        int i10 = aVar.f10518c;
        c0 c0Var2 = aVar.d;
        if (s2Var.p()) {
            this.f10548f = null;
            return;
        }
        g gVar = (g) this.f10546c.get(this.f10548f);
        this.f10548f = b(i10, c0Var2).f10537a;
        e(aVar);
        if (c0Var2 != null) {
            long j10 = c0Var2.d;
            if (c0Var2.a()) {
                if (gVar != null && gVar.f10539c == j10 && (c0Var = gVar.d) != null && c0Var.f12504b == c0Var2.f12504b && c0Var.f12505c == c0Var2.f12505c) {
                    return;
                }
                b(i10, new c0(c0Var2.f12503a, j10));
                this.d.getClass();
            }
        }
    }

    public final synchronized void e(i3.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: i3.h.e(i3.a):void");
    }

    public final synchronized void f(a aVar, int i10) {
        try {
            this.d.getClass();
            boolean z10 = i10 == 0;
            Iterator it = this.f10546c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    if (gVar.f10540e) {
                        boolean zEquals = gVar.f10537a.equals(this.f10548f);
                        if (z10 && zEquals) {
                            boolean z11 = gVar.f10541f;
                        }
                        if (zEquals) {
                            this.f10548f = null;
                        }
                        this.d.n(aVar, gVar.f10537a);
                    }
                }
            }
            d(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
