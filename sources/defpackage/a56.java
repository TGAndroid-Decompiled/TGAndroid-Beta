package defpackage;
public final class a56 extends x1 {
    public final y46 a;
    public boolean b;
    public int c;

    public a56(y46 y46Var) {
        this.a = y46Var;
    }

    @Override
    public final boolean b(gk0 gk0Var) {
        if (!(gk0Var instanceof f56)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
        }
        return true;
    }

    @Override
    public final gk0 e() {
        return this.a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final vj2 h(vo3 vo3Var) {
        if (vo3Var.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return vj2.a(vo3Var.b);
    }
}
