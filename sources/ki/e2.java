package ki;
public final class e2 extends org.telegram.ui.ActionBar.j {
    public final int f18643a;
    public final t2 f18644b;

    public e2(t2 t2Var, int i7) {
        this.f18643a = i7;
        this.f18644b = t2Var;
    }

    @Override
    public final void b(int i7) {
        int i10 = this.f18643a;
        t2 t2Var = this.f18644b;
        switch (i10) {
            case 0:
                if (i7 == -1) {
                    if (!t2Var.E.D()) {
                        t2Var.v();
                        return;
                    }
                    return;
                } else if (i7 == 2131296492) {
                    t2Var.f18956z0 = true;
                    t2Var.o(true);
                    return;
                } else {
                    return;
                }
            default:
                if (i7 == -1) {
                    t2Var.v();
                    return;
                }
                return;
        }
    }
}
