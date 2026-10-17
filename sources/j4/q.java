package j4;

import c3.j0;
import i2.m0;
public final class q implements i {
    public final c0 f14137a;
    public final boolean f14138b;
    public final boolean f14139c;
    public long f14141g;
    public String f14142i;
    public j0 f14143j;
    public p f14144k;
    public boolean f14145l;
    public boolean f14147n;
    public final boolean[] h = new boolean[3];
    public final m0 d = new m0(7);
    public final m0 e = new m0(8);
    public final m0 f14140f = new m0(6);
    public long f14146m = -9223372036854775807L;
    public final e2.x f14148o = new e2.x();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f14137a = c0Var;
        this.f14138b = z10;
        this.f14139c = z11;
    }

    @Override
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        this.f14143j.getClass();
        String str = e2.m0.f8254a;
        int i12 = xVar.f8294b;
        int i13 = xVar.f8295c;
        byte[] bArr = xVar.f8293a;
        this.f14141g += xVar.a();
        this.f14143j.d(xVar.a(), xVar);
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
            long j10 = this.f14141g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            b(j10, i16, i11, this.f14146m);
            h(i14, j10, this.f14146m);
            i12 = c10 + i10;
        }
    }

    public final void b(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.b(long, int, int, long):void");
    }

    @Override
    public final void c() {
        this.f14141g = 0L;
        this.f14147n = false;
        this.f14146m = -9223372036854775807L;
        f2.q.b(this.h);
        this.d.g();
        this.e.g();
        this.f14140f.g();
        this.f14137a.d.c(0);
        p pVar = this.f14144k;
        if (pVar != null) {
            pVar.f14128k = false;
            pVar.f14132o = false;
            o oVar = pVar.f14131n;
            oVar.f14109b = false;
            oVar.f14108a = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14142i = (String) f0Var.e;
        f0Var.c();
        j0 j02 = qVar.j0(f0Var.f14052c, 2);
        this.f14143j = j02;
        this.f14144k = new p(j02, this.f14138b, this.f14139c);
        this.f14137a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f14143j.getClass();
        String str = e2.m0.f8254a;
        if (z10) {
            this.f14137a.d.c(0);
            b(this.f14141g, 0, 0, this.f14146m);
            h(9, this.f14141g, this.f14146m);
            b(this.f14141g, 0, 0, this.f14146m);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        boolean z10;
        this.f14146m = j10;
        boolean z11 = this.f14147n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14147n = z10 | z11;
    }

    public final void g(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.g(int, int, byte[]):void");
    }

    public final void h(int i10, long j10, long j11) {
        if (!this.f14145l || this.f14144k.f14123c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f14140f.h(i10);
        p pVar = this.f14144k;
        boolean z10 = this.f14147n;
        pVar.f14126i = i10;
        pVar.f14129l = j11;
        pVar.f14127j = j10;
        pVar.f14136s = z10;
        if (!pVar.f14122b || i10 != 1) {
            if (pVar.f14123c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f14130m;
        pVar.f14130m = pVar.f14131n;
        pVar.f14131n = oVar;
        oVar.f14109b = false;
        oVar.f14108a = false;
        pVar.h = 0;
        pVar.f14128k = true;
    }
}
