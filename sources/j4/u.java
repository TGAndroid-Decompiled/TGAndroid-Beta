package j4;

import b2.v0;
import c3.j0;
import v7.u6;
public final class u implements i {
    public final e2.x f14188a;
    public final c3.a0 f14189b;
    public final String f14190c;
    public final int d;
    public final String e;
    public j0 f14191f;
    public String f14192g;
    public int h = 0;
    public int f14193i;
    public boolean f14194j;
    public boolean f14195k;
    public long f14196l;
    public int f14197m;
    public long f14198n;

    public u(String str, int i10, String str2) {
        e2.x xVar = new e2.x(4);
        this.f14188a = xVar;
        xVar.f8293a[0] = -1;
        this.f14189b = new Object();
        this.f14198n = -9223372036854775807L;
        this.f14190c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override
    public final void a(e2.x xVar) {
        boolean z10;
        boolean z11;
        this.f14191f.getClass();
        while (xVar.a() > 0) {
            int i10 = this.h;
            e2.x xVar2 = this.f14188a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(xVar.a(), this.f14197m - this.f14193i);
                        this.f14191f.d(min, xVar);
                        int i11 = this.f14193i + min;
                        this.f14193i = i11;
                        if (i11 >= this.f14197m) {
                            if (this.f14198n == -9223372036854775807L) {
                                z12 = false;
                            }
                            u6.p(z12);
                            this.f14191f.c(this.f14198n, 1, this.f14197m, 0, null);
                            this.f14198n += this.f14196l;
                            this.f14193i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f14193i);
                    xVar.k(this.f14193i, min2, xVar2.f8293a);
                    int i12 = this.f14193i + min2;
                    this.f14193i = i12;
                    if (i12 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        c3.a0 a0Var = this.f14189b;
                        if (!a0Var.a(m10)) {
                            this.f14193i = 0;
                            this.h = 1;
                        } else {
                            this.f14197m = a0Var.f4565b;
                            if (!this.f14194j) {
                                this.f14196l = (a0Var.f4567f * 1000000) / a0Var.f4566c;
                                b2.v vVar = new b2.v();
                                vVar.f4064a = this.f14192g;
                                vVar.f4077q = v0.n(this.e);
                                vVar.f4078r = v0.n((String) a0Var.f4568g);
                                vVar.f4079s = 4096;
                                vVar.J = a0Var.d;
                                vVar.K = a0Var.f4566c;
                                vVar.d = this.f14190c;
                                vVar.f4067f = this.d;
                                this.f14191f.b(new b2.w(vVar));
                                this.f14194j = true;
                            }
                            xVar2.N(0);
                            this.f14191f.d(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f8293a;
                int i13 = xVar.f8294b;
                int i14 = xVar.f8295c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f14195k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f14195k = z10;
                        if (z11) {
                            xVar.N(i13 + 1);
                            this.f14195k = false;
                            xVar2.f8293a[1] = bArr[i13];
                            this.f14193i = 2;
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
    public final void c() {
        this.h = 0;
        this.f14193i = 0;
        this.f14195k = false;
        this.f14198n = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14192g = (String) f0Var.e;
        f0Var.c();
        this.f14191f = qVar.j0(f0Var.f14052c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14198n = j10;
    }

    @Override
    public final void e(boolean z10) {
    }
}
