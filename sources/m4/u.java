package m4;

import a8.la;
import e2.s0;
import f3.i0;
public final class u implements i {
    public final h2.x f20794a;
    public final f3.z f20795b;
    public final String f20796c;
    public final int d;
    public final String f20797e;
    public i0 f20798f;
    public String f20799g;
    public int h = 0;
    public int f20800i;
    public boolean f20801j;
    public boolean f20802k;
    public long f20803l;
    public int f20804m;
    public long f20805n;

    public u(String str, int i7, String str2) {
        h2.x xVar = new h2.x(4);
        this.f20794a = xVar;
        xVar.f13865a[0] = -1;
        this.f20795b = new Object();
        this.f20805n = -9223372036854775807L;
        this.f20796c = str;
        this.d = i7;
        this.f20797e = str2;
    }

    @Override
    public final void c(h2.x xVar) {
        boolean z10;
        boolean z11;
        this.f20798f.getClass();
        while (xVar.a() > 0) {
            int i7 = this.h;
            h2.x xVar2 = this.f20794a;
            boolean z12 = true;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(xVar.a(), this.f20804m - this.f20800i);
                        this.f20798f.b(min, xVar);
                        int i10 = this.f20800i + min;
                        this.f20800i = i10;
                        if (i10 >= this.f20804m) {
                            if (this.f20805n == -9223372036854775807L) {
                                z12 = false;
                            }
                            la.p(z12);
                            this.f20798f.c(this.f20805n, 1, this.f20804m, 0, null);
                            this.f20805n += this.f20803l;
                            this.f20800i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f20800i);
                    xVar.k(this.f20800i, min2, xVar2.f13865a);
                    int i11 = this.f20800i + min2;
                    this.f20800i = i11;
                    if (i11 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        f3.z zVar = this.f20795b;
                        if (!zVar.a(m10)) {
                            this.f20800i = 0;
                            this.h = 1;
                        } else {
                            this.f20804m = zVar.f11263b;
                            if (!this.f20801j) {
                                this.f20803l = (zVar.f11266f * 1000000) / zVar.f11264c;
                                e2.t tVar = new e2.t();
                                tVar.f10731a = this.f20799g;
                                tVar.f10745q = s0.n(this.f20797e);
                                tVar.f10746r = s0.n((String) zVar.f11267g);
                                tVar.f10747s = 4096;
                                tVar.J = zVar.d;
                                tVar.K = zVar.f11264c;
                                tVar.d = this.f20796c;
                                tVar.f10735f = this.d;
                                this.f20798f.g(new e2.u(tVar));
                                this.f20801j = true;
                            }
                            xVar2.N(0);
                            this.f20798f.b(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f13865a;
                int i12 = xVar.f13866b;
                int i13 = xVar.f13867c;
                while (true) {
                    if (i12 < i13) {
                        byte b10 = bArr[i12];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f20802k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f20802k = z10;
                        if (z11) {
                            xVar.N(i12 + 1);
                            this.f20802k = false;
                            xVar2.f13865a[1] = bArr[i12];
                            this.f20800i = 2;
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
        this.f20800i = 0;
        this.f20802k = false;
        this.f20805n = -9223372036854775807L;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20805n = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20799g = (String) f0Var.f20645e;
        f0Var.c();
        this.f20798f = qVar.d2(f0Var.f20644c, 1);
    }

    @Override
    public final void e(boolean z10) {
    }
}
