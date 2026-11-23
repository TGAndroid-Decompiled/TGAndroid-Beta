package m4;

import a8.ma;
import e2.s0;
import f3.i0;
import java.util.Collections;
import l2.l0;
public final class s implements i {
    public final c0 f20729a;
    public String f20730b;
    public i0 f20731c;
    public r d;
    public boolean f20732e;
    public long f20738l;
    public final boolean[] f20733f = new boolean[3];
    public final l0 f20734g = new l0(32);
    public final l0 h = new l0(33);
    public final l0 f20735i = new l0(34);
    public final l0 f20736j = new l0(39);
    public final l0 f20737k = new l0(40);
    public long f20739m = -9223372036854775807L;
    public final h2.x f20740n = new h2.x();

    public s(c0 c0Var) {
        this.f20729a = c0Var;
    }

    public final void a(long j3, long j10, int i7, int i10) {
        h2.c cVar = this.f20729a.d;
        r rVar = this.d;
        boolean z10 = this.f20732e;
        boolean z11 = false;
        if (rVar.f20725j && rVar.f20723g) {
            rVar.f20728m = rVar.f20720c;
            rVar.f20725j = false;
        } else if (rVar.h || rVar.f20723g) {
            if (z10 && rVar.f20724i) {
                rVar.a(i7 + ((int) (j3 - rVar.f20719b)));
            }
            rVar.f20726k = rVar.f20719b;
            rVar.f20727l = rVar.f20721e;
            rVar.f20728m = rVar.f20720c;
            rVar.f20724i = true;
        }
        if (!this.f20732e) {
            l0 l0Var = this.f20734g;
            l0Var.e(i10);
            l0 l0Var2 = this.h;
            l0Var2.e(i10);
            l0 l0Var3 = this.f20735i;
            l0Var3.e(i10);
            if (l0Var.d && l0Var2.d && l0Var3.d) {
                String str = this.f20730b;
                int i11 = l0Var.f19429e;
                byte[] bArr = new byte[l0Var2.f19429e + i11 + l0Var3.f19429e];
                System.arraycopy((byte[]) l0Var.f19430f, 0, bArr, 0, i11);
                System.arraycopy((byte[]) l0Var2.f19430f, 0, bArr, l0Var.f19429e, l0Var2.f19429e);
                System.arraycopy((byte[]) l0Var3.f19430f, 0, bArr, l0Var.f19429e + l0Var2.f19429e, l0Var3.f19429e);
                String str2 = null;
                i2.k k10 = i2.o.k((byte[]) l0Var2.f19430f, 3, l0Var2.f19429e, null);
                i2.h hVar = k10.f15936b;
                if (hVar != null) {
                    str2 = h2.g.a(hVar.f15924a, hVar.f15926c, hVar.d, hVar.f15928f, hVar.f15925b, hVar.f15927e);
                }
                e2.t tVar = new e2.t();
                tVar.f10694a = str;
                tVar.f10708q = s0.n("video/mp2t");
                tVar.f10709r = s0.n("video/hevc");
                tVar.f10701j = str2;
                tVar.f10715y = k10.f15938e;
                tVar.f10716z = k10.f15939f;
                tVar.A = k10.f15940g;
                tVar.B = k10.h;
                tVar.H = new e2.m(k10.f15943k, k10.f15944l, k10.f15945m, null, k10.f15937c + 8, k10.d + 8);
                tVar.E = k10.f15941i;
                tVar.f10711t = k10.f15942j;
                tVar.I = k10.f15935a + 1;
                tVar.f10712u = Collections.singletonList(bArr);
                e2.u uVar = new e2.u(tVar);
                this.f20731c.g(uVar);
                int i12 = uVar.f10763u;
                if (i12 != -1) {
                    z11 = true;
                }
                ma.p(z11);
                cVar.C(i12);
                this.f20732e = true;
            }
        }
        l0 l0Var4 = this.f20736j;
        boolean e10 = l0Var4.e(i10);
        h2.x xVar = this.f20740n;
        if (e10) {
            xVar.L(i2.o.p(l0Var4.f19429e, (byte[]) l0Var4.f19430f), (byte[]) l0Var4.f19430f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
        l0 l0Var5 = this.f20737k;
        if (l0Var5.e(i10)) {
            xVar.L(i2.o.p(l0Var5.f19429e, (byte[]) l0Var5.f19430f), (byte[]) l0Var5.f19430f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
    }

    public final void b(int i7, int i10, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f20722f) {
            int i11 = rVar.d;
            int i12 = (i7 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f20723g = z10;
                rVar.f20722f = false;
            } else {
                rVar.d = (i10 - i7) + i11;
            }
        }
        if (!this.f20732e) {
            this.f20734g.a(i7, i10, bArr);
            this.h.a(i7, i10, bArr);
            this.f20735i.a(i7, i10, bArr);
        }
        this.f20736j.a(i7, i10, bArr);
        this.f20737k.a(i7, i10, bArr);
    }

    @Override
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        this.f20731c.getClass();
        String str = h2.l0.f13778a;
        while (xVar.a() > 0) {
            int i11 = xVar.f13829b;
            int i12 = xVar.f13830c;
            byte[] bArr = xVar.f13828a;
            this.f20738l += xVar.a();
            this.f20731c.b(xVar.a(), xVar);
            while (i11 < i12) {
                int c10 = i2.o.c(bArr, i11, i12, this.f20733f);
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
                long j3 = this.f20738l - i17;
                if (i16 < 0) {
                    i10 = -i16;
                } else {
                    i10 = 0;
                }
                a(j3, this.f20739m, i17, i10);
                h(j3, this.f20739m, i17, i13);
                i11 = i14 + i15;
            }
        }
    }

    @Override
    public final void d() {
        this.f20738l = 0L;
        this.f20739m = -9223372036854775807L;
        i2.o.b(this.f20733f);
        this.f20734g.g();
        this.h.g();
        this.f20735i.g();
        this.f20736j.g();
        this.f20737k.g();
        this.f20729a.d.r(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f20722f = false;
            rVar.f20723g = false;
            rVar.h = false;
            rVar.f20724i = false;
            rVar.f20725j = false;
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f20731c.getClass();
        String str = h2.l0.f13778a;
        if (z10) {
            this.f20729a.d.r(0);
            a(this.f20738l, this.f20739m, 0, 0);
            h(this.f20738l, this.f20739m, 0, 48);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20739m = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20730b = (String) f0Var.f20611e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20610c, 2);
        this.f20731c = d2;
        this.d = new r(d2);
        this.f20729a.b(qVar, f0Var);
    }

    public final void h(long j3, long j10, int i7, int i10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.f20732e;
        boolean z12 = false;
        rVar.f20723g = false;
        rVar.h = false;
        rVar.f20721e = j10;
        rVar.d = 0;
        rVar.f20719b = j3;
        if (i10 >= 32 && i10 != 40) {
            if (rVar.f20724i && !rVar.f20725j) {
                if (z11) {
                    rVar.a(i7);
                }
                rVar.f20724i = false;
            }
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                rVar.h = !rVar.f20725j;
                rVar.f20725j = true;
            }
        }
        if (i10 >= 16 && i10 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f20720c = z10;
        if (z10 || i10 <= 9) {
            z12 = true;
        }
        rVar.f20722f = z12;
        if (!this.f20732e) {
            this.f20734g.h(i10);
            this.h.h(i10);
            this.f20735i.h(i10);
        }
        this.f20736j.h(i10);
        this.f20737k.h(i10);
    }
}
