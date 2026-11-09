package m4;

import a8.ia;
import e2.s0;
import f3.j0;
import h2.m0;
import java.util.Collections;
import l2.o0;
public final class s implements i {
    public final c0 f19777a;
    public String f19778b;
    public j0 f19779c;
    public r d;
    public boolean f19780e;
    public long f19786l;
    public final boolean[] f19781f = new boolean[3];
    public final o0 f19782g = new o0(32);
    public final o0 h = new o0(33);
    public final o0 f19783i = new o0(34);
    public final o0 f19784j = new o0(39);
    public final o0 f19785k = new o0(40);
    public long f19787m = -9223372036854775807L;
    public final h2.x f19788n = new h2.x();

    public s(c0 c0Var) {
        this.f19777a = c0Var;
    }

    public final void a(long j3, long j10, int i7, int i10) {
        h2.c cVar = this.f19777a.d;
        r rVar = this.d;
        boolean z9 = this.f19780e;
        boolean z10 = false;
        if (rVar.f19773j && rVar.f19771g) {
            rVar.f19776m = rVar.f19768c;
            rVar.f19773j = false;
        } else if (rVar.h || rVar.f19771g) {
            if (z9 && rVar.f19772i) {
                rVar.a(i7 + ((int) (j3 - rVar.f19767b)));
            }
            rVar.f19774k = rVar.f19767b;
            rVar.f19775l = rVar.f19769e;
            rVar.f19776m = rVar.f19768c;
            rVar.f19772i = true;
        }
        if (!this.f19780e) {
            o0 o0Var = this.f19782g;
            o0Var.e(i10);
            o0 o0Var2 = this.h;
            o0Var2.e(i10);
            o0 o0Var3 = this.f19783i;
            o0Var3.e(i10);
            if (o0Var.d && o0Var2.d && o0Var3.d) {
                String str = this.f19778b;
                int i11 = o0Var.f17975e;
                byte[] bArr = new byte[o0Var2.f17975e + i11 + o0Var3.f17975e];
                System.arraycopy((byte[]) o0Var.f17976f, 0, bArr, 0, i11);
                System.arraycopy((byte[]) o0Var2.f17976f, 0, bArr, o0Var.f17975e, o0Var2.f17975e);
                System.arraycopy((byte[]) o0Var3.f17976f, 0, bArr, o0Var.f17975e + o0Var2.f17975e, o0Var3.f17975e);
                String str2 = null;
                i2.k k10 = i2.o.k((byte[]) o0Var2.f17976f, 3, o0Var2.f17975e, null);
                i2.h hVar = k10.f15173b;
                if (hVar != null) {
                    str2 = h2.g.a(hVar.f15161a, hVar.f15163c, hVar.d, hVar.f15165f, hVar.f15162b, hVar.f15164e);
                }
                e2.t tVar = new e2.t();
                tVar.f10548a = str;
                tVar.f10562q = s0.n("video/mp2t");
                tVar.f10563r = s0.n("video/hevc");
                tVar.f10555j = str2;
                tVar.f10569y = k10.f15175e;
                tVar.f10570z = k10.f15176f;
                tVar.A = k10.f15177g;
                tVar.B = k10.h;
                tVar.H = new e2.m(k10.f15180k, k10.f15181l, k10.f15182m, null, k10.f15174c + 8, k10.d + 8);
                tVar.E = k10.f15178i;
                tVar.f10565t = k10.f15179j;
                tVar.I = k10.f15172a + 1;
                tVar.f10566u = Collections.singletonList(bArr);
                e2.u uVar = new e2.u(tVar);
                this.f19779c.g(uVar);
                int i12 = uVar.f10617u;
                if (i12 != -1) {
                    z10 = true;
                }
                ia.p(z10);
                cVar.C(i12);
                this.f19780e = true;
            }
        }
        o0 o0Var4 = this.f19784j;
        boolean e10 = o0Var4.e(i10);
        h2.x xVar = this.f19788n;
        if (e10) {
            xVar.L(i2.o.p(o0Var4.f17975e, (byte[]) o0Var4.f17976f), (byte[]) o0Var4.f17976f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
        o0 o0Var5 = this.f19785k;
        if (o0Var5.e(i10)) {
            xVar.L(i2.o.p(o0Var5.f17975e, (byte[]) o0Var5.f17976f), (byte[]) o0Var5.f17976f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
    }

    public final void b(int i7, int i10, byte[] bArr) {
        boolean z9;
        r rVar = this.d;
        if (rVar.f19770f) {
            int i11 = rVar.d;
            int i12 = (i7 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                rVar.f19771g = z9;
                rVar.f19770f = false;
            } else {
                rVar.d = (i10 - i7) + i11;
            }
        }
        if (!this.f19780e) {
            this.f19782g.a(i7, i10, bArr);
            this.h.a(i7, i10, bArr);
            this.f19783i.a(i7, i10, bArr);
        }
        this.f19784j.a(i7, i10, bArr);
        this.f19785k.a(i7, i10, bArr);
    }

    @Override
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        this.f19779c.getClass();
        String str = m0.f14112a;
        while (xVar.a() > 0) {
            int i11 = xVar.f14163b;
            int i12 = xVar.f14164c;
            byte[] bArr = xVar.f14162a;
            this.f19786l += xVar.a();
            this.f19779c.b(xVar.a(), xVar);
            while (i11 < i12) {
                int c10 = i2.o.c(bArr, i11, i12, this.f19781f);
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
                long j3 = this.f19786l - i17;
                if (i16 < 0) {
                    i10 = -i16;
                } else {
                    i10 = 0;
                }
                a(j3, this.f19787m, i17, i10);
                h(j3, this.f19787m, i17, i13);
                i11 = i14 + i15;
            }
        }
    }

    @Override
    public final void d() {
        this.f19786l = 0L;
        this.f19787m = -9223372036854775807L;
        i2.o.b(this.f19781f);
        this.f19782g.g();
        this.h.g();
        this.f19783i.g();
        this.f19784j.g();
        this.f19785k.g();
        this.f19777a.d.r(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f19770f = false;
            rVar.f19771g = false;
            rVar.h = false;
            rVar.f19772i = false;
            rVar.f19773j = false;
        }
    }

    @Override
    public final void e(boolean z9) {
        this.f19779c.getClass();
        String str = m0.f14112a;
        if (z9) {
            this.f19777a.d.r(0);
            a(this.f19786l, this.f19787m, 0, 0);
            h(this.f19786l, this.f19787m, 0, 48);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19787m = j3;
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f19778b = (String) g0Var.f19674e;
        g0Var.c();
        j0 O1 = qVar.O1(g0Var.f19673c, 2);
        this.f19779c = O1;
        this.d = new r(O1);
        this.f19777a.b(qVar, g0Var);
    }

    public final void h(long j3, long j10, int i7, int i10) {
        boolean z9;
        r rVar = this.d;
        boolean z10 = this.f19780e;
        boolean z11 = false;
        rVar.f19771g = false;
        rVar.h = false;
        rVar.f19769e = j10;
        rVar.d = 0;
        rVar.f19767b = j3;
        if (i10 >= 32 && i10 != 40) {
            if (rVar.f19772i && !rVar.f19773j) {
                if (z10) {
                    rVar.a(i7);
                }
                rVar.f19772i = false;
            }
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                rVar.h = !rVar.f19773j;
                rVar.f19773j = true;
            }
        }
        if (i10 >= 16 && i10 <= 21) {
            z9 = true;
        } else {
            z9 = false;
        }
        rVar.f19768c = z9;
        if (z9 || i10 <= 9) {
            z11 = true;
        }
        rVar.f19770f = z11;
        if (!this.f19780e) {
            this.f19782g.h(i10);
            this.h.h(i10);
            this.f19783i.h(i10);
        }
        this.f19784j.h(i10);
        this.f19785k.h(i10);
    }
}
