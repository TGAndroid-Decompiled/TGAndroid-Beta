package j4;

import i2.k0;
public final class q implements i {
    public final d0 f11665a;
    public final boolean f11666b;
    public final boolean f11667c;
    public long f11669g;
    public String f11670i;
    public c3.h0 f11671j;
    public p f11672k;
    public boolean f11673l;
    public boolean f11675n;
    public final boolean[] h = new boolean[3];
    public final k0 d = new k0(7);
    public final k0 e = new k0(8);
    public final k0 f11668f = new k0(6);
    public long f11674m = -9223372036854775807L;
    public final e2.v f11676o = new e2.v();

    public q(d0 d0Var, boolean z10, boolean z11) {
        this.f11665a = d0Var;
        this.f11666b = z10;
        this.f11667c = z11;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f11671j);
        String str = e2.d0.f7188a;
        int i12 = vVar.f7235b;
        int i13 = vVar.f7236c;
        byte[] bArr = vVar.f7234a;
        this.f11669g += vVar.a();
        this.f11671j.d(vVar.a(), vVar);
        while (true) {
            int b10 = f2.o.b(bArr, i12, i13, this.h);
            if (b10 == i13) {
                g(i12, i13, bArr);
                return;
            }
            int i14 = bArr[b10 + 3] & 31;
            if (b10 > 0 && bArr[b10 - 1] == 0) {
                b10--;
                i10 = 4;
            } else {
                i10 = 3;
            }
            int i15 = b10 - i12;
            if (i15 > 0) {
                g(i12, b10, bArr);
            }
            int i16 = i13 - b10;
            long j3 = this.f11669g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            f(j3, i16, i11, this.f11674m);
            h(i14, j3, this.f11674m);
            i12 = b10 + i10;
        }
    }

    @Override
    public final void b() {
        this.f11669g = 0L;
        this.f11675n = false;
        this.f11674m = -9223372036854775807L;
        f2.o.a(this.h);
        this.d.g();
        this.e.g();
        this.f11668f.g();
        this.f11665a.d.c(0);
        p pVar = this.f11672k;
        if (pVar != null) {
            pVar.f11656k = false;
            pVar.f11660o = false;
            o oVar = pVar.f11659n;
            oVar.f11637b = false;
            oVar.f11636a = false;
        }
    }

    @Override
    public final void c(c3.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f11670i = g0Var.e;
        g0Var.b();
        c3.h0 I = qVar.I(g0Var.d, 2);
        this.f11671j = I;
        this.f11672k = new p(I, this.f11666b, this.f11667c);
        this.f11665a.b(qVar, g0Var);
    }

    @Override
    public final void d(boolean z10) {
        e2.d.h(this.f11671j);
        String str = e2.d0.f7188a;
        if (z10) {
            this.f11665a.d.c(0);
            f(this.f11669g, 0, 0, this.f11674m);
            h(9, this.f11669g, this.f11674m);
            f(this.f11669g, 0, 0, this.f11674m);
        }
    }

    @Override
    public final void e(int i10, long j3) {
        boolean z10;
        this.f11674m = j3;
        boolean z11 = this.f11675n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11675n = z10 | z11;
    }

    public final void f(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.f(long, int, int, long):void");
    }

    public final void g(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.g(int, int, byte[]):void");
    }

    public final void h(int i10, long j3, long j10) {
        if (!this.f11673l || this.f11672k.f11651c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f11668f.h(i10);
        p pVar = this.f11672k;
        boolean z10 = this.f11675n;
        pVar.f11654i = i10;
        pVar.f11657l = j10;
        pVar.f11655j = j3;
        pVar.f11664s = z10;
        if (!pVar.f11650b || i10 != 1) {
            if (pVar.f11651c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f11658m;
        pVar.f11658m = pVar.f11659n;
        pVar.f11659n = oVar;
        oVar.f11637b = false;
        oVar.f11636a = false;
        pVar.h = 0;
        pVar.f11656k = true;
    }
}
