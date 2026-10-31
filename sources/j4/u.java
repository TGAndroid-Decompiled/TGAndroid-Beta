package j4;

import b2.v0;
import c3.k0;
import v7.t6;
public final class u implements i {
    public final e2.x f9613a;
    public final c3.z f9614b;
    public final String f9615c;
    public final int d;
    public final String e;
    public k0 f9616f;
    public String f9617g;
    public int h = 0;
    public int f9618i;
    public boolean f9619j;
    public boolean f9620k;
    public long f9621l;
    public int f9622m;
    public long f9623n;

    public u(String str, int i10, String str2) {
        e2.x xVar = new e2.x(4);
        this.f9613a = xVar;
        xVar.f6207a[0] = -1;
        this.f9614b = new Object();
        this.f9623n = -9223372036854775807L;
        this.f9615c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override
    public final void c(e2.x xVar) {
        boolean z10;
        boolean z11;
        this.f9616f.getClass();
        while (xVar.a() > 0) {
            int i10 = this.h;
            e2.x xVar2 = this.f9613a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(xVar.a(), this.f9622m - this.f9618i);
                        this.f9616f.d(min, xVar);
                        int i11 = this.f9618i + min;
                        this.f9618i = i11;
                        if (i11 >= this.f9622m) {
                            if (this.f9623n == -9223372036854775807L) {
                                z12 = false;
                            }
                            t6.p(z12);
                            this.f9616f.c(this.f9623n, 1, this.f9622m, 0, null);
                            this.f9623n += this.f9621l;
                            this.f9618i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f9618i);
                    xVar.k(this.f9618i, min2, xVar2.f6207a);
                    int i12 = this.f9618i + min2;
                    this.f9618i = i12;
                    if (i12 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        c3.z zVar = this.f9614b;
                        if (!zVar.a(m10)) {
                            this.f9618i = 0;
                            this.h = 1;
                        } else {
                            this.f9622m = zVar.f3720b;
                            if (!this.f9619j) {
                                this.f9621l = (zVar.f3722f * 1000000) / zVar.f3721c;
                                b2.w wVar = new b2.w();
                                wVar.f2356a = this.f9617g;
                                wVar.f2369q = v0.n(this.e);
                                wVar.f2370r = v0.n((String) zVar.f3723g);
                                wVar.f2371s = 4096;
                                wVar.J = zVar.d;
                                wVar.K = zVar.f3721c;
                                wVar.d = this.f9615c;
                                wVar.f2359f = this.d;
                                this.f9616f.b(new b2.x(wVar));
                                this.f9619j = true;
                            }
                            xVar2.N(0);
                            this.f9616f.d(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f6207a;
                int i13 = xVar.f6208b;
                int i14 = xVar.f6209c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f9620k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f9620k = z10;
                        if (z11) {
                            xVar.N(i13 + 1);
                            this.f9620k = false;
                            xVar2.f6207a[1] = bArr[i13];
                            this.f9618i = 2;
                            this.h = 1;
                            break;
                        }
                        i13++;
                    } else {
                        xVar.N(i14);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public final void e() {
        this.h = 0;
        this.f9618i = 0;
        this.f9620k = false;
        this.f9623n = -9223372036854775807L;
    }

    @Override
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f9617g = (String) g0Var.e;
        g0Var.c();
        this.f9616f = qVar.I1(g0Var.f9491c, 1);
    }

    @Override
    public final void h(int i10, long j10) {
        this.f9623n = j10;
    }

    @Override
    public final void g(boolean z10) {
    }
}
