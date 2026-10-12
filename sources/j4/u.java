package j4;

import b2.w0;
import c3.i0;
import v7.u6;
public final class u implements i {
    public final e2.x f12779a;
    public final c3.z f12780b;
    public final String f12781c;
    public final int d;
    public final String e;
    public i0 f12782f;
    public String f12783g;
    public int h = 0;
    public int f12784i;
    public boolean f12785j;
    public boolean f12786k;
    public long f12787l;
    public int f12788m;
    public long f12789n;

    public u(String str, int i10, String str2) {
        e2.x xVar = new e2.x(4);
        this.f12779a = xVar;
        xVar.f8411a[0] = -1;
        this.f12780b = new Object();
        this.f12789n = -9223372036854775807L;
        this.f12781c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override
    public final void a(e2.x xVar) {
        boolean z10;
        boolean z11;
        this.f12782f.getClass();
        while (xVar.a() > 0) {
            int i10 = this.h;
            e2.x xVar2 = this.f12779a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(xVar.a(), this.f12788m - this.f12784i);
                        this.f12782f.d(min, xVar);
                        int i11 = this.f12784i + min;
                        this.f12784i = i11;
                        if (i11 >= this.f12788m) {
                            if (this.f12789n == -9223372036854775807L) {
                                z12 = false;
                            }
                            u6.p(z12);
                            this.f12782f.c(this.f12789n, 1, this.f12788m, 0, null);
                            this.f12789n += this.f12787l;
                            this.f12784i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f12784i);
                    xVar.k(this.f12784i, min2, xVar2.f8411a);
                    int i12 = this.f12784i + min2;
                    this.f12784i = i12;
                    if (i12 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        c3.z zVar = this.f12780b;
                        if (!zVar.a(m10)) {
                            this.f12784i = 0;
                            this.h = 1;
                        } else {
                            this.f12788m = zVar.f4312b;
                            if (!this.f12785j) {
                                this.f12787l = (zVar.f4314f * 1000000) / zVar.f4313c;
                                b2.w wVar = new b2.w();
                                wVar.f2452a = this.f12783g;
                                wVar.f2465q = w0.n(this.e);
                                wVar.f2466r = w0.n((String) zVar.f4315g);
                                wVar.f2467s = 4096;
                                wVar.J = zVar.d;
                                wVar.K = zVar.f4313c;
                                wVar.d = this.f12781c;
                                wVar.f2455f = this.d;
                                this.f12782f.b(new b2.x(wVar));
                                this.f12785j = true;
                            }
                            xVar2.N(0);
                            this.f12782f.d(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f8411a;
                int i13 = xVar.f8412b;
                int i14 = xVar.f8413c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f12786k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f12786k = z10;
                        if (z11) {
                            xVar.N(i13 + 1);
                            this.f12786k = false;
                            xVar2.f8411a[1] = bArr[i13];
                            this.f12784i = 2;
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
        this.f12784i = 0;
        this.f12786k = false;
        this.f12789n = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f12783g = (String) f0Var.e;
        f0Var.c();
        this.f12782f = qVar.a0(f0Var.f12643c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f12789n = j10;
    }

    @Override
    public final void e(boolean z10) {
    }
}
