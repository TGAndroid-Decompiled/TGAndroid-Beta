package l4;

import b8.zb;
import d2.u0;
import e3.i0;
import g2.n0;
import java.util.Collections;
import k2.o0;
public final class s implements i {
    public final c0 f17941a;
    public String f17942b;
    public i0 f17943c;
    public r d;
    public boolean f17944e;
    public long f17950l;
    public final boolean[] f17945f = new boolean[3];
    public final o0 f17946g = new o0(32);
    public final o0 h = new o0(33);
    public final o0 f17947i = new o0(34);
    public final o0 f17948j = new o0(39);
    public final o0 f17949k = new o0(40);
    public long f17951m = -9223372036854775807L;
    public final g2.y f17952n = new g2.y();

    public s(c0 c0Var) {
        this.f17941a = c0Var;
    }

    @Override
    public final void a() {
        this.f17950l = 0L;
        this.f17951m = -9223372036854775807L;
        h2.o.b(this.f17945f);
        this.f17946g.g();
        this.h.g();
        this.f17947i.g();
        this.f17948j.g();
        this.f17949k.g();
        this.f17941a.d.r(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f17934f = false;
            rVar.f17935g = false;
            rVar.h = false;
            rVar.f17936i = false;
            rVar.f17937j = false;
        }
    }

    public final void b(long j10, long j11, int i3, int i10) {
        g2.d dVar = this.f17941a.d;
        r rVar = this.d;
        boolean z10 = this.f17944e;
        boolean z11 = false;
        if (rVar.f17937j && rVar.f17935g) {
            rVar.f17940m = rVar.f17932c;
            rVar.f17937j = false;
        } else if (rVar.h || rVar.f17935g) {
            if (z10 && rVar.f17936i) {
                rVar.a(i3 + ((int) (j10 - rVar.f17931b)));
            }
            rVar.f17938k = rVar.f17931b;
            rVar.f17939l = rVar.f17933e;
            rVar.f17940m = rVar.f17932c;
            rVar.f17936i = true;
        }
        if (!this.f17944e) {
            o0 o0Var = this.f17946g;
            o0Var.e(i10);
            o0 o0Var2 = this.h;
            o0Var2.e(i10);
            o0 o0Var3 = this.f17947i;
            o0Var3.e(i10);
            if (o0Var.d && o0Var2.d && o0Var3.d) {
                String str = this.f17942b;
                int i11 = o0Var.f16662e;
                byte[] bArr = new byte[o0Var2.f16662e + i11 + o0Var3.f16662e];
                System.arraycopy((byte[]) o0Var.f16663f, 0, bArr, 0, i11);
                System.arraycopy((byte[]) o0Var2.f16663f, 0, bArr, o0Var.f16662e, o0Var2.f16662e);
                System.arraycopy((byte[]) o0Var3.f16663f, 0, bArr, o0Var.f16662e + o0Var2.f16662e, o0Var3.f16662e);
                String str2 = null;
                h2.k k10 = h2.o.k((byte[]) o0Var2.f16663f, 3, o0Var2.f16662e, null);
                h2.h hVar = k10.f14126b;
                if (hVar != null) {
                    str2 = g2.h.a(hVar.f14114a, hVar.f14116c, hVar.d, hVar.f14118f, hVar.f14115b, hVar.f14117e);
                }
                d2.u uVar = new d2.u();
                uVar.f8416a = str;
                uVar.f8430q = u0.n("video/mp2t");
                uVar.f8431r = u0.n("video/hevc");
                uVar.f8423j = str2;
                uVar.f8437y = k10.f14128e;
                uVar.f8438z = k10.f14129f;
                uVar.A = k10.f14130g;
                uVar.B = k10.h;
                uVar.H = new d2.n(k10.f14133k, k10.f14134l, k10.f14135m, null, k10.f14127c + 8, k10.d + 8);
                uVar.E = k10.f14131i;
                uVar.f8433t = k10.f14132j;
                uVar.I = k10.f14125a + 1;
                uVar.f8434u = Collections.singletonList(bArr);
                d2.v vVar = new d2.v(uVar);
                this.f17943c.g(vVar);
                int i12 = vVar.f8491u;
                if (i12 != -1) {
                    z11 = true;
                }
                zb.p(z11);
                dVar.C(i12);
                this.f17944e = true;
            }
        }
        o0 o0Var4 = this.f17948j;
        boolean e10 = o0Var4.e(i10);
        g2.y yVar = this.f17952n;
        if (e10) {
            yVar.L(h2.o.p(o0Var4.f16662e, (byte[]) o0Var4.f16663f), (byte[]) o0Var4.f16663f);
            yVar.O(5);
            dVar.a(j11, yVar);
        }
        o0 o0Var5 = this.f17949k;
        if (o0Var5.e(i10)) {
            yVar.L(h2.o.p(o0Var5.f16662e, (byte[]) o0Var5.f16663f), (byte[]) o0Var5.f16663f);
            yVar.O(5);
            dVar.a(j11, yVar);
        }
    }

