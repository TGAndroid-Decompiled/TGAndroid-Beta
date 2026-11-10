package m4;

import f3.j0;
import h2.m0;
import l2.o0;
public final class q implements i {
    public final c0 f19758a;
    public final boolean f19759b;
    public final boolean f19760c;
    public long f19763g;
    public String f19764i;
    public j0 f19765j;
    public p f19766k;
    public boolean f19767l;
    public boolean f19769n;
    public final boolean[] h = new boolean[3];
    public final o0 d = new o0(7);
    public final o0 f19761e = new o0(8);
    public final o0 f19762f = new o0(6);
    public long f19768m = -9223372036854775807L;
    public final h2.x f19770o = new h2.x();

    public q(c0 c0Var, boolean z9, boolean z10) {
        this.f19758a = c0Var;
        this.f19759b = z9;
        this.f19760c = z10;
    }

    public final void a(long r26, long r28, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: m4.q.a(long, long, int, int):void");
    }

    public final void b(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: m4.q.b(int, int, byte[]):void");
    }

    @Override
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        this.f19765j.getClass();
        String str = m0.f14114a;
        int i11 = xVar.f14165b;
        int i12 = xVar.f14166c;
        byte[] bArr = xVar.f14164a;
        this.f19763g += xVar.a();
        this.f19765j.b(xVar.a(), xVar);
        while (true) {
            int c10 = i2.o.c(bArr, i11, i12, this.h);
            if (c10 == i12) {
                b(i11, i12, bArr);
                return;
            }
            int i13 = bArr[c10 + 3] & 31;
            if (c10 > 0 && bArr[c10 - 1] == 0) {
                c10--;
                i7 = 4;
            } else {
                i7 = 3;
            }
            int i14 = c10;
            int i15 = i7;
            int i16 = i14 - i11;
            if (i16 > 0) {
                b(i11, i14, bArr);
            }
            int i17 = i12 - i14;
            long j3 = this.f19763g - i17;
            if (i16 < 0) {
                i10 = -i16;
            } else {
                i10 = 0;
            }
            a(j3, this.f19768m, i17, i10);
            h(j3, i13, this.f19768m);
            i11 = i14 + i15;
        }
    }

    @Override
    public final void d() {
        this.f19763g = 0L;
        this.f19769n = false;
        this.f19768m = -9223372036854775807L;
        i2.o.b(this.h);
        this.d.g();
        this.f19761e.g();
        this.f19762f.g();
        this.f19758a.d.r(0);
        p pVar = this.f19766k;
        if (pVar != null) {
            pVar.f19749k = false;
            pVar.f19753o = false;
            o oVar = pVar.f19752n;
            oVar.f19728b = false;
            oVar.f19727a = false;
        }
    }

    @Override
    public final void e(boolean z9) {
        this.f19765j.getClass();
        String str = m0.f14114a;
        if (z9) {
            this.f19758a.d.r(0);
            a(this.f19763g, this.f19768m, 0, 0);
            h(this.f19763g, 9, this.f19768m);
            a(this.f19763g, this.f19768m, 0, 0);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        boolean z9;
        this.f19768m = j3;
        boolean z10 = this.f19769n;
        if ((i7 & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f19769n = z9 | z10;
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f19764i = (String) g0Var.f19679e;
        g0Var.c();
        j0 O1 = qVar.O1(g0Var.f19678c, 2);
        this.f19765j = O1;
        this.f19766k = new p(O1, this.f19759b, this.f19760c);
        this.f19758a.b(qVar, g0Var);
    }

    public final void h(long j3, int i7, long j10) {
        if (!this.f19767l || this.f19766k.f19743c) {
            this.d.h(i7);
            this.f19761e.h(i7);
        }
        this.f19762f.h(i7);
        p pVar = this.f19766k;
        boolean z9 = this.f19769n;
        pVar.f19747i = i7;
        pVar.f19750l = j10;
        pVar.f19748j = j3;
        pVar.f19757s = z9;
        if (!pVar.f19742b || i7 != 1) {
            if (pVar.f19743c) {
                if (i7 != 5 && i7 != 1 && i7 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f19751m;
        pVar.f19751m = pVar.f19752n;
        pVar.f19752n = oVar;
        oVar.f19728b = false;
        oVar.f19727a = false;
        pVar.h = 0;
        pVar.f19749k = true;
    }
}
