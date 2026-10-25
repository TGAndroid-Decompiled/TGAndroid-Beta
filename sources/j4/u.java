package j4;

import a8.yb;
import b2.w0;
import c3.j0;
public final class u implements i {
    public final e2.x f15451a;
    public final c3.z f15452b;
    public final String f15453c;
    public final int d;
    public final String e;
    public j0 f15454f;
    public String f15455g;
    public int h = 0;
    public int f15456i;
    public boolean f15457j;
    public boolean f15458k;
    public long f15459l;
    public int f15460m;
    public long f15461n;

    public u(String str, int i10, String str2) {
        e2.x xVar = new e2.x(4);
        this.f15451a = xVar;
        xVar.f9732a[0] = -1;
        this.f15452b = new Object();
        this.f15461n = -9223372036854775807L;
        this.f15453c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override
    public final void a(e2.x xVar) {
        boolean z10;
        boolean z11;
        this.f15454f.getClass();
        while (xVar.a() > 0) {
            int i10 = this.h;
            e2.x xVar2 = this.f15451a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(xVar.a(), this.f15460m - this.f15456i);
                        this.f15454f.d(min, xVar);
                        int i11 = this.f15456i + min;
                        this.f15456i = i11;
                        if (i11 >= this.f15460m) {
                            if (this.f15461n == -9223372036854775807L) {
                                z12 = false;
                            }
                            yb.p(z12);
                            this.f15454f.c(this.f15461n, 1, this.f15460m, 0, null);
                            this.f15461n += this.f15459l;
                            this.f15456i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f15456i);
                    xVar.k(this.f15456i, min2, xVar2.f9732a);
                    int i12 = this.f15456i + min2;
                    this.f15456i = i12;
                    if (i12 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        c3.z zVar = this.f15452b;
                        if (!zVar.a(m10)) {
                            this.f15456i = 0;
                            this.h = 1;
                        } else {
                            this.f15460m = zVar.f6125b;
                            if (!this.f15457j) {
                                this.f15459l = (zVar.f6127f * 1000000) / zVar.f6126c;
                                b2.w wVar = new b2.w();
                                wVar.f3519a = this.f15455g;
                                wVar.f3532q = w0.n(this.e);
                                wVar.f3533r = w0.n((String) zVar.f6128g);
                                wVar.f3534s = 4096;
                                wVar.J = zVar.d;
                                wVar.K = zVar.f6126c;
                                wVar.d = this.f15453c;
                                wVar.f3522f = this.d;
                                this.f15454f.b(new b2.x(wVar));
                                this.f15457j = true;
                            }
                            xVar2.N(0);
                            this.f15454f.d(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f9732a;
                int i13 = xVar.f9733b;
                int i14 = xVar.f9734c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f15458k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f15458k = z10;
                        if (z11) {
                            xVar.N(i13 + 1);
                            this.f15458k = false;
                            xVar2.f9732a[1] = bArr[i13];
                            this.f15456i = 2;
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
        this.f15456i = 0;
        this.f15458k = false;
        this.f15461n = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f15455g = (String) f0Var.e;
        f0Var.c();
        this.f15454f = qVar.F1(f0Var.f15315c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f15461n = j10;
    }

    @Override
    public final void e(boolean z10) {
    }
}