    @Override
    public final void c(g2.y yVar) {
        int i3;
        int i10;
        this.f17943c.getClass();
        String str = n0.f11873a;
        while (yVar.a() > 0) {
            int i11 = yVar.f11924b;
            int i12 = yVar.f11925c;
            byte[] bArr = yVar.f11923a;
            this.f17950l += yVar.a();
            this.f17943c.e(yVar.a(), yVar);
            while (i11 < i12) {
                int c2 = h2.o.c(bArr, i11, i12, this.f17945f);
                if (c2 == i12) {
                    g(i11, i12, bArr);
                    return;
                }
                int i13 = (bArr[c2 + 3] & 126) >> 1;
                if (c2 > 0 && bArr[c2 - 1] == 0) {
                    c2--;
                    i3 = 4;
                } else {
                    i3 = 3;
                }
                int i14 = c2;
                int i15 = i3;
                int i16 = i14 - i11;
                if (i16 > 0) {
                    g(i11, i14, bArr);
                }
                int i17 = i12 - i14;
                long j10 = this.f17950l - i17;
                if (i16 < 0) {
                    i10 = -i16;
                } else {
                    i10 = 0;
                }
                b(j10, this.f17951m, i17, i10);
                h(j10, this.f17951m, i17, i13);
                i11 = i14 + i15;
            }
        }
    }

    @Override
    public final void d(boolean z10) {
        this.f17943c.getClass();
        String str = n0.f11873a;
        if (z10) {
            this.f17941a.d.r(0);
            b(this.f17950l, this.f17951m, 0, 0);
            h(this.f17950l, this.f17951m, 0, 48);
        }
    }

    @Override
    public final void e(int i3, long j10) {
        this.f17951m = j10;
    }

    @Override
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f17942b = (String) f0Var.f17823e;
        f0Var.c();
        i0 i02 = qVar.i0(f0Var.f17822c, 2);
        this.f17943c = i02;
        this.d = new r(i02);
        this.f17941a.b(qVar, f0Var);
    }

    public final void g(int i3, int i10, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f17934f) {
            int i11 = rVar.d;
            int i12 = (i3 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f17935g = z10;
                rVar.f17934f = false;
            } else {
                rVar.d = (i10 - i3) + i11;
            }
        }
        if (!this.f17944e) {
            this.f17946g.a(i3, i10, bArr);
            this.h.a(i3, i10, bArr);
            this.f17947i.a(i3, i10, bArr);
        }
        this.f17948j.a(i3, i10, bArr);
        this.f17949k.a(i3, i10, bArr);
    }

    public final void h(long j10, long j11, int i3, int i10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.f17944e;
        boolean z12 = false;
        rVar.f17935g = false;
        rVar.h = false;
        rVar.f17933e = j11;
        rVar.d = 0;
        rVar.f17931b = j10;
        if (i10 >= 32 && i10 != 40) {
            if (rVar.f17936i && !rVar.f17937j) {
                if (z11) {
                    rVar.a(i3);
                }
                rVar.f17936i = false;
            }
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                rVar.h = !rVar.f17937j;
                rVar.f17937j = true;
            }
        }
        if (i10 >= 16 && i10 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f17932c = z10;
        if (z10 || i10 <= 9) {
            z12 = true;
        }
        rVar.f17934f = z12;
        if (!this.f17944e) {
            this.f17946g.h(i10);
            this.h.h(i10);
            this.f17947i.h(i10);
        }
        this.f17948j.h(i10);
        this.f17949k.h(i10);
    }
}
