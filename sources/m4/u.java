package m4;

import a8.ia;
import e2.s0;
import f3.j0;
public final class u implements i {
    public final h2.x f19808a;
    public final f3.a0 f19809b;
    public final String f19810c;
    public final int d;
    public final String f19811e;
    public j0 f19812f;
    public String f19813g;
    public int h = 0;
    public int f19814i;
    public boolean f19815j;
    public boolean f19816k;
    public long f19817l;
    public int f19818m;
    public long f19819n;

    public u(String str, int i7, String str2) {
        h2.x xVar = new h2.x(4);
        this.f19808a = xVar;
        xVar.f14162a[0] = -1;
        this.f19809b = new Object();
        this.f19819n = -9223372036854775807L;
        this.f19810c = str;
        this.d = i7;
        this.f19811e = str2;
    }

    @Override
    public final void c(h2.x xVar) {
        boolean z9;
        boolean z10;
        this.f19812f.getClass();
        while (xVar.a() > 0) {
            int i7 = this.h;
            h2.x xVar2 = this.f19808a;
            boolean z11 = true;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(xVar.a(), this.f19818m - this.f19814i);
                        this.f19812f.b(min, xVar);
                        int i10 = this.f19814i + min;
                        this.f19814i = i10;
                        if (i10 >= this.f19818m) {
                            if (this.f19819n == -9223372036854775807L) {
                                z11 = false;
                            }
                            ia.p(z11);
                            this.f19812f.c(this.f19819n, 1, this.f19818m, 0, null);
                            this.f19819n += this.f19817l;
                            this.f19814i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f19814i);
                    xVar.k(this.f19814i, min2, xVar2.f14162a);
                    int i11 = this.f19814i + min2;
                    this.f19814i = i11;
                    if (i11 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        f3.a0 a0Var = this.f19809b;
                        if (!a0Var.a(m10)) {
                            this.f19814i = 0;
                            this.h = 1;
                        } else {
                            this.f19818m = a0Var.f10965b;
                            if (!this.f19815j) {
                                this.f19817l = (a0Var.f10968f * 1000000) / a0Var.f10966c;
                                e2.t tVar = new e2.t();
                                tVar.f10548a = this.f19813g;
                                tVar.f10562q = s0.n(this.f19811e);
                                tVar.f10563r = s0.n((String) a0Var.f10969g);
                                tVar.f10564s = 4096;
                                tVar.J = a0Var.d;
                                tVar.K = a0Var.f10966c;
                                tVar.d = this.f19810c;
                                tVar.f10552f = this.d;
                                this.f19812f.g(new e2.u(tVar));
                                this.f19815j = true;
                            }
                            xVar2.N(0);
                            this.f19812f.b(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f14162a;
                int i12 = xVar.f14163b;
                int i13 = xVar.f14164c;
                while (true) {
                    if (i12 < i13) {
                        byte b10 = bArr[i12];
                        if ((b10 & 255) == 255) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (this.f19816k && (b10 & 224) == 224) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f19816k = z9;
                        if (z10) {
                            xVar.N(i12 + 1);
                            this.f19816k = false;
                            xVar2.f14162a[1] = bArr[i12];
                            this.f19814i = 2;
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
        this.f19814i = 0;
        this.f19816k = false;
        this.f19819n = -9223372036854775807L;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19819n = j3;
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f19813g = (String) g0Var.f19674e;
        g0Var.c();
        this.f19812f = qVar.O1(g0Var.f19673c, 1);
    }

    @Override
    public final void e(boolean z9) {
    }
}
