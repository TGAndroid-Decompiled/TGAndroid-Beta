package m4;
public final class e implements Runnable {
    public final int f15151a;
    public final e0 f15152b;
    public final v f15153c;

    public e(e0 e0Var, v vVar, int i10) {
        this.f15151a = i10;
        this.f15152b = e0Var;
        this.f15153c = vVar;
    }

    @Override
    public final void run() {
        switch (this.f15151a) {
            case 0:
                e0 e0Var = this.f15152b;
                if (!e0Var.j()) {
                    if (e0Var.f15173x) {
                        v vVar = this.f15153c;
                        if (!e0.k(vVar)) {
                            if (e0Var.i(vVar)) {
                                e0Var.f15173x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    e0Var.e.getClass();
                    return;
                }
                return;
            case 1:
                this.f15152b.f15158g.O0(this.f15153c, Integer.MIN_VALUE, 1, i1.Q0(new k2.y0(15)));
                return;
            case 2:
                this.f15152b.f15158g.O0(this.f15153c, Integer.MIN_VALUE, 9, i1.Q0(new k2.y0(24)));
                return;
            case 3:
                this.f15152b.f15158g.O0(this.f15153c, Integer.MIN_VALUE, 7, i1.Q0(new k2.y0(20)));
                return;
            case 4:
                this.f15152b.f15158g.O0(this.f15153c, Integer.MIN_VALUE, 12, i1.Q0(new k2.y0(23)));
                return;
            case 5:
                this.f15152b.f15158g.O0(this.f15153c, Integer.MIN_VALUE, 11, i1.Q0(new k2.y0(19)));
                return;
            case 6:
                this.f15152b.f15158g.O0(this.f15153c, Integer.MIN_VALUE, 3, i1.Q0(new v0(0)));
                return;
            case 7:
                this.f15152b.f15158g.O0(this.f15153c, Integer.MIN_VALUE, 1, i1.Q0(new k2.y0(15)));
                return;
            case 8:
                this.f15152b.f15158g.M0(this.f15153c, Integer.MIN_VALUE);
                return;
            default:
                this.f15152b.f15158g.M0(this.f15153c, Integer.MIN_VALUE);
                return;
        }
    }
}
