package j4;

import b2.v0;
import c3.l0;
import e2.m0;
import i2.n0;
import java.util.Collections;
import v7.u6;
public final class s implements i {
    public final c0 f14209a;
    public String f14210b;
    public l0 f14211c;
    public r d;
    public boolean e;
    public long f14217l;
    public final boolean[] f14212f = new boolean[3];
    public final n0 f14213g = new n0(32);
    public final n0 h = new n0(33);
    public final n0 f14214i = new n0(34);
    public final n0 f14215j = new n0(39);
    public final n0 f14216k = new n0(40);
    public long f14218m = -9223372036854775807L;
    public final e2.x f14219n = new e2.x();

    public s(c0 c0Var) {
        this.f14209a = c0Var;
    }

    @Override
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        this.f14211c.getClass();
        String str = m0.f8259a;
        while (xVar.a() > 0) {
            int i12 = xVar.f8299b;
            int i13 = xVar.f8300c;
            byte[] bArr = xVar.f8298a;
            this.f14217l += xVar.a();
            this.f14211c.d(xVar.a(), xVar);
            while (i12 < i13) {
                int c10 = f2.q.c(bArr, i12, i13, this.f14212f);
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
                long j10 = this.f14217l - i18;
                if (i17 < 0) {
                    i11 = -i17;
                } else {
                    i11 = 0;
                }
                b(j10, i18, i11, this.f14218m);
                h(j10, i18, i14, this.f14218m);
                i12 = i15 + i16;
            }
        }
    }

    public final void b(long j10, int i10, int i11, long j11) {
        e2.c cVar = this.f14209a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        boolean z11 = false;
        if (rVar.f14205j && rVar.f14203g) {
            rVar.f14208m = rVar.f14201c;
            rVar.f14205j = false;
        } else if (rVar.h || rVar.f14203g) {
            if (z10 && rVar.f14204i) {
                rVar.a(i10 + ((int) (j10 - rVar.f14200b)));
            }
            rVar.f14206k = rVar.f14200b;
            rVar.f14207l = rVar.e;
            rVar.f14208m = rVar.f14201c;
            rVar.f14204i = true;
        }
        if (!this.e) {
            n0 n0Var = this.f14213g;
            n0Var.e(i11);
            n0 n0Var2 = this.h;
            n0Var2.e(i11);
            n0 n0Var3 = this.f14214i;
            n0Var3.e(i11);
            if (n0Var.d && n0Var2.d && n0Var3.d) {
                String str = this.f14210b;
                int i12 = n0Var.e;
                byte[] bArr = new byte[n0Var2.e + i12 + n0Var3.e];
                System.arraycopy((byte[]) n0Var.f12524f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) n0Var2.f12524f, 0, bArr, n0Var.e, n0Var2.e);
                System.arraycopy((byte[]) n0Var3.f12524f, 0, bArr, n0Var.e + n0Var2.e, n0Var3.e);
                String str2 = null;
                f2.m k10 = f2.q.k((byte[]) n0Var2.f12524f, 3, n0Var2.e, null);
                f2.j jVar = k10.f10322b;
                if (jVar != null) {
                    str2 = e2.g.a(jVar.f10312a, jVar.f10314c, jVar.d, jVar.f10315f, jVar.f10313b, jVar.e);
                }
                b2.v vVar = new b2.v();
                vVar.f4068a = str;
                vVar.f4081q = v0.n("video/mp2t");
                vVar.f4082r = v0.n("video/hevc");
                vVar.f4074j = str2;
                vVar.f4088y = k10.e;
                vVar.f4089z = k10.f10324f;
                vVar.A = k10.f10325g;
                vVar.B = k10.h;
                vVar.H = new b2.n(k10.f10328k, k10.f10329l, k10.f10330m, null, k10.f10323c + 8, k10.d + 8);
                vVar.E = k10.f10326i;
                vVar.f4084t = k10.f10327j;
                vVar.I = k10.f10321a + 1;
                vVar.f4085u = Collections.singletonList(bArr);
                b2.w wVar = new b2.w(vVar);
                this.f14211c.b(wVar);
                int i13 = wVar.f4137u;
                if (i13 != -1) {
                    z11 = true;
                }
                u6.p(z11);
                cVar.k(i13);
                this.e = true;
            }
        }
        n0 n0Var4 = this.f14215j;
        boolean e = n0Var4.e(i11);
        e2.x xVar = this.f14219n;
        if (e) {
            xVar.L(f2.q.p(n0Var4.e, (byte[]) n0Var4.f12524f), (byte[]) n0Var4.f12524f);
            xVar.O(5);
            cVar.a(j11, xVar);
        }
        n0 n0Var5 = this.f14216k;
        if (n0Var5.e(i11)) {
            xVar.L(f2.q.p(n0Var5.e, (byte[]) n0Var5.f12524f), (byte[]) n0Var5.f12524f);
            xVar.O(5);
            cVar.a(j11, xVar);
        }
    }

    @Override
    public final void c() {
        this.f14217l = 0L;
        this.f14218m = -9223372036854775807L;
        f2.q.b(this.f14212f);
        this.f14213g.g();
        this.h.g();
        this.f14214i.g();
        this.f14215j.g();
        this.f14216k.g();
        this.f14209a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f14202f = false;
            rVar.f14203g = false;
            rVar.h = false;
            rVar.f14204i = false;
            rVar.f14205j = false;
        }
    }

    @Override
    public final void d(c3.s sVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14210b = (String) f0Var.e;
        f0Var.c();
        l0 j02 = sVar.j0(f0Var.f14102c, 2);
        this.f14211c = j02;
        this.d = new r(j02);
        this.f14209a.b(sVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f14211c.getClass();
        String str = m0.f8259a;
        if (z10) {
            this.f14209a.d.c(0);
            b(this.f14217l, 0, 0, this.f14218m);
            h(this.f14217l, 0, 48, this.f14218m);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14218m = j10;
    }

    public final void g(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f14202f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f14203g = z10;
                rVar.f14202f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.f14213g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f14214i.a(i10, i11, bArr);
        }
        this.f14215j.a(i10, i11, bArr);
        this.f14216k.a(i10, i11, bArr);
    }

    public final void h(long j10, int i10, int i11, long j11) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.e;
        boolean z12 = false;
        rVar.f14203g = false;
        rVar.h = false;
        rVar.e = j11;
        rVar.d = 0;
        rVar.f14200b = j10;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f14204i && !rVar.f14205j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f14204i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f14205j;
                rVar.f14205j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f14201c = z10;
        if (z10 || i11 <= 9) {
            z12 = true;
        }
        rVar.f14202f = z12;
        if (!this.e) {
            this.f14213g.h(i11);
            this.h.h(i11);
            this.f14214i.h(i11);
        }
        this.f14215j.h(i11);
        this.f14216k.h(i11);
    }
}
