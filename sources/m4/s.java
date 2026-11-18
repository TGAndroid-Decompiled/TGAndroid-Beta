package m4;

import a8.la;
import e2.s0;
import f3.i0;
import java.util.Collections;
import l2.l0;
public final class s implements i {
    public final c0 f20732a;
    public String f20733b;
    public i0 f20734c;
    public r d;
    public boolean f20735e;
    public long f20741l;
    public final boolean[] f20736f = new boolean[3];
    public final l0 f20737g = new l0(32);
    public final l0 h = new l0(33);
    public final l0 f20738i = new l0(34);
    public final l0 f20739j = new l0(39);
    public final l0 f20740k = new l0(40);
    public long f20742m = -9223372036854775807L;
    public final h2.x f20743n = new h2.x();

    public s(c0 c0Var) {
        this.f20732a = c0Var;
    }

    public final void a(long j3, long j10, int i7, int i10) {
        h2.c cVar = this.f20732a.d;
        r rVar = this.d;
        boolean z10 = this.f20735e;
        boolean z11 = false;
        if (rVar.f20728j && rVar.f20726g) {
            rVar.f20731m = rVar.f20723c;
            rVar.f20728j = false;
        } else if (rVar.h || rVar.f20726g) {
            if (z10 && rVar.f20727i) {
                rVar.a(i7 + ((int) (j3 - rVar.f20722b)));
            }
            rVar.f20729k = rVar.f20722b;
            rVar.f20730l = rVar.f20724e;
            rVar.f20731m = rVar.f20723c;
            rVar.f20727i = true;
        }
        if (!this.f20735e) {
            l0 l0Var = this.f20737g;
            l0Var.e(i10);
            l0 l0Var2 = this.h;
            l0Var2.e(i10);
            l0 l0Var3 = this.f20738i;
            l0Var3.e(i10);
            if (l0Var.d && l0Var2.d && l0Var3.d) {
                String str = this.f20733b;
                int i11 = l0Var.f19432e;
                byte[] bArr = new byte[l0Var2.f19432e + i11 + l0Var3.f19432e];
                System.arraycopy((byte[]) l0Var.f19433f, 0, bArr, 0, i11);
                System.arraycopy((byte[]) l0Var2.f19433f, 0, bArr, l0Var.f19432e, l0Var2.f19432e);
                System.arraycopy((byte[]) l0Var3.f19433f, 0, bArr, l0Var.f19432e + l0Var2.f19432e, l0Var3.f19432e);
                String str2 = null;
                i2.k k10 = i2.o.k((byte[]) l0Var2.f19433f, 3, l0Var2.f19432e, null);
                i2.h hVar = k10.f15942b;
                if (hVar != null) {
                    str2 = h2.g.a(hVar.f15930a, hVar.f15932c, hVar.d, hVar.f15934f, hVar.f15931b, hVar.f15933e);
                }
                e2.t tVar = new e2.t();
                tVar.f10699a = str;
                tVar.f10713q = s0.n("video/mp2t");
                tVar.f10714r = s0.n("video/hevc");
                tVar.f10706j = str2;
                tVar.f10720y = k10.f15944e;
                tVar.f10721z = k10.f15945f;
                tVar.A = k10.f15946g;
                tVar.B = k10.h;
                tVar.H = new e2.m(k10.f15949k, k10.f15950l, k10.f15951m, null, k10.f15943c + 8, k10.d + 8);
                tVar.E = k10.f15947i;
                tVar.f10716t = k10.f15948j;
                tVar.I = k10.f15941a + 1;
                tVar.f10717u = Collections.singletonList(bArr);
                e2.u uVar = new e2.u(tVar);
                this.f20734c.g(uVar);
                int i12 = uVar.f10768u;
                if (i12 != -1) {
                    z11 = true;
                }
                la.p(z11);
                cVar.C(i12);
                this.f20735e = true;
            }
        }
        l0 l0Var4 = this.f20739j;
        boolean e10 = l0Var4.e(i10);
        h2.x xVar = this.f20743n;
        if (e10) {
            xVar.L(i2.o.p(l0Var4.f19432e, (byte[]) l0Var4.f19433f), (byte[]) l0Var4.f19433f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
        l0 l0Var5 = this.f20740k;
        if (l0Var5.e(i10)) {
            xVar.L(i2.o.p(l0Var5.f19432e, (byte[]) l0Var5.f19433f), (byte[]) l0Var5.f19433f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
    }

    public final void b(int i7, int i10, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f20725f) {
            int i11 = rVar.d;
            int i12 = (i7 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f20726g = z10;
                rVar.f20725f = false;
            } else {
                rVar.d = (i10 - i7) + i11;
            }
        }
        if (!this.f20735e) {
            this.f20737g.a(i7, i10, bArr);
            this.h.a(i7, i10, bArr);
            this.f20738i.a(i7, i10, bArr);
        }
        this.f20739j.a(i7, i10, bArr);
        this.f20740k.a(i7, i10, bArr);
    }

    @Override
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        this.f20734c.getClass();
        String str = h2.l0.f13783a;
        while (xVar.a() > 0) {
            int i11 = xVar.f13834b;
            int i12 = xVar.f13835c;
            byte[] bArr = xVar.f13833a;
            this.f20741l += xVar.a();
            this.f20734c.b(xVar.a(), xVar);
            while (i11 < i12) {
                int c10 = i2.o.c(bArr, i11, i12, this.f20736f);
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
                long j3 = this.f20741l - i17;
                if (i16 < 0) {
                    i10 = -i16;
                } else {
                    i10 = 0;
                }
                a(j3, this.f20742m, i17, i10);
                h(j3, this.f20742m, i17, i13);
                i11 = i14 + i15;
            }
        }
    }

    @Override
    public final void d() {
        this.f20741l = 0L;
        this.f20742m = -9223372036854775807L;
        i2.o.b(this.f20736f);
        this.f20737g.g();
        this.h.g();
        this.f20738i.g();
        this.f20739j.g();
        this.f20740k.g();
        this.f20732a.d.r(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f20725f = false;
            rVar.f20726g = false;
            rVar.h = false;
            rVar.f20727i = false;
            rVar.f20728j = false;
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f20734c.getClass();
        String str = h2.l0.f13783a;
        if (z10) {
            this.f20732a.d.r(0);
            a(this.f20741l, this.f20742m, 0, 0);
            h(this.f20741l, this.f20742m, 0, 48);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20742m = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20733b = (String) f0Var.f20614e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20613c, 2);
        this.f20734c = d2;
        this.d = new r(d2);
        this.f20732a.b(qVar, f0Var);
    }

    public final void h(long j3, long j10, int i7, int i10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.f20735e;
        boolean z12 = false;
        rVar.f20726g = false;
        rVar.h = false;
        rVar.f20724e = j10;
        rVar.d = 0;
        rVar.f20722b = j3;
        if (i10 >= 32 && i10 != 40) {
            if (rVar.f20727i && !rVar.f20728j) {
                if (z11) {
                    rVar.a(i7);
                }
                rVar.f20727i = false;
            }
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                rVar.h = !rVar.f20728j;
                rVar.f20728j = true;
            }
        }
        if (i10 >= 16 && i10 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f20723c = z10;
        if (z10 || i10 <= 9) {
            z12 = true;
        }
        rVar.f20725f = z12;
        if (!this.f20735e) {
            this.f20737g.h(i10);
            this.h.h(i10);
            this.f20738i.h(i10);
        }
        this.f20739j.h(i10);
        this.f20740k.h(i10);
    }
}
