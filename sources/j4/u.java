package j4;

import b2.r0;
import c3.h0;
public final class u implements i {
    public final e2.v f13958a;
    public final c3.z f13959b;
    public final String f13960c;
    public final int d;
    public final String f13961e;
    public h0 f13962f;
    public String f13963g;
    public int h = 0;
    public int f13964i;
    public boolean f13965j;
    public boolean f13966k;
    public long f13967l;
    public int f13968m;
    public long f13969n;

    public u(String str, int i10, String str2) {
        e2.v vVar = new e2.v(4);
        this.f13958a = vVar;
        vVar.f8584a[0] = -1;
        this.f13959b = new Object();
        this.f13969n = -9223372036854775807L;
        this.f13960c = str;
        this.d = i10;
        this.f13961e = str2;
    }

    @Override
    public final void a(e2.v vVar) {
        boolean z10;
        boolean z11;
        e2.d.h(this.f13962f);
        while (vVar.a() > 0) {
            int i10 = this.h;
            e2.v vVar2 = this.f13958a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(vVar.a(), this.f13968m - this.f13964i);
                        this.f13962f.d(min, vVar);
                        int i11 = this.f13964i + min;
                        this.f13964i = i11;
                        if (i11 >= this.f13968m) {
                            if (this.f13969n == -9223372036854775807L) {
                                z12 = false;
                            }
                            e2.d.g(z12);
                            this.f13962f.c(this.f13969n, 1, this.f13968m, 0, null);
                            this.f13969n += this.f13967l;
                            this.f13964i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(vVar.a(), 4 - this.f13964i);
                    vVar.h(this.f13964i, min2, vVar2.f8584a);
                    int i12 = this.f13964i + min2;
                    this.f13964i = i12;
                    if (i12 >= 4) {
                        vVar2.J(0);
                        int j3 = vVar2.j();
                        c3.z zVar = this.f13959b;
                        if (!zVar.a(j3)) {
                            this.f13964i = 0;
                            this.h = 1;
                        } else {
                            this.f13968m = zVar.f4185b;
                            if (!this.f13965j) {
                                this.f13967l = (zVar.f4188f * 1000000) / zVar.f4186c;
                                b2.r rVar = new b2.r();
                                rVar.f3571a = this.f13963g;
                                rVar.f3584p = r0.n(this.f13961e);
                                rVar.f3585q = r0.n((String) zVar.f4189g);
                                rVar.f3586r = 4096;
                                rVar.I = zVar.d;
                                rVar.J = zVar.f4186c;
                                rVar.d = this.f13960c;
                                rVar.f3575f = this.d;
                                this.f13962f.b(new b2.s(rVar));
                                this.f13965j = true;
                            }
                            vVar2.J(0);
                            this.f13962f.d(4, vVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = vVar.f8584a;
                int i13 = vVar.f8585b;
                int i14 = vVar.f8586c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f13966k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f13966k = z10;
                        if (z11) {
                            vVar.J(i13 + 1);
                            this.f13966k = false;
                            vVar2.f8584a[1] = bArr[i13];
                            this.f13964i = 2;
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
        this.f13964i = 0;
        this.f13966k = false;
        this.f13969n = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13963g = (String) f0Var.f13809e;
        f0Var.c();
        this.f13962f = qVar.f2(f0Var.f13808c, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13969n = j3;
    }

    @Override
    public final void e(boolean z10) {
    }
}
