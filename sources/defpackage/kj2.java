package defpackage;
public final class kj2 implements at9 {
    public final at9 a;
    public final boolean b;
    public boolean c;
    public final lj2 d;

    public kj2(lj2 lj2Var, at9 at9Var, boolean z) {
        this.d = lj2Var;
        this.a = at9Var;
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
    public final void g() {
        this.a.g();
    }

    @Override
    public final int i(ym4 ym4Var, s93 s93Var, int i) {
        lj2 lj2Var = this.d;
        if (lj2Var.b()) {
            return -3;
        }
        if (this.c) {
            s93Var.setFlags(4);
            return -4;
        }
        long t = lj2Var.t();
        int i2 = this.a.i(ym4Var, s93Var, i);
        if (lj2Var.h != -9223372036854775807L && i2 != -3) {
            lj2Var.h = -9223372036854775807L;
        }
        if (i2 == -5) {
            long j = lj2Var.n;
            long j2 = lj2Var.r;
            ko4 ko4Var = (ko4) ym4Var.c;
            ko4Var.getClass();
            int i3 = ko4Var.S;
            int i4 = ko4Var.R;
            if (i4 != 0 || i3 != 0) {
                if (j != 0) {
                    i4 = 0;
                }
                if (j2 != Long.MIN_VALUE) {
                    i3 = 0;
                }
                jo4 a = ko4Var.a();
                a.Q = i4;
                a.R = i3;
                ym4Var.c = new ko4(a);
            }
            return -5;
        }
        long j3 = lj2Var.r;
        if (j3 != Long.MIN_VALUE && ((i2 == -4 && s93Var.e >= j3) || (i2 == -3 && t == Long.MIN_VALUE && !s93Var.d))) {
            s93Var.clear();
            s93Var.setFlags(4);
            this.c = true;
            return -4;
        }
        return i2;
    }

    @Override
    public final boolean k() {
        if (!this.d.b() && this.a.k()) {
            return true;
        }
        return false;
    }

    @Override
    public final int o(long j) {
        if (this.d.b()) {
            return -3;
        }
        return this.a.o(j);
    }
}
