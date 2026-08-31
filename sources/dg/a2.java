package dg;
public final class a2 extends c2 {
    public final int f4436f;
    public final z1 f4437g;
    public final d2 h;

    public a2(d2 d2Var, z1 z1Var, int i10) {
        this.f4436f = i10;
        this.h = d2Var;
        this.f4437g = z1Var;
    }

    @Override
    public final void a() {
        switch (this.f4436f) {
            case 0:
                r1 r1Var = this.h.h;
                float f10 = r1Var.f4657i;
                float f11 = r1Var.f4658j;
                this.d = f10;
                this.f4477e = f11;
                return;
            default:
                r1 r1Var2 = this.h.h;
                float f12 = r1Var2.d;
                float f13 = r1Var2.f4654e;
                this.d = f12;
                this.f4477e = f13;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f4436f) {
            case 0:
                r1 r1Var = this.h.h;
                r1Var.f4657i = f10;
                r1Var.f4658j = f11;
                this.d = f10;
                this.f4477e = f11;
                this.f4437g.a();
                return;
            default:
                r1 r1Var2 = this.h.h;
                r1Var2.d = f10;
                r1Var2.f4654e = f11;
                this.d = f10;
                this.f4477e = f11;
                this.f4437g.a();
                return;
        }
    }
}
