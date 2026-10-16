package j4;

import c3.i0;
import e2.m0;
import i2.o0;
public final class q implements i {
    public final c0 f12732a;
    public final boolean f12733b;
    public final boolean f12734c;
    public long f12736g;
    public String f12737i;
    public i0 f12738j;
    public p f12739k;
    public boolean f12740l;
    public boolean f12742n;
    public final boolean[] h = new boolean[3];
    public final o0 d = new o0(7);
    public final o0 e = new o0(8);
    public final o0 f12735f = new o0(6);
    public long f12741m = -9223372036854775807L;
    public final e2.x f12743o = new e2.x();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f12732a = c0Var;
        this.f12733b = z10;
        this.f12734c = z11;
    }

    @Override
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        this.f12738j.getClass();
        String str = m0.f8375a;
        int i12 = xVar.f8415b;
        int i13 = xVar.f8416c;
        byte[] bArr = xVar.f8414a;
        this.f12736g += xVar.a();
        this.f12738j.d(xVar.a(), xVar);
        while (true) {
            int c10 = f2.p.c(bArr, i12, i13, this.h);
            if (c10 == i13) {
                g(i12, i13, bArr);
                return;
            }
            int i14 = bArr[c10 + 3] & 31;
            if (c10 > 0 && bArr[c10 - 1] == 0) {
                c10--;
                i10 = 4;
            } else {
                i10 = 3;
            }
            int i15 = c10 - i12;
            if (i15 > 0) {
                g(i12, c10, bArr);
            }
            int i16 = i13 - c10;
            long j10 = this.f12736g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            b(j10, i16, i11, this.f12741m);
            h(i14, j10, this.f12741m);
            i12 = c10 + i10;
        }
    }

    public final void b(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.b(long, int, int, long):void");
    }

    @Override
    public final void c() {
        this.f12736g = 0L;
        this.f12742n = false;
        this.f12741m = -9223372036854775807L;
        f2.p.b(this.h);
        this.d.g();
        this.e.g();
        this.f12735f.g();
        this.f12732a.d.c(0);
        p pVar = this.f12739k;
        if (pVar != null) {
            pVar.f12723k = false;
            pVar.f12727o = false;
            o oVar = pVar.f12726n;
            oVar.f12704b = false;
            oVar.f12703a = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f12737i = (String) f0Var.e;
        f0Var.c();
        i0 W = qVar.W(f0Var.f12647c, 2);
        this.f12738j = W;
        this.f12739k = new p(W, this.f12733b, this.f12734c);
        this.f12732a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f12738j.getClass();
        String str = m0.f8375a;
        if (z10) {
            this.f12732a.d.c(0);
            b(this.f12736g, 0, 0, this.f12741m);
            h(9, this.f12736g, this.f12741m);
            b(this.f12736g, 0, 0, this.f12741m);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        boolean z10;
        this.f12741m = j10;
        boolean z11 = this.f12742n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12742n = z10 | z11;
    }

    public final void g(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.g(int, int, byte[]):void");
    }

    public final void h(int i10, long j10, long j11) {
        if (!this.f12740l || this.f12739k.f12718c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f12735f.h(i10);
        p pVar = this.f12739k;
        boolean z10 = this.f12742n;
        pVar.f12721i = i10;
        pVar.f12724l = j11;
        pVar.f12722j = j10;
        pVar.f12731s = z10;
        if (!pVar.f12717b || i10 != 1) {
            if (pVar.f12718c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f12725m;
        pVar.f12725m = pVar.f12726n;
        pVar.f12726n = oVar;
        oVar.f12704b = false;
        oVar.f12703a = false;
        pVar.h = 0;
        pVar.f12723k = true;
    }
}
