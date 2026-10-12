package j4;

import c3.h0;
import i2.m0;
public final class q implements i {
    public final c0 f13900a;
    public final boolean f13901b;
    public final boolean f13902c;
    public long f13905g;
    public String f13906i;
    public h0 f13907j;
    public p f13908k;
    public boolean f13909l;
    public boolean f13911n;
    public final boolean[] h = new boolean[3];
    public final m0 d = new m0(7);
    public final m0 f13903e = new m0(8);
    public final m0 f13904f = new m0(6);
    public long f13910m = -9223372036854775807L;
    public final e2.v f13912o = new e2.v();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f13900a = c0Var;
        this.f13901b = z10;
        this.f13902c = z11;
    }

    public final void a(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.a(long, int, int, long):void");
    }

    @Override
    public final void b(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f13907j);
        String str = e2.d0.f8529a;
        int i12 = vVar.f8582b;
        int i13 = vVar.f8583c;
        byte[] bArr = vVar.f8581a;
        this.f13905g += vVar.a();
        this.f13907j.d(vVar.a(), vVar);
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
            long j3 = this.f13905g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            a(j3, i16, i11, this.f13910m);
            h(i14, j3, this.f13910m);
            i12 = b10 + i10;
        }
    }

    public final void c(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.c(int, int, byte[]):void");
    }

    @Override
    public final void d() {
        this.f13905g = 0L;
        this.f13911n = false;
        this.f13910m = -9223372036854775807L;
        f2.p.a(this.h);
        this.d.g();
        this.f13903e.g();
        this.f13904f.g();
        this.f13900a.d.c(0);
        p pVar = this.f13908k;
        if (pVar != null) {
            pVar.f13891k = false;
            pVar.f13895o = false;
            o oVar = pVar.f13894n;
            oVar.f13870b = false;
            oVar.f13869a = false;
        }
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13906i = (String) f0Var.f13806e;
        f0Var.c();
        h0 f22 = qVar.f2(f0Var.f13805c, 2);
        this.f13907j = f22;
        this.f13908k = new p(f22, this.f13901b, this.f13902c);
        this.f13900a.b(qVar, f0Var);
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13907j);
        String str = e2.d0.f8529a;
        if (z10) {
            this.f13900a.d.c(0);
            a(this.f13905g, 0, 0, this.f13910m);
            h(9, this.f13905g, this.f13910m);
            a(this.f13905g, 0, 0, this.f13910m);
        }
    }

    @Override
    public final void g(int i10, long j3) {
        boolean z10;
        this.f13910m = j3;
        boolean z11 = this.f13911n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13911n = z10 | z11;
    }

    public final void h(int i10, long j3, long j10) {
        if (!this.f13909l || this.f13908k.f13885c) {
            this.d.h(i10);
            this.f13903e.h(i10);
        }
        this.f13904f.h(i10);
        p pVar = this.f13908k;
        boolean z10 = this.f13911n;
        pVar.f13889i = i10;
        pVar.f13892l = j10;
        pVar.f13890j = j3;
        pVar.f13899s = z10;
        if (!pVar.f13884b || i10 != 1) {
            if (pVar.f13885c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f13893m;
        pVar.f13893m = pVar.f13894n;
        pVar.f13894n = oVar;
        oVar.f13870b = false;
        oVar.f13869a = false;
        pVar.h = 0;
        pVar.f13891k = true;
    }
}
