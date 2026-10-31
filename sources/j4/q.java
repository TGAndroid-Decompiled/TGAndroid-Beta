package j4;

import c3.k0;
import e2.l0;
import i2.p0;
public final class q implements i {
    public final d0 f9562a;
    public final boolean f9563b;
    public final boolean f9564c;
    public long f9566g;
    public String f9567i;
    public k0 f9568j;
    public p f9569k;
    public boolean f9570l;
    public boolean f9572n;
    public final boolean[] h = new boolean[3];
    public final p0 d = new p0(7);
    public final p0 e = new p0(8);
    public final p0 f9565f = new p0(6);
    public long f9571m = -9223372036854775807L;
    public final e2.x f9573o = new e2.x();

    public q(d0 d0Var, boolean z10, boolean z11) {
        this.f9562a = d0Var;
        this.f9563b = z10;
        this.f9564c = z11;
    }

    public final void a(long r26, long r28, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.a(long, long, int, int):void");
    }

    public final void b(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.b(int, int, byte[]):void");
    }

    @Override
    public final void c(e2.x xVar) {
        int i10;
        int i11;
        this.f9568j.getClass();
        String str = l0.f6165a;
        int i12 = xVar.f6208b;
        int i13 = xVar.f6209c;
        byte[] bArr = xVar.f6207a;
        this.f9566g += xVar.a();
        this.f9568j.d(xVar.a(), xVar);
        while (true) {
            int c10 = f2.q.c(bArr, i12, i13, this.h);
            if (c10 == i13) {
                b(i12, i13, bArr);
                return;
            }
            int i14 = bArr[c10 + 3] & 31;
            if (c10 > 0 && bArr[c10 - 1] == 0) {
                c10--;
                i10 = 4;
            } else {
                i10 = 3;
            }
            int i15 = c10;
            int i16 = i10;
            int i17 = i15 - i12;
            if (i17 > 0) {
                b(i12, i15, bArr);
            }
            int i18 = i13 - i15;
            long j10 = this.f9566g - i18;
            if (i17 < 0) {
                i11 = -i17;
            } else {
                i11 = 0;
            }
            a(j10, this.f9571m, i18, i11);
            d(j10, i14, this.f9571m);
            i12 = i15 + i16;
        }
    }

    public final void d(long j10, int i10, long j11) {
        if (!this.f9570l || this.f9569k.f9548c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f9565f.h(i10);
        p pVar = this.f9569k;
        boolean z10 = this.f9572n;
        pVar.f9551i = i10;
        pVar.f9554l = j11;
        pVar.f9552j = j10;
        pVar.f9561s = z10;
        if (!pVar.f9547b || i10 != 1) {
            if (pVar.f9548c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f9555m;
        pVar.f9555m = pVar.f9556n;
        pVar.f9556n = oVar;
        oVar.f9534b = false;
        oVar.f9533a = false;
        pVar.h = 0;
        pVar.f9553k = true;
    }

    @Override
    public final void e() {
        this.f9566g = 0L;
        this.f9572n = false;
        this.f9571m = -9223372036854775807L;
        f2.q.b(this.h);
        this.d.g();
        this.e.g();
        this.f9565f.g();
        this.f9562a.d.e(0);
        p pVar = this.f9569k;
        if (pVar != null) {
            pVar.f9553k = false;
            pVar.f9557o = false;
            o oVar = pVar.f9556n;
            oVar.f9534b = false;
            oVar.f9533a = false;
        }
    }

    @Override
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f9567i = (String) g0Var.e;
        g0Var.c();
        k0 I1 = qVar.I1(g0Var.f9491c, 2);
        this.f9568j = I1;
        this.f9569k = new p(I1, this.f9563b, this.f9564c);
        this.f9562a.b(qVar, g0Var);
    }

    @Override
    public final void g(boolean z10) {
        this.f9568j.getClass();
        String str = l0.f6165a;
        if (z10) {
            this.f9562a.d.e(0);
            a(this.f9566g, this.f9571m, 0, 0);
            d(this.f9566g, 9, this.f9571m);
            a(this.f9566g, this.f9571m, 0, 0);
        }
    }

    @Override
    public final void h(int i10, long j10) {
        boolean z10;
        this.f9571m = j10;
        boolean z11 = this.f9572n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9572n = z10 | z11;
    }
}
