package j4;

import b2.r0;
import c3.h0;
public final class u implements i {
    public final e2.v f12812a;
    public final c3.z f12813b;
    public final String f12814c;
    public final int d;
    public final String e;
    public h0 f12815f;
    public String f12816g;
    public int h = 0;
    public int f12817i;
    public boolean f12818j;
    public boolean f12819k;
    public long f12820l;
    public int f12821m;
    public long f12822n;

    public u(String str, int i10, String str2) {
        e2.v vVar = new e2.v(4);
        this.f12812a = vVar;
        vVar.f7918a[0] = -1;
        this.f12813b = new Object();
        this.f12822n = -9223372036854775807L;
        this.f12814c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override
    public final void a(e2.v vVar) {
        boolean z10;
        boolean z11;
        e2.d.h(this.f12815f);
        while (vVar.a() > 0) {
            int i10 = this.h;
            e2.v vVar2 = this.f12812a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(vVar.a(), this.f12821m - this.f12817i);
                        this.f12815f.d(min, vVar);
                        int i11 = this.f12817i + min;
                        this.f12817i = i11;
                        if (i11 >= this.f12821m) {
                            if (this.f12822n == -9223372036854775807L) {
                                z12 = false;
                            }
                            e2.d.g(z12);
                            this.f12815f.c(this.f12822n, 1, this.f12821m, 0, null);
                            this.f12822n += this.f12820l;
                            this.f12817i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(vVar.a(), 4 - this.f12817i);
                    vVar.h(this.f12817i, min2, vVar2.f7918a);
                    int i12 = this.f12817i + min2;
                    this.f12817i = i12;
                    if (i12 >= 4) {
                        vVar2.J(0);
                        int j3 = vVar2.j();
                        c3.z zVar = this.f12813b;
                        if (!zVar.a(j3)) {
                            this.f12817i = 0;
                            this.h = 1;
                        } else {
                            this.f12821m = zVar.f3825b;
                            if (!this.f12818j) {
                                this.f12820l = (zVar.f3827f * 1000000) / zVar.f3826c;
                                b2.r rVar = new b2.r();
                                rVar.f3234a = this.f12816g;
                                rVar.f3246p = r0.n(this.e);
                                rVar.f3247q = r0.n((String) zVar.f3828g);
                                rVar.f3248r = 4096;
                                rVar.I = zVar.d;
                                rVar.J = zVar.f3826c;
                                rVar.d = this.f12814c;
                                rVar.f3237f = this.d;
                                this.f12815f.b(new b2.s(rVar));
                                this.f12818j = true;
                            }
                            vVar2.J(0);
                            this.f12815f.d(4, vVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = vVar.f7918a;
                int i13 = vVar.f7919b;
                int i14 = vVar.f7920c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f12819k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f12819k = z10;
                        if (z11) {
                            vVar.J(i13 + 1);
                            this.f12819k = false;
                            vVar2.f7918a[1] = bArr[i13];
                            this.f12817i = 2;
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
        this.f12817i = 0;
        this.f12819k = false;
        this.f12822n = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12816g = f0Var.e;
        f0Var.b();
        this.f12815f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12822n = j3;
    }

    @Override
    public final void e(boolean z10) {
    }
}
