package j4;

import b2.r0;
import c3.h0;
public final class u implements i {
    public final e2.v f13470a;
    public final c3.z f13471b;
    public final String f13472c;
    public final int d;
    public final String f13473e;
    public h0 f13474f;
    public String f13475g;
    public int h = 0;
    public int f13476i;
    public boolean f13477j;
    public boolean f13478k;
    public long f13479l;
    public int f13480m;
    public long f13481n;

    public u(String str, int i10, String str2) {
        e2.v vVar = new e2.v(4);
        this.f13470a = vVar;
        vVar.f8817a[0] = -1;
        this.f13471b = new Object();
        this.f13481n = -9223372036854775807L;
        this.f13472c = str;
        this.d = i10;
        this.f13473e = str2;
    }

    @Override
    public final void b(e2.v vVar) {
        boolean z10;
        boolean z11;
        e2.d.h(this.f13474f);
        while (vVar.a() > 0) {
            int i10 = this.h;
            e2.v vVar2 = this.f13470a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(vVar.a(), this.f13480m - this.f13476i);
                        this.f13474f.d(min, vVar);
                        int i11 = this.f13476i + min;
                        this.f13476i = i11;
                        if (i11 >= this.f13480m) {
                            if (this.f13481n == -9223372036854775807L) {
                                z12 = false;
                            }
                            e2.d.g(z12);
                            this.f13474f.c(this.f13481n, 1, this.f13480m, 0, null);
                            this.f13481n += this.f13479l;
                            this.f13476i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(vVar.a(), 4 - this.f13476i);
                    vVar.h(this.f13476i, min2, vVar2.f8817a);
                    int i12 = this.f13476i + min2;
                    this.f13476i = i12;
                    if (i12 >= 4) {
                        vVar2.J(0);
                        int j3 = vVar2.j();
                        c3.z zVar = this.f13471b;
                        if (!zVar.a(j3)) {
                            this.f13476i = 0;
                            this.h = 1;
                        } else {
                            this.f13480m = zVar.f4356b;
                            if (!this.f13477j) {
                                this.f13479l = (zVar.f4359f * 1000000) / zVar.f4357c;
                                b2.r rVar = new b2.r();
                                rVar.f2325a = this.f13475g;
                                rVar.f2338p = r0.n(this.f13473e);
                                rVar.f2339q = r0.n((String) zVar.f4360g);
                                rVar.f2340r = 4096;
                                rVar.I = zVar.d;
                                rVar.J = zVar.f4357c;
                                rVar.d = this.f13472c;
                                rVar.f2329f = this.d;
                                this.f13474f.b(new b2.s(rVar));
                                this.f13477j = true;
                            }
                            vVar2.J(0);
                            this.f13474f.d(4, vVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = vVar.f8817a;
                int i13 = vVar.f8818b;
                int i14 = vVar.f8819c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f13478k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f13478k = z10;
                        if (z11) {
                            vVar.J(i13 + 1);
                            this.f13478k = false;
                            vVar2.f8817a[1] = bArr[i13];
                            this.f13476i = 2;
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
        this.f13476i = 0;
        this.f13478k = false;
        this.f13481n = -9223372036854775807L;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13475g = f0Var.f13321e;
        f0Var.b();
        this.f13474f = qVar.R1(f0Var.d, 1);
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13481n = j3;
    }

    @Override
    public final void f(boolean z10) {
    }
}
