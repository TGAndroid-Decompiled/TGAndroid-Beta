package m4;

import a8.la;
import e2.s0;
import f3.i0;
import java.util.Collections;
import l2.l0;
public final class s implements i {
    public final c0 f20760a;
    public String f20761b;
    public i0 f20762c;
    public r d;
    public boolean f20763e;
    public long f20769l;
    public final boolean[] f20764f = new boolean[3];
    public final l0 f20765g = new l0(32);
    public final l0 h = new l0(33);
    public final l0 f20766i = new l0(34);
    public final l0 f20767j = new l0(39);
    public final l0 f20768k = new l0(40);
    public long f20770m = -9223372036854775807L;
    public final h2.x f20771n = new h2.x();

    public s(c0 c0Var) {
        this.f20760a = c0Var;
    }

    public final void a(long j3, long j10, int i7, int i10) {
        h2.c cVar = this.f20760a.d;
        r rVar = this.d;
        boolean z10 = this.f20763e;
        boolean z11 = false;
        if (rVar.f20756j && rVar.f20754g) {
            rVar.f20759m = rVar.f20751c;
            rVar.f20756j = false;
        } else if (rVar.h || rVar.f20754g) {
            if (z10 && rVar.f20755i) {
                rVar.a(i7 + ((int) (j3 - rVar.f20750b)));
            }
            rVar.f20757k = rVar.f20750b;
            rVar.f20758l = rVar.f20752e;
            rVar.f20759m = rVar.f20751c;
            rVar.f20755i = true;
        }
        if (!this.f20763e) {
            l0 l0Var = this.f20765g;
            l0Var.e(i10);
            l0 l0Var2 = this.h;
            l0Var2.e(i10);
            l0 l0Var3 = this.f20766i;
            l0Var3.e(i10);
            if (l0Var.d && l0Var2.d && l0Var3.d) {
                String str = this.f20761b;
                int i11 = l0Var.f19460e;
                byte[] bArr = new byte[l0Var2.f19460e + i11 + l0Var3.f19460e];
                System.arraycopy((byte[]) l0Var.f19461f, 0, bArr, 0, i11);
                System.arraycopy((byte[]) l0Var2.f19461f, 0, bArr, l0Var.f19460e, l0Var2.f19460e);
                System.arraycopy((byte[]) l0Var3.f19461f, 0, bArr, l0Var.f19460e + l0Var2.f19460e, l0Var3.f19460e);
                String str2 = null;
                i2.k k10 = i2.o.k((byte[]) l0Var2.f19461f, 3, l0Var2.f19460e, null);
                i2.h hVar = k10.f15967b;
                if (hVar != null) {
                    str2 = h2.g.a(hVar.f15955a, hVar.f15957c, hVar.d, hVar.f15959f, hVar.f15956b, hVar.f15958e);
                }
                e2.t tVar = new e2.t();
                tVar.f10728a = str;
                tVar.f10742q = s0.n("video/mp2t");
                tVar.f10743r = s0.n("video/hevc");
                tVar.f10735j = str2;
                tVar.f10749y = k10.f15969e;
                tVar.f10750z = k10.f15970f;
                tVar.A = k10.f15971g;
                tVar.B = k10.h;
                tVar.H = new e2.m(k10.f15974k, k10.f15975l, k10.f15976m, null, k10.f15968c + 8, k10.d + 8);
                tVar.E = k10.f15972i;
                tVar.f10745t = k10.f15973j;
                tVar.I = k10.f15966a + 1;
                tVar.f10746u = Collections.singletonList(bArr);
                e2.u uVar = new e2.u(tVar);
                this.f20762c.g(uVar);
                int i12 = uVar.f10797u;
                if (i12 != -1) {
                    z11 = true;
                }
                la.p(z11);
                cVar.C(i12);
                this.f20763e = true;
            }
        }
        l0 l0Var4 = this.f20767j;
        boolean e10 = l0Var4.e(i10);
        h2.x xVar = this.f20771n;
        if (e10) {
            xVar.L(i2.o.p(l0Var4.f19460e, (byte[]) l0Var4.f19461f), (byte[]) l0Var4.f19461f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
        l0 l0Var5 = this.f20768k;
        if (l0Var5.e(i10)) {
            xVar.L(i2.o.p(l0Var5.f19460e, (byte[]) l0Var5.f19461f), (byte[]) l0Var5.f19461f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
    }

    public final void b(int i7, int i10, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f20753f) {
            int i11 = rVar.d;
            int i12 = (i7 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f20754g = z10;
                rVar.f20753f = false;
            } else {
                rVar.d = (i10 - i7) + i11;
            }
        }
        if (!this.f20763e) {
            this.f20765g.a(i7, i10, bArr);
            this.h.a(i7, i10, bArr);
            this.f20766i.a(i7, i10, bArr);
        }
        this.f20767j.a(i7, i10, bArr);
        this.f20768k.a(i7, i10, bArr);
    }

    @Override
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        this.f20762c.getClass();
        String str = h2.l0.f13812a;
        while (xVar.a() > 0) {
            int i11 = xVar.f13863b;
            int i12 = xVar.f13864c;
            byte[] bArr = xVar.f13862a;
            this.f20769l += xVar.a();
            this.f20762c.b(xVar.a(), xVar);
            while (i11 < i12) {
                int c10 = i2.o.c(bArr, i11, i12, this.f20764f);
                if (c10 == i12) {
                    b(i11, i12, bArr);
                    return;
                }
                int i13 = (bArr[c10 + 3] & 126) >> 1;
                if (c10 > 0 && bArr[c10 - 1] == 0) {
                    c10--;
                    i7 = 4;
                } else {
                    i7 = 3;
                }
                int i14 = c10;
                int i15 = i7;
                int i16 = i14 - i11;
                if (i16 > 0) {
                    b(i11, i14, bArr);
                }
                int i17 = i12 - i14;
                long j3 = this.f20769l - i17;
                if (i16 < 0) {
                    i10 = -i16;
                } else {
                    i10 = 0;
                }
                a(j3, this.f20770m, i17, i10);
                h(j3, this.f20770m, i17, i13);
                i11 = i14 + i15;
            }
        }
    }

    @Override
    public final void d() {
        this.f20769l = 0L;
        this.f20770m = -9223372036854775807L;
        i2.o.b(this.f20764f);
        this.f20765g.g();
        this.h.g();
        this.f20766i.g();
        this.f20767j.g();
        this.f20768k.g();
        this.f20760a.d.r(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f20753f = false;
            rVar.f20754g = false;
            rVar.h = false;
            rVar.f20755i = false;
            rVar.f20756j = false;
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f20762c.getClass();
        String str = h2.l0.f13812a;
        if (z10) {
            this.f20760a.d.r(0);
            a(this.f20769l, this.f20770m, 0, 0);
            h(this.f20769l, this.f20770m, 0, 48);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20770m = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20761b = (String) f0Var.f20642e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20641c, 2);
        this.f20762c = d2;
        this.d = new r(d2);
        this.f20760a.b(qVar, f0Var);
    }

    public final void h(long j3, long j10, int i7, int i10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.f20763e;
        boolean z12 = false;
        rVar.f20754g = false;
        rVar.h = false;
        rVar.f20752e = j10;
        rVar.d = 0;
        rVar.f20750b = j3;
        if (i10 >= 32 && i10 != 40) {
            if (rVar.f20755i && !rVar.f20756j) {
                if (z11) {
                    rVar.a(i7);
                }
                rVar.f20755i = false;
            }
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                rVar.h = !rVar.f20756j;
                rVar.f20756j = true;
            }
        }
        if (i10 >= 16 && i10 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f20751c = z10;
        if (z10 || i10 <= 9) {
            z12 = true;
        }
        rVar.f20753f = z12;
        if (!this.f20763e) {
            this.f20765g.h(i10);
            this.h.h(i10);
            this.f20766i.h(i10);
        }
        this.f20767j.h(i10);
        this.f20768k.h(i10);
    }
}
