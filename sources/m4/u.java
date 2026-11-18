package m4;

import a8.la;
import e2.s0;
import f3.i0;
public final class u implements i {
    public final h2.x f20766a;
    public final f3.z f20767b;
    public final String f20768c;
    public final int d;
    public final String f20769e;
    public i0 f20770f;
    public String f20771g;
    public int h = 0;
    public int f20772i;
    public boolean f20773j;
    public boolean f20774k;
    public long f20775l;
    public int f20776m;
    public long f20777n;

    public u(String str, int i7, String str2) {
        h2.x xVar = new h2.x(4);
        this.f20766a = xVar;
        xVar.f13836a[0] = -1;
        this.f20767b = new Object();
        this.f20777n = -9223372036854775807L;
        this.f20768c = str;
        this.d = i7;
        this.f20769e = str2;
    }

    @Override
    public final void c(h2.x xVar) {
        boolean z10;
        boolean z11;
        this.f20770f.getClass();
        while (xVar.a() > 0) {
            int i7 = this.h;
            h2.x xVar2 = this.f20766a;
            boolean z12 = true;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(xVar.a(), this.f20776m - this.f20772i);
                        this.f20770f.b(min, xVar);
                        int i10 = this.f20772i + min;
                        this.f20772i = i10;
                        if (i10 >= this.f20776m) {
                            if (this.f20777n == -9223372036854775807L) {
                                z12 = false;
                            }
                            la.p(z12);
                            this.f20770f.c(this.f20777n, 1, this.f20776m, 0, null);
                            this.f20777n += this.f20775l;
                            this.f20772i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f20772i);
                    xVar.k(this.f20772i, min2, xVar2.f13836a);
                    int i11 = this.f20772i + min2;
                    this.f20772i = i11;
                    if (i11 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        f3.z zVar = this.f20767b;
                        if (!zVar.a(m10)) {
                            this.f20772i = 0;
                            this.h = 1;
                        } else {
                            this.f20776m = zVar.f11234b;
                            if (!this.f20773j) {
                                this.f20775l = (zVar.f11237f * 1000000) / zVar.f11235c;
                                e2.t tVar = new e2.t();
                                tVar.f10702a = this.f20771g;
                                tVar.f10716q = s0.n(this.f20769e);
                                tVar.f10717r = s0.n((String) zVar.f11238g);
                                tVar.f10718s = 4096;
                                tVar.J = zVar.d;
                                tVar.K = zVar.f11235c;
                                tVar.d = this.f20768c;
                                tVar.f10706f = this.d;
                                this.f20770f.g(new e2.u(tVar));
                                this.f20773j = true;
                            }
                            xVar2.N(0);
                            this.f20770f.b(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f13836a;
                int i12 = xVar.f13837b;
                int i13 = xVar.f13838c;
                while (true) {
                    if (i12 < i13) {
                        byte b10 = bArr[i12];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f20774k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f20774k = z10;
                        if (z11) {
                            xVar.N(i12 + 1);
                            this.f20774k = false;
                            xVar2.f13836a[1] = bArr[i12];
                            this.f20772i = 2;
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
        this.f20772i = 0;
        this.f20774k = false;
        this.f20777n = -9223372036854775807L;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20777n = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20771g = (String) f0Var.f20617e;
        f0Var.c();
        this.f20770f = qVar.d2(f0Var.f20616c, 1);
    }

    @Override
    public final void e(boolean z10) {
    }
}
