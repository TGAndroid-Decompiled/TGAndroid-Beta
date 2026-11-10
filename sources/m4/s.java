package m4;

import a8.ia;
import e2.s0;
import f3.j0;
import h2.m0;
import java.util.Collections;
import l2.o0;
public final class s implements i {
    public final c0 f19782a;
    public String f19783b;
    public j0 f19784c;
    public r d;
    public boolean f19785e;
    public long f19791l;
    public final boolean[] f19786f = new boolean[3];
    public final o0 f19787g = new o0(32);
    public final o0 h = new o0(33);
    public final o0 f19788i = new o0(34);
    public final o0 f19789j = new o0(39);
    public final o0 f19790k = new o0(40);
    public long f19792m = -9223372036854775807L;
    public final h2.x f19793n = new h2.x();

    public s(c0 c0Var) {
        this.f19782a = c0Var;
    }

    public final void a(long j3, long j10, int i7, int i10) {
        h2.c cVar = this.f19782a.d;
        r rVar = this.d;
        boolean z9 = this.f19785e;
        boolean z10 = false;
        if (rVar.f19778j && rVar.f19776g) {
            rVar.f19781m = rVar.f19773c;
            rVar.f19778j = false;
        } else if (rVar.h || rVar.f19776g) {
            if (z9 && rVar.f19777i) {
                rVar.a(i7 + ((int) (j3 - rVar.f19772b)));
            }
            rVar.f19779k = rVar.f19772b;
            rVar.f19780l = rVar.f19774e;
            rVar.f19781m = rVar.f19773c;
            rVar.f19777i = true;
        }
        if (!this.f19785e) {
            o0 o0Var = this.f19787g;
            o0Var.e(i10);
            o0 o0Var2 = this.h;
            o0Var2.e(i10);
            o0 o0Var3 = this.f19788i;
            o0Var3.e(i10);
            if (o0Var.d && o0Var2.d && o0Var3.d) {
                String str = this.f19783b;
                int i11 = o0Var.f17978e;
                byte[] bArr = new byte[o0Var2.f17978e + i11 + o0Var3.f17978e];
                System.arraycopy((byte[]) o0Var.f17979f, 0, bArr, 0, i11);
                System.arraycopy((byte[]) o0Var2.f17979f, 0, bArr, o0Var.f17978e, o0Var2.f17978e);
                System.arraycopy((byte[]) o0Var3.f17979f, 0, bArr, o0Var.f17978e + o0Var2.f17978e, o0Var3.f17978e);
                String str2 = null;
                i2.k k10 = i2.o.k((byte[]) o0Var2.f17979f, 3, o0Var2.f17978e, null);
                i2.h hVar = k10.f15175b;
                if (hVar != null) {
                    str2 = h2.g.a(hVar.f15163a, hVar.f15165c, hVar.d, hVar.f15167f, hVar.f15164b, hVar.f15166e);
                }
                e2.t tVar = new e2.t();
                tVar.f10553a = str;
                tVar.f10567q = s0.n("video/mp2t");
                tVar.f10568r = s0.n("video/hevc");
                tVar.f10560j = str2;
                tVar.f10574y = k10.f15177e;
                tVar.f10575z = k10.f15178f;
                tVar.A = k10.f15179g;
                tVar.B = k10.h;
                tVar.H = new e2.m(k10.f15182k, k10.f15183l, k10.f15184m, null, k10.f15176c + 8, k10.d + 8);
                tVar.E = k10.f15180i;
                tVar.f10570t = k10.f15181j;
                tVar.I = k10.f15174a + 1;
                tVar.f10571u = Collections.singletonList(bArr);
                e2.u uVar = new e2.u(tVar);
                this.f19784c.g(uVar);
                int i12 = uVar.f10622u;
                if (i12 != -1) {
                    z10 = true;
                }
                ia.p(z10);
                cVar.C(i12);
                this.f19785e = true;
            }
        }
        o0 o0Var4 = this.f19789j;
        boolean e10 = o0Var4.e(i10);
        h2.x xVar = this.f19793n;
        if (e10) {
            xVar.L(i2.o.p(o0Var4.f17978e, (byte[]) o0Var4.f17979f), (byte[]) o0Var4.f17979f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
        o0 o0Var5 = this.f19790k;
        if (o0Var5.e(i10)) {
            xVar.L(i2.o.p(o0Var5.f17978e, (byte[]) o0Var5.f17979f), (byte[]) o0Var5.f17979f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
    }

    public final void b(int i7, int i10, byte[] bArr) {
        boolean z9;
        r rVar = this.d;
        if (rVar.f19775f) {
            int i11 = rVar.d;
            int i12 = (i7 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                rVar.f19776g = z9;
                rVar.f19775f = false;
            } else {
                rVar.d = (i10 - i7) + i11;
            }
        }
        if (!this.f19785e) {
            this.f19787g.a(i7, i10, bArr);
            this.h.a(i7, i10, bArr);
            this.f19788i.a(i7, i10, bArr);
        }
        this.f19789j.a(i7, i10, bArr);
        this.f19790k.a(i7, i10, bArr);
    }

    @Override
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        this.f19784c.getClass();
        String str = m0.f14114a;
        while (xVar.a() > 0) {
            int i11 = xVar.f14165b;
            int i12 = xVar.f14166c;
            byte[] bArr = xVar.f14164a;
            this.f19791l += xVar.a();
            this.f19784c.b(xVar.a(), xVar);
            while (i11 < i12) {
                int c10 = i2.o.c(bArr, i11, i12, this.f19786f);
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
                long j3 = this.f19791l - i17;
                if (i16 < 0) {
                    i10 = -i16;
                } else {
                    i10 = 0;
                }
                a(j3, this.f19792m, i17, i10);
                h(j3, this.f19792m, i17, i13);
                i11 = i14 + i15;
            }
        }
    }

    @Override
    public final void d() {
        this.f19791l = 0L;
        this.f19792m = -9223372036854775807L;
        i2.o.b(this.f19786f);
        this.f19787g.g();
        this.h.g();
        this.f19788i.g();
        this.f19789j.g();
        this.f19790k.g();
        this.f19782a.d.r(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f19775f = false;
            rVar.f19776g = false;
            rVar.h = false;
            rVar.f19777i = false;
            rVar.f19778j = false;
        }
    }

    @Override
    public final void e(boolean z9) {
        this.f19784c.getClass();
        String str = m0.f14114a;
        if (z9) {
            this.f19782a.d.r(0);
            a(this.f19791l, this.f19792m, 0, 0);
            h(this.f19791l, this.f19792m, 0, 48);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19792m = j3;
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f19783b = (String) g0Var.f19679e;
        g0Var.c();
        j0 O1 = qVar.O1(g0Var.f19678c, 2);
        this.f19784c = O1;
        this.d = new r(O1);
        this.f19782a.b(qVar, g0Var);
    }

    public final void h(long j3, long j10, int i7, int i10) {
        boolean z9;
        r rVar = this.d;
        boolean z10 = this.f19785e;
        boolean z11 = false;
        rVar.f19776g = false;
        rVar.h = false;
        rVar.f19774e = j10;
        rVar.d = 0;
        rVar.f19772b = j3;
        if (i10 >= 32 && i10 != 40) {
            if (rVar.f19777i && !rVar.f19778j) {
                if (z10) {
                    rVar.a(i7);
                }
                rVar.f19777i = false;
            }
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                rVar.h = !rVar.f19778j;
                rVar.f19778j = true;
            }
        }
        if (i10 >= 16 && i10 <= 21) {
            z9 = true;
        } else {
            z9 = false;
        }
        rVar.f19773c = z9;
        if (z9 || i10 <= 9) {
            z11 = true;
        }
        rVar.f19775f = z11;
        if (!this.f19785e) {
            this.f19787g.h(i10);
            this.h.h(i10);
            this.f19788i.h(i10);
        }
        this.f19789j.h(i10);
        this.f19790k.h(i10);
    }
}
