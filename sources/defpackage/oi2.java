package defpackage;
public final class oi2 implements ip9 {
    public final ip9 a;
    public final boolean b;
    public boolean c;
    public final pi2 d;

    public oi2(pi2 pi2Var, ip9 ip9Var, boolean z) {
        this.d = pi2Var;
        this.a = ip9Var;
        this.b = z;
    }

    @Override
    public final int a() {
        int a = this.a.a();
        if (this.d.r != Long.MIN_VALUE) {
            a |= 1;
        }
        if (this.b) {
            return (a & (-3)) | 4;
        }
        return a;
    }

    @Override
    public final void b() {
        this.a.b();
    }

    @Override
    public final int h(sk4 sk4Var, z83 z83Var, int i) {
        pi2 pi2Var = this.d;
        if (pi2Var.c()) {
            return -3;
        }
        if (this.c) {
            z83Var.setFlags(4);
            return -4;
        }
        long s = pi2Var.s();
        int h = this.a.h(sk4Var, z83Var, i);
        if (pi2Var.h != -9223372036854775807L && h != -3) {
            pi2Var.h = -9223372036854775807L;
        }
        if (h == -5) {
            long j = pi2Var.n;
            long j2 = pi2Var.r;
            fm4 fm4Var = (fm4) sk4Var.c;
            fm4Var.getClass();
            int i2 = fm4Var.S;
            int i3 = fm4Var.R;
            if (i3 != 0 || i2 != 0) {
                if (j != 0) {
                    i3 = 0;
                }
                if (j2 != Long.MIN_VALUE) {
                    i2 = 0;
                }
                em4 a = fm4Var.a();
                a.Q = i3;
                a.R = i2;
                sk4Var.c = new fm4(a);
            }
            return -5;
        }
        long j3 = pi2Var.r;
        if (j3 != Long.MIN_VALUE && ((h == -4 && z83Var.e >= j3) || (h == -3 && s == Long.MIN_VALUE && !z83Var.d))) {
            z83Var.clear();
            z83Var.setFlags(4);
            this.c = true;
            return -4;
        }
        return h;
    }

    @Override
    public final boolean j() {
        if (!this.d.c() && this.a.j()) {
            return true;
        }
        return false;
    }

    @Override
    public final int n(long j) {
        if (this.d.c()) {
            return -3;
        }
        return this.a.n(j);
    }
}
