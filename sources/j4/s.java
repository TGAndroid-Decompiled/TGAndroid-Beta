package j4;

import b2.v0;
import c3.k0;
import e2.l0;
import i2.p0;
import java.util.Collections;
import v7.t6;
public final class s implements i {
    public final d0 f9584a;
    public String f9585b;
    public k0 f9586c;
    public r d;
    public boolean e;
    public long f9592l;
    public final boolean[] f9587f = new boolean[3];
    public final p0 f9588g = new p0(32);
    public final p0 h = new p0(33);
    public final p0 f9589i = new p0(34);
    public final p0 f9590j = new p0(39);
    public final p0 f9591k = new p0(40);
    public long f9593m = -9223372036854775807L;
    public final e2.x f9594n = new e2.x();

    public s(d0 d0Var) {
        this.f9584a = d0Var;
    }

    public final void a(long j10, long j11, int i10, int i11) {
        e2.c cVar = this.f9584a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        boolean z11 = false;
        if (rVar.f9580j && rVar.f9578g) {
            rVar.f9583m = rVar.f9576c;
            rVar.f9580j = false;
        } else if (rVar.h || rVar.f9578g) {
            if (z10 && rVar.f9579i) {
                rVar.a(i10 + ((int) (j10 - rVar.f9575b)));
            }
            rVar.f9581k = rVar.f9575b;
            rVar.f9582l = rVar.e;
            rVar.f9583m = rVar.f9576c;
            rVar.f9579i = true;
        }
        if (!this.e) {
            p0 p0Var = this.f9588g;
            p0Var.e(i11);
            p0 p0Var2 = this.h;
            p0Var2.e(i11);
            p0 p0Var3 = this.f9589i;
            p0Var3.e(i11);
            if (p0Var.d && p0Var2.d && p0Var3.d) {
                String str = this.f9585b;
                int i12 = p0Var.e;
                byte[] bArr = new byte[p0Var2.e + i12 + p0Var3.e];
                System.arraycopy((byte[]) p0Var.f8019f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) p0Var2.f8019f, 0, bArr, p0Var.e, p0Var2.e);
                System.arraycopy((byte[]) p0Var3.f8019f, 0, bArr, p0Var.e + p0Var2.e, p0Var3.e);
                String str2 = null;
                f2.m k10 = f2.q.k((byte[]) p0Var2.f8019f, 3, p0Var2.e, null);
                f2.j jVar = k10.f6753b;
                if (jVar != null) {
                    str2 = e2.g.a(jVar.f6743a, jVar.f6745c, jVar.d, jVar.f6746f, jVar.f6744b, jVar.e);
                }
                b2.w wVar = new b2.w();
                wVar.f2356a = str;
                wVar.f2369q = v0.n("video/mp2t");
                wVar.f2370r = v0.n("video/hevc");
                wVar.f2362j = str2;
                wVar.f2376y = k10.e;
                wVar.f2377z = k10.f6755f;
                wVar.A = k10.f6756g;
                wVar.B = k10.h;
                wVar.H = new b2.o(k10.f6759k, k10.f6760l, k10.f6761m, null, k10.f6754c + 8, k10.d + 8);
                wVar.E = k10.f6757i;
                wVar.f2372t = k10.f6758j;
                wVar.I = k10.f6752a + 1;
                wVar.f2373u = Collections.singletonList(bArr);
                b2.x xVar = new b2.x(wVar);
                this.f9586c.b(xVar);
                int i13 = xVar.f2425u;
                if (i13 != -1) {
                    z11 = true;
                }
                t6.p(z11);
                cVar.p(i13);
                this.e = true;
            }
        }
        p0 p0Var4 = this.f9590j;
        boolean e = p0Var4.e(i11);
        e2.x xVar2 = this.f9594n;
        if (e) {
            xVar2.L(f2.q.p(p0Var4.e, (byte[]) p0Var4.f8019f), (byte[]) p0Var4.f8019f);
            xVar2.O(5);
            cVar.a(j11, xVar2);
        }
        p0 p0Var5 = this.f9591k;
        if (p0Var5.e(i11)) {
            xVar2.L(f2.q.p(p0Var5.e, (byte[]) p0Var5.f8019f), (byte[]) p0Var5.f8019f);
            xVar2.O(5);
            cVar.a(j11, xVar2);
        }
    }

    public final void b(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f9577f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f9578g = z10;
                rVar.f9577f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.f9588g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f9589i.a(i10, i11, bArr);
        }
        this.f9590j.a(i10, i11, bArr);
        this.f9591k.a(i10, i11, bArr);
    }

    @Override
    public final void c(e2.x xVar) {
        int i10;
        int i11;
        this.f9586c.getClass();
        String str = l0.f6165a;
        while (xVar.a() > 0) {
            int i12 = xVar.f6208b;
            int i13 = xVar.f6209c;
            byte[] bArr = xVar.f6207a;
            this.f9592l += xVar.a();
            this.f9586c.d(xVar.a(), xVar);
            while (i12 < i13) {
                int c10 = f2.q.c(bArr, i12, i13, this.f9587f);
                if (c10 == i13) {
                    b(i12, i13, bArr);
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
                    b(i12, i15, bArr);
                }
                int i18 = i13 - i15;
                long j10 = this.f9592l - i18;
                if (i17 < 0) {
                    i11 = -i17;
                } else {
                    i11 = 0;
                }
                a(j10, this.f9593m, i18, i11);
                d(j10, this.f9593m, i18, i14);
                i12 = i15 + i16;
            }
        }
    }

    public final void d(long j10, long j11, int i10, int i11) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.e;
        boolean z12 = false;
        rVar.f9578g = false;
        rVar.h = false;
        rVar.e = j11;
        rVar.d = 0;
        rVar.f9575b = j10;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f9579i && !rVar.f9580j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f9579i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f9580j;
                rVar.f9580j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f9576c = z10;
        if (z10 || i11 <= 9) {
            z12 = true;
        }
        rVar.f9577f = z12;
        if (!this.e) {
            this.f9588g.h(i11);
            this.h.h(i11);
            this.f9589i.h(i11);
        }
        this.f9590j.h(i11);
        this.f9591k.h(i11);
    }

    @Override
    public final void e() {
        this.f9592l = 0L;
        this.f9593m = -9223372036854775807L;
        f2.q.b(this.f9587f);
        this.f9588g.g();
        this.h.g();
        this.f9589i.g();
        this.f9590j.g();
        this.f9591k.g();
        this.f9584a.d.e(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f9577f = false;
            rVar.f9578g = false;
            rVar.h = false;
            rVar.f9579i = false;
            rVar.f9580j = false;
        }
    }

    @Override
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f9585b = (String) g0Var.e;
        g0Var.c();
        k0 I1 = qVar.I1(g0Var.f9491c, 2);
        this.f9586c = I1;
        this.d = new r(I1);
        this.f9584a.b(qVar, g0Var);
    }

    @Override
    public final void g(boolean z10) {
        this.f9586c.getClass();
        String str = l0.f6165a;
        if (z10) {
            this.f9584a.d.e(0);
            a(this.f9592l, this.f9593m, 0, 0);
            d(this.f9592l, this.f9593m, 0, 48);
        }
    }

    @Override
    public final void h(int i10, long j10) {
        this.f9593m = j10;
    }
}
