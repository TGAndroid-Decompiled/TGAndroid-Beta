package j4;

import b2.r0;
import c3.h0;
public final class u implements i {
    public final e2.v f13444a;
    public final c3.z f13445b;
    public final String f13446c;
    public final int d;
    public final String f13447e;
    public h0 f13448f;
    public String f13449g;
    public int h = 0;
    public int f13450i;
    public boolean f13451j;
    public boolean f13452k;
    public long f13453l;
    public int f13454m;
    public long f13455n;

    public u(String str, int i10, String str2) {
        e2.v vVar = new e2.v(4);
        this.f13444a = vVar;
        vVar.f8789a[0] = -1;
        this.f13445b = new Object();
        this.f13455n = -9223372036854775807L;
        this.f13446c = str;
        this.d = i10;
        this.f13447e = str2;
    }

    @Override
    public final void b(e2.v vVar) {
        boolean z10;
        boolean z11;
        e2.d.h(this.f13448f);
        while (vVar.a() > 0) {
            int i10 = this.h;
            e2.v vVar2 = this.f13444a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(vVar.a(), this.f13454m - this.f13450i);
                        this.f13448f.d(min, vVar);
                        int i11 = this.f13450i + min;
                        this.f13450i = i11;
                        if (i11 >= this.f13454m) {
                            if (this.f13455n == -9223372036854775807L) {
                                z12 = false;
                            }
                            e2.d.g(z12);
                            this.f13448f.c(this.f13455n, 1, this.f13454m, 0, null);
                            this.f13455n += this.f13453l;
                            this.f13450i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(vVar.a(), 4 - this.f13450i);
                    vVar.h(this.f13450i, min2, vVar2.f8789a);
                    int i12 = this.f13450i + min2;
                    this.f13450i = i12;
                    if (i12 >= 4) {
                        vVar2.J(0);
                        int j3 = vVar2.j();
                        c3.z zVar = this.f13445b;
                        if (!zVar.a(j3)) {
                            this.f13450i = 0;
                            this.h = 1;
                        } else {
                            this.f13454m = zVar.f4329b;
                            if (!this.f13451j) {
                                this.f13453l = (zVar.f4332f * 1000000) / zVar.f4330c;
                                b2.r rVar = new b2.r();
                                rVar.f2298a = this.f13449g;
                                rVar.f2311p = r0.n(this.f13447e);
                                rVar.f2312q = r0.n((String) zVar.f4333g);
                                rVar.f2313r = 4096;
                                rVar.I = zVar.d;
                                rVar.J = zVar.f4330c;
                                rVar.d = this.f13446c;
                                rVar.f2302f = this.d;
                                this.f13448f.b(new b2.s(rVar));
                                this.f13451j = true;
                            }
                            vVar2.J(0);
                            this.f13448f.d(4, vVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = vVar.f8789a;
                int i13 = vVar.f8790b;
                int i14 = vVar.f8791c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f13452k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f13452k = z10;
                        if (z11) {
                            vVar.J(i13 + 1);
                            this.f13452k = false;
                            vVar2.f8789a[1] = bArr[i13];
                            this.f13450i = 2;
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
        this.f13450i = 0;
        this.f13452k = false;
        this.f13455n = -9223372036854775807L;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13449g = f0Var.f13295e;
        f0Var.b();
        this.f13448f = qVar.R1(f0Var.d, 1);
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13455n = j3;
    }

    @Override
    public final void f(boolean z10) {
    }
}
