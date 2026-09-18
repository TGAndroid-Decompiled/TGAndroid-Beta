package j4;

import b2.r0;
import c3.h0;
public final class u implements i {
    public final e2.v f12820a;
    public final c3.z f12821b;
    public final String f12822c;
    public final int d;
    public final String e;
    public h0 f12823f;
    public String f12824g;
    public int h = 0;
    public int f12825i;
    public boolean f12826j;
    public boolean f12827k;
    public long f12828l;
    public int f12829m;
    public long f12830n;

    public u(String str, int i10, String str2) {
        e2.v vVar = new e2.v(4);
        this.f12820a = vVar;
        vVar.f7933a[0] = -1;
        this.f12821b = new Object();
        this.f12830n = -9223372036854775807L;
        this.f12822c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override
    public final void a(e2.v vVar) {
        boolean z10;
        boolean z11;
        e2.d.h(this.f12823f);
        while (vVar.a() > 0) {
            int i10 = this.h;
            e2.v vVar2 = this.f12820a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(vVar.a(), this.f12829m - this.f12825i);
                        this.f12823f.d(min, vVar);
                        int i11 = this.f12825i + min;
                        this.f12825i = i11;
                        if (i11 >= this.f12829m) {
                            if (this.f12830n == -9223372036854775807L) {
                                z12 = false;
                            }
                            e2.d.g(z12);
                            this.f12823f.c(this.f12830n, 1, this.f12829m, 0, null);
                            this.f12830n += this.f12828l;
                            this.f12825i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(vVar.a(), 4 - this.f12825i);
                    vVar.h(this.f12825i, min2, vVar2.f7933a);
                    int i12 = this.f12825i + min2;
                    this.f12825i = i12;
                    if (i12 >= 4) {
                        vVar2.J(0);
                        int j3 = vVar2.j();
                        c3.z zVar = this.f12821b;
                        if (!zVar.a(j3)) {
                            this.f12825i = 0;
                            this.h = 1;
                        } else {
                            this.f12829m = zVar.f3831b;
                            if (!this.f12826j) {
                                this.f12828l = (zVar.f3833f * 1000000) / zVar.f3832c;
                                b2.r rVar = new b2.r();
                                rVar.f3240a = this.f12824g;
                                rVar.f3252p = r0.n(this.e);
                                rVar.f3253q = r0.n((String) zVar.f3834g);
                                rVar.f3254r = 4096;
                                rVar.I = zVar.d;
                                rVar.J = zVar.f3832c;
                                rVar.d = this.f12822c;
                                rVar.f3243f = this.d;
                                this.f12823f.b(new b2.s(rVar));
                                this.f12826j = true;
                            }
                            vVar2.J(0);
                            this.f12823f.d(4, vVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = vVar.f7933a;
                int i13 = vVar.f7934b;
                int i14 = vVar.f7935c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f12827k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f12827k = z10;
                        if (z11) {
                            vVar.J(i13 + 1);
                            this.f12827k = false;
                            vVar2.f7933a[1] = bArr[i13];
                            this.f12825i = 2;
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
    public final void c() {
        this.h = 0;
        this.f12825i = 0;
        this.f12827k = false;
        this.f12830n = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12824g = f0Var.e;
        f0Var.b();
        this.f12823f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12830n = j3;
    }

    @Override
    public final void e(boolean z10) {
    }
}
