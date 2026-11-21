package m4;

import a8.la;
import e2.s0;
import f3.i0;
public final class u implements i {
    public final h2.x f20791a;
    public final f3.z f20792b;
    public final String f20793c;
    public final int d;
    public final String f20794e;
    public i0 f20795f;
    public String f20796g;
    public int h = 0;
    public int f20797i;
    public boolean f20798j;
    public boolean f20799k;
    public long f20800l;
    public int f20801m;
    public long f20802n;

    public u(String str, int i7, String str2) {
        h2.x xVar = new h2.x(4);
        this.f20791a = xVar;
        xVar.f13862a[0] = -1;
        this.f20792b = new Object();
        this.f20802n = -9223372036854775807L;
        this.f20793c = str;
        this.d = i7;
        this.f20794e = str2;
    }

    @Override
    public final void c(h2.x xVar) {
        boolean z10;
        boolean z11;
        this.f20795f.getClass();
        while (xVar.a() > 0) {
            int i7 = this.h;
            h2.x xVar2 = this.f20791a;
            boolean z12 = true;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(xVar.a(), this.f20801m - this.f20797i);
                        this.f20795f.b(min, xVar);
                        int i10 = this.f20797i + min;
                        this.f20797i = i10;
                        if (i10 >= this.f20801m) {
                            if (this.f20802n == -9223372036854775807L) {
                                z12 = false;
                            }
                            la.p(z12);
                            this.f20795f.c(this.f20802n, 1, this.f20801m, 0, null);
                            this.f20802n += this.f20800l;
                            this.f20797i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f20797i);
                    xVar.k(this.f20797i, min2, xVar2.f13862a);
                    int i11 = this.f20797i + min2;
                    this.f20797i = i11;
                    if (i11 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        f3.z zVar = this.f20792b;
                        if (!zVar.a(m10)) {
                            this.f20797i = 0;
                            this.h = 1;
                        } else {
                            this.f20801m = zVar.f11260b;
                            if (!this.f20798j) {
                                this.f20800l = (zVar.f11263f * 1000000) / zVar.f11261c;
                                e2.t tVar = new e2.t();
                                tVar.f10728a = this.f20796g;
                                tVar.f10742q = s0.n(this.f20794e);
                                tVar.f10743r = s0.n((String) zVar.f11264g);
                                tVar.f10744s = 4096;
                                tVar.J = zVar.d;
                                tVar.K = zVar.f11261c;
                                tVar.d = this.f20793c;
                                tVar.f10732f = this.d;
                                this.f20795f.g(new e2.u(tVar));
                                this.f20798j = true;
                            }
                            xVar2.N(0);
                            this.f20795f.b(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f13862a;
                int i12 = xVar.f13863b;
                int i13 = xVar.f13864c;
                while (true) {
                    if (i12 < i13) {
                        byte b10 = bArr[i12];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f20799k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f20799k = z10;
                        if (z11) {
                            xVar.N(i12 + 1);
                            this.f20799k = false;
                            xVar2.f13862a[1] = bArr[i12];
                            this.f20797i = 2;
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
        this.f20797i = 0;
        this.f20799k = false;
        this.f20802n = -9223372036854775807L;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20802n = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20796g = (String) f0Var.f20642e;
        f0Var.c();
        this.f20795f = qVar.d2(f0Var.f20641c, 1);
    }

    @Override
    public final void e(boolean z10) {
    }
}
