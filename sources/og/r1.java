package og;
public final class r1 extends t1 {
    public final int f14469f;
    public final q1 f14470g;
    public final u1 h;

    public r1(u1 u1Var, q1 q1Var, int i10) {
        this.f14469f = i10;
        this.h = u1Var;
        this.f14470g = q1Var;
    }

    @Override
    public final void a() {
        switch (this.f14469f) {
            case 0:
                k1 k1Var = this.h.h;
                float f7 = k1Var.f14410i;
                float f10 = k1Var.f14411j;
                this.d = f7;
                this.e = f10;
                return;
            default:
                k1 k1Var2 = this.h.h;
                float f11 = k1Var2.d;
                float f12 = k1Var2.e;
                this.d = f11;
                this.e = f12;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f14469f) {
            case 0:
                k1 k1Var = this.h.h;
                k1Var.f14410i = f7;
                k1Var.f14411j = f10;
                this.d = f7;
                this.e = f10;
                this.f14470g.a();
                return;
            default:
                k1 k1Var2 = this.h.h;
                k1Var2.d = f7;
                k1Var2.e = f10;
                this.d = f7;
                this.e = f10;
                this.f14470g.a();
                return;
        }
    }
}
