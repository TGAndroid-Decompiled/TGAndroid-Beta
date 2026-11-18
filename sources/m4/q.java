package m4;

import f3.i0;
import l2.l0;
public final class q implements i {
    public final c0 f20711a;
    public final boolean f20712b;
    public final boolean f20713c;
    public long f20716g;
    public String f20717i;
    public i0 f20718j;
    public p f20719k;
    public boolean f20720l;
    public boolean f20722n;
    public final boolean[] h = new boolean[3];
    public final l0 d = new l0(7);
    public final l0 f20714e = new l0(8);
    public final l0 f20715f = new l0(6);
    public long f20721m = -9223372036854775807L;
    public final h2.x f20723o = new h2.x();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f20711a = c0Var;
        this.f20712b = z10;
        this.f20713c = z11;
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
        this.f20718j.getClass();
        String str = h2.l0.f13786a;
        int i11 = xVar.f13837b;
        int i12 = xVar.f13838c;
        byte[] bArr = xVar.f13836a;
        this.f20716g += xVar.a();
        this.f20718j.b(xVar.a(), xVar);
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
            long j3 = this.f20716g - i17;
            if (i16 < 0) {
                i10 = -i16;
            } else {
                i10 = 0;
            }
            a(j3, this.f20721m, i17, i10);
            h(j3, i13, this.f20721m);
            i11 = i14 + i15;
        }
    }

    @Override
    public final void d() {
        this.f20716g = 0L;
        this.f20722n = false;
        this.f20721m = -9223372036854775807L;
        i2.o.b(this.h);
        this.d.g();
        this.f20714e.g();
        this.f20715f.g();
        this.f20711a.d.r(0);
        p pVar = this.f20719k;
        if (pVar != null) {
            pVar.f20702k = false;
            pVar.f20706o = false;
            o oVar = pVar.f20705n;
            oVar.f20681b = false;
            oVar.f20680a = false;
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f20718j.getClass();
        String str = h2.l0.f13786a;
        if (z10) {
            this.f20711a.d.r(0);
            a(this.f20716g, this.f20721m, 0, 0);
            h(this.f20716g, 9, this.f20721m);
            a(this.f20716g, this.f20721m, 0, 0);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        boolean z10;
        this.f20721m = j3;
        boolean z11 = this.f20722n;
        if ((i7 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20722n = z10 | z11;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20717i = (String) f0Var.f20617e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20616c, 2);
        this.f20718j = d2;
        this.f20719k = new p(d2, this.f20712b, this.f20713c);
        this.f20711a.b(qVar, f0Var);
    }

    public final void h(long j3, int i7, long j10) {
        if (!this.f20720l || this.f20719k.f20696c) {
            this.d.h(i7);
            this.f20714e.h(i7);
        }
        this.f20715f.h(i7);
        p pVar = this.f20719k;
        boolean z10 = this.f20722n;
        pVar.f20700i = i7;
        pVar.f20703l = j10;
        pVar.f20701j = j3;
        pVar.f20710s = z10;
        if (!pVar.f20695b || i7 != 1) {
            if (pVar.f20696c) {
                if (i7 != 5 && i7 != 1 && i7 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f20704m;
        pVar.f20704m = pVar.f20705n;
        pVar.f20705n = oVar;
        oVar.f20681b = false;
        oVar.f20680a = false;
        pVar.h = 0;
        pVar.f20702k = true;
    }
}
