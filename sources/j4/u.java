package j4;

import b2.r0;
import c3.h0;
public final class u implements i {
    public final e2.v f12821a;
    public final c3.z f12822b;
    public final String f12823c;
    public final int d;
    public final String e;
    public h0 f12824f;
    public String f12825g;
    public int h = 0;
    public int f12826i;
    public boolean f12827j;
    public boolean f12828k;
    public long f12829l;
    public int f12830m;
    public long f12831n;

    public u(String str, int i10, String str2) {
        e2.v vVar = new e2.v(4);
        this.f12821a = vVar;
        vVar.f7933a[0] = -1;
        this.f12822b = new Object();
        this.f12831n = -9223372036854775807L;
        this.f12823c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override
    public final void b(e2.v vVar) {
        boolean z10;
        boolean z11;
        e2.d.h(this.f12824f);
        while (vVar.a() > 0) {
            int i10 = this.h;
            e2.v vVar2 = this.f12821a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(vVar.a(), this.f12830m - this.f12826i);
                        this.f12824f.d(min, vVar);
                        int i11 = this.f12826i + min;
                        this.f12826i = i11;
                        if (i11 >= this.f12830m) {
                            if (this.f12831n == -9223372036854775807L) {
                                z12 = false;
                            }
                            e2.d.g(z12);
                            this.f12824f.c(this.f12831n, 1, this.f12830m, 0, null);
                            this.f12831n += this.f12829l;
                            this.f12826i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(vVar.a(), 4 - this.f12826i);
                    vVar.h(this.f12826i, min2, vVar2.f7933a);
                    int i12 = this.f12826i + min2;
                    this.f12826i = i12;
                    if (i12 >= 4) {
                        vVar2.J(0);
                        int j3 = vVar2.j();
                        c3.z zVar = this.f12822b;
                        if (!zVar.a(j3)) {
                            this.f12826i = 0;
                            this.h = 1;
                        } else {
                            this.f12830m = zVar.f3830b;
                            if (!this.f12827j) {
                                this.f12829l = (zVar.f3832f * 1000000) / zVar.f3831c;
                                b2.r rVar = new b2.r();
                                rVar.f3239a = this.f12825g;
                                rVar.f3251p = r0.n(this.e);
                                rVar.f3252q = r0.n((String) zVar.f3833g);
                                rVar.f3253r = 4096;
                                rVar.I = zVar.d;
                                rVar.J = zVar.f3831c;
                                rVar.d = this.f12823c;
                                rVar.f3242f = this.d;
                                this.f12824f.b(new b2.s(rVar));
                                this.f12827j = true;
                            }
                            vVar2.J(0);
                            this.f12824f.d(4, vVar2);
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
                        if (this.f12828k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f12828k = z10;
                        if (z11) {
                            vVar.J(i13 + 1);
                            this.f12828k = false;
                            vVar2.f7933a[1] = bArr[i13];
                            this.f12826i = 2;
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
    public final void d() {
        this.h = 0;
        this.f12826i = 0;
        this.f12828k = false;
        this.f12831n = -9223372036854775807L;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12825g = f0Var.e;
        f0Var.b();
        this.f12824f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void g(int i10, long j3) {
        this.f12831n = j3;
    }

    @Override
    public final void f(boolean z10) {
    }
}
