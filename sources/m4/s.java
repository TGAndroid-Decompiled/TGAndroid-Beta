package m4;

import a8.ia;
import e2.s0;
import f3.j0;
import h2.m0;
import java.util.Collections;
import l2.o0;
public final class s implements i {
    public final c0 f19774a;
    public String f19775b;
    public j0 f19776c;
    public r d;
    public boolean f19777e;
    public long f19783l;
    public final boolean[] f19778f = new boolean[3];
    public final o0 f19779g = new o0(32);
    public final o0 h = new o0(33);
    public final o0 f19780i = new o0(34);
    public final o0 f19781j = new o0(39);
    public final o0 f19782k = new o0(40);
    public long f19784m = -9223372036854775807L;
    public final h2.x f19785n = new h2.x();

    public s(c0 c0Var) {
        this.f19774a = c0Var;
    }

    public final void a(long j3, long j10, int i7, int i10) {
        h2.c cVar = this.f19774a.d;
        r rVar = this.d;
        boolean z9 = this.f19777e;
        boolean z10 = false;
        if (rVar.f19770j && rVar.f19768g) {
            rVar.f19773m = rVar.f19765c;
            rVar.f19770j = false;
        } else if (rVar.h || rVar.f19768g) {
            if (z9 && rVar.f19769i) {
                rVar.a(i7 + ((int) (j3 - rVar.f19764b)));
            }
            rVar.f19771k = rVar.f19764b;
            rVar.f19772l = rVar.f19766e;
            rVar.f19773m = rVar.f19765c;
            rVar.f19769i = true;
        }
        if (!this.f19777e) {
            o0 o0Var = this.f19779g;
            o0Var.e(i10);
            o0 o0Var2 = this.h;
            o0Var2.e(i10);
            o0 o0Var3 = this.f19780i;
            o0Var3.e(i10);
            if (o0Var.d && o0Var2.d && o0Var3.d) {
                String str = this.f19775b;
                int i11 = o0Var.f17974e;
                byte[] bArr = new byte[o0Var2.f17974e + i11 + o0Var3.f17974e];
                System.arraycopy((byte[]) o0Var.f17975f, 0, bArr, 0, i11);
                System.arraycopy((byte[]) o0Var2.f17975f, 0, bArr, o0Var.f17974e, o0Var2.f17974e);
                System.arraycopy((byte[]) o0Var3.f17975f, 0, bArr, o0Var.f17974e + o0Var2.f17974e, o0Var3.f17974e);
                String str2 = null;
                i2.k k10 = i2.o.k((byte[]) o0Var2.f17975f, 3, o0Var2.f17974e, null);
                i2.h hVar = k10.f15170b;
                if (hVar != null) {
                    str2 = h2.g.a(hVar.f15158a, hVar.f15160c, hVar.d, hVar.f15162f, hVar.f15159b, hVar.f15161e);
                }
                e2.t tVar = new e2.t();
                tVar.f10548a = str;
                tVar.f10562q = s0.n("video/mp2t");
                tVar.f10563r = s0.n("video/hevc");
                tVar.f10555j = str2;
                tVar.f10569y = k10.f15172e;
                tVar.f10570z = k10.f15173f;
                tVar.A = k10.f15174g;
                tVar.B = k10.h;
                tVar.H = new e2.m(k10.f15177k, k10.f15178l, k10.f15179m, null, k10.f15171c + 8, k10.d + 8);
                tVar.E = k10.f15175i;
                tVar.f10565t = k10.f15176j;
                tVar.I = k10.f15169a + 1;
                tVar.f10566u = Collections.singletonList(bArr);
                e2.u uVar = new e2.u(tVar);
                this.f19776c.g(uVar);
                int i12 = uVar.f10617u;
                if (i12 != -1) {
                    z10 = true;
                }
                ia.p(z10);
                cVar.C(i12);
                this.f19777e = true;
            }
        }
        o0 o0Var4 = this.f19781j;
        boolean e10 = o0Var4.e(i10);
        h2.x xVar = this.f19785n;
        if (e10) {
            xVar.L(i2.o.p(o0Var4.f17974e, (byte[]) o0Var4.f17975f), (byte[]) o0Var4.f17975f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
        o0 o0Var5 = this.f19782k;
        if (o0Var5.e(i10)) {
            xVar.L(i2.o.p(o0Var5.f17974e, (byte[]) o0Var5.f17975f), (byte[]) o0Var5.f17975f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
    }

    public final void b(int i7, int i10, byte[] bArr) {
        boolean z9;
        r rVar = this.d;
        if (rVar.f19767f) {
            int i11 = rVar.d;
            int i12 = (i7 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                rVar.f19768g = z9;
                rVar.f19767f = false;
            } else {
                rVar.d = (i10 - i7) + i11;
            }
        }
        if (!this.f19777e) {
            this.f19779g.a(i7, i10, bArr);
            this.h.a(i7, i10, bArr);
            this.f19780i.a(i7, i10, bArr);
        }
        this.f19781j.a(i7, i10, bArr);
        this.f19782k.a(i7, i10, bArr);
    }

    @Override
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        this.f19776c.getClass();
        String str = m0.f14112a;
        while (xVar.a() > 0) {
            int i11 = xVar.f14163b;
            int i12 = xVar.f14164c;
            byte[] bArr = xVar.f14162a;
            this.f19783l += xVar.a();
            this.f19776c.b(xVar.a(), xVar);
            while (i11 < i12) {
                int c10 = i2.o.c(bArr, i11, i12, this.f19778f);
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
                long j3 = this.f19783l - i17;
                if (i16 < 0) {
                    i10 = -i16;
                } else {
                    i10 = 0;
                }
                a(j3, this.f19784m, i17, i10);
                h(j3, this.f19784m, i17, i13);
                i11 = i14 + i15;
            }
        }
    }

    @Override
    public final void d() {
        this.f19783l = 0L;
        this.f19784m = -9223372036854775807L;
        i2.o.b(this.f19778f);
        this.f19779g.g();
        this.h.g();
        this.f19780i.g();
        this.f19781j.g();
        this.f19782k.g();
        this.f19774a.d.r(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f19767f = false;
            rVar.f19768g = false;
            rVar.h = false;
            rVar.f19769i = false;
            rVar.f19770j = false;
        }
    }

    @Override
    public final void e(boolean z9) {
        this.f19776c.getClass();
        String str = m0.f14112a;
        if (z9) {
            this.f19774a.d.r(0);
            a(this.f19783l, this.f19784m, 0, 0);
            h(this.f19783l, this.f19784m, 0, 48);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19784m = j3;
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f19775b = (String) g0Var.f19671e;
        g0Var.c();
        j0 O1 = qVar.O1(g0Var.f19670c, 2);
        this.f19776c = O1;
        this.d = new r(O1);
        this.f19774a.b(qVar, g0Var);
    }

    public final void h(long j3, long j10, int i7, int i10) {
        boolean z9;
        r rVar = this.d;
        boolean z10 = this.f19777e;
        boolean z11 = false;
        rVar.f19768g = false;
        rVar.h = false;
        rVar.f19766e = j10;
        rVar.d = 0;
        rVar.f19764b = j3;
        if (i10 >= 32 && i10 != 40) {
            if (rVar.f19769i && !rVar.f19770j) {
                if (z10) {
                    rVar.a(i7);
                }
                rVar.f19769i = false;
            }
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                rVar.h = !rVar.f19770j;
                rVar.f19770j = true;
            }
        }
        if (i10 >= 16 && i10 <= 21) {
            z9 = true;
        } else {
            z9 = false;
        }
        rVar.f19765c = z9;
        if (z9 || i10 <= 9) {
            z11 = true;
        }
        rVar.f19767f = z11;
        if (!this.f19777e) {
            this.f19779g.h(i10);
            this.h.h(i10);
            this.f19780i.h(i10);
        }
        this.f19781j.h(i10);
        this.f19782k.h(i10);
    }
}
