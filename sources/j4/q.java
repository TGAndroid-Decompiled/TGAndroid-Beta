package j4;

import c3.h0;
import i2.m0;
public final class q implements i {
    public final c0 f12761a;
    public final boolean f12762b;
    public final boolean f12763c;
    public long f12765g;
    public String f12766i;
    public h0 f12767j;
    public p f12768k;
    public boolean f12769l;
    public boolean f12771n;
    public final boolean[] h = new boolean[3];
    public final m0 d = new m0(7);
    public final m0 e = new m0(8);
    public final m0 f12764f = new m0(6);
    public long f12770m = -9223372036854775807L;
    public final e2.v f12772o = new e2.v();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f12761a = c0Var;
        this.f12762b = z10;
        this.f12763c = z11;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f12767j);
        String str = e2.d0.f7872a;
        int i12 = vVar.f7919b;
        int i13 = vVar.f7920c;
        byte[] bArr = vVar.f7918a;
        this.f12765g += vVar.a();
        this.f12767j.d(vVar.a(), vVar);
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
            long j3 = this.f12765g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            b(j3, i16, i11, this.f12770m);
            h(i14, j3, this.f12770m);
            i12 = b10 + i10;
        }
    }

    public final void b(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.b(long, int, int, long):void");
    }

    @Override
    public final void c() {
        this.f12765g = 0L;
        this.f12771n = false;
        this.f12770m = -9223372036854775807L;
        f2.o.a(this.h);
        this.d.g();
        this.e.g();
        this.f12764f.g();
        this.f12761a.d.c(0);
        p pVar = this.f12768k;
        if (pVar != null) {
            pVar.f12752k = false;
            pVar.f12756o = false;
            o oVar = pVar.f12755n;
            oVar.f12733b = false;
            oVar.f12732a = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12766i = f0Var.e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f12767j = Z1;
        this.f12768k = new p(Z1, this.f12762b, this.f12763c);
        this.f12761a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f12767j);
        String str = e2.d0.f7872a;
        if (z10) {
            this.f12761a.d.c(0);
            b(this.f12765g, 0, 0, this.f12770m);
            h(9, this.f12765g, this.f12770m);
            b(this.f12765g, 0, 0, this.f12770m);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        boolean z10;
        this.f12770m = j3;
        boolean z11 = this.f12771n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12771n = z10 | z11;
    }

    public final void g(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.g(int, int, byte[]):void");
    }

    public final void h(int i10, long j3, long j10) {
        if (!this.f12769l || this.f12768k.f12747c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f12764f.h(i10);
        p pVar = this.f12768k;
        boolean z10 = this.f12771n;
        pVar.f12750i = i10;
        pVar.f12753l = j10;
        pVar.f12751j = j3;
        pVar.f12760s = z10;
        if (!pVar.f12746b || i10 != 1) {
            if (pVar.f12747c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f12754m;
        pVar.f12754m = pVar.f12755n;
        pVar.f12755n = oVar;
        oVar.f12733b = false;
        oVar.f12732a = false;
        pVar.h = 0;
        pVar.f12752k = true;
    }
}
