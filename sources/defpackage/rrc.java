package defpackage;

import java.math.RoundingMode;
public final class rrc implements qrc {
    public final l74 a;
    public final wxb b;
    public final sk9 c;
    public final fm4 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public rrc(l74 l74Var, wxb wxbVar, sk9 sk9Var, String str, int i) {
        int i2;
        this.a = l74Var;
        this.b = wxbVar;
        this.c = sk9Var;
        int i3 = sk9Var.a;
        int i4 = sk9Var.b;
        int i5 = (sk9Var.d * i3) / 8;
        int i6 = sk9Var.c;
        if (i6 == i5) {
            int i7 = i4 * i5;
            int i8 = i7 << 3;
            int max = Math.max(i5, i7 / 10);
            this.e = max;
            em4 em4Var = new em4();
            em4Var.r = ud7.n("audio/wav");
            em4Var.s = ud7.n(str);
            em4Var.i = i8;
            em4Var.j = i8;
            em4Var.t = max;
            em4Var.M = i3;
            int i9 = sk9Var.e;
            if (i9 == 0) {
                i2 = -1;
            } else {
                i2 = i9 << 2;
            }
            em4Var.N = i2;
            em4Var.O = i4;
            em4Var.P = i;
            this.d = new fm4(em4Var);
            return;
        }
        throw av7.a("Expected block size: " + i5 + "; got: " + i6, null);
    }

    @Override
    public final boolean a(ja3 ja3Var, long j) {
        int i;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i <= 0 || (i2 = this.g) >= (i3 = this.e)) {
                break;
            }
            int f = this.b.f(ja3Var, (int) Math.min(i3 - i2, j2), true);
            if (f == -1) {
                j2 = 0;
            } else {
                this.g += f;
                j2 -= f;
            }
        }
        sk9 sk9Var = this.c;
        int i4 = sk9Var.c;
        int i5 = this.g / i4;
        if (i5 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = sk9Var.b;
            String str = g8c.a;
            int i6 = i5 * i4;
            int i7 = this.g - i6;
            this.b.a(j3 + g8c.b0(j4, 1000000L, j5, RoundingMode.DOWN), 1, i6, i7, null);
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
        urc urcVar = new urc(this.c, 1, i, j);
        this.a.f0(urcVar);
        fm4 fm4Var = this.d;
        wxb wxbVar = this.b;
        wxbVar.g(fm4Var);
        wxbVar.d(urcVar.e);
    }
}
