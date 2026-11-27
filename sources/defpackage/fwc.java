package defpackage;

import java.math.RoundingMode;
public final class fwc implements ewc {
    public final g84 a;
    public final x1c b;
    public final go9 c;
    public final ko4 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public fwc(g84 g84Var, x1c x1cVar, go9 go9Var, String str, int i) {
        int i2;
        this.a = g84Var;
        this.b = x1cVar;
        this.c = go9Var;
        int i3 = go9Var.a;
        int i4 = go9Var.b;
        int i5 = (go9Var.d * i3) / 8;
        int i6 = go9Var.c;
        if (i6 == i5) {
            int i7 = i4 * i5;
            int i8 = i7 << 3;
            int max = Math.max(i5, i7 / 10);
            this.e = max;
            jo4 jo4Var = new jo4();
            jo4Var.r = dg7.n("audio/wav");
            jo4Var.s = dg7.n(str);
            jo4Var.i = i8;
            jo4Var.j = i8;
            jo4Var.t = max;
            jo4Var.M = i3;
            int i9 = go9Var.e;
            if (i9 == 0) {
                i2 = -1;
            } else {
                i2 = i9 << 2;
            }
            jo4Var.N = i2;
            jo4Var.O = i4;
            jo4Var.P = i;
            this.d = new ko4(jo4Var);
            return;
        }
        throw hy7.a("Expected block size: " + i5 + "; got: " + i6, null);
    }

    @Override
    public final boolean a(cb3 cb3Var, long j) {
        int i;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i <= 0 || (i2 = this.g) >= (i3 = this.e)) {
                break;
            }
            int f = this.b.f(cb3Var, (int) Math.min(i3 - i2, j2), true);
            if (f == -1) {
                j2 = 0;
            } else {
                this.g += f;
                j2 -= f;
            }
        }
        go9 go9Var = this.c;
        int i4 = go9Var.c;
        int i5 = this.g / i4;
        if (i5 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = go9Var.b;
            String str = gcc.a;
            int i6 = i5 * i4;
            int i7 = this.g - i6;
            this.b.a(j3 + gcc.b0(j4, 1000000L, j5, RoundingMode.DOWN), 1, i6, i7, null);
            this.h += i5;
            this.g = i7;
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override
    public final void c(int i, long j) {
        iwc iwcVar = new iwc(this.c, 1, i, j);
        this.a.m0(iwcVar);
        ko4 ko4Var = this.d;
        x1c x1cVar = this.b;
        x1cVar.g(ko4Var);
        x1cVar.d(iwcVar.e);
    }
}
