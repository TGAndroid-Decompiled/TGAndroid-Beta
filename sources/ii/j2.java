package ii;
public final class j2 extends org.telegram.ui.ActionBar.j {
    public final int f15024a;
    public final a3 f15025b;

    public j2(a3 a3Var, int i3) {
        this.f15024a = i3;
        this.f15025b = a3Var;
    }

    @Override
    public final void b(int i3) {
        int i10 = this.f15024a;
        a3 a3Var = this.f15025b;
        switch (i10) {
            case 0:
                if (i3 == -1) {
                    if (!a3Var.E.C()) {
                        a3Var.v();
                        return;
                    }
                    return;
                } else if (i3 == 2131296492) {
                    a3Var.f14828z0 = true;
                    a3Var.o(true);
                    return;
                } else {
                    return;
                }
            default:
                if (i3 == -1) {
                    a3Var.v();
                    return;
                }
                return;
        }
    }
}
