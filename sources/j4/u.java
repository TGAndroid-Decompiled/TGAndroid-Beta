package j4;

import b2.v0;
import c3.l0;
import v7.u6;
public final class u implements i {
    public final e2.x f14238a;
    public final c3.c0 f14239b;
    public final String f14240c;
    public final int d;
    public final String e;
    public l0 f14241f;
    public String f14242g;
    public int h = 0;
    public int f14243i;
    public boolean f14244j;
    public boolean f14245k;
    public long f14246l;
    public int f14247m;
    public long f14248n;

    public u(String str, int i10, String str2) {
        e2.x xVar = new e2.x(4);
        this.f14238a = xVar;
        xVar.f8298a[0] = -1;
        this.f14239b = new Object();
        this.f14248n = -9223372036854775807L;
        this.f14240c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override
    public final void a(e2.x xVar) {
        boolean z10;
        boolean z11;
        this.f14241f.getClass();
        while (xVar.a() > 0) {
            int i10 = this.h;
            e2.x xVar2 = this.f14238a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(xVar.a(), this.f14247m - this.f14243i);
                        this.f14241f.d(min, xVar);
                        int i11 = this.f14243i + min;
                        this.f14243i = i11;
                        if (i11 >= this.f14247m) {
                            if (this.f14248n == -9223372036854775807L) {
                                z12 = false;
                            }
                            u6.p(z12);
                            this.f14241f.c(this.f14248n, 1, this.f14247m, 0, null);
                            this.f14248n += this.f14246l;
                            this.f14243i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f14243i);
                    xVar.k(this.f14243i, min2, xVar2.f8298a);
                    int i12 = this.f14243i + min2;
                    this.f14243i = i12;
                    if (i12 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        c3.c0 c0Var = this.f14239b;
                        if (!c0Var.a(m10)) {
                            this.f14243i = 0;
                            this.h = 1;
                        } else {
                            this.f14247m = c0Var.f4596b;
                            if (!this.f14244j) {
                                this.f14246l = (c0Var.f4598f * 1000000) / c0Var.f4597c;
                                b2.v vVar = new b2.v();
                                vVar.f4068a = this.f14242g;
                                vVar.f4081q = v0.n(this.e);
                                vVar.f4082r = v0.n((String) c0Var.f4599g);
                                vVar.f4083s = 4096;
                                vVar.J = c0Var.d;
                                vVar.K = c0Var.f4597c;
                                vVar.d = this.f14240c;
                                vVar.f4071f = this.d;
                                this.f14241f.b(new b2.w(vVar));
                                this.f14244j = true;
                            }
                            xVar2.N(0);
                            this.f14241f.d(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f8298a;
                int i13 = xVar.f8299b;
                int i14 = xVar.f8300c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f14245k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f14245k = z10;
                        if (z11) {
                            xVar.N(i13 + 1);
                            this.f14245k = false;
                            xVar2.f8298a[1] = bArr[i13];
                            this.f14243i = 2;
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
        this.f14243i = 0;
        this.f14245k = false;
        this.f14248n = -9223372036854775807L;
    }

    @Override
    public final void d(c3.s sVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14242g = (String) f0Var.e;
        f0Var.c();
        this.f14241f = sVar.j0(f0Var.f14102c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14248n = j10;
    }

    @Override
    public final void e(boolean z10) {
    }
}
