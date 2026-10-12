package j4;

import c3.i0;
import e2.m0;
import i2.o0;
public final class q implements i {
    public final c0 f12728a;
    public final boolean f12729b;
    public final boolean f12730c;
    public long f12732g;
    public String f12733i;
    public i0 f12734j;
    public p f12735k;
    public boolean f12736l;
    public boolean f12738n;
    public final boolean[] h = new boolean[3];
    public final o0 d = new o0(7);
    public final o0 e = new o0(8);
    public final o0 f12731f = new o0(6);
    public long f12737m = -9223372036854775807L;
    public final e2.x f12739o = new e2.x();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f12728a = c0Var;
        this.f12729b = z10;
        this.f12730c = z11;
    }

    @Override
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        this.f12734j.getClass();
        String str = m0.f8372a;
        int i12 = xVar.f8412b;
        int i13 = xVar.f8413c;
        byte[] bArr = xVar.f8411a;
        this.f12732g += xVar.a();
        this.f12734j.d(xVar.a(), xVar);
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
            long j10 = this.f12732g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            b(j10, i16, i11, this.f12737m);
            h(i14, j10, this.f12737m);
            i12 = c10 + i10;
        }
    }

    public final void b(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.b(long, int, int, long):void");
    }

    @Override
    public final void c() {
        this.f12732g = 0L;
        this.f12738n = false;
        this.f12737m = -9223372036854775807L;
        f2.p.b(this.h);
        this.d.g();
        this.e.g();
        this.f12731f.g();
        this.f12728a.d.c(0);
        p pVar = this.f12735k;
        if (pVar != null) {
            pVar.f12719k = false;
            pVar.f12723o = false;
            o oVar = pVar.f12722n;
            oVar.f12700b = false;
            oVar.f12699a = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f12733i = (String) f0Var.e;
        f0Var.c();
        i0 a02 = qVar.a0(f0Var.f12643c, 2);
        this.f12734j = a02;
        this.f12735k = new p(a02, this.f12729b, this.f12730c);
        this.f12728a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f12734j.getClass();
        String str = m0.f8372a;
        if (z10) {
            this.f12728a.d.c(0);
            b(this.f12732g, 0, 0, this.f12737m);
            h(9, this.f12732g, this.f12737m);
            b(this.f12732g, 0, 0, this.f12737m);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        boolean z10;
        this.f12737m = j10;
        boolean z11 = this.f12738n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12738n = z10 | z11;
    }

    public final void g(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.g(int, int, byte[]):void");
    }

    public final void h(int i10, long j10, long j11) {
        if (!this.f12736l || this.f12735k.f12714c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f12731f.h(i10);
        p pVar = this.f12735k;
        boolean z10 = this.f12738n;
        pVar.f12717i = i10;
        pVar.f12720l = j11;
        pVar.f12718j = j10;
        pVar.f12727s = z10;
        if (!pVar.f12713b || i10 != 1) {
            if (pVar.f12714c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f12721m;
        pVar.f12721m = pVar.f12722n;
        pVar.f12722n = oVar;
        oVar.f12700b = false;
        oVar.f12699a = false;
        pVar.h = 0;
        pVar.f12719k = true;
    }
}
