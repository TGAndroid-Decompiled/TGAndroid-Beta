package j4;

import b2.v0;
import c3.j0;
import i2.m0;
import java.util.Collections;
import v7.u6;
public final class s implements i {
    public final c0 f14159a;
    public String f14160b;
    public j0 f14161c;
    public r d;
    public boolean e;
    public long f14167l;
    public final boolean[] f14162f = new boolean[3];
    public final m0 f14163g = new m0(32);
    public final m0 h = new m0(33);
    public final m0 f14164i = new m0(34);
    public final m0 f14165j = new m0(39);
    public final m0 f14166k = new m0(40);
    public long f14168m = -9223372036854775807L;
    public final e2.x f14169n = new e2.x();

    public s(c0 c0Var) {
        this.f14159a = c0Var;
    }

    @Override
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        this.f14161c.getClass();
        String str = e2.m0.f8254a;
        while (xVar.a() > 0) {
            int i12 = xVar.f8294b;
            int i13 = xVar.f8295c;
            byte[] bArr = xVar.f8293a;
            this.f14167l += xVar.a();
            this.f14161c.d(xVar.a(), xVar);
            while (i12 < i13) {
                int c10 = f2.q.c(bArr, i12, i13, this.f14162f);
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
                long j10 = this.f14167l - i18;
                if (i17 < 0) {
                    i11 = -i17;
                } else {
                    i11 = 0;
                }
                b(j10, i18, i11, this.f14168m);
                h(j10, i18, i14, this.f14168m);
                i12 = i15 + i16;
            }
        }
    }

    public final void b(long j10, int i10, int i11, long j11) {
        e2.c cVar = this.f14159a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        boolean z11 = false;
        if (rVar.f14155j && rVar.f14153g) {
            rVar.f14158m = rVar.f14151c;
            rVar.f14155j = false;
        } else if (rVar.h || rVar.f14153g) {
            if (z10 && rVar.f14154i) {
                rVar.a(i10 + ((int) (j10 - rVar.f14150b)));
            }
            rVar.f14156k = rVar.f14150b;
            rVar.f14157l = rVar.e;
            rVar.f14158m = rVar.f14151c;
            rVar.f14154i = true;
        }
        if (!this.e) {
            m0 m0Var = this.f14163g;
            m0Var.e(i11);
            m0 m0Var2 = this.h;
            m0Var2.e(i11);
            m0 m0Var3 = this.f14164i;
            m0Var3.e(i11);
            if (m0Var.d && m0Var2.d && m0Var3.d) {
                String str = this.f14160b;
                int i12 = m0Var.e;
                byte[] bArr = new byte[m0Var2.e + i12 + m0Var3.e];
                System.arraycopy((byte[]) m0Var.f12492f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) m0Var2.f12492f, 0, bArr, m0Var.e, m0Var2.e);
                System.arraycopy((byte[]) m0Var3.f12492f, 0, bArr, m0Var.e + m0Var2.e, m0Var3.e);
                String str2 = null;
                f2.m k10 = f2.q.k((byte[]) m0Var2.f12492f, 3, m0Var2.e, null);
                f2.j jVar = k10.f10306b;
                if (jVar != null) {
                    str2 = e2.g.a(jVar.f10296a, jVar.f10298c, jVar.d, jVar.f10299f, jVar.f10297b, jVar.e);
                }
                b2.v vVar = new b2.v();
                vVar.f4064a = str;
                vVar.f4077q = v0.n("video/mp2t");
                vVar.f4078r = v0.n("video/hevc");
                vVar.f4070j = str2;
                vVar.f4084y = k10.e;
                vVar.f4085z = k10.f10308f;
                vVar.A = k10.f10309g;
                vVar.B = k10.h;
                vVar.H = new b2.n(k10.f10312k, k10.f10313l, k10.f10314m, null, k10.f10307c + 8, k10.d + 8);
                vVar.E = k10.f10310i;
                vVar.f4080t = k10.f10311j;
                vVar.I = k10.f10305a + 1;
                vVar.f4081u = Collections.singletonList(bArr);
                b2.w wVar = new b2.w(vVar);
                this.f14161c.b(wVar);
                int i13 = wVar.f4133u;
                if (i13 != -1) {
                    z11 = true;
                }
                u6.p(z11);
                cVar.k(i13);
                this.e = true;
            }
        }
        m0 m0Var4 = this.f14165j;
        boolean e = m0Var4.e(i11);
        e2.x xVar = this.f14169n;
        if (e) {
            xVar.L(f2.q.p(m0Var4.e, (byte[]) m0Var4.f12492f), (byte[]) m0Var4.f12492f);
            xVar.O(5);
            cVar.a(j11, xVar);
        }
        m0 m0Var5 = this.f14166k;
        if (m0Var5.e(i11)) {
            xVar.L(f2.q.p(m0Var5.e, (byte[]) m0Var5.f12492f), (byte[]) m0Var5.f12492f);
            xVar.O(5);
            cVar.a(j11, xVar);
        }
    }

    @Override
    public final void c() {
        this.f14167l = 0L;
        this.f14168m = -9223372036854775807L;
        f2.q.b(this.f14162f);
        this.f14163g.g();
        this.h.g();
        this.f14164i.g();
        this.f14165j.g();
        this.f14166k.g();
        this.f14159a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f14152f = false;
            rVar.f14153g = false;
            rVar.h = false;
            rVar.f14154i = false;
            rVar.f14155j = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14160b = (String) f0Var.e;
        f0Var.c();
        j0 j02 = qVar.j0(f0Var.f14052c, 2);
        this.f14161c = j02;
        this.d = new r(j02);
        this.f14159a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f14161c.getClass();
        String str = e2.m0.f8254a;
        if (z10) {
            this.f14159a.d.c(0);
            b(this.f14167l, 0, 0, this.f14168m);
            h(this.f14167l, 0, 48, this.f14168m);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14168m = j10;
    }

    public final void g(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f14152f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f14153g = z10;
                rVar.f14152f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.f14163g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f14164i.a(i10, i11, bArr);
        }
        this.f14165j.a(i10, i11, bArr);
        this.f14166k.a(i10, i11, bArr);
    }

    public final void h(long j10, int i10, int i11, long j11) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.e;
        boolean z12 = false;
        rVar.f14153g = false;
        rVar.h = false;
        rVar.e = j11;
        rVar.d = 0;
        rVar.f14150b = j10;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f14154i && !rVar.f14155j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f14154i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f14155j;
                rVar.f14155j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f14151c = z10;
        if (z10 || i11 <= 9) {
            z12 = true;
        }
        rVar.f14152f = z12;
        if (!this.e) {
            this.f14163g.h(i11);
            this.h.h(i11);
            this.f14164i.h(i11);
        }
        this.f14165j.h(i11);
        this.f14166k.h(i11);
    }
}
