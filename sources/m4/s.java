package m4;

import a8.la;
import e2.s0;
import f3.i0;
import java.util.Collections;
import l2.l0;
public final class s implements i {
    public final c0 f20735a;
    public String f20736b;
    public i0 f20737c;
    public r d;
    public boolean f20738e;
    public long f20744l;
    public final boolean[] f20739f = new boolean[3];
    public final l0 f20740g = new l0(32);
    public final l0 h = new l0(33);
    public final l0 f20741i = new l0(34);
    public final l0 f20742j = new l0(39);
    public final l0 f20743k = new l0(40);
    public long f20745m = -9223372036854775807L;
    public final h2.x f20746n = new h2.x();

    public s(c0 c0Var) {
        this.f20735a = c0Var;
    }

    public final void a(long j3, long j10, int i7, int i10) {
        h2.c cVar = this.f20735a.d;
        r rVar = this.d;
        boolean z10 = this.f20738e;
        boolean z11 = false;
        if (rVar.f20731j && rVar.f20729g) {
            rVar.f20734m = rVar.f20726c;
            rVar.f20731j = false;
        } else if (rVar.h || rVar.f20729g) {
            if (z10 && rVar.f20730i) {
                rVar.a(i7 + ((int) (j3 - rVar.f20725b)));
            }
            rVar.f20732k = rVar.f20725b;
            rVar.f20733l = rVar.f20727e;
            rVar.f20734m = rVar.f20726c;
            rVar.f20730i = true;
        }
        if (!this.f20738e) {
            l0 l0Var = this.f20740g;
            l0Var.e(i10);
            l0 l0Var2 = this.h;
            l0Var2.e(i10);
            l0 l0Var3 = this.f20741i;
            l0Var3.e(i10);
            if (l0Var.d && l0Var2.d && l0Var3.d) {
                String str = this.f20736b;
                int i11 = l0Var.f19435e;
                byte[] bArr = new byte[l0Var2.f19435e + i11 + l0Var3.f19435e];
                System.arraycopy((byte[]) l0Var.f19436f, 0, bArr, 0, i11);
                System.arraycopy((byte[]) l0Var2.f19436f, 0, bArr, l0Var.f19435e, l0Var2.f19435e);
                System.arraycopy((byte[]) l0Var3.f19436f, 0, bArr, l0Var.f19435e + l0Var2.f19435e, l0Var3.f19435e);
                String str2 = null;
                i2.k k10 = i2.o.k((byte[]) l0Var2.f19436f, 3, l0Var2.f19435e, null);
                i2.h hVar = k10.f15945b;
                if (hVar != null) {
                    str2 = h2.g.a(hVar.f15933a, hVar.f15935c, hVar.d, hVar.f15937f, hVar.f15934b, hVar.f15936e);
                }
                e2.t tVar = new e2.t();
                tVar.f10702a = str;
                tVar.f10716q = s0.n("video/mp2t");
                tVar.f10717r = s0.n("video/hevc");
                tVar.f10709j = str2;
                tVar.f10723y = k10.f15947e;
                tVar.f10724z = k10.f15948f;
                tVar.A = k10.f15949g;
                tVar.B = k10.h;
                tVar.H = new e2.m(k10.f15952k, k10.f15953l, k10.f15954m, null, k10.f15946c + 8, k10.d + 8);
                tVar.E = k10.f15950i;
                tVar.f10719t = k10.f15951j;
                tVar.I = k10.f15944a + 1;
                tVar.f10720u = Collections.singletonList(bArr);
                e2.u uVar = new e2.u(tVar);
                this.f20737c.g(uVar);
                int i12 = uVar.f10771u;
                if (i12 != -1) {
                    z11 = true;
                }
                la.p(z11);
                cVar.C(i12);
                this.f20738e = true;
            }
        }
        l0 l0Var4 = this.f20742j;
        boolean e10 = l0Var4.e(i10);
        h2.x xVar = this.f20746n;
        if (e10) {
            xVar.L(i2.o.p(l0Var4.f19435e, (byte[]) l0Var4.f19436f), (byte[]) l0Var4.f19436f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
        l0 l0Var5 = this.f20743k;
        if (l0Var5.e(i10)) {
            xVar.L(i2.o.p(l0Var5.f19435e, (byte[]) l0Var5.f19436f), (byte[]) l0Var5.f19436f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
    }

    public final void b(int i7, int i10, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f20728f) {
            int i11 = rVar.d;
            int i12 = (i7 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f20729g = z10;
                rVar.f20728f = false;
            } else {
                rVar.d = (i10 - i7) + i11;
            }
        }
        if (!this.f20738e) {
            this.f20740g.a(i7, i10, bArr);
            this.h.a(i7, i10, bArr);
            this.f20741i.a(i7, i10, bArr);
        }
        this.f20742j.a(i7, i10, bArr);
        this.f20743k.a(i7, i10, bArr);
    }

    @Override
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        this.f20737c.getClass();
        String str = h2.l0.f13786a;
        while (xVar.a() > 0) {
            int i11 = xVar.f13837b;
            int i12 = xVar.f13838c;
            byte[] bArr = xVar.f13836a;
            this.f20744l += xVar.a();
            this.f20737c.b(xVar.a(), xVar);
            while (i11 < i12) {
                int c10 = i2.o.c(bArr, i11, i12, this.f20739f);
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
                long j3 = this.f20744l - i17;
                if (i16 < 0) {
                    i10 = -i16;
                } else {
                    i10 = 0;
                }
                a(j3, this.f20745m, i17, i10);
                h(j3, this.f20745m, i17, i13);
                i11 = i14 + i15;
            }
        }
    }

    @Override
    public final void d() {
        this.f20744l = 0L;
        this.f20745m = -9223372036854775807L;
        i2.o.b(this.f20739f);
        this.f20740g.g();
        this.h.g();
        this.f20741i.g();
        this.f20742j.g();
        this.f20743k.g();
        this.f20735a.d.r(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f20728f = false;
            rVar.f20729g = false;
            rVar.h = false;
            rVar.f20730i = false;
            rVar.f20731j = false;
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f20737c.getClass();
        String str = h2.l0.f13786a;
        if (z10) {
            this.f20735a.d.r(0);
            a(this.f20744l, this.f20745m, 0, 0);
            h(this.f20744l, this.f20745m, 0, 48);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20745m = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20736b = (String) f0Var.f20617e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20616c, 2);
        this.f20737c = d2;
        this.d = new r(d2);
        this.f20735a.b(qVar, f0Var);
    }

    public final void h(long j3, long j10, int i7, int i10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.f20738e;
        boolean z12 = false;
        rVar.f20729g = false;
        rVar.h = false;
        rVar.f20727e = j10;
        rVar.d = 0;
        rVar.f20725b = j3;
        if (i10 >= 32 && i10 != 40) {
            if (rVar.f20730i && !rVar.f20731j) {
                if (z11) {
                    rVar.a(i7);
                }
                rVar.f20730i = false;
            }
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                rVar.h = !rVar.f20731j;
                rVar.f20731j = true;
            }
        }
        if (i10 >= 16 && i10 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f20726c = z10;
        if (z10 || i10 <= 9) {
            z12 = true;
        }
        rVar.f20728f = z12;
        if (!this.f20738e) {
            this.f20740g.h(i10);
            this.h.h(i10);
            this.f20741i.h(i10);
        }
        this.f20742j.h(i10);
        this.f20743k.h(i10);
    }
}
