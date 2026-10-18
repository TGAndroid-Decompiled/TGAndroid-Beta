package j4;

import c3.j0;
import e2.m0;
import i2.n0;
public final class q implements i {
    public final c0 f14144a;
    public final boolean f14145b;
    public final boolean f14146c;
    public long f14148g;
    public String f14149i;
    public j0 f14150j;
    public p f14151k;
    public boolean f14152l;
    public boolean f14154n;
    public final boolean[] h = new boolean[3];
    public final n0 d = new n0(7);
    public final n0 e = new n0(8);
    public final n0 f14147f = new n0(6);
    public long f14153m = -9223372036854775807L;
    public final e2.x f14155o = new e2.x();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f14144a = c0Var;
        this.f14145b = z10;
        this.f14146c = z11;
    }

    @Override
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        this.f14150j.getClass();
        String str = m0.f8255a;
        int i12 = xVar.f8295b;
        int i13 = xVar.f8296c;
        byte[] bArr = xVar.f8294a;
        this.f14148g += xVar.a();
        this.f14150j.d(xVar.a(), xVar);
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
            long j10 = this.f14148g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            b(j10, i16, i11, this.f14153m);
            h(i14, j10, this.f14153m);
            i12 = c10 + i10;
        }
    }

    public final void b(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.b(long, int, int, long):void");
    }

    @Override
    public final void c() {
        this.f14148g = 0L;
        this.f14154n = false;
        this.f14153m = -9223372036854775807L;
        f2.q.b(this.h);
        this.d.g();
        this.e.g();
        this.f14147f.g();
        this.f14144a.d.c(0);
        p pVar = this.f14151k;
        if (pVar != null) {
            pVar.f14135k = false;
            pVar.f14139o = false;
            o oVar = pVar.f14138n;
            oVar.f14116b = false;
            oVar.f14115a = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14149i = (String) f0Var.e;
        f0Var.c();
        j0 j02 = qVar.j0(f0Var.f14059c, 2);
        this.f14150j = j02;
        this.f14151k = new p(j02, this.f14145b, this.f14146c);
        this.f14144a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f14150j.getClass();
        String str = m0.f8255a;
        if (z10) {
            this.f14144a.d.c(0);
            b(this.f14148g, 0, 0, this.f14153m);
            h(9, this.f14148g, this.f14153m);
            b(this.f14148g, 0, 0, this.f14153m);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        boolean z10;
        this.f14153m = j10;
        boolean z11 = this.f14154n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14154n = z10 | z11;
    }

    public final void g(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.g(int, int, byte[]):void");
    }

    public final void h(int i10, long j10, long j11) {
        if (!this.f14152l || this.f14151k.f14130c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f14147f.h(i10);
        p pVar = this.f14151k;
        boolean z10 = this.f14154n;
        pVar.f14133i = i10;
        pVar.f14136l = j11;
        pVar.f14134j = j10;
        pVar.f14143s = z10;
        if (!pVar.f14129b || i10 != 1) {
            if (pVar.f14130c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f14137m;
        pVar.f14137m = pVar.f14138n;
        pVar.f14138n = oVar;
        oVar.f14116b = false;
        oVar.f14115a = false;
        pVar.h = 0;
        pVar.f14135k = true;
    }
}
