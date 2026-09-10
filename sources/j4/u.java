package j4;

import b2.r0;
public final class u implements i {
    public final e2.v f11716a;
    public final c3.z f11717b;
    public final String f11718c;
    public final int d;
    public final String e;
    public c3.h0 f11719f;
    public String f11720g;
    public int h = 0;
    public int f11721i;
    public boolean f11722j;
    public boolean f11723k;
    public long f11724l;
    public int f11725m;
    public long f11726n;

    public u(String str, int i10, String str2) {
        e2.v vVar = new e2.v(4);
        this.f11716a = vVar;
        vVar.f7234a[0] = -1;
        this.f11717b = new Object();
        this.f11726n = -9223372036854775807L;
        this.f11718c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override
    public final void a(e2.v vVar) {
        boolean z10;
        boolean z11;
        e2.d.h(this.f11719f);
        while (vVar.a() > 0) {
            int i10 = this.h;
            e2.v vVar2 = this.f11716a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(vVar.a(), this.f11725m - this.f11721i);
                        this.f11719f.d(min, vVar);
                        int i11 = this.f11721i + min;
                        this.f11721i = i11;
                        if (i11 >= this.f11725m) {
                            if (this.f11726n == -9223372036854775807L) {
                                z12 = false;
                            }
                            e2.d.g(z12);
                            this.f11719f.c(this.f11726n, 1, this.f11725m, 0, null);
                            this.f11726n += this.f11724l;
                            this.f11721i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(vVar.a(), 4 - this.f11721i);
                    vVar.h(this.f11721i, min2, vVar2.f7234a);
                    int i12 = this.f11721i + min2;
                    this.f11721i = i12;
                    if (i12 >= 4) {
                        vVar2.J(0);
                        int j3 = vVar2.j();
                        c3.z zVar = this.f11717b;
                        if (!zVar.a(j3)) {
                            this.f11721i = 0;
                            this.h = 1;
                        } else {
                            this.f11725m = zVar.f4245b;
                            if (!this.f11722j) {
                                this.f11724l = (zVar.f4247f * 1000000) / zVar.f4246c;
                                b2.r rVar = new b2.r();
                                rVar.f1933a = this.f11720g;
                                rVar.f1945p = r0.n(this.e);
                                rVar.f1946q = r0.n((String) zVar.f4248g);
                                rVar.f1947r = 4096;
                                rVar.I = zVar.d;
                                rVar.J = zVar.f4246c;
                                rVar.d = this.f11718c;
                                rVar.f1936f = this.d;
                                this.f11719f.b(new b2.s(rVar));
                                this.f11722j = true;
                            }
                            vVar2.J(0);
                            this.f11719f.d(4, vVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = vVar.f7234a;
                int i13 = vVar.f7235b;
                int i14 = vVar.f7236c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f11723k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f11723k = z10;
                        if (z11) {
                            vVar.J(i13 + 1);
                            this.f11723k = false;
                            vVar2.f7234a[1] = bArr[i13];
                            this.f11721i = 2;
                            this.h = 1;
                            break;
                        }
                        i13++;
                    } else {
                        vVar.J(i14);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public final void b() {
        this.h = 0;
        this.f11721i = 0;
        this.f11723k = false;
        this.f11726n = -9223372036854775807L;
    }

    @Override
    public final void c(c3.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f11720g = g0Var.e;
        g0Var.b();
        this.f11719f = qVar.I(g0Var.d, 1);
    }

    @Override
    public final void e(int i10, long j3) {
        this.f11726n = j3;
    }

    @Override
    public final void d(boolean z10) {
    }
}
