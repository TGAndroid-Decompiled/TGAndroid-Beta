package j4;

import b2.w0;
import c3.i0;
import v7.u6;
public final class u implements i {
    public final e2.x f12783a;
    public final c3.z f12784b;
    public final String f12785c;
    public final int d;
    public final String e;
    public i0 f12786f;
    public String f12787g;
    public int h = 0;
    public int f12788i;
    public boolean f12789j;
    public boolean f12790k;
    public long f12791l;
    public int f12792m;
    public long f12793n;

    public u(String str, int i10, String str2) {
        e2.x xVar = new e2.x(4);
        this.f12783a = xVar;
        xVar.f8414a[0] = -1;
        this.f12784b = new Object();
        this.f12793n = -9223372036854775807L;
        this.f12785c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override
    public final void a(e2.x xVar) {
        boolean z10;
        boolean z11;
        this.f12786f.getClass();
        while (xVar.a() > 0) {
            int i10 = this.h;
            e2.x xVar2 = this.f12783a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(xVar.a(), this.f12792m - this.f12788i);
                        this.f12786f.d(min, xVar);
                        int i11 = this.f12788i + min;
                        this.f12788i = i11;
                        if (i11 >= this.f12792m) {
                            if (this.f12793n == -9223372036854775807L) {
                                z12 = false;
                            }
                            u6.p(z12);
                            this.f12786f.c(this.f12793n, 1, this.f12792m, 0, null);
                            this.f12793n += this.f12791l;
                            this.f12788i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f12788i);
                    xVar.k(this.f12788i, min2, xVar2.f8414a);
                    int i12 = this.f12788i + min2;
                    this.f12788i = i12;
                    if (i12 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        c3.z zVar = this.f12784b;
                        if (!zVar.a(m10)) {
                            this.f12788i = 0;
                            this.h = 1;
                        } else {
                            this.f12792m = zVar.f4316b;
                            if (!this.f12789j) {
                                this.f12791l = (zVar.f4318f * 1000000) / zVar.f4317c;
                                b2.w wVar = new b2.w();
                                wVar.f2456a = this.f12787g;
                                wVar.f2469q = w0.n(this.e);
                                wVar.f2470r = w0.n((String) zVar.f4319g);
                                wVar.f2471s = 4096;
                                wVar.J = zVar.d;
                                wVar.K = zVar.f4317c;
                                wVar.d = this.f12785c;
                                wVar.f2459f = this.d;
                                this.f12786f.b(new b2.x(wVar));
                                this.f12789j = true;
                            }
                            xVar2.N(0);
                            this.f12786f.d(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f8414a;
                int i13 = xVar.f8415b;
                int i14 = xVar.f8416c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f12790k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f12790k = z10;
                        if (z11) {
                            xVar.N(i13 + 1);
                            this.f12790k = false;
                            xVar2.f8414a[1] = bArr[i13];
                            this.f12788i = 2;
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
        this.f12788i = 0;
        this.f12790k = false;
        this.f12793n = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f12787g = (String) f0Var.e;
        f0Var.c();
        this.f12786f = qVar.W(f0Var.f12647c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f12793n = j10;
    }

    @Override
    public final void e(boolean z10) {
    }
}
