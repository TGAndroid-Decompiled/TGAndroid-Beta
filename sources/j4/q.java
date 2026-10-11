package j4;

import c3.h0;
import i2.m0;
public final class q implements i {
    public final c0 f13902a;
    public final boolean f13903b;
    public final boolean f13904c;
    public long f13907g;
    public String f13908i;
    public h0 f13909j;
    public p f13910k;
    public boolean f13911l;
    public boolean f13913n;
    public final boolean[] h = new boolean[3];
    public final m0 d = new m0(7);
    public final m0 f13905e = new m0(8);
    public final m0 f13906f = new m0(6);
    public long f13912m = -9223372036854775807L;
    public final e2.v f13914o = new e2.v();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f13902a = c0Var;
        this.f13903b = z10;
        this.f13904c = z11;
    }

    public final void a(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.a(long, int, int, long):void");
    }

    @Override
    public final void b(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f13909j);
        String str = e2.d0.f8531a;
        int i12 = vVar.f8584b;
        int i13 = vVar.f8585c;
        byte[] bArr = vVar.f8583a;
        this.f13907g += vVar.a();
        this.f13909j.d(vVar.a(), vVar);
        while (true) {
            int b10 = f2.p.b(bArr, i12, i13, this.h);
            if (b10 == i13) {
                c(i12, i13, bArr);
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
                c(i12, b10, bArr);
            }
            int i16 = i13 - b10;
            long j3 = this.f13907g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            a(j3, i16, i11, this.f13912m);
            h(i14, j3, this.f13912m);
            i12 = b10 + i10;
        }
    }

    public final void c(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.c(int, int, byte[]):void");
    }

    @Override
    public final void d() {
        this.f13907g = 0L;
        this.f13913n = false;
        this.f13912m = -9223372036854775807L;
        f2.p.a(this.h);
        this.d.g();
        this.f13905e.g();
        this.f13906f.g();
        this.f13902a.d.c(0);
        p pVar = this.f13910k;
        if (pVar != null) {
            pVar.f13893k = false;
            pVar.f13897o = false;
            o oVar = pVar.f13896n;
            oVar.f13872b = false;
            oVar.f13871a = false;
        }
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13908i = (String) f0Var.f13808e;
        f0Var.c();
        h0 f22 = qVar.f2(f0Var.f13807c, 2);
        this.f13909j = f22;
        this.f13910k = new p(f22, this.f13903b, this.f13904c);
        this.f13902a.b(qVar, f0Var);
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13909j);
        String str = e2.d0.f8531a;
        if (z10) {
            this.f13902a.d.c(0);
            a(this.f13907g, 0, 0, this.f13912m);
            h(9, this.f13907g, this.f13912m);
            a(this.f13907g, 0, 0, this.f13912m);
        }
    }

    @Override
    public final void g(int i10, long j3) {
        boolean z10;
        this.f13912m = j3;
        boolean z11 = this.f13913n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13913n = z10 | z11;
    }

    public final void h(int i10, long j3, long j10) {
        if (!this.f13911l || this.f13910k.f13887c) {
            this.d.h(i10);
            this.f13905e.h(i10);
        }
        this.f13906f.h(i10);
        p pVar = this.f13910k;
        boolean z10 = this.f13913n;
        pVar.f13891i = i10;
        pVar.f13894l = j10;
        pVar.f13892j = j3;
        pVar.f13901s = z10;
        if (!pVar.f13886b || i10 != 1) {
            if (pVar.f13887c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f13895m;
        pVar.f13895m = pVar.f13896n;
        pVar.f13896n = oVar;
        oVar.f13872b = false;
        oVar.f13871a = false;
        pVar.h = 0;
        pVar.f13893k = true;
    }
}
