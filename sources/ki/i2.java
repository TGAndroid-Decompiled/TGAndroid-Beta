package ki;
public final class i2 extends org.telegram.ui.ActionBar.j {
    public final int f18363a;
    public final x2 f18364b;

    public i2(x2 x2Var, int i7) {
        this.f18363a = i7;
        this.f18364b = x2Var;
    }

    @Override
    public final void b(int i7) {
        int i10 = this.f18363a;
        x2 x2Var = this.f18364b;
        switch (i10) {
            case 0:
                if (i7 == -1) {
                    if (!x2Var.E.D()) {
                        x2Var.v();
                        return;
                    }
                    return;
                } else if (i7 == 2131296492) {
                    x2Var.f18687z0 = true;
                    x2Var.o(true);
                    return;
                } else {
                    return;
                }
            default:
                if (i7 == -1) {
                    x2Var.v();
                    return;
                }
                return;
        }
    }
}
