package j4;

import a8.yb;
import b2.w0;
import c3.j0;
import e2.n0;
import i2.p0;
import java.util.Collections;
public final class s implements i {
    public final c0 f15422a;
    public String f15423b;
    public j0 f15424c;
    public r d;
    public boolean e;
    public long f15430l;
    public final boolean[] f15425f = new boolean[3];
    public final p0 f15426g = new p0(32);
    public final p0 h = new p0(33);
    public final p0 f15427i = new p0(34);
    public final p0 f15428j = new p0(39);
    public final p0 f15429k = new p0(40);
    public long f15431m = -9223372036854775807L;
    public final e2.x f15432n = new e2.x();

    public s(c0 c0Var) {
        this.f15422a = c0Var;
    }

    @Override
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        this.f15424c.getClass();
        String str = n0.f9692a;
        while (xVar.a() > 0) {
            int i12 = xVar.f9733b;
            int i13 = xVar.f9734c;
            byte[] bArr = xVar.f9732a;
            this.f15430l += xVar.a();
            this.f15424c.d(xVar.a(), xVar);
            while (i12 < i13) {
                int c10 = f2.q.c(bArr, i12, i13, this.f15425f);
                if (c10 == i13) {
                    g(i12, i13, bArr);
                    return;
                }
                int i14 = (bArr[c10 + 3] & 126) >> 1;
                if (c10 > 0 && bArr[c10 - 1] == 0) {
                    c10--;
                    i10 = 4;
                } else {
                    i10 = 3;
                }
                int i15 = c10;
                int i16 = i10;
                int i17 = i15 - i12;
                if (i17 > 0) {
                    g(i12, i15, bArr);
                }
                int i18 = i13 - i15;
                long j10 = this.f15430l - i18;
                if (i17 < 0) {
                    i11 = -i17;
                } else {
                    i11 = 0;
                }
                b(j10, i18, i11, this.f15431m);
                h(j10, i18, i14, this.f15431m);
                i12 = i15 + i16;
            }
        }
    }

    public final void b(long j10, int i10, int i11, long j11) {
        e2.c cVar = this.f15422a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        boolean z11 = false;
        if (rVar.f15418j && rVar.f15416g) {
            rVar.f15421m = rVar.f15414c;
            rVar.f15418j = false;
        } else if (rVar.h || rVar.f15416g) {
            if (z10 && rVar.f15417i) {
                rVar.a(i10 + ((int) (j10 - rVar.f15413b)));
            }
            rVar.f15419k = rVar.f15413b;
            rVar.f15420l = rVar.e;
            rVar.f15421m = rVar.f15414c;
            rVar.f15417i = true;
        }
        if (!this.e) {
            p0 p0Var = this.f15426g;
            p0Var.e(i11);
            p0 p0Var2 = this.h;
            p0Var2.e(i11);
            p0 p0Var3 = this.f15427i;
            p0Var3.e(i11);
            if (p0Var.d && p0Var2.d && p0Var3.d) {
                String str = this.f15423b;
                int i12 = p0Var.e;
                byte[] bArr = new byte[p0Var2.e + i12 + p0Var3.e];
                System.arraycopy((byte[]) p0Var.f13700f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) p0Var2.f13700f, 0, bArr, p0Var.e, p0Var2.e);
                System.arraycopy((byte[]) p0Var3.f13700f, 0, bArr, p0Var.e + p0Var2.e, p0Var3.e);
                String str2 = null;
                f2.m k10 = f2.q.k((byte[]) p0Var2.f13700f, 3, p0Var2.e, null);
                f2.j jVar = k10.f10081b;
                if (jVar != null) {
                    str2 = e2.g.a(jVar.f10071a, jVar.f10073c, jVar.d, jVar.f10074f, jVar.f10072b, jVar.e);
                }
                b2.w wVar = new b2.w();
                wVar.f3519a = str;
                wVar.f3532q = w0.n("video/mp2t");
                wVar.f3533r = w0.n("video/hevc");
                wVar.f3525j = str2;
                wVar.f3539y = k10.e;
                wVar.f3540z = k10.f10083f;
                wVar.A = k10.f10084g;
                wVar.B = k10.h;
                wVar.H = new b2.o(k10.f10087k, k10.f10088l, k10.f10089m, null, k10.f10082c + 8, k10.d + 8);
                wVar.E = k10.f10085i;
                wVar.f3535t = k10.f10086j;
                wVar.I = k10.f10080a + 1;
                wVar.f3536u = Collections.singletonList(bArr);
                b2.x xVar = new b2.x(wVar);
                this.f15424c.b(xVar);
                int i13 = xVar.f3588u;
                if (i13 != -1) {
                    z11 = true;
                }
                yb.p(z11);
                cVar.k(i13);
                this.e = true;
            }
        }
        p0 p0Var4 = this.f15428j;
        boolean e = p0Var4.e(i11);
        e2.x xVar2 = this.f15432n;
        if (e) {
            xVar2.L(f2.q.p(p0Var4.e, (byte[]) p0Var4.f13700f), (byte[]) p0Var4.f13700f);
            xVar2.O(5);
            cVar.a(j11, xVar2);
        }
        p0 p0Var5 = this.f15429k;
        if (p0Var5.e(i11)) {
            xVar2.L(f2.q.p(p0Var5.e, (byte[]) p0Var5.f13700f), (byte[]) p0Var5.f13700f);
            xVar2.O(5);
            cVar.a(j11, xVar2);
        }
    }

    @Override
    public final void c() {
        this.f15430l = 0L;
        this.f15431m = -9223372036854775807L;
        f2.q.b(this.f15425f);
        this.f15426g.g();
        this.h.g();
        this.f15427i.g();
        this.f15428j.g();
        this.f15429k.g();
        this.f15422a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f15415f = false;
            rVar.f15416g = false;
            rVar.h = false;
            rVar.f15417i = false;
            rVar.f15418j = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f15423b = (String) f0Var.e;
        f0Var.c();
        j0 F1 = qVar.F1(f0Var.f15315c, 2);
        this.f15424c = F1;
        this.d = new r(F1);
        this.f15422a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f15424c.getClass();
        String str = n0.f9692a;
        if (z10) {
            this.f15422a.d.c(0);
            b(this.f15430l, 0, 0, this.f15431m);
            h(this.f15430l, 0, 48, this.f15431m);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f15431m = j10;
    }

    public final void g(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f15415f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f15416g = z10;
                rVar.f15415f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.f15426g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f15427i.a(i10, i11, bArr);
        }
        this.f15428j.a(i10, i11, bArr);
        this.f15429k.a(i10, i11, bArr);
    }

    public final void h(long j10, int i10, int i11, long j11) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.e;
        boolean z12 = false;
        rVar.f15416g = false;
        rVar.h = false;
        rVar.e = j11;
        rVar.d = 0;
        rVar.f15413b = j10;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f15417i && !rVar.f15418j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f15417i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f15418j;
                rVar.f15418j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f15414c = z10;
        if (z10 || i11 <= 9) {
            z12 = true;
        }
        rVar.f15415f = z12;
        if (!this.e) {
            this.f15426g.h(i11);
            this.h.h(i11);
            this.f15427i.h(i11);
        }
        this.f15428j.h(i11);
        this.f15429k.h(i11);
    }
}
