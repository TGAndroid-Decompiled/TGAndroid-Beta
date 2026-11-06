package hi;
public final class k2 extends org.telegram.ui.ActionBar.j {
    public final int f14762a;
    public final a3 f14763b;

    public k2(a3 a3Var, int i7) {
        this.f14762a = i7;
        this.f14763b = a3Var;
    }

    @Override
    public final void b(int i7) {
        int i10 = this.f14762a;
        a3 a3Var = this.f14763b;
        switch (i10) {
            case 0:
                if (i7 == -1) {
                    if (!a3Var.D.D()) {
                        a3Var.v();
                        return;
                    }
                    return;
                } else if (i7 == 2131296492) {
                    a3Var.f14544y0 = true;
                    a3Var.o(true);
                    return;
                } else {
                    return;
                }
            default:
                if (i7 == -1) {
                    a3Var.v();
                    return;
                }
                return;
        }
    }
}
