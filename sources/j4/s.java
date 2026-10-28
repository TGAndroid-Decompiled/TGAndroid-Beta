package j4;

import a8.yb;
import b2.w0;
import c3.j0;
import e2.n0;
import i2.p0;
import java.util.Collections;
public final class s implements i {
    public final c0 f15421a;
    public String f15422b;
    public j0 f15423c;
    public r d;
    public boolean e;
    public long f15429l;
    public final boolean[] f15424f = new boolean[3];
    public final p0 f15425g = new p0(32);
    public final p0 h = new p0(33);
    public final p0 f15426i = new p0(34);
    public final p0 f15427j = new p0(39);
    public final p0 f15428k = new p0(40);
    public long f15430m = -9223372036854775807L;
    public final e2.x f15431n = new e2.x();

    public s(c0 c0Var) {
        this.f15421a = c0Var;
    }

    @Override
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        this.f15423c.getClass();
        String str = n0.f9691a;
        while (xVar.a() > 0) {
            int i12 = xVar.f9732b;
            int i13 = xVar.f9733c;
            byte[] bArr = xVar.f9731a;
            this.f15429l += xVar.a();
            this.f15423c.d(xVar.a(), xVar);
            while (i12 < i13) {
                int c10 = f2.q.c(bArr, i12, i13, this.f15424f);
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
                long j10 = this.f15429l - i18;
                if (i17 < 0) {
                    i11 = -i17;
                } else {
                    i11 = 0;
                }
                b(j10, i18, i11, this.f15430m);
                h(j10, i18, i14, this.f15430m);
                i12 = i15 + i16;
            }
        }
    }

    public final void b(long j10, int i10, int i11, long j11) {
        e2.c cVar = this.f15421a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        boolean z11 = false;
        if (rVar.f15417j && rVar.f15415g) {
            rVar.f15420m = rVar.f15413c;
            rVar.f15417j = false;
        } else if (rVar.h || rVar.f15415g) {
            if (z10 && rVar.f15416i) {
                rVar.a(i10 + ((int) (j10 - rVar.f15412b)));
            }
            rVar.f15418k = rVar.f15412b;
            rVar.f15419l = rVar.e;
            rVar.f15420m = rVar.f15413c;
            rVar.f15416i = true;
        }
        if (!this.e) {
            p0 p0Var = this.f15425g;
            p0Var.e(i11);
            p0 p0Var2 = this.h;
            p0Var2.e(i11);
            p0 p0Var3 = this.f15426i;
            p0Var3.e(i11);
            if (p0Var.d && p0Var2.d && p0Var3.d) {
                String str = this.f15422b;
                int i12 = p0Var.e;
                byte[] bArr = new byte[p0Var2.e + i12 + p0Var3.e];
                System.arraycopy((byte[]) p0Var.f13699f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) p0Var2.f13699f, 0, bArr, p0Var.e, p0Var2.e);
                System.arraycopy((byte[]) p0Var3.f13699f, 0, bArr, p0Var.e + p0Var2.e, p0Var3.e);
                String str2 = null;
                f2.m k10 = f2.q.k((byte[]) p0Var2.f13699f, 3, p0Var2.e, null);
                f2.j jVar = k10.f10080b;
                if (jVar != null) {
                    str2 = e2.g.a(jVar.f10070a, jVar.f10072c, jVar.d, jVar.f10073f, jVar.f10071b, jVar.e);
                }
                b2.w wVar = new b2.w();
                wVar.f3519a = str;
                wVar.f3532q = w0.n("video/mp2t");
                wVar.f3533r = w0.n("video/hevc");
                wVar.f3525j = str2;
                wVar.f3539y = k10.e;
                wVar.f3540z = k10.f10082f;
                wVar.A = k10.f10083g;
                wVar.B = k10.h;
                wVar.H = new b2.o(k10.f10086k, k10.f10087l, k10.f10088m, null, k10.f10081c + 8, k10.d + 8);
                wVar.E = k10.f10084i;
                wVar.f3535t = k10.f10085j;
                wVar.I = k10.f10079a + 1;
                wVar.f3536u = Collections.singletonList(bArr);
                b2.x xVar = new b2.x(wVar);
                this.f15423c.b(xVar);
                int i13 = xVar.f3588u;
                if (i13 != -1) {
                    z11 = true;
                }
                yb.p(z11);
                cVar.k(i13);
                this.e = true;
            }
        }
        p0 p0Var4 = this.f15427j;
        boolean e = p0Var4.e(i11);
        e2.x xVar2 = this.f15431n;
        if (e) {
            xVar2.L(f2.q.p(p0Var4.e, (byte[]) p0Var4.f13699f), (byte[]) p0Var4.f13699f);
            xVar2.O(5);
            cVar.a(j11, xVar2);
        }
        p0 p0Var5 = this.f15428k;
        if (p0Var5.e(i11)) {
            xVar2.L(f2.q.p(p0Var5.e, (byte[]) p0Var5.f13699f), (byte[]) p0Var5.f13699f);
            xVar2.O(5);
            cVar.a(j11, xVar2);
        }
    }

    @Override
    public final void c() {
        this.f15429l = 0L;
        this.f15430m = -9223372036854775807L;
        f2.q.b(this.f15424f);
        this.f15425g.g();
        this.h.g();
        this.f15426i.g();
        this.f15427j.g();
        this.f15428k.g();
        this.f15421a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f15414f = false;
            rVar.f15415g = false;
            rVar.h = false;
            rVar.f15416i = false;
            rVar.f15417j = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f15422b = (String) f0Var.e;
        f0Var.c();
        j0 F1 = qVar.F1(f0Var.f15314c, 2);
        this.f15423c = F1;
        this.d = new r(F1);
        this.f15421a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f15423c.getClass();
        String str = n0.f9691a;
        if (z10) {
            this.f15421a.d.c(0);
            b(this.f15429l, 0, 0, this.f15430m);
            h(this.f15429l, 0, 48, this.f15430m);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f15430m = j10;
    }

    public final void g(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f15414f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f15415g = z10;
                rVar.f15414f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.f15425g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f15426i.a(i10, i11, bArr);
        }
        this.f15427j.a(i10, i11, bArr);
        this.f15428k.a(i10, i11, bArr);
    }

    public final void h(long j10, int i10, int i11, long j11) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.e;
        boolean z12 = false;
        rVar.f15415g = false;
        rVar.h = false;
        rVar.e = j11;
        rVar.d = 0;
        rVar.f15412b = j10;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f15416i && !rVar.f15417j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f15416i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f15417j;
                rVar.f15417j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f15413c = z10;
        if (z10 || i11 <= 9) {
            z12 = true;
        }
        rVar.f15414f = z12;
        if (!this.e) {
            this.f15425g.h(i11);
            this.h.h(i11);
            this.f15426i.h(i11);
        }
        this.f15427j.h(i11);
        this.f15428k.h(i11);
    }
}
