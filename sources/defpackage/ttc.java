package defpackage;

import java.math.RoundingMode;
public final class ttc implements stc {
    public final u84 a;
    public final yzb b;
    public final tm9 c;
    public final go4 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public ttc(u84 u84Var, yzb yzbVar, tm9 tm9Var, String str, int i) {
        int i2;
        this.a = u84Var;
        this.b = yzbVar;
        this.c = tm9Var;
        int i3 = tm9Var.a;
        int i4 = tm9Var.b;
        int i5 = (tm9Var.d * i3) / 8;
        int i6 = tm9Var.c;
        if (i6 == i5) {
            int i7 = i4 * i5;
            int i8 = i7 << 3;
            int max = Math.max(i5, i7 / 10);
            this.e = max;
            fo4 fo4Var = new fo4();
            fo4Var.r = wf7.n("audio/wav");
            fo4Var.s = wf7.n(str);
            fo4Var.i = i8;
            fo4Var.j = i8;
            fo4Var.t = max;
            fo4Var.M = i3;
            int i9 = tm9Var.e;
            if (i9 == 0) {
                i2 = -1;
            } else {
                i2 = i9 << 2;
            }
            fo4Var.N = i2;
            fo4Var.O = i4;
            fo4Var.P = i;
            this.d = new go4(fo4Var);
            return;
        }
        throw bx7.a("Expected block size: " + i5 + "; got: " + i6, null);
    }

    @Override
    public final boolean a(vb3 vb3Var, long j) {
        int i;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i <= 0 || (i2 = this.g) >= (i3 = this.e)) {
                break;
            }
            int f = this.b.f(vb3Var, (int) Math.min(i3 - i2, j2), true);
            if (f == -1) {
                j2 = 0;
            } else {
                this.g += f;
                j2 -= f;
            }
        }
        tm9 tm9Var = this.c;
        int i4 = tm9Var.c;
        int i5 = this.g / i4;
        if (i5 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = tm9Var.b;
            String str = hac.a;
            int i6 = i5 * i4;
            int i7 = this.g - i6;
            this.b.a(j3 + hac.b0(j4, 1000000L, j5, RoundingMode.DOWN), 1, i6, i7, null);
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
        wtc wtcVar = new wtc(this.c, 1, i, j);
        this.a.f0(wtcVar);
        go4 go4Var = this.d;
        yzb yzbVar = this.b;
        yzbVar.g(go4Var);
        yzbVar.d(wtcVar.e);
    }
}
