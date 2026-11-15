package m4;

import f3.i0;
import l2.l0;
public final class q implements i {
    public final c0 f20347a;
    public final boolean f20348b;
    public final boolean f20349c;
    public long f20352g;
    public String f20353i;
    public i0 f20354j;
    public p f20355k;
    public boolean f20356l;
    public boolean f20358n;
    public final boolean[] h = new boolean[3];
    public final l0 d = new l0(7);
    public final l0 f20350e = new l0(8);
    public final l0 f20351f = new l0(6);
    public long f20357m = -9223372036854775807L;
    public final h2.x f20359o = new h2.x();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f20347a = c0Var;
        this.f20348b = z10;
        this.f20349c = z11;
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
        this.f20354j.getClass();
        String str = h2.l0.f13471a;
        int i11 = xVar.f13522b;
        int i12 = xVar.f13523c;
        byte[] bArr = xVar.f13521a;
        this.f20352g += xVar.a();
        this.f20354j.b(xVar.a(), xVar);
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
            long j3 = this.f20352g - i17;
            if (i16 < 0) {
                i10 = -i16;
            } else {
                i10 = 0;
            }
            a(j3, this.f20357m, i17, i10);
            h(j3, i13, this.f20357m);
            i11 = i14 + i15;
        }
    }

    @Override
    public final void d() {
        this.f20352g = 0L;
        this.f20358n = false;
        this.f20357m = -9223372036854775807L;
        i2.o.b(this.h);
        this.d.g();
        this.f20350e.g();
        this.f20351f.g();
        this.f20347a.d.r(0);
        p pVar = this.f20355k;
        if (pVar != null) {
            pVar.f20338k = false;
            pVar.f20342o = false;
            o oVar = pVar.f20341n;
            oVar.f20317b = false;
            oVar.f20316a = false;
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f20354j.getClass();
        String str = h2.l0.f13471a;
        if (z10) {
            this.f20347a.d.r(0);
            a(this.f20352g, this.f20357m, 0, 0);
            h(this.f20352g, 9, this.f20357m);
            a(this.f20352g, this.f20357m, 0, 0);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        boolean z10;
        this.f20357m = j3;
        boolean z11 = this.f20358n;
        if ((i7 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20358n = z10 | z11;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20353i = (String) f0Var.f20253e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20252c, 2);
        this.f20354j = d2;
        this.f20355k = new p(d2, this.f20348b, this.f20349c);
        this.f20347a.b(qVar, f0Var);
    }

    public final void h(long j3, int i7, long j10) {
        if (!this.f20356l || this.f20355k.f20332c) {
            this.d.h(i7);
            this.f20350e.h(i7);
        }
        this.f20351f.h(i7);
        p pVar = this.f20355k;
        boolean z10 = this.f20358n;
        pVar.f20336i = i7;
        pVar.f20339l = j10;
        pVar.f20337j = j3;
        pVar.f20346s = z10;
        if (!pVar.f20331b || i7 != 1) {
            if (pVar.f20332c) {
                if (i7 != 5 && i7 != 1 && i7 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f20340m;
        pVar.f20340m = pVar.f20341n;
        pVar.f20341n = oVar;
        oVar.f20317b = false;
        oVar.f20316a = false;
        pVar.h = 0;
        pVar.f20338k = true;
    }
}
