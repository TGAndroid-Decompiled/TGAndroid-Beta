package j4;

import b2.v0;
import c3.j0;
import v7.u6;
public final class u implements i {
    public final e2.x f14195a;
    public final c3.a0 f14196b;
    public final String f14197c;
    public final int d;
    public final String e;
    public j0 f14198f;
    public String f14199g;
    public int h = 0;
    public int f14200i;
    public boolean f14201j;
    public boolean f14202k;
    public long f14203l;
    public int f14204m;
    public long f14205n;

    public u(String str, int i10, String str2) {
        e2.x xVar = new e2.x(4);
        this.f14195a = xVar;
        xVar.f8294a[0] = -1;
        this.f14196b = new Object();
        this.f14205n = -9223372036854775807L;
        this.f14197c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override
    public final void a(e2.x xVar) {
        boolean z10;
        boolean z11;
        this.f14198f.getClass();
        while (xVar.a() > 0) {
            int i10 = this.h;
            e2.x xVar2 = this.f14195a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(xVar.a(), this.f14204m - this.f14200i);
                        this.f14198f.d(min, xVar);
                        int i11 = this.f14200i + min;
                        this.f14200i = i11;
                        if (i11 >= this.f14204m) {
                            if (this.f14205n == -9223372036854775807L) {
                                z12 = false;
                            }
                            u6.p(z12);
                            this.f14198f.c(this.f14205n, 1, this.f14204m, 0, null);
                            this.f14205n += this.f14203l;
                            this.f14200i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f14200i);
                    xVar.k(this.f14200i, min2, xVar2.f8294a);
                    int i12 = this.f14200i + min2;
                    this.f14200i = i12;
                    if (i12 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        c3.a0 a0Var = this.f14196b;
                        if (!a0Var.a(m10)) {
                            this.f14200i = 0;
                            this.h = 1;
                        } else {
                            this.f14204m = a0Var.f4566b;
                            if (!this.f14201j) {
                                this.f14203l = (a0Var.f4568f * 1000000) / a0Var.f4567c;
                                b2.v vVar = new b2.v();
                                vVar.f4065a = this.f14199g;
                                vVar.f4078q = v0.n(this.e);
                                vVar.f4079r = v0.n((String) a0Var.f4569g);
                                vVar.f4080s = 4096;
                                vVar.J = a0Var.d;
                                vVar.K = a0Var.f4567c;
                                vVar.d = this.f14197c;
                                vVar.f4068f = this.d;
                                this.f14198f.b(new b2.w(vVar));
                                this.f14201j = true;
                            }
                            xVar2.N(0);
                            this.f14198f.d(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f8294a;
                int i13 = xVar.f8295b;
                int i14 = xVar.f8296c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f14202k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f14202k = z10;
                        if (z11) {
                            xVar.N(i13 + 1);
                            this.f14202k = false;
                            xVar2.f8294a[1] = bArr[i13];
                            this.f14200i = 2;
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
        this.f14200i = 0;
        this.f14202k = false;
        this.f14205n = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14199g = (String) f0Var.e;
        f0Var.c();
        this.f14198f = qVar.j0(f0Var.f14059c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14205n = j10;
    }

    @Override
    public final void e(boolean z10) {
    }
}
