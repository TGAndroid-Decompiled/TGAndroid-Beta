package ih;
public final class u3 implements Runnable {
    public final int f12182a;
    public final b4 f12183b;

    public u3(b4 b4Var, int i9) {
        this.f12182a = i9;
        this.f12183b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f12182a) {
            case 0:
                ((d9) this.f12183b.f11268l.M1).g(false);
                return;
            case 1:
                i4 i4Var = this.f12183b.f11268l;
                c4 c4Var = i4Var.M1;
                if (c4Var != null) {
                    m9 m9Var = ((d9) c4Var).d;
                    m9Var.V0 = false;
                    m9Var.P();
                }
                i4Var.f1(false);
                i4Var.f11541d3 = true;
                i4Var.G0.D(true);
                return;
            case 2:
                i4 i4Var2 = this.f12183b.f11268l;
                i4Var2.Q3 = true;
                i4Var2.setActive(false);
                return;
            default:
                i4 i4Var3 = this.f12183b.f11268l;
                i4Var3.Q3 = true;
                i4Var3.setActive(false);
                return;
        }
    }
}
