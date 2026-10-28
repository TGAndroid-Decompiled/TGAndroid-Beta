package j4;

import c3.j0;
import e2.n0;
import i2.p0;
public final class q implements i {
    public final c0 f15399a;
    public final boolean f15400b;
    public final boolean f15401c;
    public long f15403g;
    public String f15404i;
    public j0 f15405j;
    public p f15406k;
    public boolean f15407l;
    public boolean f15409n;
    public final boolean[] h = new boolean[3];
    public final p0 d = new p0(7);
    public final p0 e = new p0(8);
    public final p0 f15402f = new p0(6);
    public long f15408m = -9223372036854775807L;
    public final e2.x f15410o = new e2.x();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f15399a = c0Var;
        this.f15400b = z10;
        this.f15401c = z11;
    }

    @Override
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        this.f15405j.getClass();
        String str = n0.f9691a;
        int i12 = xVar.f9732b;
        int i13 = xVar.f9733c;
        byte[] bArr = xVar.f9731a;
        this.f15403g += xVar.a();
        this.f15405j.d(xVar.a(), xVar);
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
            long j10 = this.f15403g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            b(j10, i16, i11, this.f15408m);
            h(i14, j10, this.f15408m);
            i12 = c10 + i10;
        }
    }

    public final void b(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.b(long, int, int, long):void");
    }

    @Override
    public final void c() {
        this.f15403g = 0L;
        this.f15409n = false;
        this.f15408m = -9223372036854775807L;
        f2.q.b(this.h);
        this.d.g();
        this.e.g();
        this.f15402f.g();
        this.f15399a.d.c(0);
        p pVar = this.f15406k;
        if (pVar != null) {
            pVar.f15390k = false;
            pVar.f15394o = false;
            o oVar = pVar.f15393n;
            oVar.f15371b = false;
            oVar.f15370a = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f15404i = (String) f0Var.e;
        f0Var.c();
        j0 F1 = qVar.F1(f0Var.f15314c, 2);
        this.f15405j = F1;
        this.f15406k = new p(F1, this.f15400b, this.f15401c);
        this.f15399a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f15405j.getClass();
        String str = n0.f9691a;
        if (z10) {
            this.f15399a.d.c(0);
            b(this.f15403g, 0, 0, this.f15408m);
            h(9, this.f15403g, this.f15408m);
            b(this.f15403g, 0, 0, this.f15408m);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        boolean z10;
        this.f15408m = j10;
        boolean z11 = this.f15409n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15409n = z10 | z11;
    }

    public final void g(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.g(int, int, byte[]):void");
    }

    public final void h(int i10, long j10, long j11) {
        if (!this.f15407l || this.f15406k.f15385c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f15402f.h(i10);
        p pVar = this.f15406k;
        boolean z10 = this.f15409n;
        pVar.f15388i = i10;
        pVar.f15391l = j11;
        pVar.f15389j = j10;
        pVar.f15398s = z10;
        if (!pVar.f15384b || i10 != 1) {
            if (pVar.f15385c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f15392m;
        pVar.f15392m = pVar.f15393n;
        pVar.f15393n = oVar;
        oVar.f15371b = false;
        oVar.f15370a = false;
        pVar.h = 0;
        pVar.f15390k = true;
    }
}
