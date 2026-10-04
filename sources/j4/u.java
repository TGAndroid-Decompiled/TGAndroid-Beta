package j4;

import b2.r0;
import c3.h0;
public final class u implements i {
    public final e2.v f13921a;
    public final c3.z f13922b;
    public final String f13923c;
    public final int d;
    public final String f13924e;
    public h0 f13925f;
    public String f13926g;
    public int h = 0;
    public int f13927i;
    public boolean f13928j;
    public boolean f13929k;
    public long f13930l;
    public int f13931m;
    public long f13932n;

    public u(String str, int i10, String str2) {
        e2.v vVar = new e2.v(4);
        this.f13921a = vVar;
        vVar.f8590a[0] = -1;
        this.f13922b = new Object();
        this.f13932n = -9223372036854775807L;
        this.f13923c = str;
        this.d = i10;
        this.f13924e = str2;
    }

    @Override
    public final void a(e2.v vVar) {
        boolean z10;
        boolean z11;
        e2.d.h(this.f13925f);
        while (vVar.a() > 0) {
            int i10 = this.h;
            e2.v vVar2 = this.f13921a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(vVar.a(), this.f13931m - this.f13927i);
                        this.f13925f.d(min, vVar);
                        int i11 = this.f13927i + min;
                        this.f13927i = i11;
                        if (i11 >= this.f13931m) {
                            if (this.f13932n == -9223372036854775807L) {
                                z12 = false;
                            }
                            e2.d.g(z12);
                            this.f13925f.c(this.f13932n, 1, this.f13931m, 0, null);
                            this.f13932n += this.f13930l;
                            this.f13927i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(vVar.a(), 4 - this.f13927i);
                    vVar.h(this.f13927i, min2, vVar2.f8590a);
                    int i12 = this.f13927i + min2;
                    this.f13927i = i12;
                    if (i12 >= 4) {
                        vVar2.J(0);
                        int j3 = vVar2.j();
                        c3.z zVar = this.f13922b;
                        if (!zVar.a(j3)) {
                            this.f13927i = 0;
                            this.h = 1;
                        } else {
                            this.f13931m = zVar.f4136b;
                            if (!this.f13928j) {
                                this.f13930l = (zVar.f4139f * 1000000) / zVar.f4137c;
                                b2.r rVar = new b2.r();
                                rVar.f3492a = this.f13926g;
                                rVar.f3505p = r0.n(this.f13924e);
                                rVar.f3506q = r0.n((String) zVar.f4140g);
                                rVar.f3507r = 4096;
                                rVar.I = zVar.d;
                                rVar.J = zVar.f4137c;
                                rVar.d = this.f13923c;
                                rVar.f3496f = this.d;
                                this.f13925f.b(new b2.s(rVar));
                                this.f13928j = true;
                            }
                            vVar2.J(0);
                            this.f13925f.d(4, vVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = vVar.f8590a;
                int i13 = vVar.f8591b;
                int i14 = vVar.f8592c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f13929k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f13929k = z10;
                        if (z11) {
                            vVar.J(i13 + 1);
                            this.f13929k = false;
                            vVar2.f8590a[1] = bArr[i13];
                            this.f13927i = 2;
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
        this.f13927i = 0;
        this.f13929k = false;
        this.f13932n = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13926g = f0Var.f13772e;
        f0Var.b();
        this.f13925f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13932n = j3;
    }

    @Override
    public final void e(boolean z10) {
    }
}
