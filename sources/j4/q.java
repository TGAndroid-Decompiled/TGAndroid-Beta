package j4;

import c3.j0;
import e2.m0;
import i2.n0;
public final class q implements i {
    public final c0 f14142a;
    public final boolean f14143b;
    public final boolean f14144c;
    public long f14146g;
    public String f14147i;
    public j0 f14148j;
    public p f14149k;
    public boolean f14150l;
    public boolean f14152n;
    public final boolean[] h = new boolean[3];
    public final n0 d = new n0(7);
    public final n0 e = new n0(8);
    public final n0 f14145f = new n0(6);
    public long f14151m = -9223372036854775807L;
    public final e2.x f14153o = new e2.x();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f14142a = c0Var;
        this.f14143b = z10;
        this.f14144c = z11;
    }

    @Override
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        this.f14148j.getClass();
        String str = m0.f8253a;
        int i12 = xVar.f8293b;
        int i13 = xVar.f8294c;
        byte[] bArr = xVar.f8292a;
        this.f14146g += xVar.a();
        this.f14148j.d(xVar.a(), xVar);
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
            long j10 = this.f14146g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            b(j10, i16, i11, this.f14151m);
            h(i14, j10, this.f14151m);
            i12 = c10 + i10;
        }
    }

    public final void b(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.b(long, int, int, long):void");
    }

    @Override
    public final void c() {
        this.f14146g = 0L;
        this.f14152n = false;
        this.f14151m = -9223372036854775807L;
        f2.q.b(this.h);
        this.d.g();
        this.e.g();
        this.f14145f.g();
        this.f14142a.d.c(0);
        p pVar = this.f14149k;
        if (pVar != null) {
            pVar.f14133k = false;
            pVar.f14137o = false;
            o oVar = pVar.f14136n;
            oVar.f14114b = false;
            oVar.f14113a = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14147i = (String) f0Var.e;
        f0Var.c();
        j0 j02 = qVar.j0(f0Var.f14057c, 2);
        this.f14148j = j02;
        this.f14149k = new p(j02, this.f14143b, this.f14144c);
        this.f14142a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f14148j.getClass();
        String str = m0.f8253a;
        if (z10) {
            this.f14142a.d.c(0);
            b(this.f14146g, 0, 0, this.f14151m);
            h(9, this.f14146g, this.f14151m);
            b(this.f14146g, 0, 0, this.f14151m);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        boolean z10;
        this.f14151m = j10;
        boolean z11 = this.f14152n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14152n = z10 | z11;
    }

    public final void g(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.g(int, int, byte[]):void");
    }

    public final void h(int i10, long j10, long j11) {
        if (!this.f14150l || this.f14149k.f14128c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f14145f.h(i10);
        p pVar = this.f14149k;
        boolean z10 = this.f14152n;
        pVar.f14131i = i10;
        pVar.f14134l = j11;
        pVar.f14132j = j10;
        pVar.f14141s = z10;
        if (!pVar.f14127b || i10 != 1) {
            if (pVar.f14128c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f14135m;
        pVar.f14135m = pVar.f14136n;
        pVar.f14136n = oVar;
        oVar.f14114b = false;
        oVar.f14113a = false;
        pVar.h = 0;
        pVar.f14133k = true;
    }
}
