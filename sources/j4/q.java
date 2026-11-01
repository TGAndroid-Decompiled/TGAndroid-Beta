package j4;

import c3.k0;
import e2.l0;
import i2.p0;
public final class q implements i {
    public final d0 f9563a;
    public final boolean f9564b;
    public final boolean f9565c;
    public long f9567g;
    public String f9568i;
    public k0 f9569j;
    public p f9570k;
    public boolean f9571l;
    public boolean f9573n;
    public final boolean[] h = new boolean[3];
    public final p0 d = new p0(7);
    public final p0 e = new p0(8);
    public final p0 f9566f = new p0(6);
    public long f9572m = -9223372036854775807L;
    public final e2.x f9574o = new e2.x();

    public q(d0 d0Var, boolean z10, boolean z11) {
        this.f9563a = d0Var;
        this.f9564b = z10;
        this.f9565c = z11;
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
        this.f9569j.getClass();
        String str = l0.f6165a;
        int i12 = xVar.f6208b;
        int i13 = xVar.f6209c;
        byte[] bArr = xVar.f6207a;
        this.f9567g += xVar.a();
        this.f9569j.d(xVar.a(), xVar);
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
            long j10 = this.f9567g - i18;
            if (i17 < 0) {
                i11 = -i17;
            } else {
                i11 = 0;
            }
            a(j10, this.f9572m, i18, i11);
            d(j10, i14, this.f9572m);
            i12 = i15 + i16;
        }
    }

    public final void d(long j10, int i10, long j11) {
        if (!this.f9571l || this.f9570k.f9549c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f9566f.h(i10);
        p pVar = this.f9570k;
        boolean z10 = this.f9573n;
        pVar.f9552i = i10;
        pVar.f9555l = j11;
        pVar.f9553j = j10;
        pVar.f9562s = z10;
        if (!pVar.f9548b || i10 != 1) {
            if (pVar.f9549c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f9556m;
        pVar.f9556m = pVar.f9557n;
        pVar.f9557n = oVar;
        oVar.f9535b = false;
        oVar.f9534a = false;
        pVar.h = 0;
        pVar.f9554k = true;
    }

    @Override
    public final void e() {
        this.f9567g = 0L;
        this.f9573n = false;
        this.f9572m = -9223372036854775807L;
        f2.q.b(this.h);
        this.d.g();
        this.e.g();
        this.f9566f.g();
        this.f9563a.d.e(0);
        p pVar = this.f9570k;
        if (pVar != null) {
            pVar.f9554k = false;
            pVar.f9558o = false;
            o oVar = pVar.f9557n;
            oVar.f9535b = false;
            oVar.f9534a = false;
        }
    }

    @Override
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f9568i = (String) g0Var.e;
        g0Var.c();
        k0 I1 = qVar.I1(g0Var.f9492c, 2);
        this.f9569j = I1;
        this.f9570k = new p(I1, this.f9564b, this.f9565c);
        this.f9563a.b(qVar, g0Var);
    }

    @Override
    public final void g(boolean z10) {
        this.f9569j.getClass();
        String str = l0.f6165a;
        if (z10) {
            this.f9563a.d.e(0);
            a(this.f9567g, this.f9572m, 0, 0);
            d(this.f9567g, 9, this.f9572m);
            a(this.f9567g, this.f9572m, 0, 0);
        }
    }

    @Override
    public final void h(int i10, long j10) {
        boolean z10;
        this.f9572m = j10;
        boolean z11 = this.f9573n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9573n = z10 | z11;
    }
}
