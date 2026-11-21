package m4;

import f3.i0;
import l2.l0;
public final class q implements i {
    public final c0 f20736a;
    public final boolean f20737b;
    public final boolean f20738c;
    public long f20741g;
    public String f20742i;
    public i0 f20743j;
    public p f20744k;
    public boolean f20745l;
    public boolean f20747n;
    public final boolean[] h = new boolean[3];
    public final l0 d = new l0(7);
    public final l0 f20739e = new l0(8);
    public final l0 f20740f = new l0(6);
    public long f20746m = -9223372036854775807L;
    public final h2.x f20748o = new h2.x();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f20736a = c0Var;
        this.f20737b = z10;
        this.f20738c = z11;
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
        this.f20743j.getClass();
        String str = h2.l0.f13812a;
        int i11 = xVar.f13863b;
        int i12 = xVar.f13864c;
        byte[] bArr = xVar.f13862a;
        this.f20741g += xVar.a();
        this.f20743j.b(xVar.a(), xVar);
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
            long j3 = this.f20741g - i17;
            if (i16 < 0) {
                i10 = -i16;
            } else {
                i10 = 0;
            }
            a(j3, this.f20746m, i17, i10);
            h(j3, i13, this.f20746m);
            i11 = i14 + i15;
        }
    }

    @Override
    public final void d() {
        this.f20741g = 0L;
        this.f20747n = false;
        this.f20746m = -9223372036854775807L;
        i2.o.b(this.h);
        this.d.g();
        this.f20739e.g();
        this.f20740f.g();
        this.f20736a.d.r(0);
        p pVar = this.f20744k;
        if (pVar != null) {
            pVar.f20727k = false;
            pVar.f20731o = false;
            o oVar = pVar.f20730n;
            oVar.f20706b = false;
            oVar.f20705a = false;
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f20743j.getClass();
        String str = h2.l0.f13812a;
        if (z10) {
            this.f20736a.d.r(0);
            a(this.f20741g, this.f20746m, 0, 0);
            h(this.f20741g, 9, this.f20746m);
            a(this.f20741g, this.f20746m, 0, 0);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        boolean z10;
        this.f20746m = j3;
        boolean z11 = this.f20747n;
        if ((i7 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20747n = z10 | z11;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20742i = (String) f0Var.f20642e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20641c, 2);
        this.f20743j = d2;
        this.f20744k = new p(d2, this.f20737b, this.f20738c);
        this.f20736a.b(qVar, f0Var);
    }

    public final void h(long j3, int i7, long j10) {
        if (!this.f20745l || this.f20744k.f20721c) {
            this.d.h(i7);
            this.f20739e.h(i7);
        }
        this.f20740f.h(i7);
        p pVar = this.f20744k;
        boolean z10 = this.f20747n;
        pVar.f20725i = i7;
        pVar.f20728l = j10;
        pVar.f20726j = j3;
        pVar.f20735s = z10;
        if (!pVar.f20720b || i7 != 1) {
            if (pVar.f20721c) {
                if (i7 != 5 && i7 != 1 && i7 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f20729m;
        pVar.f20729m = pVar.f20730n;
        pVar.f20730n = oVar;
        oVar.f20706b = false;
        oVar.f20705a = false;
        pVar.h = 0;
        pVar.f20727k = true;
    }
}
