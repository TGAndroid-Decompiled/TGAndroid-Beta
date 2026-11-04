package o4;
public final class e implements Runnable {
    public final int f20616a;
    public final e0 f20617b;
    public final v f20618c;

    public e(e0 e0Var, v vVar, int i3) {
        this.f20616a = i3;
        this.f20617b = e0Var;
        this.f20618c = vVar;
    }

    @Override
    public final void run() {
        switch (this.f20616a) {
            case 0:
                e0 e0Var = this.f20617b;
                if (!e0Var.j()) {
                    if (e0Var.f20639x) {
                        v vVar = this.f20618c;
                        if (!e0.k(vVar)) {
                            if (e0Var.i(vVar)) {
                                e0Var.f20639x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    e0Var.f20622e.getClass();
                    return;
                }
                return;
            case 1:
                this.f20617b.f20624g.Q0(this.f20618c, Integer.MIN_VALUE, 1, h1.S0(new n9.j(8)));
                return;
            case 2:
                this.f20617b.f20624g.Q0(this.f20618c, Integer.MIN_VALUE, 9, h1.S0(new n9.j(17)));
                return;
            case 3:
                this.f20617b.f20624g.Q0(this.f20618c, Integer.MIN_VALUE, 7, h1.S0(new n9.j(13)));
                return;
            case 4:
                this.f20617b.f20624g.Q0(this.f20618c, Integer.MIN_VALUE, 12, h1.S0(new n9.j(16)));
                return;
            case 5:
                this.f20617b.f20624g.Q0(this.f20618c, Integer.MIN_VALUE, 11, h1.S0(new n9.j(12)));
                return;
            case 6:
                this.f20617b.f20624g.Q0(this.f20618c, Integer.MIN_VALUE, 3, h1.S0(new n9.j(23)));
                return;
            case 7:
                this.f20617b.f20624g.Q0(this.f20618c, Integer.MIN_VALUE, 1, h1.S0(new n9.j(8)));
                return;
            case 8:
                this.f20617b.f20624g.O0(this.f20618c, Integer.MIN_VALUE);
                return;
            default:
                this.f20617b.f20624g.O0(this.f20618c, Integer.MIN_VALUE);
                return;
        }
    }
}
