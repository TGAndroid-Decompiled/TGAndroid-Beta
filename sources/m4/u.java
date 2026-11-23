package m4;

import a8.ma;
import e2.s0;
import f3.i0;
public final class u implements i {
    public final h2.x f20760a;
    public final f3.z f20761b;
    public final String f20762c;
    public final int d;
    public final String f20763e;
    public i0 f20764f;
    public String f20765g;
    public int h = 0;
    public int f20766i;
    public boolean f20767j;
    public boolean f20768k;
    public long f20769l;
    public int f20770m;
    public long f20771n;

    public u(String str, int i7, String str2) {
        h2.x xVar = new h2.x(4);
        this.f20760a = xVar;
        xVar.f13828a[0] = -1;
        this.f20761b = new Object();
        this.f20771n = -9223372036854775807L;
        this.f20762c = str;
        this.d = i7;
        this.f20763e = str2;
    }

    @Override
    public final void c(h2.x xVar) {
        boolean z10;
        boolean z11;
        this.f20764f.getClass();
        while (xVar.a() > 0) {
            int i7 = this.h;
            h2.x xVar2 = this.f20760a;
            boolean z12 = true;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(xVar.a(), this.f20770m - this.f20766i);
                        this.f20764f.b(min, xVar);
                        int i10 = this.f20766i + min;
                        this.f20766i = i10;
                        if (i10 >= this.f20770m) {
                            if (this.f20771n == -9223372036854775807L) {
                                z12 = false;
                            }
                            ma.p(z12);
                            this.f20764f.c(this.f20771n, 1, this.f20770m, 0, null);
                            this.f20771n += this.f20769l;
                            this.f20766i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f20766i);
                    xVar.k(this.f20766i, min2, xVar2.f13828a);
                    int i11 = this.f20766i + min2;
                    this.f20766i = i11;
                    if (i11 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        f3.z zVar = this.f20761b;
                        if (!zVar.a(m10)) {
                            this.f20766i = 0;
                            this.h = 1;
                        } else {
                            this.f20770m = zVar.f11226b;
                            if (!this.f20767j) {
                                this.f20769l = (zVar.f11229f * 1000000) / zVar.f11227c;
                                e2.t tVar = new e2.t();
                                tVar.f10694a = this.f20765g;
                                tVar.f10708q = s0.n(this.f20763e);
                                tVar.f10709r = s0.n((String) zVar.f11230g);
                                tVar.f10710s = 4096;
                                tVar.J = zVar.d;
                                tVar.K = zVar.f11227c;
                                tVar.d = this.f20762c;
                                tVar.f10698f = this.d;
                                this.f20764f.g(new e2.u(tVar));
                                this.f20767j = true;
                            }
                            xVar2.N(0);
                            this.f20764f.b(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f13828a;
                int i12 = xVar.f13829b;
                int i13 = xVar.f13830c;
                while (true) {
                    if (i12 < i13) {
                        byte b10 = bArr[i12];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f20768k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f20768k = z10;
                        if (z11) {
                            xVar.N(i12 + 1);
                            this.f20768k = false;
                            xVar2.f13828a[1] = bArr[i12];
                            this.f20766i = 2;
                            this.h = 1;
                            break;
                        }
                        i12++;
                    } else {
                        xVar.N(i13);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public final void d() {
        this.h = 0;
        this.f20766i = 0;
        this.f20768k = false;
        this.f20771n = -9223372036854775807L;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20771n = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20765g = (String) f0Var.f20611e;
        f0Var.c();
        this.f20764f = qVar.d2(f0Var.f20610c, 1);
    }

    @Override
    public final void e(boolean z10) {
    }
}
