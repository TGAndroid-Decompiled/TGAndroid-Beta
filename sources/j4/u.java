package j4;

import b2.r0;
import c3.h0;
public final class u implements i {
    public final e2.v f12809a;
    public final c3.z f12810b;
    public final String f12811c;
    public final int d;
    public final String e;
    public h0 f12812f;
    public String f12813g;
    public int h = 0;
    public int f12814i;
    public boolean f12815j;
    public boolean f12816k;
    public long f12817l;
    public int f12818m;
    public long f12819n;

    public u(String str, int i10, String str2) {
        e2.v vVar = new e2.v(4);
        this.f12809a = vVar;
        vVar.f7916a[0] = -1;
        this.f12810b = new Object();
        this.f12819n = -9223372036854775807L;
        this.f12811c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override
    public final void a(e2.v vVar) {
        boolean z10;
        boolean z11;
        e2.d.h(this.f12812f);
        while (vVar.a() > 0) {
            int i10 = this.h;
            e2.v vVar2 = this.f12809a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(vVar.a(), this.f12818m - this.f12814i);
                        this.f12812f.d(min, vVar);
                        int i11 = this.f12814i + min;
                        this.f12814i = i11;
                        if (i11 >= this.f12818m) {
                            if (this.f12819n == -9223372036854775807L) {
                                z12 = false;
                            }
                            e2.d.g(z12);
                            this.f12812f.c(this.f12819n, 1, this.f12818m, 0, null);
                            this.f12819n += this.f12817l;
                            this.f12814i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(vVar.a(), 4 - this.f12814i);
                    vVar.h(this.f12814i, min2, vVar2.f7916a);
                    int i12 = this.f12814i + min2;
                    this.f12814i = i12;
                    if (i12 >= 4) {
                        vVar2.J(0);
                        int j3 = vVar2.j();
                        c3.z zVar = this.f12810b;
                        if (!zVar.a(j3)) {
                            this.f12814i = 0;
                            this.h = 1;
                        } else {
                            this.f12818m = zVar.f3823b;
                            if (!this.f12815j) {
                                this.f12817l = (zVar.f3825f * 1000000) / zVar.f3824c;
                                b2.r rVar = new b2.r();
                                rVar.f3232a = this.f12813g;
                                rVar.f3244p = r0.n(this.e);
                                rVar.f3245q = r0.n((String) zVar.f3826g);
                                rVar.f3246r = 4096;
                                rVar.I = zVar.d;
                                rVar.J = zVar.f3824c;
                                rVar.d = this.f12811c;
                                rVar.f3235f = this.d;
                                this.f12812f.b(new b2.s(rVar));
                                this.f12815j = true;
                            }
                            vVar2.J(0);
                            this.f12812f.d(4, vVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = vVar.f7916a;
                int i13 = vVar.f7917b;
                int i14 = vVar.f7918c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f12816k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f12816k = z10;
                        if (z11) {
                            vVar.J(i13 + 1);
                            this.f12816k = false;
                            vVar2.f7916a[1] = bArr[i13];
                            this.f12814i = 2;
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
        this.f12814i = 0;
        this.f12816k = false;
        this.f12819n = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12813g = f0Var.e;
        f0Var.b();
        this.f12812f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12819n = j3;
    }

    @Override
    public final void e(boolean z10) {
    }
}
