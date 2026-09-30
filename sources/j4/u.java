package j4;

import b2.r0;
import c3.h0;
public final class u implements i {
    public final e2.v f12824a;
    public final c3.z f12825b;
    public final String f12826c;
    public final int d;
    public final String e;
    public h0 f12827f;
    public String f12828g;
    public int h = 0;
    public int f12829i;
    public boolean f12830j;
    public boolean f12831k;
    public long f12832l;
    public int f12833m;
    public long f12834n;

    public u(String str, int i10, String str2) {
        e2.v vVar = new e2.v(4);
        this.f12824a = vVar;
        vVar.f7928a[0] = -1;
        this.f12825b = new Object();
        this.f12834n = -9223372036854775807L;
        this.f12826c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override
    public final void a(e2.v vVar) {
        boolean z10;
        boolean z11;
        e2.d.h(this.f12827f);
        while (vVar.a() > 0) {
            int i10 = this.h;
            e2.v vVar2 = this.f12824a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(vVar.a(), this.f12833m - this.f12829i);
                        this.f12827f.d(min, vVar);
                        int i11 = this.f12829i + min;
                        this.f12829i = i11;
                        if (i11 >= this.f12833m) {
                            if (this.f12834n == -9223372036854775807L) {
                                z12 = false;
                            }
                            e2.d.g(z12);
                            this.f12827f.c(this.f12834n, 1, this.f12833m, 0, null);
                            this.f12834n += this.f12832l;
                            this.f12829i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(vVar.a(), 4 - this.f12829i);
                    vVar.h(this.f12829i, min2, vVar2.f7928a);
                    int i12 = this.f12829i + min2;
                    this.f12829i = i12;
                    if (i12 >= 4) {
                        vVar2.J(0);
                        int j3 = vVar2.j();
                        c3.z zVar = this.f12825b;
                        if (!zVar.a(j3)) {
                            this.f12829i = 0;
                            this.h = 1;
                        } else {
                            this.f12833m = zVar.f3830b;
                            if (!this.f12830j) {
                                this.f12832l = (zVar.f3832f * 1000000) / zVar.f3831c;
                                b2.r rVar = new b2.r();
                                rVar.f3239a = this.f12828g;
                                rVar.f3251p = r0.n(this.e);
                                rVar.f3252q = r0.n((String) zVar.f3833g);
                                rVar.f3253r = 4096;
                                rVar.I = zVar.d;
                                rVar.J = zVar.f3831c;
                                rVar.d = this.f12826c;
                                rVar.f3242f = this.d;
                                this.f12827f.b(new b2.s(rVar));
                                this.f12830j = true;
                            }
                            vVar2.J(0);
                            this.f12827f.d(4, vVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = vVar.f7928a;
                int i13 = vVar.f7929b;
                int i14 = vVar.f7930c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f12831k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f12831k = z10;
                        if (z11) {
                            vVar.J(i13 + 1);
                            this.f12831k = false;
                            vVar2.f7928a[1] = bArr[i13];
                            this.f12829i = 2;
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
        this.f12829i = 0;
        this.f12831k = false;
        this.f12834n = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12828g = f0Var.e;
        f0Var.b();
        this.f12827f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12834n = j3;
    }

    @Override
    public final void e(boolean z10) {
    }
}
