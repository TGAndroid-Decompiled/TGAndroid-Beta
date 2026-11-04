package l4;

import b8.zb;
import d2.u0;
import e3.i0;
public final class u implements i {
    public final g2.y f17972a;
    public final e3.z f17973b;
    public final String f17974c;
    public final int d;
    public final String f17975e;
    public i0 f17976f;
    public String f17977g;
    public int h = 0;
    public int f17978i;
    public boolean f17979j;
    public boolean f17980k;
    public long f17981l;
    public int f17982m;
    public long f17983n;

    public u(String str, int i3, String str2) {
        g2.y yVar = new g2.y(4);
        this.f17972a = yVar;
        yVar.f11923a[0] = -1;
        this.f17973b = new Object();
        this.f17983n = -9223372036854775807L;
        this.f17974c = str;
        this.d = i3;
        this.f17975e = str2;
    }

    @Override
    public final void a() {
        this.h = 0;
        this.f17978i = 0;
        this.f17980k = false;
        this.f17983n = -9223372036854775807L;
    }

    @Override
    public final void c(g2.y yVar) {
        boolean z10;
        boolean z11;
        this.f17976f.getClass();
        while (yVar.a() > 0) {
            int i3 = this.h;
            g2.y yVar2 = this.f17972a;
            boolean z12 = true;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        int min = Math.min(yVar.a(), this.f17982m - this.f17978i);
                        this.f17976f.e(min, yVar);
                        int i10 = this.f17978i + min;
                        this.f17978i = i10;
                        if (i10 >= this.f17982m) {
                            if (this.f17983n == -9223372036854775807L) {
                                z12 = false;
                            }
                            zb.p(z12);
                            this.f17976f.d(this.f17983n, 1, this.f17982m, 0, null);
                            this.f17983n += this.f17981l;
                            this.f17978i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(yVar.a(), 4 - this.f17978i);
                    yVar.k(this.f17978i, min2, yVar2.f11923a);
                    int i11 = this.f17978i + min2;
                    this.f17978i = i11;
                    if (i11 >= 4) {
                        yVar2.N(0);
                        int m10 = yVar2.m();
                        e3.z zVar = this.f17973b;
                        if (!zVar.a(m10)) {
                            this.f17978i = 0;
                            this.h = 1;
                        } else {
                            this.f17982m = zVar.f9541b;
                            if (!this.f17979j) {
                                this.f17981l = (zVar.f9544f * 1000000) / zVar.f9542c;
                                d2.u uVar = new d2.u();
                                uVar.f8416a = this.f17977g;
                                uVar.f8430q = u0.n(this.f17975e);
                                uVar.f8431r = u0.n((String) zVar.f9545g);
                                uVar.f8432s = 4096;
                                uVar.J = zVar.d;
                                uVar.K = zVar.f9542c;
                                uVar.d = this.f17974c;
                                uVar.f8420f = this.d;
                                this.f17976f.g(new d2.v(uVar));
                                this.f17979j = true;
                            }
                            yVar2.N(0);
                            this.f17976f.e(4, yVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = yVar.f11923a;
                int i12 = yVar.f11924b;
                int i13 = yVar.f11925c;
                while (true) {
                    if (i12 < i13) {
                        byte b10 = bArr[i12];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f17980k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f17980k = z10;
                        if (z11) {
                            yVar.N(i12 + 1);
                            this.f17980k = false;
                            yVar2.f11923a[1] = bArr[i12];
                            this.f17978i = 2;
                            this.h = 1;
                            break;
                        }
                        i12++;
                    } else {
                        yVar.N(i13);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public final void e(int i3, long j10) {
        this.f17983n = j10;
    }

    @Override
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f17977g = (String) f0Var.f17823e;
        f0Var.c();
        this.f17976f = qVar.i0(f0Var.f17822c, 1);
    }

    @Override
    public final void d(boolean z10) {
    }
}
