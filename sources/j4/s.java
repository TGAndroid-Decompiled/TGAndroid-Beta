package j4;

import b2.w0;
import c3.i0;
import e2.m0;
import i2.o0;
import java.util.Collections;
import v7.u6;
public final class s implements i {
    public final c0 f12750a;
    public String f12751b;
    public i0 f12752c;
    public r d;
    public boolean e;
    public long f12758l;
    public final boolean[] f12753f = new boolean[3];
    public final o0 f12754g = new o0(32);
    public final o0 h = new o0(33);
    public final o0 f12755i = new o0(34);
    public final o0 f12756j = new o0(39);
    public final o0 f12757k = new o0(40);
    public long f12759m = -9223372036854775807L;
    public final e2.x f12760n = new e2.x();

    public s(c0 c0Var) {
        this.f12750a = c0Var;
    }

    @Override
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        this.f12752c.getClass();
        String str = m0.f8372a;
        while (xVar.a() > 0) {
            int i12 = xVar.f8412b;
            int i13 = xVar.f8413c;
            byte[] bArr = xVar.f8411a;
            this.f12758l += xVar.a();
            this.f12752c.d(xVar.a(), xVar);
            while (i12 < i13) {
                int c10 = f2.p.c(bArr, i12, i13, this.f12753f);
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
                long j10 = this.f12758l - i18;
                if (i17 < 0) {
                    i11 = -i17;
                } else {
                    i11 = 0;
                }
                b(j10, i18, i11, this.f12759m);
                h(j10, i18, i14, this.f12759m);
                i12 = i15 + i16;
            }
        }
    }

    public final void b(long j10, int i10, int i11, long j11) {
        e2.c cVar = this.f12750a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        boolean z11 = false;
        if (rVar.f12746j && rVar.f12744g) {
            rVar.f12749m = rVar.f12742c;
            rVar.f12746j = false;
        } else if (rVar.h || rVar.f12744g) {
            if (z10 && rVar.f12745i) {
                rVar.a(i10 + ((int) (j10 - rVar.f12741b)));
            }
            rVar.f12747k = rVar.f12741b;
            rVar.f12748l = rVar.e;
            rVar.f12749m = rVar.f12742c;
            rVar.f12745i = true;
        }
        if (!this.e) {
            o0 o0Var = this.f12754g;
            o0Var.e(i11);
            o0 o0Var2 = this.h;
            o0Var2.e(i11);
            o0 o0Var3 = this.f12755i;
            o0Var3.e(i11);
            if (o0Var.d && o0Var2.d && o0Var3.d) {
                String str = this.f12751b;
                int i12 = o0Var.e;
                byte[] bArr = new byte[o0Var2.e + i12 + o0Var3.e];
                System.arraycopy((byte[]) o0Var.f11124f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) o0Var2.f11124f, 0, bArr, o0Var.e, o0Var2.e);
                System.arraycopy((byte[]) o0Var3.f11124f, 0, bArr, o0Var.e + o0Var2.e, o0Var3.e);
                String str2 = null;
                f2.l k10 = f2.p.k((byte[]) o0Var2.f11124f, 3, o0Var2.e, null);
                f2.i iVar = k10.f8859b;
                if (iVar != null) {
                    str2 = e2.g.a(iVar.f8849a, iVar.f8851c, iVar.d, iVar.f8852f, iVar.f8850b, iVar.e);
                }
                b2.w wVar = new b2.w();
                wVar.f2452a = str;
                wVar.f2465q = w0.n("video/mp2t");
                wVar.f2466r = w0.n("video/hevc");
                wVar.f2458j = str2;
                wVar.f2472y = k10.e;
                wVar.f2473z = k10.f8861f;
                wVar.A = k10.f8862g;
                wVar.B = k10.h;
                wVar.H = new b2.o(k10.f8865k, k10.f8866l, k10.f8867m, null, k10.f8860c + 8, k10.d + 8);
                wVar.E = k10.f8863i;
                wVar.f2468t = k10.f8864j;
                wVar.I = k10.f8858a + 1;
                wVar.f2469u = Collections.singletonList(bArr);
                b2.x xVar = new b2.x(wVar);
                this.f12752c.b(xVar);
                int i13 = xVar.f2521u;
                if (i13 != -1) {
                    z11 = true;
                }
                u6.p(z11);
                cVar.k(i13);
                this.e = true;
            }
        }
        o0 o0Var4 = this.f12756j;
        boolean e = o0Var4.e(i11);
        e2.x xVar2 = this.f12760n;
        if (e) {
            xVar2.L(f2.p.p(o0Var4.e, (byte[]) o0Var4.f11124f), (byte[]) o0Var4.f11124f);
            xVar2.O(5);
            cVar.a(j11, xVar2);
        }
        o0 o0Var5 = this.f12757k;
        if (o0Var5.e(i11)) {
            xVar2.L(f2.p.p(o0Var5.e, (byte[]) o0Var5.f11124f), (byte[]) o0Var5.f11124f);
            xVar2.O(5);
            cVar.a(j11, xVar2);
        }
    }

    @Override
    public final void c() {
        this.f12758l = 0L;
        this.f12759m = -9223372036854775807L;
        f2.p.b(this.f12753f);
        this.f12754g.g();
        this.h.g();
        this.f12755i.g();
        this.f12756j.g();
        this.f12757k.g();
        this.f12750a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f12743f = false;
            rVar.f12744g = false;
            rVar.h = false;
            rVar.f12745i = false;
            rVar.f12746j = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f12751b = (String) f0Var.e;
        f0Var.c();
        i0 a02 = qVar.a0(f0Var.f12643c, 2);
        this.f12752c = a02;
        this.d = new r(a02);
        this.f12750a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f12752c.getClass();
        String str = m0.f8372a;
        if (z10) {
            this.f12750a.d.c(0);
            b(this.f12758l, 0, 0, this.f12759m);
            h(this.f12758l, 0, 48, this.f12759m);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f12759m = j10;
    }

    public final void g(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f12743f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f12744g = z10;
                rVar.f12743f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.f12754g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f12755i.a(i10, i11, bArr);
        }
        this.f12756j.a(i10, i11, bArr);
        this.f12757k.a(i10, i11, bArr);
    }

    public final void h(long j10, int i10, int i11, long j11) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.e;
        boolean z12 = false;
        rVar.f12744g = false;
        rVar.h = false;
        rVar.e = j11;
        rVar.d = 0;
        rVar.f12741b = j10;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f12745i && !rVar.f12746j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f12745i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f12746j;
                rVar.f12746j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f12742c = z10;
        if (z10 || i11 <= 9) {
            z12 = true;
        }
        rVar.f12743f = z12;
        if (!this.e) {
            this.f12754g.h(i11);
            this.h.h(i11);
            this.f12755i.h(i11);
        }
        this.f12756j.h(i11);
        this.f12757k.h(i11);
    }
}
