package j4;

import b2.r0;
import c3.h0;
public final class u implements i {
    public final e2.v f12819a;
    public final c3.z f12820b;
    public final String f12821c;
    public final int d;
    public final String e;
    public h0 f12822f;
    public String f12823g;
    public int h = 0;
    public int f12824i;
    public boolean f12825j;
    public boolean f12826k;
    public long f12827l;
    public int f12828m;
    public long f12829n;

    public u(String str, int i10, String str2) {
        e2.v vVar = new e2.v(4);
        this.f12819a = vVar;
        vVar.f7931a[0] = -1;
        this.f12820b = new Object();
        this.f12829n = -9223372036854775807L;
        this.f12821c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override
    public final void a(e2.v vVar) {
        boolean z10;
        boolean z11;
        e2.d.h(this.f12822f);
        while (vVar.a() > 0) {
            int i10 = this.h;
            e2.v vVar2 = this.f12819a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(vVar.a(), this.f12828m - this.f12824i);
                        this.f12822f.d(min, vVar);
                        int i11 = this.f12824i + min;
                        this.f12824i = i11;
                        if (i11 >= this.f12828m) {
                            if (this.f12829n == -9223372036854775807L) {
                                z12 = false;
                            }
                            e2.d.g(z12);
                            this.f12822f.c(this.f12829n, 1, this.f12828m, 0, null);
                            this.f12829n += this.f12827l;
                            this.f12824i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(vVar.a(), 4 - this.f12824i);
                    vVar.h(this.f12824i, min2, vVar2.f7931a);
                    int i12 = this.f12824i + min2;
                    this.f12824i = i12;
                    if (i12 >= 4) {
                        vVar2.J(0);
                        int j3 = vVar2.j();
                        c3.z zVar = this.f12820b;
                        if (!zVar.a(j3)) {
                            this.f12824i = 0;
                            this.h = 1;
                        } else {
                            this.f12828m = zVar.f3828b;
                            if (!this.f12825j) {
                                this.f12827l = (zVar.f3830f * 1000000) / zVar.f3829c;
                                b2.r rVar = new b2.r();
                                rVar.f3237a = this.f12823g;
                                rVar.f3249p = r0.n(this.e);
                                rVar.f3250q = r0.n((String) zVar.f3831g);
                                rVar.f3251r = 4096;
                                rVar.I = zVar.d;
                                rVar.J = zVar.f3829c;
                                rVar.d = this.f12821c;
                                rVar.f3240f = this.d;
                                this.f12822f.b(new b2.s(rVar));
                                this.f12825j = true;
                            }
                            vVar2.J(0);
                            this.f12822f.d(4, vVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = vVar.f7931a;
                int i13 = vVar.f7932b;
                int i14 = vVar.f7933c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f12826k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f12826k = z10;
                        if (z11) {
                            vVar.J(i13 + 1);
                            this.f12826k = false;
                            vVar2.f7931a[1] = bArr[i13];
                            this.f12824i = 2;
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
        this.f12824i = 0;
        this.f12826k = false;
        this.f12829n = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12823g = f0Var.e;
        f0Var.b();
        this.f12822f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12829n = j3;
    }

    @Override
    public final void e(boolean z10) {
    }
}
