package m4;

import a8.la;
import e2.s0;
import f3.i0;
import java.util.Collections;
import l2.l0;
public final class s implements i {
    public final c0 f20763a;
    public String f20764b;
    public i0 f20765c;
    public r d;
    public boolean f20766e;
    public long f20772l;
    public final boolean[] f20767f = new boolean[3];
    public final l0 f20768g = new l0(32);
    public final l0 h = new l0(33);
    public final l0 f20769i = new l0(34);
    public final l0 f20770j = new l0(39);
    public final l0 f20771k = new l0(40);
    public long f20773m = -9223372036854775807L;
    public final h2.x f20774n = new h2.x();

    public s(c0 c0Var) {
        this.f20763a = c0Var;
    }

    public final void a(long j3, long j10, int i7, int i10) {
        h2.c cVar = this.f20763a.d;
        r rVar = this.d;
        boolean z10 = this.f20766e;
        boolean z11 = false;
        if (rVar.f20759j && rVar.f20757g) {
            rVar.f20762m = rVar.f20754c;
            rVar.f20759j = false;
        } else if (rVar.h || rVar.f20757g) {
            if (z10 && rVar.f20758i) {
                rVar.a(i7 + ((int) (j3 - rVar.f20753b)));
            }
            rVar.f20760k = rVar.f20753b;
            rVar.f20761l = rVar.f20755e;
            rVar.f20762m = rVar.f20754c;
            rVar.f20758i = true;
        }
        if (!this.f20766e) {
            l0 l0Var = this.f20768g;
            l0Var.e(i10);
            l0 l0Var2 = this.h;
            l0Var2.e(i10);
            l0 l0Var3 = this.f20769i;
            l0Var3.e(i10);
            if (l0Var.d && l0Var2.d && l0Var3.d) {
                String str = this.f20764b;
                int i11 = l0Var.f19463e;
                byte[] bArr = new byte[l0Var2.f19463e + i11 + l0Var3.f19463e];
                System.arraycopy((byte[]) l0Var.f19464f, 0, bArr, 0, i11);
                System.arraycopy((byte[]) l0Var2.f19464f, 0, bArr, l0Var.f19463e, l0Var2.f19463e);
                System.arraycopy((byte[]) l0Var3.f19464f, 0, bArr, l0Var.f19463e + l0Var2.f19463e, l0Var3.f19463e);
                String str2 = null;
                i2.k k10 = i2.o.k((byte[]) l0Var2.f19464f, 3, l0Var2.f19463e, null);
                i2.h hVar = k10.f15970b;
                if (hVar != null) {
                    str2 = h2.g.a(hVar.f15958a, hVar.f15960c, hVar.d, hVar.f15962f, hVar.f15959b, hVar.f15961e);
                }
                e2.t tVar = new e2.t();
                tVar.f10731a = str;
                tVar.f10745q = s0.n("video/mp2t");
                tVar.f10746r = s0.n("video/hevc");
                tVar.f10738j = str2;
                tVar.f10752y = k10.f15972e;
                tVar.f10753z = k10.f15973f;
                tVar.A = k10.f15974g;
                tVar.B = k10.h;
                tVar.H = new e2.m(k10.f15977k, k10.f15978l, k10.f15979m, null, k10.f15971c + 8, k10.d + 8);
                tVar.E = k10.f15975i;
                tVar.f10748t = k10.f15976j;
                tVar.I = k10.f15969a + 1;
                tVar.f10749u = Collections.singletonList(bArr);
                e2.u uVar = new e2.u(tVar);
                this.f20765c.g(uVar);
                int i12 = uVar.f10800u;
                if (i12 != -1) {
                    z11 = true;
                }
                la.p(z11);
                cVar.C(i12);
                this.f20766e = true;
            }
        }
        l0 l0Var4 = this.f20770j;
        boolean e10 = l0Var4.e(i10);
        h2.x xVar = this.f20774n;
        if (e10) {
            xVar.L(i2.o.p(l0Var4.f19463e, (byte[]) l0Var4.f19464f), (byte[]) l0Var4.f19464f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
        l0 l0Var5 = this.f20771k;
        if (l0Var5.e(i10)) {
            xVar.L(i2.o.p(l0Var5.f19463e, (byte[]) l0Var5.f19464f), (byte[]) l0Var5.f19464f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
    }

    public final void b(int i7, int i10, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f20756f) {
            int i11 = rVar.d;
            int i12 = (i7 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f20757g = z10;
                rVar.f20756f = false;
            } else {
                rVar.d = (i10 - i7) + i11;
            }
        }
        if (!this.f20766e) {
            this.f20768g.a(i7, i10, bArr);
            this.h.a(i7, i10, bArr);
            this.f20769i.a(i7, i10, bArr);
        }
        this.f20770j.a(i7, i10, bArr);
        this.f20771k.a(i7, i10, bArr);
    }

    @Override
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        this.f20765c.getClass();
        String str = h2.l0.f13815a;
        while (xVar.a() > 0) {
            int i11 = xVar.f13866b;
            int i12 = xVar.f13867c;
            byte[] bArr = xVar.f13865a;
            this.f20772l += xVar.a();
            this.f20765c.b(xVar.a(), xVar);
            while (i11 < i12) {
                int c10 = i2.o.c(bArr, i11, i12, this.f20767f);
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
                long j3 = this.f20772l - i17;
                if (i16 < 0) {
                    i10 = -i16;
                } else {
                    i10 = 0;
                }
                a(j3, this.f20773m, i17, i10);
                h(j3, this.f20773m, i17, i13);
                i11 = i14 + i15;
            }
        }
    }

    @Override
    public final void d() {
        this.f20772l = 0L;
        this.f20773m = -9223372036854775807L;
        i2.o.b(this.f20767f);
        this.f20768g.g();
        this.h.g();
        this.f20769i.g();
        this.f20770j.g();
        this.f20771k.g();
        this.f20763a.d.r(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f20756f = false;
            rVar.f20757g = false;
            rVar.h = false;
            rVar.f20758i = false;
            rVar.f20759j = false;
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f20765c.getClass();
        String str = h2.l0.f13815a;
        if (z10) {
            this.f20763a.d.r(0);
            a(this.f20772l, this.f20773m, 0, 0);
            h(this.f20772l, this.f20773m, 0, 48);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20773m = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20764b = (String) f0Var.f20645e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20644c, 2);
        this.f20765c = d2;
        this.d = new r(d2);
        this.f20763a.b(qVar, f0Var);
    }

    public final void h(long j3, long j10, int i7, int i10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.f20766e;
        boolean z12 = false;
        rVar.f20757g = false;
        rVar.h = false;
        rVar.f20755e = j10;
        rVar.d = 0;
        rVar.f20753b = j3;
        if (i10 >= 32 && i10 != 40) {
            if (rVar.f20758i && !rVar.f20759j) {
                if (z11) {
                    rVar.a(i7);
                }
                rVar.f20758i = false;
            }
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                rVar.h = !rVar.f20759j;
                rVar.f20759j = true;
            }
        }
        if (i10 >= 16 && i10 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f20754c = z10;
        if (z10 || i10 <= 9) {
            z12 = true;
        }
        rVar.f20756f = z12;
        if (!this.f20766e) {
            this.f20768g.h(i10);
            this.h.h(i10);
            this.f20769i.h(i10);
        }
        this.f20770j.h(i10);
        this.f20771k.h(i10);
    }
}
