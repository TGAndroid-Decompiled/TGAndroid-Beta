package m4;

import a8.ma;
import e2.s0;
import f3.j0;
public final class u implements i {
    public final h2.x f20856a;
    public final f3.a0 f20857b;
    public final String f20858c;
    public final int d;
    public final String f20859e;
    public j0 f20860f;
    public String f20861g;
    public int h = 0;
    public int f20862i;
    public boolean f20863j;
    public boolean f20864k;
    public long f20865l;
    public int f20866m;
    public long f20867n;

    public u(String str, int i7, String str2) {
        h2.x xVar = new h2.x(4);
        this.f20856a = xVar;
        xVar.f13828a[0] = -1;
        this.f20857b = new Object();
        this.f20867n = -9223372036854775807L;
        this.f20858c = str;
        this.d = i7;
        this.f20859e = str2;
    }

    @Override
    public final void c(h2.x xVar) {
        boolean z10;
        boolean z11;
        this.f20860f.getClass();
        while (xVar.a() > 0) {
            int i7 = this.h;
            h2.x xVar2 = this.f20856a;
            boolean z12 = true;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(xVar.a(), this.f20866m - this.f20862i);
                        this.f20860f.b(min, xVar);
                        int i10 = this.f20862i + min;
                        this.f20862i = i10;
                        if (i10 >= this.f20866m) {
                            if (this.f20867n == -9223372036854775807L) {
                                z12 = false;
                            }
                            ma.p(z12);
                            this.f20860f.c(this.f20867n, 1, this.f20866m, 0, null);
                            this.f20867n += this.f20865l;
                            this.f20862i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f20862i);
                    xVar.k(this.f20862i, min2, xVar2.f13828a);
                    int i11 = this.f20862i + min2;
                    this.f20862i = i11;
                    if (i11 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        f3.a0 a0Var = this.f20857b;
                        if (!a0Var.a(m10)) {
                            this.f20862i = 0;
                            this.h = 1;
                        } else {
                            this.f20866m = a0Var.f11090b;
                            if (!this.f20863j) {
                                this.f20865l = (a0Var.f11093f * 1000000) / a0Var.f11091c;
                                e2.t tVar = new e2.t();
                                tVar.f10692a = this.f20861g;
                                tVar.f10706q = s0.n(this.f20859e);
                                tVar.f10707r = s0.n((String) a0Var.f11094g);
                                tVar.f10708s = 4096;
                                tVar.J = a0Var.d;
                                tVar.K = a0Var.f11091c;
                                tVar.d = this.f20858c;
                                tVar.f10696f = this.d;
                                this.f20860f.g(new e2.u(tVar));
                                this.f20863j = true;
                            }
                            xVar2.N(0);
                            this.f20860f.b(4, xVar2);
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
                        if (this.f20864k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f20864k = z10;
                        if (z11) {
                            xVar.N(i12 + 1);
                            this.f20864k = false;
                            xVar2.f13828a[1] = bArr[i12];
                            this.f20862i = 2;
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
        this.f20862i = 0;
        this.f20864k = false;
        this.f20867n = -9223372036854775807L;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20867n = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20861g = (String) f0Var.f20707e;
        f0Var.c();
        this.f20860f = qVar.d2(f0Var.f20706c, 1);
    }

    @Override
    public final void e(boolean z10) {
    }
}
