package b4;

import j3.m0;
import j3.n0;
import l3.o0;
public final class u implements i {
    public final h5.w f1640a;
    public final o0 f1641b;
    public final String f1642c;
    public r3.v d;
    public String f1643e;
    public int f1644f = 0;
    public int f1645g;
    public boolean h;
    public boolean f1646i;
    public long f1647j;
    public int f1648k;
    public long f1649l;

    public u(String str) {
        h5.w wVar = new h5.w(4);
        this.f1640a = wVar;
        wVar.f7308a[0] = -1;
        this.f1641b = new Object();
        this.f1649l = -9223372036854775807L;
        this.f1642c = str;
    }

    @Override
    public final void a(h5.w wVar) {
        boolean z4;
        boolean z10;
        h5.a.j(this.d);
        while (wVar.a() > 0) {
            int i10 = this.f1644f;
            h5.w wVar2 = this.f1640a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(wVar.a(), this.f1648k - this.f1645g);
                        this.d.d(min, wVar);
                        int i11 = this.f1645g + min;
                        this.f1645g = i11;
                        int i12 = this.f1648k;
                        if (i11 >= i12) {
                            long j10 = this.f1649l;
                            if (j10 != -9223372036854775807L) {
                                this.d.c(j10, 1, i12, 0, null);
                                this.f1649l += this.f1647j;
                            }
                            this.f1645g = 0;
                            this.f1644f = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(wVar.a(), 4 - this.f1645g);
                    wVar.e(this.f1645g, min2, wVar2.f7308a);
                    int i13 = this.f1645g + min2;
                    this.f1645g = i13;
                    if (i13 >= 4) {
                        wVar2.F(0);
                        int g10 = wVar2.g();
                        o0 o0Var = this.f1641b;
                        if (!o0Var.a(g10)) {
                            this.f1645g = 0;
                            this.f1644f = 1;
                        } else {
                            this.f1648k = o0Var.f11572b;
                            if (!this.h) {
                                int i14 = o0Var.f11573c;
                                this.f1647j = (o0Var.f11575f * 1000000) / i14;
                                m0 m0Var = new m0();
                                m0Var.f9253a = this.f1643e;
                                m0Var.f9265o = (String) o0Var.f11576g;
                                m0Var.f9266p = 4096;
                                m0Var.B = o0Var.d;
                                m0Var.C = i14;
                                m0Var.f9255c = this.f1642c;
                                this.d.b(new n0(m0Var));
                                this.h = true;
                            }
                            wVar2.F(0);
                            this.d.d(4, wVar2);
                            this.f1644f = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = wVar.f7308a;
                int i15 = wVar.f7309b;
                int i16 = wVar.f7310c;
                while (true) {
                    if (i15 < i16) {
                        byte b10 = bArr[i15];
                        if ((b10 & 255) == 255) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (this.f1646i && (b10 & 224) == 224) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f1646i = z4;
                        if (z10) {
                            wVar.F(i15 + 1);
                            this.f1646i = false;
                            wVar2.f7308a[1] = bArr[i15];
                            this.f1645g = 2;
                            this.f1644f = 1;
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
        this.f1644f = 0;
        this.f1645g = 0;
        this.f1646i = false;
        this.f1649l = -9223372036854775807L;
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f1643e = h0Var.f1514e;
        h0Var.b();
        this.d = mVar.i2(h0Var.d, 1);
    }

    @Override
    public final void e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f1649l = j10;
        }
    }

    @Override
    public final void d() {
    }
}
