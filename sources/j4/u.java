package j4;

import b2.r0;
import c3.h0;
public final class u implements i {
    public final e2.v f13920a;
    public final c3.z f13921b;
    public final String f13922c;
    public final int d;
    public final String f13923e;
    public h0 f13924f;
    public String f13925g;
    public int h = 0;
    public int f13926i;
    public boolean f13927j;
    public boolean f13928k;
    public long f13929l;
    public int f13930m;
    public long f13931n;

    public u(String str, int i10, String str2) {
        e2.v vVar = new e2.v(4);
        this.f13920a = vVar;
        vVar.f8589a[0] = -1;
        this.f13921b = new Object();
        this.f13931n = -9223372036854775807L;
        this.f13922c = str;
        this.d = i10;
        this.f13923e = str2;
    }

    @Override
    public final void a(e2.v vVar) {
        boolean z10;
        boolean z11;
        e2.d.h(this.f13924f);
        while (vVar.a() > 0) {
            int i10 = this.h;
            e2.v vVar2 = this.f13920a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(vVar.a(), this.f13930m - this.f13926i);
                        this.f13924f.d(min, vVar);
                        int i11 = this.f13926i + min;
                        this.f13926i = i11;
                        if (i11 >= this.f13930m) {
                            if (this.f13931n == -9223372036854775807L) {
                                z12 = false;
                            }
                            e2.d.g(z12);
                            this.f13924f.c(this.f13931n, 1, this.f13930m, 0, null);
                            this.f13931n += this.f13929l;
                            this.f13926i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(vVar.a(), 4 - this.f13926i);
                    vVar.h(this.f13926i, min2, vVar2.f8589a);
                    int i12 = this.f13926i + min2;
                    this.f13926i = i12;
                    if (i12 >= 4) {
                        vVar2.J(0);
                        int j3 = vVar2.j();
                        c3.z zVar = this.f13921b;
                        if (!zVar.a(j3)) {
                            this.f13926i = 0;
                            this.h = 1;
                        } else {
                            this.f13930m = zVar.f4135b;
                            if (!this.f13927j) {
                                this.f13929l = (zVar.f4138f * 1000000) / zVar.f4136c;
                                b2.r rVar = new b2.r();
                                rVar.f3492a = this.f13925g;
                                rVar.f3505p = r0.n(this.f13923e);
                                rVar.f3506q = r0.n((String) zVar.f4139g);
                                rVar.f3507r = 4096;
                                rVar.I = zVar.d;
                                rVar.J = zVar.f4136c;
                                rVar.d = this.f13922c;
                                rVar.f3496f = this.d;
                                this.f13924f.b(new b2.s(rVar));
                                this.f13927j = true;
                            }
                            vVar2.J(0);
                            this.f13924f.d(4, vVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = vVar.f8589a;
                int i13 = vVar.f8590b;
                int i14 = vVar.f8591c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f13928k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f13928k = z10;
                        if (z11) {
                            vVar.J(i13 + 1);
                            this.f13928k = false;
                            vVar2.f8589a[1] = bArr[i13];
                            this.f13926i = 2;
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
        this.f13926i = 0;
        this.f13928k = false;
        this.f13931n = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13925g = f0Var.f13771e;
        f0Var.b();
        this.f13924f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13931n = j3;
    }

    @Override
    public final void e(boolean z10) {
    }
}
