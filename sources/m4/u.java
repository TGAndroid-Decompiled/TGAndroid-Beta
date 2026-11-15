package m4;

import a8.ja;
import e2.s0;
import f3.i0;
public final class u implements i {
    public final h2.x f20402a;
    public final f3.z f20403b;
    public final String f20404c;
    public final int d;
    public final String f20405e;
    public i0 f20406f;
    public String f20407g;
    public int h = 0;
    public int f20408i;
    public boolean f20409j;
    public boolean f20410k;
    public long f20411l;
    public int f20412m;
    public long f20413n;

    public u(String str, int i7, String str2) {
        h2.x xVar = new h2.x(4);
        this.f20402a = xVar;
        xVar.f13521a[0] = -1;
        this.f20403b = new Object();
        this.f20413n = -9223372036854775807L;
        this.f20404c = str;
        this.d = i7;
        this.f20405e = str2;
    }

    @Override
    public final void c(h2.x xVar) {
        boolean z10;
        boolean z11;
        this.f20406f.getClass();
        while (xVar.a() > 0) {
            int i7 = this.h;
            h2.x xVar2 = this.f20402a;
            boolean z12 = true;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(xVar.a(), this.f20412m - this.f20408i);
                        this.f20406f.b(min, xVar);
                        int i10 = this.f20408i + min;
                        this.f20408i = i10;
                        if (i10 >= this.f20412m) {
                            if (this.f20413n == -9223372036854775807L) {
                                z12 = false;
                            }
                            ja.p(z12);
                            this.f20406f.c(this.f20413n, 1, this.f20412m, 0, null);
                            this.f20413n += this.f20411l;
                            this.f20408i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f20408i);
                    xVar.k(this.f20408i, min2, xVar2.f13521a);
                    int i11 = this.f20408i + min2;
                    this.f20408i = i11;
                    if (i11 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        f3.z zVar = this.f20403b;
                        if (!zVar.a(m10)) {
                            this.f20408i = 0;
                            this.h = 1;
                        } else {
                            this.f20412m = zVar.f10912b;
                            if (!this.f20409j) {
                                this.f20411l = (zVar.f10915f * 1000000) / zVar.f10913c;
                                e2.t tVar = new e2.t();
                                tVar.f10384a = this.f20407g;
                                tVar.f10398q = s0.n(this.f20405e);
                                tVar.f10399r = s0.n((String) zVar.f10916g);
                                tVar.f10400s = 4096;
                                tVar.J = zVar.d;
                                tVar.K = zVar.f10913c;
                                tVar.d = this.f20404c;
                                tVar.f10388f = this.d;
                                this.f20406f.g(new e2.u(tVar));
                                this.f20409j = true;
                            }
                            xVar2.N(0);
                            this.f20406f.b(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f13521a;
                int i12 = xVar.f13522b;
                int i13 = xVar.f13523c;
                while (true) {
                    if (i12 < i13) {
                        byte b10 = bArr[i12];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f20410k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f20410k = z10;
                        if (z11) {
                            xVar.N(i12 + 1);
                            this.f20410k = false;
                            xVar2.f13521a[1] = bArr[i12];
                            this.f20408i = 2;
                            this.h = 1;
                            break;
                        }
                        i12++;
                    } else {
                        xVar.N(i13);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public final void d() {
        this.h = 0;
        this.f20408i = 0;
        this.f20410k = false;
        this.f20413n = -9223372036854775807L;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20413n = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20407g = (String) f0Var.f20253e;
        f0Var.c();
        this.f20406f = qVar.d2(f0Var.f20252c, 1);
    }

    @Override
    public final void e(boolean z10) {
    }
}
