package m4;

import a8.ja;
import e2.s0;
import f3.i0;
import java.util.Collections;
import l2.l0;
public final class s implements i {
    public final c0 f20371a;
    public String f20372b;
    public i0 f20373c;
    public r d;
    public boolean f20374e;
    public long f20380l;
    public final boolean[] f20375f = new boolean[3];
    public final l0 f20376g = new l0(32);
    public final l0 h = new l0(33);
    public final l0 f20377i = new l0(34);
    public final l0 f20378j = new l0(39);
    public final l0 f20379k = new l0(40);
    public long f20381m = -9223372036854775807L;
    public final h2.x f20382n = new h2.x();

    public s(c0 c0Var) {
        this.f20371a = c0Var;
    }

    public final void a(long j3, long j10, int i7, int i10) {
        h2.c cVar = this.f20371a.d;
        r rVar = this.d;
        boolean z10 = this.f20374e;
        boolean z11 = false;
        if (rVar.f20367j && rVar.f20365g) {
            rVar.f20370m = rVar.f20362c;
            rVar.f20367j = false;
        } else if (rVar.h || rVar.f20365g) {
            if (z10 && rVar.f20366i) {
                rVar.a(i7 + ((int) (j3 - rVar.f20361b)));
            }
            rVar.f20368k = rVar.f20361b;
            rVar.f20369l = rVar.f20363e;
            rVar.f20370m = rVar.f20362c;
            rVar.f20366i = true;
        }
        if (!this.f20374e) {
            l0 l0Var = this.f20376g;
            l0Var.e(i10);
            l0 l0Var2 = this.h;
            l0Var2.e(i10);
            l0 l0Var3 = this.f20377i;
            l0Var3.e(i10);
            if (l0Var.d && l0Var2.d && l0Var3.d) {
                String str = this.f20372b;
                int i11 = l0Var.f19068e;
                byte[] bArr = new byte[l0Var2.f19068e + i11 + l0Var3.f19068e];
                System.arraycopy((byte[]) l0Var.f19069f, 0, bArr, 0, i11);
                System.arraycopy((byte[]) l0Var2.f19069f, 0, bArr, l0Var.f19068e, l0Var2.f19068e);
                System.arraycopy((byte[]) l0Var3.f19069f, 0, bArr, l0Var.f19068e + l0Var2.f19068e, l0Var3.f19068e);
                String str2 = null;
                i2.k k10 = i2.o.k((byte[]) l0Var2.f19069f, 3, l0Var2.f19068e, null);
                i2.h hVar = k10.f15627b;
                if (hVar != null) {
                    str2 = h2.g.a(hVar.f15615a, hVar.f15617c, hVar.d, hVar.f15619f, hVar.f15616b, hVar.f15618e);
                }
                e2.t tVar = new e2.t();
                tVar.f10384a = str;
                tVar.f10398q = s0.n("video/mp2t");
                tVar.f10399r = s0.n("video/hevc");
                tVar.f10391j = str2;
                tVar.f10405y = k10.f15629e;
                tVar.f10406z = k10.f15630f;
                tVar.A = k10.f15631g;
                tVar.B = k10.h;
                tVar.H = new e2.m(k10.f15634k, k10.f15635l, k10.f15636m, null, k10.f15628c + 8, k10.d + 8);
                tVar.E = k10.f15632i;
                tVar.f10401t = k10.f15633j;
                tVar.I = k10.f15626a + 1;
                tVar.f10402u = Collections.singletonList(bArr);
                e2.u uVar = new e2.u(tVar);
                this.f20373c.g(uVar);
                int i12 = uVar.f10453u;
                if (i12 != -1) {
                    z11 = true;
                }
                ja.p(z11);
                cVar.C(i12);
                this.f20374e = true;
            }
        }
        l0 l0Var4 = this.f20378j;
        boolean e10 = l0Var4.e(i10);
        h2.x xVar = this.f20382n;
        if (e10) {
            xVar.L(i2.o.p(l0Var4.f19068e, (byte[]) l0Var4.f19069f), (byte[]) l0Var4.f19069f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
        l0 l0Var5 = this.f20379k;
        if (l0Var5.e(i10)) {
            xVar.L(i2.o.p(l0Var5.f19068e, (byte[]) l0Var5.f19069f), (byte[]) l0Var5.f19069f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
    }

    public final void b(int i7, int i10, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f20364f) {
            int i11 = rVar.d;
            int i12 = (i7 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f20365g = z10;
                rVar.f20364f = false;
            } else {
                rVar.d = (i10 - i7) + i11;
            }
        }
        if (!this.f20374e) {
            this.f20376g.a(i7, i10, bArr);
            this.h.a(i7, i10, bArr);
            this.f20377i.a(i7, i10, bArr);
        }
        this.f20378j.a(i7, i10, bArr);
        this.f20379k.a(i7, i10, bArr);
    }

    @Override
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        this.f20373c.getClass();
        String str = h2.l0.f13471a;
        while (xVar.a() > 0) {
            int i11 = xVar.f13522b;
            int i12 = xVar.f13523c;
            byte[] bArr = xVar.f13521a;
            this.f20380l += xVar.a();
            this.f20373c.b(xVar.a(), xVar);
            while (i11 < i12) {
                int c10 = i2.o.c(bArr, i11, i12, this.f20375f);
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
                long j3 = this.f20380l - i17;
                if (i16 < 0) {
                    i10 = -i16;
                } else {
                    i10 = 0;
                }
                a(j3, this.f20381m, i17, i10);
                h(j3, this.f20381m, i17, i13);
                i11 = i14 + i15;
            }
        }
    }

    @Override
    public final void d() {
        this.f20380l = 0L;
        this.f20381m = -9223372036854775807L;
        i2.o.b(this.f20375f);
        this.f20376g.g();
        this.h.g();
        this.f20377i.g();
        this.f20378j.g();
        this.f20379k.g();
        this.f20371a.d.r(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f20364f = false;
            rVar.f20365g = false;
            rVar.h = false;
            rVar.f20366i = false;
            rVar.f20367j = false;
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f20373c.getClass();
        String str = h2.l0.f13471a;
        if (z10) {
            this.f20371a.d.r(0);
            a(this.f20380l, this.f20381m, 0, 0);
            h(this.f20380l, this.f20381m, 0, 48);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20381m = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20372b = (String) f0Var.f20253e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20252c, 2);
        this.f20373c = d2;
        this.d = new r(d2);
        this.f20371a.b(qVar, f0Var);
    }

    public final void h(long j3, long j10, int i7, int i10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.f20374e;
        boolean z12 = false;
        rVar.f20365g = false;
        rVar.h = false;
        rVar.f20363e = j10;
        rVar.d = 0;
        rVar.f20361b = j3;
        if (i10 >= 32 && i10 != 40) {
            if (rVar.f20366i && !rVar.f20367j) {
                if (z11) {
                    rVar.a(i7);
                }
                rVar.f20366i = false;
            }
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                rVar.h = !rVar.f20367j;
                rVar.f20367j = true;
            }
        }
        if (i10 >= 16 && i10 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f20362c = z10;
        if (z10 || i10 <= 9) {
            z12 = true;
        }
        rVar.f20364f = z12;
        if (!this.f20374e) {
            this.f20376g.h(i10);
            this.h.h(i10);
            this.f20377i.h(i10);
        }
        this.f20378j.h(i10);
        this.f20379k.h(i10);
    }
}
