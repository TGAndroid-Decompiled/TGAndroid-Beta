package j4;

import b2.v0;
import c3.j0;
import e2.m0;
import i2.o0;
import java.util.Collections;
import v7.u6;
public final class s implements i {
    public final c0 f14166a;
    public String f14167b;
    public j0 f14168c;
    public r d;
    public boolean e;
    public long f14174l;
    public final boolean[] f14169f = new boolean[3];
    public final o0 f14170g = new o0(32);
    public final o0 h = new o0(33);
    public final o0 f14171i = new o0(34);
    public final o0 f14172j = new o0(39);
    public final o0 f14173k = new o0(40);
    public long f14175m = -9223372036854775807L;
    public final e2.x f14176n = new e2.x();

    public s(c0 c0Var) {
        this.f14166a = c0Var;
    }

    @Override
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        this.f14168c.getClass();
        String str = m0.f8254a;
        while (xVar.a() > 0) {
            int i12 = xVar.f8294b;
            int i13 = xVar.f8295c;
            byte[] bArr = xVar.f8293a;
            this.f14174l += xVar.a();
            this.f14168c.d(xVar.a(), xVar);
            while (i12 < i13) {
                int c10 = f2.q.c(bArr, i12, i13, this.f14169f);
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
                long j10 = this.f14174l - i18;
                if (i17 < 0) {
                    i11 = -i17;
                } else {
                    i11 = 0;
                }
                b(j10, i18, i11, this.f14175m);
                h(j10, i18, i14, this.f14175m);
                i12 = i15 + i16;
            }
        }
    }

    public final void b(long j10, int i10, int i11, long j11) {
        e2.c cVar = this.f14166a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        boolean z11 = false;
        if (rVar.f14162j && rVar.f14160g) {
            rVar.f14165m = rVar.f14158c;
            rVar.f14162j = false;
        } else if (rVar.h || rVar.f14160g) {
            if (z10 && rVar.f14161i) {
                rVar.a(i10 + ((int) (j10 - rVar.f14157b)));
            }
            rVar.f14163k = rVar.f14157b;
            rVar.f14164l = rVar.e;
            rVar.f14165m = rVar.f14158c;
            rVar.f14161i = true;
        }
        if (!this.e) {
            o0 o0Var = this.f14170g;
            o0Var.e(i11);
            o0 o0Var2 = this.h;
            o0Var2.e(i11);
            o0 o0Var3 = this.f14171i;
            o0Var3.e(i11);
            if (o0Var.d && o0Var2.d && o0Var3.d) {
                String str = this.f14167b;
                int i12 = o0Var.e;
                byte[] bArr = new byte[o0Var2.e + i12 + o0Var3.e];
                System.arraycopy((byte[]) o0Var.f12497f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) o0Var2.f12497f, 0, bArr, o0Var.e, o0Var2.e);
                System.arraycopy((byte[]) o0Var3.f12497f, 0, bArr, o0Var.e + o0Var2.e, o0Var3.e);
                String str2 = null;
                f2.m k10 = f2.q.k((byte[]) o0Var2.f12497f, 3, o0Var2.e, null);
                f2.j jVar = k10.f10307b;
                if (jVar != null) {
                    str2 = e2.g.a(jVar.f10297a, jVar.f10299c, jVar.d, jVar.f10300f, jVar.f10298b, jVar.e);
                }
                b2.v vVar = new b2.v();
                vVar.f4063a = str;
                vVar.f4076q = v0.n("video/mp2t");
                vVar.f4077r = v0.n("video/hevc");
                vVar.f4069j = str2;
                vVar.f4083y = k10.e;
                vVar.f4084z = k10.f10309f;
                vVar.A = k10.f10310g;
                vVar.B = k10.h;
                vVar.H = new b2.n(k10.f10313k, k10.f10314l, k10.f10315m, null, k10.f10308c + 8, k10.d + 8);
                vVar.E = k10.f10311i;
                vVar.f4079t = k10.f10312j;
                vVar.I = k10.f10306a + 1;
                vVar.f4080u = Collections.singletonList(bArr);
                b2.w wVar = new b2.w(vVar);
                this.f14168c.b(wVar);
                int i13 = wVar.f4132u;
                if (i13 != -1) {
                    z11 = true;
                }
                u6.p(z11);
                cVar.k(i13);
                this.e = true;
            }
        }
        o0 o0Var4 = this.f14172j;
        boolean e = o0Var4.e(i11);
        e2.x xVar = this.f14176n;
        if (e) {
            xVar.L(f2.q.p(o0Var4.e, (byte[]) o0Var4.f12497f), (byte[]) o0Var4.f12497f);
            xVar.O(5);
            cVar.a(j11, xVar);
        }
        o0 o0Var5 = this.f14173k;
        if (o0Var5.e(i11)) {
            xVar.L(f2.q.p(o0Var5.e, (byte[]) o0Var5.f12497f), (byte[]) o0Var5.f12497f);
            xVar.O(5);
            cVar.a(j11, xVar);
        }
    }

    @Override
    public final void c() {
        this.f14174l = 0L;
        this.f14175m = -9223372036854775807L;
        f2.q.b(this.f14169f);
        this.f14170g.g();
        this.h.g();
        this.f14171i.g();
        this.f14172j.g();
        this.f14173k.g();
        this.f14166a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f14159f = false;
            rVar.f14160g = false;
            rVar.h = false;
            rVar.f14161i = false;
            rVar.f14162j = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14167b = (String) f0Var.e;
        f0Var.c();
        j0 j02 = qVar.j0(f0Var.f14059c, 2);
        this.f14168c = j02;
        this.d = new r(j02);
        this.f14166a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f14168c.getClass();
        String str = m0.f8254a;
        if (z10) {
            this.f14166a.d.c(0);
            b(this.f14174l, 0, 0, this.f14175m);
            h(this.f14174l, 0, 48, this.f14175m);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14175m = j10;
    }

    public final void g(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f14159f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f14160g = z10;
                rVar.f14159f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.f14170g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f14171i.a(i10, i11, bArr);
        }
        this.f14172j.a(i10, i11, bArr);
        this.f14173k.a(i10, i11, bArr);
    }

    public final void h(long j10, int i10, int i11, long j11) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.e;
        boolean z12 = false;
        rVar.f14160g = false;
        rVar.h = false;
        rVar.e = j11;
        rVar.d = 0;
        rVar.f14157b = j10;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f14161i && !rVar.f14162j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f14161i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f14162j;
                rVar.f14162j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f14158c = z10;
        if (z10 || i11 <= 9) {
            z12 = true;
        }
        rVar.f14159f = z12;
        if (!this.e) {
            this.f14170g.h(i11);
            this.h.h(i11);
            this.f14171i.h(i11);
        }
        this.f14172j.h(i11);
        this.f14173k.h(i11);
    }
}
