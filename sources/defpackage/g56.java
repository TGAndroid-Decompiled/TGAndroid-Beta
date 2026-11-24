package defpackage;
public final class g56 extends x1 {
    public final f56 a = new tg6();
    public final int b;
    public boolean c;

    public g56(int i) {
        this.b = i;
    }

    @Override
    public final boolean b(gk0 gk0Var) {
        if (this.c) {
            gk0 gk0Var2 = (gk0) ((tg6) this.a.b);
            return true;
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
        boolean z = false;
        if (vo3Var.h) {
            if (((tg6) this.a.c) != null) {
                gk0 e = vo3Var.h().e();
                this.c = ((e instanceof tu7) || (e instanceof f56)) ? true : true;
                return vj2.a(vo3Var.e);
            }
            return null;
        }
        int i = vo3Var.g;
        int i2 = this.b;
        if (i >= i2) {
            return new vj2(-1, vo3Var.c + i2, false);
        }
        return null;
    }
}
