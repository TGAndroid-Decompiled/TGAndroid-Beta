package m4;

import a8.ia;
import e2.s0;
import f3.j0;
public final class u implements i {
    public final h2.x f19813a;
    public final f3.a0 f19814b;
    public final String f19815c;
    public final int d;
    public final String f19816e;
    public j0 f19817f;
    public String f19818g;
    public int h = 0;
    public int f19819i;
    public boolean f19820j;
    public boolean f19821k;
    public long f19822l;
    public int f19823m;
    public long f19824n;

    public u(String str, int i7, String str2) {
        h2.x xVar = new h2.x(4);
        this.f19813a = xVar;
        xVar.f14164a[0] = -1;
        this.f19814b = new Object();
        this.f19824n = -9223372036854775807L;
        this.f19815c = str;
        this.d = i7;
        this.f19816e = str2;
    }

    @Override
    public final void c(h2.x xVar) {
        boolean z9;
        boolean z10;
        this.f19817f.getClass();
        while (xVar.a() > 0) {
            int i7 = this.h;
            h2.x xVar2 = this.f19813a;
            boolean z11 = true;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(xVar.a(), this.f19823m - this.f19819i);
                        this.f19817f.b(min, xVar);
                        int i10 = this.f19819i + min;
                        this.f19819i = i10;
                        if (i10 >= this.f19823m) {
                            if (this.f19824n == -9223372036854775807L) {
                                z11 = false;
                            }
                            ia.p(z11);
                            this.f19817f.c(this.f19824n, 1, this.f19823m, 0, null);
                            this.f19824n += this.f19822l;
                            this.f19819i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(xVar.a(), 4 - this.f19819i);
                    xVar.k(this.f19819i, min2, xVar2.f14164a);
                    int i11 = this.f19819i + min2;
                    this.f19819i = i11;
                    if (i11 >= 4) {
                        xVar2.N(0);
                        int m10 = xVar2.m();
                        f3.a0 a0Var = this.f19814b;
                        if (!a0Var.a(m10)) {
                            this.f19819i = 0;
                            this.h = 1;
                        } else {
                            this.f19823m = a0Var.f10970b;
                            if (!this.f19820j) {
                                this.f19822l = (a0Var.f10973f * 1000000) / a0Var.f10971c;
                                e2.t tVar = new e2.t();
                                tVar.f10553a = this.f19818g;
                                tVar.f10567q = s0.n(this.f19816e);
                                tVar.f10568r = s0.n((String) a0Var.f10974g);
                                tVar.f10569s = 4096;
                                tVar.J = a0Var.d;
                                tVar.K = a0Var.f10971c;
                                tVar.d = this.f19815c;
                                tVar.f10557f = this.d;
                                this.f19817f.g(new e2.u(tVar));
                                this.f19820j = true;
                            }
                            xVar2.N(0);
                            this.f19817f.b(4, xVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xVar.f14164a;
                int i12 = xVar.f14165b;
                int i13 = xVar.f14166c;
                while (true) {
                    if (i12 < i13) {
                        byte b10 = bArr[i12];
                        if ((b10 & 255) == 255) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (this.f19821k && (b10 & 224) == 224) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f19821k = z9;
                        if (z10) {
                            xVar.N(i12 + 1);
                            this.f19821k = false;
                            xVar2.f14164a[1] = bArr[i12];
                            this.f19819i = 2;
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
        this.f19819i = 0;
        this.f19821k = false;
        this.f19824n = -9223372036854775807L;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19824n = j3;
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f19818g = (String) g0Var.f19679e;
        g0Var.c();
        this.f19817f = qVar.O1(g0Var.f19678c, 1);
    }

    @Override
    public final void e(boolean z9) {
    }
}
