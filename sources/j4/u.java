package j4;

import b2.r0;
import c3.h0;
public final class u implements i {
    public final e2.v f13957a;
    public final c3.z f13958b;
    public final String f13959c;
    public final int d;
    public final String f13960e;
    public h0 f13961f;
    public String f13962g;
    public int h = 0;
    public int f13963i;
    public boolean f13964j;
    public boolean f13965k;
    public long f13966l;
    public int f13967m;
    public long f13968n;

    public u(String str, int i10, String str2) {
        e2.v vVar = new e2.v(4);
        this.f13957a = vVar;
        vVar.f8583a[0] = -1;
        this.f13958b = new Object();
        this.f13968n = -9223372036854775807L;
        this.f13959c = str;
        this.d = i10;
        this.f13960e = str2;
    }

    @Override
    public final void b(e2.v vVar) {
        boolean z10;
        boolean z11;
        e2.d.h(this.f13961f);
        while (vVar.a() > 0) {
            int i10 = this.h;
            e2.v vVar2 = this.f13957a;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(vVar.a(), this.f13967m - this.f13963i);
                        this.f13961f.d(min, vVar);
                        int i11 = this.f13963i + min;
                        this.f13963i = i11;
                        if (i11 >= this.f13967m) {
                            if (this.f13968n == -9223372036854775807L) {
                                z12 = false;
                            }
                            e2.d.g(z12);
                            this.f13961f.c(this.f13968n, 1, this.f13967m, 0, null);
                            this.f13968n += this.f13966l;
                            this.f13963i = 0;
                            this.h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(vVar.a(), 4 - this.f13963i);
                    vVar.h(this.f13963i, min2, vVar2.f8583a);
                    int i12 = this.f13963i + min2;
                    this.f13963i = i12;
                    if (i12 >= 4) {
                        vVar2.J(0);
                        int j3 = vVar2.j();
                        c3.z zVar = this.f13958b;
                        if (!zVar.a(j3)) {
                            this.f13963i = 0;
                            this.h = 1;
                        } else {
                            this.f13967m = zVar.f4185b;
                            if (!this.f13964j) {
                                this.f13966l = (zVar.f4188f * 1000000) / zVar.f4186c;
                                b2.r rVar = new b2.r();
                                rVar.f3571a = this.f13962g;
                                rVar.f3584p = r0.n(this.f13960e);
                                rVar.f3585q = r0.n((String) zVar.f4189g);
                                rVar.f3586r = 4096;
                                rVar.I = zVar.d;
                                rVar.J = zVar.f4186c;
                                rVar.d = this.f13959c;
                                rVar.f3575f = this.d;
                                this.f13961f.b(new b2.s(rVar));
                                this.f13964j = true;
                            }
                            vVar2.J(0);
                            this.f13961f.d(4, vVar2);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = vVar.f8583a;
                int i13 = vVar.f8584b;
                int i14 = vVar.f8585c;
                while (true) {
                    if (i13 < i14) {
                        byte b10 = bArr[i13];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f13965k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f13965k = z10;
                        if (z11) {
                            vVar.J(i13 + 1);
                            this.f13965k = false;
                            vVar2.f8583a[1] = bArr[i13];
                            this.f13963i = 2;
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
        this.f13963i = 0;
        this.f13965k = false;
        this.f13968n = -9223372036854775807L;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13962g = (String) f0Var.f13808e;
        f0Var.c();
        this.f13961f = qVar.f2(f0Var.f13807c, 1);
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13968n = j3;
    }

    @Override
    public final void f(boolean z10) {
    }
}
