package j4;

import b2.v0;
import c3.j0;
import v7.u6;
public final class u implements i {
    public final e2.x f14193a;
    public final c3.a0 f14194b;
    public final String f14195c;
    public final int d;
    public final String e;
    public j0 f14196f;
    public String f14197g;
    public int h = 0;
    public int f14198i;
    public boolean f14199j;
    public boolean f14200k;
    public long f14201l;
    public int f14202m;
    public long f14203n;

    public u(String str, int i10, String str2) {
        e2.x xVar = new e2.x(4);
        this.f14193a = xVar;
        xVar.f8291a[0] = -1;
        this.f14194b = new Object();
        this.f14203n = -9223372036854775807L;
        this.f14195c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override
    public final void a(e2.x xVar) {
        boolean z10;
        boolean z11;
        this.f14196f.getClass();
        while (xVar.a() > 0) {
            int i10 = this.h;
            e2.x xVar2 = this.f14193a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(xVar.a(), this.f14202m - this.f14198i);
                        this.f14196f.d(min, xVar);
                        int i11 = this.f14198i + min;
                        this.f14198i = i11;
                        if (i11 >= this.f14202m) {
                            if (this.f14203n == -9223372036854775807L) {
                                z12 = false;
                            }
                            u6.p(z12);
                            this.f14196f.c(this.f14203n, 1, this.f14202m, 0, null);
                            this.f14203n += this.f14201l;
                            this.f14198i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f14198i);
                    xVar.k(this.f14198i, min2, xVar2.f8291a);
                    int i12 = this.f14198i + min2;
                    this.f14198i = i12;
                    if (i12 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        c3.a0 a0Var = this.f14194b;
                        if (!a0Var.a(m10)) {
                            this.f14198i = 0;
                            this.h = 1;
                        } else {
                            this.f14202m = a0Var.f4562b;
                            if (!this.f14199j) {
                                this.f14201l = (a0Var.f4564f * 1000000) / a0Var.f4563c;
                                b2.v vVar = new b2.v();
                                vVar.f4061a = this.f14197g;
                                vVar.f4074q = v0.n(this.e);
                                vVar.f4075r = v0.n((String) a0Var.f4565g);
                                vVar.f4076s = 4096;
                                vVar.J = a0Var.d;
                                vVar.K = a0Var.f4563c;
                                vVar.d = this.f14195c;
                                vVar.f4064f = this.d;
                                this.f14196f.b(new b2.w(vVar));
                                this.f14199j = true;
                            }
                            xVar2.N(0);
                            this.f14196f.d(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f8291a;
                int i13 = xVar.f8292b;
                int i14 = xVar.f8293c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f14200k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f14200k = z10;
                        if (z11) {
                            xVar.N(i13 + 1);
                            this.f14200k = false;
                            xVar2.f8291a[1] = bArr[i13];
                            this.f14198i = 2;
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
        this.f14198i = 0;
        this.f14200k = false;
        this.f14203n = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14197g = (String) f0Var.e;
        f0Var.c();
        this.f14196f = qVar.j0(f0Var.f14057c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14203n = j10;
    }

    @Override
    public final void e(boolean z10) {
    }
}
