package j4;

import c3.h0;
import i2.m0;
public final class q implements i {
    public final c0 f13903a;
    public final boolean f13904b;
    public final boolean f13905c;
    public long f13908g;
    public String f13909i;
    public h0 f13910j;
    public p f13911k;
    public boolean f13912l;
    public boolean f13914n;
    public final boolean[] h = new boolean[3];
    public final m0 d = new m0(7);
    public final m0 f13906e = new m0(8);
    public final m0 f13907f = new m0(6);
    public long f13913m = -9223372036854775807L;
    public final e2.v f13915o = new e2.v();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f13903a = c0Var;
        this.f13904b = z10;
        this.f13905c = z11;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f13910j);
        String str = e2.d0.f8532a;
        int i12 = vVar.f8585b;
        int i13 = vVar.f8586c;
        byte[] bArr = vVar.f8584a;
        this.f13908g += vVar.a();
        this.f13910j.d(vVar.a(), vVar);
        while (true) {
            int b10 = f2.p.b(bArr, i12, i13, this.h);
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
            long j3 = this.f13908g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            b(j3, i16, i11, this.f13913m);
            h(i14, j3, this.f13913m);
            i12 = b10 + i10;
        }
    }

    public final void b(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.b(long, int, int, long):void");
    }

    @Override
    public final void c() {
        this.f13908g = 0L;
        this.f13914n = false;
        this.f13913m = -9223372036854775807L;
        f2.p.a(this.h);
        this.d.g();
        this.f13906e.g();
        this.f13907f.g();
        this.f13903a.d.c(0);
        p pVar = this.f13911k;
        if (pVar != null) {
            pVar.f13894k = false;
            pVar.f13898o = false;
            o oVar = pVar.f13897n;
            oVar.f13873b = false;
            oVar.f13872a = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13909i = (String) f0Var.f13809e;
        f0Var.c();
        h0 f22 = qVar.f2(f0Var.f13808c, 2);
        this.f13910j = f22;
        this.f13911k = new p(f22, this.f13904b, this.f13905c);
        this.f13903a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f13910j);
        String str = e2.d0.f8532a;
        if (z10) {
            this.f13903a.d.c(0);
            b(this.f13908g, 0, 0, this.f13913m);
            h(9, this.f13908g, this.f13913m);
            b(this.f13908g, 0, 0, this.f13913m);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        boolean z10;
        this.f13913m = j3;
        boolean z11 = this.f13914n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13914n = z10 | z11;
    }

    public final void g(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.g(int, int, byte[]):void");
    }

    public final void h(int i10, long j3, long j10) {
        if (!this.f13912l || this.f13911k.f13888c) {
            this.d.h(i10);
            this.f13906e.h(i10);
        }
        this.f13907f.h(i10);
        p pVar = this.f13911k;
        boolean z10 = this.f13914n;
        pVar.f13892i = i10;
        pVar.f13895l = j10;
        pVar.f13893j = j3;
        pVar.f13902s = z10;
        if (!pVar.f13887b || i10 != 1) {
            if (pVar.f13888c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f13896m;
        pVar.f13896m = pVar.f13897n;
        pVar.f13897n = oVar;
        oVar.f13873b = false;
        oVar.f13872a = false;
        pVar.h = 0;
        pVar.f13894k = true;
    }
}
