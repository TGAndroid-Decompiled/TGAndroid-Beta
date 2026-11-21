package ki;
public final class d2 extends org.telegram.ui.ActionBar.j {
    public final int f18650a;
    public final s2 f18651b;

    public d2(s2 s2Var, int i7) {
        this.f18650a = i7;
        this.f18651b = s2Var;
    }

    @Override
    public final void b(int i7) {
        int i10 = this.f18650a;
        s2 s2Var = this.f18651b;
        switch (i10) {
            case 0:
                if (i7 == -1) {
                    if (!s2Var.E.D()) {
                        s2Var.v();
                        return;
                    }
                    return;
                } else if (i7 == 2131296494) {
                    s2Var.f18963z0 = true;
                    s2Var.o(true);
                    return;
                } else {
                    return;
                }
            default:
                if (i7 == -1) {
                    s2Var.v();
                    return;
                }
                return;
        }
    }
}
