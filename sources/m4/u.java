package m4;

import a8.la;
import e2.s0;
import f3.i0;
public final class u implements i {
    public final h2.x f20763a;
    public final f3.z f20764b;
    public final String f20765c;
    public final int d;
    public final String f20766e;
    public i0 f20767f;
    public String f20768g;
    public int h = 0;
    public int f20769i;
    public boolean f20770j;
    public boolean f20771k;
    public long f20772l;
    public int f20773m;
    public long f20774n;

    public u(String str, int i7, String str2) {
        h2.x xVar = new h2.x(4);
        this.f20763a = xVar;
        xVar.f13833a[0] = -1;
        this.f20764b = new Object();
        this.f20774n = -9223372036854775807L;
        this.f20765c = str;
        this.d = i7;
        this.f20766e = str2;
    }

    @Override
    public final void c(h2.x xVar) {
        boolean z10;
        boolean z11;
        this.f20767f.getClass();
        while (xVar.a() > 0) {
            int i7 = this.h;
            h2.x xVar2 = this.f20763a;
            boolean z12 = true;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(xVar.a(), this.f20773m - this.f20769i);
                        this.f20767f.b(min, xVar);
                        int i10 = this.f20769i + min;
                        this.f20769i = i10;
                        if (i10 >= this.f20773m) {
                            if (this.f20774n == -9223372036854775807L) {
                                z12 = false;
                            }
                            la.p(z12);
                            this.f20767f.c(this.f20774n, 1, this.f20773m, 0, null);
                            this.f20774n += this.f20772l;
                            this.f20769i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f20769i);
                    xVar.k(this.f20769i, min2, xVar2.f13833a);
                    int i11 = this.f20769i + min2;
                    this.f20769i = i11;
                    if (i11 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        f3.z zVar = this.f20764b;
                        if (!zVar.a(m10)) {
                            this.f20769i = 0;
                            this.h = 1;
                        } else {
                            this.f20773m = zVar.f11231b;
                            if (!this.f20770j) {
                                this.f20772l = (zVar.f11234f * 1000000) / zVar.f11232c;
                                e2.t tVar = new e2.t();
                                tVar.f10699a = this.f20768g;
                                tVar.f10713q = s0.n(this.f20766e);
                                tVar.f10714r = s0.n((String) zVar.f11235g);
                                tVar.f10715s = 4096;
                                tVar.J = zVar.d;
                                tVar.K = zVar.f11232c;
                                tVar.d = this.f20765c;
                                tVar.f10703f = this.d;
                                this.f20767f.g(new e2.u(tVar));
                                this.f20770j = true;
                            }
                            xVar2.N(0);
                            this.f20767f.b(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f13833a;
                int i12 = xVar.f13834b;
                int i13 = xVar.f13835c;
                while (true) {
                    if (i12 < i13) {
                        byte b10 = bArr[i12];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f20771k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f20771k = z10;
                        if (z11) {
                            xVar.N(i12 + 1);
                            this.f20771k = false;
                            xVar2.f13833a[1] = bArr[i12];
                            this.f20769i = 2;
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
        this.f20769i = 0;
        this.f20771k = false;
        this.f20774n = -9223372036854775807L;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20774n = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20768g = (String) f0Var.f20614e;
        f0Var.c();
        this.f20767f = qVar.d2(f0Var.f20613c, 1);
    }

    @Override
    public final void e(boolean z10) {
    }
}
