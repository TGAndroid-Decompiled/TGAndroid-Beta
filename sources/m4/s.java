package m4;

import a8.ma;
import e2.s0;
import f3.j0;
import h2.l0;
import java.util.Collections;
import l2.m0;
public final class s implements i {
    public final c0 f20825a;
    public String f20826b;
    public j0 f20827c;
    public r d;
    public boolean f20828e;
    public long f20834l;
    public final boolean[] f20829f = new boolean[3];
    public final m0 f20830g = new m0(32);
    public final m0 h = new m0(33);
    public final m0 f20831i = new m0(34);
    public final m0 f20832j = new m0(39);
    public final m0 f20833k = new m0(40);
    public long f20835m = -9223372036854775807L;
    public final h2.x f20836n = new h2.x();

    public s(c0 c0Var) {
        this.f20825a = c0Var;
    }

    public final void a(long j3, long j10, int i7, int i10) {
        h2.c cVar = this.f20825a.d;
        r rVar = this.d;
        boolean z10 = this.f20828e;
        boolean z11 = false;
        if (rVar.f20821j && rVar.f20819g) {
            rVar.f20824m = rVar.f20816c;
            rVar.f20821j = false;
        } else if (rVar.h || rVar.f20819g) {
            if (z10 && rVar.f20820i) {
                rVar.a(i7 + ((int) (j3 - rVar.f20815b)));
            }
            rVar.f20822k = rVar.f20815b;
            rVar.f20823l = rVar.f20817e;
            rVar.f20824m = rVar.f20816c;
            rVar.f20820i = true;
        }
        if (!this.f20828e) {
            m0 m0Var = this.f20830g;
            m0Var.e(i10);
            m0 m0Var2 = this.h;
            m0Var2.e(i10);
            m0 m0Var3 = this.f20831i;
            m0Var3.e(i10);
            if (m0Var.d && m0Var2.d && m0Var3.d) {
                String str = this.f20826b;
                int i11 = m0Var.f19533e;
                byte[] bArr = new byte[m0Var2.f19533e + i11 + m0Var3.f19533e];
                System.arraycopy((byte[]) m0Var.f19534f, 0, bArr, 0, i11);
                System.arraycopy((byte[]) m0Var2.f19534f, 0, bArr, m0Var.f19533e, m0Var2.f19533e);
                System.arraycopy((byte[]) m0Var3.f19534f, 0, bArr, m0Var.f19533e + m0Var2.f19533e, m0Var3.f19533e);
                String str2 = null;
                i2.k k10 = i2.o.k((byte[]) m0Var2.f19534f, 3, m0Var2.f19533e, null);
                i2.h hVar = k10.f16031b;
                if (hVar != null) {
                    str2 = h2.g.a(hVar.f16019a, hVar.f16021c, hVar.d, hVar.f16023f, hVar.f16020b, hVar.f16022e);
                }
                e2.t tVar = new e2.t();
                tVar.f10692a = str;
                tVar.f10706q = s0.n("video/mp2t");
                tVar.f10707r = s0.n("video/hevc");
                tVar.f10699j = str2;
                tVar.f10713y = k10.f16033e;
                tVar.f10714z = k10.f16034f;
                tVar.A = k10.f16035g;
                tVar.B = k10.h;
                tVar.H = new e2.m(k10.f16038k, k10.f16039l, k10.f16040m, null, k10.f16032c + 8, k10.d + 8);
                tVar.E = k10.f16036i;
                tVar.f10709t = k10.f16037j;
                tVar.I = k10.f16030a + 1;
                tVar.f10710u = Collections.singletonList(bArr);
                e2.u uVar = new e2.u(tVar);
                this.f20827c.g(uVar);
                int i12 = uVar.f10761u;
                if (i12 != -1) {
                    z11 = true;
                }
                ma.p(z11);
                cVar.C(i12);
                this.f20828e = true;
            }
        }
        m0 m0Var4 = this.f20832j;
        boolean e10 = m0Var4.e(i10);
        h2.x xVar = this.f20836n;
        if (e10) {
            xVar.L(i2.o.p(m0Var4.f19533e, (byte[]) m0Var4.f19534f), (byte[]) m0Var4.f19534f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
        m0 m0Var5 = this.f20833k;
        if (m0Var5.e(i10)) {
            xVar.L(i2.o.p(m0Var5.f19533e, (byte[]) m0Var5.f19534f), (byte[]) m0Var5.f19534f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
    }

    public final void b(int i7, int i10, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f20818f) {
            int i11 = rVar.d;
            int i12 = (i7 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f20819g = z10;
                rVar.f20818f = false;
            } else {
                rVar.d = (i10 - i7) + i11;
            }
        }
        if (!this.f20828e) {
            this.f20830g.a(i7, i10, bArr);
            this.h.a(i7, i10, bArr);
            this.f20831i.a(i7, i10, bArr);
        }
        this.f20832j.a(i7, i10, bArr);
        this.f20833k.a(i7, i10, bArr);
    }

    @Override
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        this.f20827c.getClass();
        String str = l0.f13778a;
        while (xVar.a() > 0) {
            int i11 = xVar.f13829b;
            int i12 = xVar.f13830c;
            byte[] bArr = xVar.f13828a;
            this.f20834l += xVar.a();
            this.f20827c.b(xVar.a(), xVar);
            while (i11 < i12) {
                int c10 = i2.o.c(bArr, i11, i12, this.f20829f);
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
                long j3 = this.f20834l - i17;
                if (i16 < 0) {
                    i10 = -i16;
                } else {
                    i10 = 0;
                }
                a(j3, this.f20835m, i17, i10);
                h(j3, this.f20835m, i17, i13);
                i11 = i14 + i15;
            }
        }
    }

    @Override
    public final void d() {
        this.f20834l = 0L;
        this.f20835m = -9223372036854775807L;
        i2.o.b(this.f20829f);
        this.f20830g.g();
        this.h.g();
        this.f20831i.g();
        this.f20832j.g();
        this.f20833k.g();
        this.f20825a.d.r(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f20818f = false;
            rVar.f20819g = false;
            rVar.h = false;
            rVar.f20820i = false;
            rVar.f20821j = false;
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f20827c.getClass();
        String str = l0.f13778a;
        if (z10) {
            this.f20825a.d.r(0);
            a(this.f20834l, this.f20835m, 0, 0);
            h(this.f20834l, this.f20835m, 0, 48);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20835m = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20826b = (String) f0Var.f20707e;
        f0Var.c();
        j0 d2 = qVar.d2(f0Var.f20706c, 2);
        this.f20827c = d2;
        this.d = new r(d2);
        this.f20825a.b(qVar, f0Var);
    }

    public final void h(long j3, long j10, int i7, int i10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.f20828e;
        boolean z12 = false;
        rVar.f20819g = false;
        rVar.h = false;
        rVar.f20817e = j10;
        rVar.d = 0;
        rVar.f20815b = j3;
        if (i10 >= 32 && i10 != 40) {
            if (rVar.f20820i && !rVar.f20821j) {
                if (z11) {
                    rVar.a(i7);
                }
                rVar.f20820i = false;
            }
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                rVar.h = !rVar.f20821j;
                rVar.f20821j = true;
            }
        }
        if (i10 >= 16 && i10 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f20816c = z10;
        if (z10 || i10 <= 9) {
            z12 = true;
        }
        rVar.f20818f = z12;
        if (!this.f20828e) {
            this.f20830g.h(i10);
            this.h.h(i10);
            this.f20831i.h(i10);
        }
        this.f20832j.h(i10);
        this.f20833k.h(i10);
    }
}
