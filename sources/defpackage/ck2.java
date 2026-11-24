package defpackage;
public final class ck2 implements jr9 {
    public final jr9 a;
    public final boolean b;
    public boolean c;
    public final dk2 d;

    public ck2(dk2 dk2Var, jr9 jr9Var, boolean z) {
        this.d = dk2Var;
        this.a = jr9Var;
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
    public final void d() {
        this.a.d();
    }

    @Override
    public final boolean i() {
        if (!this.d.d() && this.a.i()) {
            return true;
        }
        return false;
    }

    @Override
    public final int m(long j) {
        if (this.d.d()) {
            return -3;
        }
        return this.a.m(j);
    }

    @Override
    public final int p(mj4 mj4Var, la3 la3Var, int i) {
        dk2 dk2Var = this.d;
        if (dk2Var.d()) {
            return -3;
        }
        if (this.c) {
            la3Var.setFlags(4);
            return -4;
        }
        long s = dk2Var.s();
        int p = this.a.p(mj4Var, la3Var, i);
        if (dk2Var.h != -9223372036854775807L && p != -3) {
            dk2Var.h = -9223372036854775807L;
        }
        if (p == -5) {
            long j = dk2Var.n;
            long j2 = dk2Var.r;
            go4 go4Var = (go4) mj4Var.c;
            go4Var.getClass();
            int i2 = go4Var.S;
            int i3 = go4Var.R;
            if (i3 != 0 || i2 != 0) {
                if (j != 0) {
                    i3 = 0;
                }
                if (j2 != Long.MIN_VALUE) {
                    i2 = 0;
                }
                fo4 a = go4Var.a();
                a.Q = i3;
                a.R = i2;
                mj4Var.c = new go4(a);
            }
            return -5;
        }
        long j3 = dk2Var.r;
        if (j3 != Long.MIN_VALUE && ((p == -4 && la3Var.e >= j3) || (p == -3 && s == Long.MIN_VALUE && !la3Var.d))) {
            la3Var.clear();
            la3Var.setFlags(4);
            this.c = true;
            return -4;
        }
        return p;
    }
}
