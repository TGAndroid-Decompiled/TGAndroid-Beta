package ih;
public final class b8 implements Runnable {
    public final int f11273a;
    public final c8 f11274b;

    public b8(c8 c8Var, int i9) {
        this.f11273a = i9;
        this.f11274b = c8Var;
    }

    @Override
    public final void run() {
        switch (this.f11273a) {
            case 0:
                d8 d8Var = this.f11274b.v;
                d8Var.f11337s = 0;
                d8Var.requestLayout();
                e8 e8Var = d8Var.F;
                e8Var.L(e8Var.getWidth(), e8Var.getHeight());
                e8Var.requestLayout();
                return;
            case 1:
                d8 d8Var2 = this.f11274b.v;
                d8Var2.f11337s = 0;
                d8Var2.requestLayout();
                e8 e8Var2 = d8Var2.F;
                e8Var2.L(e8Var2.getWidth(), e8Var2.getHeight());
                e8Var2.requestLayout();
                return;
            case 2:
                c8 c8Var = this.f11274b;
                c8Var.v.post(new b8(c8Var, 3));
                return;
            default:
                this.f11274b.v.f11339x = true;
                return;
        }
    }
}
