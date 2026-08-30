package b4;

import j3.m0;
import j3.n0;
import l3.o0;
public final class u implements i {
    public final h5.w f1518a;
    public final o0 f1519b;
    public final String f1520c;
    public r3.v d;
    public String e;
    public int f1521f = 0;
    public int f1522g;
    public boolean h;
    public boolean f1523i;
    public long f1524j;
    public int f1525k;
    public long f1526l;

    public u(String str) {
        h5.w wVar = new h5.w(4);
        this.f1518a = wVar;
        wVar.f7000a[0] = -1;
        this.f1519b = new Object();
        this.f1526l = -9223372036854775807L;
        this.f1520c = str;
    }

    @Override
    public final void a(h5.w wVar) {
        boolean z4;
        boolean z10;
        h5.a.j(this.d);
        while (wVar.a() > 0) {
            int i10 = this.f1521f;
            h5.w wVar2 = this.f1518a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(wVar.a(), this.f1525k - this.f1522g);
                        this.d.d(min, wVar);
                        int i11 = this.f1522g + min;
                        this.f1522g = i11;
                        int i12 = this.f1525k;
                        if (i11 >= i12) {
                            long j10 = this.f1526l;
                            if (j10 != -9223372036854775807L) {
                                this.d.c(j10, 1, i12, 0, null);
                                this.f1526l += this.f1524j;
                            }
                            this.f1522g = 0;
                            this.f1521f = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(wVar.a(), 4 - this.f1522g);
                    wVar.e(this.f1522g, min2, wVar2.f7000a);
                    int i13 = this.f1522g + min2;
                    this.f1522g = i13;
                    if (i13 >= 4) {
                        wVar2.F(0);
                        int g10 = wVar2.g();
                        o0 o0Var = this.f1519b;
                        if (!o0Var.a(g10)) {
                            this.f1522g = 0;
                            this.f1521f = 1;
                        } else {
                            this.f1525k = o0Var.f11206b;
                            if (!this.h) {
                                int i14 = o0Var.f11207c;
                                this.f1524j = (o0Var.f11208f * 1000000) / i14;
                                m0 m0Var = new m0();
                                m0Var.f8673a = this.e;
                                m0Var.f8684o = (String) o0Var.f11209g;
                                m0Var.f8685p = 4096;
                                m0Var.B = o0Var.d;
                                m0Var.C = i14;
                                m0Var.f8675c = this.f1520c;
                                this.d.b(new n0(m0Var));
                                this.h = true;
                            }
                            wVar2.F(0);
                            this.d.d(4, wVar2);
                            this.f1521f = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = wVar.f7000a;
                int i15 = wVar.f7001b;
                int i16 = wVar.f7002c;
                while (true) {
                    if (i15 < i16) {
                        byte b10 = bArr[i15];
                        if ((b10 & 255) == 255) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (this.f1523i && (b10 & 224) == 224) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f1523i = z4;
                        if (z10) {
                            wVar.F(i15 + 1);
                            this.f1523i = false;
                            wVar2.f7000a[1] = bArr[i15];
                            this.f1522g = 2;
                            this.f1521f = 1;
                            break;
                        }
                        i15++;
                    } else {
                        wVar.F(i16);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public final void b() {
        this.f1521f = 0;
        this.f1522g = 0;
        this.f1523i = false;
        this.f1526l = -9223372036854775807L;
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.e = h0Var.e;
        h0Var.b();
        this.d = mVar.c2(h0Var.d, 1);
    }

    @Override
    public final void e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f1526l = j10;
        }
    }

    @Override
    public final void d() {
    }
}
