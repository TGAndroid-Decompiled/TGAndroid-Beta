package j4;

import c3.l0;
import e2.m0;
import i2.n0;
public final class q implements i {
    public final c0 f14187a;
    public final boolean f14188b;
    public final boolean f14189c;
    public long f14191g;
    public String f14192i;
    public l0 f14193j;
    public p f14194k;
    public boolean f14195l;
    public boolean f14197n;
    public final boolean[] h = new boolean[3];
    public final n0 d = new n0(7);
    public final n0 e = new n0(8);
    public final n0 f14190f = new n0(6);
    public long f14196m = -9223372036854775807L;
    public final e2.x f14198o = new e2.x();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f14187a = c0Var;
        this.f14188b = z10;
        this.f14189c = z11;
    }

    @Override
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        this.f14193j.getClass();
        String str = m0.f8259a;
        int i12 = xVar.f8299b;
        int i13 = xVar.f8300c;
        byte[] bArr = xVar.f8298a;
        this.f14191g += xVar.a();
        this.f14193j.d(xVar.a(), xVar);
        while (true) {
            int c10 = f2.q.c(bArr, i12, i13, this.h);
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
            long j10 = this.f14191g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            b(j10, i16, i11, this.f14196m);
            h(i14, j10, this.f14196m);
            i12 = c10 + i10;
        }
    }

    public final void b(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.b(long, int, int, long):void");
    }

    @Override
    public final void c() {
        this.f14191g = 0L;
        this.f14197n = false;
        this.f14196m = -9223372036854775807L;
        f2.q.b(this.h);
        this.d.g();
        this.e.g();
        this.f14190f.g();
        this.f14187a.d.c(0);
        p pVar = this.f14194k;
        if (pVar != null) {
            pVar.f14178k = false;
            pVar.f14182o = false;
            o oVar = pVar.f14181n;
            oVar.f14159b = false;
            oVar.f14158a = false;
        }
    }

    @Override
    public final void d(c3.s sVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14192i = (String) f0Var.e;
        f0Var.c();
        l0 j02 = sVar.j0(f0Var.f14102c, 2);
        this.f14193j = j02;
        this.f14194k = new p(j02, this.f14188b, this.f14189c);
        this.f14187a.b(sVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f14193j.getClass();
        String str = m0.f8259a;
        if (z10) {
            this.f14187a.d.c(0);
            b(this.f14191g, 0, 0, this.f14196m);
            h(9, this.f14191g, this.f14196m);
            b(this.f14191g, 0, 0, this.f14196m);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        boolean z10;
        this.f14196m = j10;
        boolean z11 = this.f14197n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14197n = z10 | z11;
    }

    public final void g(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.g(int, int, byte[]):void");
    }

    public final void h(int i10, long j10, long j11) {
        if (!this.f14195l || this.f14194k.f14173c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f14190f.h(i10);
        p pVar = this.f14194k;
        boolean z10 = this.f14197n;
        pVar.f14176i = i10;
        pVar.f14179l = j11;
        pVar.f14177j = j10;
        pVar.f14186s = z10;
        if (!pVar.f14172b || i10 != 1) {
            if (pVar.f14173c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f14180m;
        pVar.f14180m = pVar.f14181n;
        pVar.f14181n = oVar;
        oVar.f14159b = false;
        oVar.f14158a = false;
        pVar.h = 0;
        pVar.f14178k = true;
    }
}
