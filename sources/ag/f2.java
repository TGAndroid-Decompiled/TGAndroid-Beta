package ag;
public final class f2 extends h2 {
    public final int f492f;
    public final e2 f493g;
    public final i2 h;

    public f2(i2 i2Var, e2 e2Var, int i10) {
        this.f492f = i10;
        this.h = i2Var;
        this.f493g = e2Var;
    }

    @Override
    public final void a() {
        switch (this.f492f) {
            case 0:
                w1 w1Var = this.h.h;
                float f9 = w1Var.f700i;
                float f10 = w1Var.f701j;
                this.d = f9;
                this.f528e = f10;
                return;
            default:
                w1 w1Var2 = this.h.h;
                float f11 = w1Var2.d;
                float f12 = w1Var2.f697e;
                this.d = f11;
                this.f528e = f12;
                return;
        }
    }

    @Override
    public final void b(float f9, float f10) {
        switch (this.f492f) {
            case 0:
                w1 w1Var = this.h.h;
                w1Var.f700i = f9;
                w1Var.f701j = f10;
                this.d = f9;
                this.f528e = f10;
                this.f493g.a();
                return;
            default:
                w1 w1Var2 = this.h.h;
                w1Var2.d = f9;
                w1Var2.f697e = f10;
                this.d = f9;
                this.f528e = f10;
                this.f493g.a();
                return;
        }
    }
}
