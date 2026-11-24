package defpackage;
public final class dh2 implements ip9 {
    public final eh2 a;
    public final gp9 b;
    public final int c;
    public boolean d;
    public final eh2 e;

    public dh2(eh2 eh2Var, eh2 eh2Var2, gp9 gp9Var, int i) {
        this.e = eh2Var;
        this.a = eh2Var2;
        this.b = gp9Var;
        this.c = i;
    }

    @Override
    public final int a() {
        return 0;
    }

    public final void c() {
        if (!this.d) {
            eh2 eh2Var = this.e;
            kp kpVar = eh2Var.h;
            int[] iArr = eh2Var.b;
            int i = this.c;
            kpVar.i(iArr[i], eh2Var.c[i], 0, null, eh2Var.K);
            this.d = true;
        }
    }

    @Override
    public final int h(sk4 sk4Var, z83 z83Var, int i) {
        eh2 eh2Var = this.e;
        if (!eh2Var.y()) {
            og0 og0Var = eh2Var.M;
            gp9 gp9Var = this.b;
            if (og0Var != null && og0Var.e(this.c + 1) <= gp9Var.v()) {
                return -3;
            }
            c();
            return gp9Var.F(sk4Var, z83Var, i, eh2Var.S);
        }
        return -3;
    }

    @Override
    public final boolean j() {
        eh2 eh2Var = this.e;
        if (!eh2Var.y() && this.b.A(eh2Var.S)) {
            return true;
        }
        return false;
    }

    @Override
    public final int n(long j) {
        eh2 eh2Var = this.e;
        if (eh2Var.y()) {
            return 0;
        }
        boolean z = eh2Var.S;
        gp9 gp9Var = this.b;
        int x = gp9Var.x(j, z);
        og0 og0Var = eh2Var.M;
        if (og0Var != null) {
            x = Math.min(x, og0Var.e(this.c + 1) - gp9Var.v());
        }
        gp9Var.L(x);
        if (x > 0) {
            c();
        }
        return x;
    }

    @Override
    public final void b() {
    }
}
