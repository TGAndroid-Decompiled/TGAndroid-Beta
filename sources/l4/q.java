package l4;

import e3.i0;
import g2.n0;
import k2.o0;
public final class q implements i {
    public final c0 f17917a;
    public final boolean f17918b;
    public final boolean f17919c;
    public long f17922g;
    public String f17923i;
    public i0 f17924j;
    public p f17925k;
    public boolean f17926l;
    public boolean f17928n;
    public final boolean[] h = new boolean[3];
    public final o0 d = new o0(7);
    public final o0 f17920e = new o0(8);
    public final o0 f17921f = new o0(6);
    public long f17927m = -9223372036854775807L;
    public final g2.y f17929o = new g2.y();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f17917a = c0Var;
        this.f17918b = z10;
        this.f17919c = z11;
    }

    @Override
    public final void a() {
        this.f17922g = 0L;
        this.f17928n = false;
        this.f17927m = -9223372036854775807L;
        h2.o.b(this.h);
        this.d.g();
        this.f17920e.g();
        this.f17921f.g();
        this.f17917a.d.r(0);
        p pVar = this.f17925k;
        if (pVar != null) {
            pVar.f17908k = false;
            pVar.f17912o = false;
            o oVar = pVar.f17911n;
            oVar.f17887b = false;
            oVar.f17886a = false;
        }
    }

    public final void b(long r26, long r28, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: l4.q.b(long, long, int, int):void");
    }

    @Override
    public final void c(g2.y yVar) {
        int i3;
        int i10;
        this.f17924j.getClass();
        String str = n0.f11873a;
        int i11 = yVar.f11924b;
        int i12 = yVar.f11925c;
        byte[] bArr = yVar.f11923a;
        this.f17922g += yVar.a();
        this.f17924j.e(yVar.a(), yVar);
        while (true) {
            int c2 = h2.o.c(bArr, i11, i12, this.h);
            if (c2 == i12) {
                g(i11, i12, bArr);
                return;
            }
            int i13 = bArr[c2 + 3] & 31;
            if (c2 > 0 && bArr[c2 - 1] == 0) {
                c2--;
                i3 = 4;
            } else {
                i3 = 3;
            }
            int i14 = c2;
            int i15 = i3;
            int i16 = i14 - i11;
            if (i16 > 0) {
                g(i11, i14, bArr);
            }
            int i17 = i12 - i14;
            long j10 = this.f17922g - i17;
            if (i16 < 0) {
                i10 = -i16;
            } else {
                i10 = 0;
            }
            b(j10, this.f17927m, i17, i10);
            h(j10, i13, this.f17927m);
            i11 = i14 + i15;
        }
    }

    @Override
    public final void d(boolean z10) {
        this.f17924j.getClass();
        String str = n0.f11873a;
        if (z10) {
            this.f17917a.d.r(0);
            b(this.f17922g, this.f17927m, 0, 0);
            h(this.f17922g, 9, this.f17927m);
            b(this.f17922g, this.f17927m, 0, 0);
        }
    }

    @Override
    public final void e(int i3, long j10) {
        boolean z10;
        this.f17927m = j10;
        boolean z11 = this.f17928n;
        if ((i3 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f17928n = z10 | z11;
    }

    @Override
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f17923i = (String) f0Var.f17823e;
        f0Var.c();
        i0 i02 = qVar.i0(f0Var.f17822c, 2);
        this.f17924j = i02;
        this.f17925k = new p(i02, this.f17918b, this.f17919c);
        this.f17917a.b(qVar, f0Var);
    }

    public final void g(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: l4.q.g(int, int, byte[]):void");
    }

    public final void h(long j10, int i3, long j11) {
        if (!this.f17926l || this.f17925k.f17902c) {
            this.d.h(i3);
            this.f17920e.h(i3);
        }
        this.f17921f.h(i3);
        p pVar = this.f17925k;
        boolean z10 = this.f17928n;
        pVar.f17906i = i3;
        pVar.f17909l = j11;
        pVar.f17907j = j10;
        pVar.f17916s = z10;
        if (!pVar.f17901b || i3 != 1) {
            if (pVar.f17902c) {
                if (i3 != 5 && i3 != 1 && i3 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f17910m;
        pVar.f17910m = pVar.f17911n;
        pVar.f17911n = oVar;
        oVar.f17887b = false;
        oVar.f17886a = false;
        pVar.h = 0;
        pVar.f17908k = true;
    }
}
