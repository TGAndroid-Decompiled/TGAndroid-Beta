package j4;

import c3.h0;
import i2.m0;
public final class q implements i {
    public final c0 f13866a;
    public final boolean f13867b;
    public final boolean f13868c;
    public long f13871g;
    public String f13872i;
    public h0 f13873j;
    public p f13874k;
    public boolean f13875l;
    public boolean f13877n;
    public final boolean[] h = new boolean[3];
    public final m0 d = new m0(7);
    public final m0 f13869e = new m0(8);
    public final m0 f13870f = new m0(6);
    public long f13876m = -9223372036854775807L;
    public final e2.v f13878o = new e2.v();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f13866a = c0Var;
        this.f13867b = z10;
        this.f13868c = z11;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f13873j);
        String str = e2.d0.f8538a;
        int i12 = vVar.f8591b;
        int i13 = vVar.f8592c;
        byte[] bArr = vVar.f8590a;
        this.f13871g += vVar.a();
        this.f13873j.d(vVar.a(), vVar);
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
            long j3 = this.f13871g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            b(j3, i16, i11, this.f13876m);
            h(i14, j3, this.f13876m);
            i12 = b10 + i10;
        }
    }

    public final void b(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.b(long, int, int, long):void");
    }

    @Override
    public final void c() {
        this.f13871g = 0L;
        this.f13877n = false;
        this.f13876m = -9223372036854775807L;
        f2.o.a(this.h);
        this.d.g();
        this.f13869e.g();
        this.f13870f.g();
        this.f13866a.d.c(0);
        p pVar = this.f13874k;
        if (pVar != null) {
            pVar.f13857k = false;
            pVar.f13861o = false;
            o oVar = pVar.f13860n;
            oVar.f13836b = false;
            oVar.f13835a = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13872i = f0Var.f13772e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f13873j = Z1;
        this.f13874k = new p(Z1, this.f13867b, this.f13868c);
        this.f13866a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f13873j);
        String str = e2.d0.f8538a;
        if (z10) {
            this.f13866a.d.c(0);
            b(this.f13871g, 0, 0, this.f13876m);
            h(9, this.f13871g, this.f13876m);
            b(this.f13871g, 0, 0, this.f13876m);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        boolean z10;
        this.f13876m = j3;
        boolean z11 = this.f13877n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13877n = z10 | z11;
    }

    public final void g(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.g(int, int, byte[]):void");
    }

    public final void h(int i10, long j3, long j10) {
        if (!this.f13875l || this.f13874k.f13851c) {
            this.d.h(i10);
            this.f13869e.h(i10);
        }
        this.f13870f.h(i10);
        p pVar = this.f13874k;
        boolean z10 = this.f13877n;
        pVar.f13855i = i10;
        pVar.f13858l = j10;
        pVar.f13856j = j3;
        pVar.f13865s = z10;
        if (!pVar.f13850b || i10 != 1) {
            if (pVar.f13851c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f13859m;
        pVar.f13859m = pVar.f13860n;
        pVar.f13860n = oVar;
        oVar.f13836b = false;
        oVar.f13835a = false;
        pVar.h = 0;
        pVar.f13857k = true;
    }
}
