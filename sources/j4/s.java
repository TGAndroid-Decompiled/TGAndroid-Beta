package j4;

import b2.v0;
import c3.j0;
import e2.m0;
import i2.o0;
import java.util.Collections;
import v7.u6;
public final class s implements i {
    public final c0 f14164a;
    public String f14165b;
    public j0 f14166c;
    public r d;
    public boolean e;
    public long f14172l;
    public final boolean[] f14167f = new boolean[3];
    public final o0 f14168g = new o0(32);
    public final o0 h = new o0(33);
    public final o0 f14169i = new o0(34);
    public final o0 f14170j = new o0(39);
    public final o0 f14171k = new o0(40);
    public long f14173m = -9223372036854775807L;
    public final e2.x f14174n = new e2.x();

    public s(c0 c0Var) {
        this.f14164a = c0Var;
    }

    @Override
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        this.f14166c.getClass();
        String str = m0.f8252a;
        while (xVar.a() > 0) {
            int i12 = xVar.f8292b;
            int i13 = xVar.f8293c;
            byte[] bArr = xVar.f8291a;
            this.f14172l += xVar.a();
            this.f14166c.d(xVar.a(), xVar);
            while (i12 < i13) {
                int c10 = f2.q.c(bArr, i12, i13, this.f14167f);
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
                long j10 = this.f14172l - i18;
                if (i17 < 0) {
                    i11 = -i17;
                } else {
                    i11 = 0;
                }
                b(j10, i18, i11, this.f14173m);
                h(j10, i18, i14, this.f14173m);
                i12 = i15 + i16;
            }
        }
    }

    public final void b(long j10, int i10, int i11, long j11) {
        e2.c cVar = this.f14164a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        boolean z11 = false;
        if (rVar.f14160j && rVar.f14158g) {
            rVar.f14163m = rVar.f14156c;
            rVar.f14160j = false;
        } else if (rVar.h || rVar.f14158g) {
            if (z10 && rVar.f14159i) {
                rVar.a(i10 + ((int) (j10 - rVar.f14155b)));
            }
            rVar.f14161k = rVar.f14155b;
            rVar.f14162l = rVar.e;
            rVar.f14163m = rVar.f14156c;
            rVar.f14159i = true;
        }
        if (!this.e) {
            o0 o0Var = this.f14168g;
            o0Var.e(i11);
            o0 o0Var2 = this.h;
            o0Var2.e(i11);
            o0 o0Var3 = this.f14169i;
            o0Var3.e(i11);
            if (o0Var.d && o0Var2.d && o0Var3.d) {
                String str = this.f14165b;
                int i12 = o0Var.e;
                byte[] bArr = new byte[o0Var2.e + i12 + o0Var3.e];
                System.arraycopy((byte[]) o0Var.f12495f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) o0Var2.f12495f, 0, bArr, o0Var.e, o0Var2.e);
                System.arraycopy((byte[]) o0Var3.f12495f, 0, bArr, o0Var.e + o0Var2.e, o0Var3.e);
                String str2 = null;
                f2.m k10 = f2.q.k((byte[]) o0Var2.f12495f, 3, o0Var2.e, null);
                f2.j jVar = k10.f10305b;
                if (jVar != null) {
                    str2 = e2.g.a(jVar.f10295a, jVar.f10297c, jVar.d, jVar.f10298f, jVar.f10296b, jVar.e);
                }
                b2.v vVar = new b2.v();
                vVar.f4061a = str;
                vVar.f4074q = v0.n("video/mp2t");
                vVar.f4075r = v0.n("video/hevc");
                vVar.f4067j = str2;
                vVar.f4081y = k10.e;
                vVar.f4082z = k10.f10307f;
                vVar.A = k10.f10308g;
                vVar.B = k10.h;
                vVar.H = new b2.n(k10.f10311k, k10.f10312l, k10.f10313m, null, k10.f10306c + 8, k10.d + 8);
                vVar.E = k10.f10309i;
                vVar.f4077t = k10.f10310j;
                vVar.I = k10.f10304a + 1;
                vVar.f4078u = Collections.singletonList(bArr);
                b2.w wVar = new b2.w(vVar);
                this.f14166c.b(wVar);
                int i13 = wVar.f4130u;
                if (i13 != -1) {
                    z11 = true;
                }
                u6.p(z11);
                cVar.k(i13);
                this.e = true;
            }
        }
        o0 o0Var4 = this.f14170j;
        boolean e = o0Var4.e(i11);
        e2.x xVar = this.f14174n;
        if (e) {
            xVar.L(f2.q.p(o0Var4.e, (byte[]) o0Var4.f12495f), (byte[]) o0Var4.f12495f);
            xVar.O(5);
            cVar.a(j11, xVar);
        }
        o0 o0Var5 = this.f14171k;
        if (o0Var5.e(i11)) {
            xVar.L(f2.q.p(o0Var5.e, (byte[]) o0Var5.f12495f), (byte[]) o0Var5.f12495f);
            xVar.O(5);
            cVar.a(j11, xVar);
        }
    }

    @Override
    public final void c() {
        this.f14172l = 0L;
        this.f14173m = -9223372036854775807L;
        f2.q.b(this.f14167f);
        this.f14168g.g();
        this.h.g();
        this.f14169i.g();
        this.f14170j.g();
        this.f14171k.g();
        this.f14164a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f14157f = false;
            rVar.f14158g = false;
            rVar.h = false;
            rVar.f14159i = false;
            rVar.f14160j = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14165b = (String) f0Var.e;
        f0Var.c();
        j0 j02 = qVar.j0(f0Var.f14057c, 2);
        this.f14166c = j02;
        this.d = new r(j02);
        this.f14164a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f14166c.getClass();
        String str = m0.f8252a;
        if (z10) {
            this.f14164a.d.c(0);
            b(this.f14172l, 0, 0, this.f14173m);
            h(this.f14172l, 0, 48, this.f14173m);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14173m = j10;
    }

    public final void g(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f14157f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f14158g = z10;
                rVar.f14157f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.f14168g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f14169i.a(i10, i11, bArr);
        }
        this.f14170j.a(i10, i11, bArr);
        this.f14171k.a(i10, i11, bArr);
    }

    public final void h(long j10, int i10, int i11, long j11) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.e;
        boolean z12 = false;
        rVar.f14158g = false;
        rVar.h = false;
        rVar.e = j11;
        rVar.d = 0;
        rVar.f14155b = j10;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f14159i && !rVar.f14160j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f14159i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f14160j;
                rVar.f14160j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f14156c = z10;
        if (z10 || i11 <= 9) {
            z12 = true;
        }
        rVar.f14157f = z12;
        if (!this.e) {
            this.f14168g.h(i11);
            this.h.h(i11);
            this.f14169i.h(i11);
        }
        this.f14170j.h(i11);
        this.f14171k.h(i11);
    }
}
