package m4;
public final class e implements Runnable {
    public final int f16515a;
    public final f0 f16516b;
    public final v f16517c;

    public e(f0 f0Var, v vVar, int i10) {
        this.f16515a = i10;
        this.f16516b = f0Var;
        this.f16517c = vVar;
    }

    @Override
    public final void run() {
        switch (this.f16515a) {
            case 0:
                f0 f0Var = this.f16516b;
                if (!f0Var.j()) {
                    if (f0Var.f16539x) {
                        v vVar = this.f16517c;
                        if (!f0.k(vVar)) {
                            if (f0Var.i(vVar)) {
                                f0Var.f16539x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    f0Var.e.getClass();
                    return;
                }
                return;
            case 1:
                this.f16516b.f16524g.O0(this.f16517c, Integer.MIN_VALUE, 1, i1.Q0(new k2.f0(15)));
                return;
            case 2:
                this.f16516b.f16524g.O0(this.f16517c, Integer.MIN_VALUE, 9, i1.Q0(new k2.f0(24)));
                return;
            case 3:
                this.f16516b.f16524g.O0(this.f16517c, Integer.MIN_VALUE, 7, i1.Q0(new k2.f0(20)));
                return;
            case 4:
                this.f16516b.f16524g.O0(this.f16517c, Integer.MIN_VALUE, 12, i1.Q0(new k2.f0(23)));
                return;
            case 5:
                this.f16516b.f16524g.O0(this.f16517c, Integer.MIN_VALUE, 11, i1.Q0(new k2.f0(19)));
                return;
            case 6:
                this.f16516b.f16524g.O0(this.f16517c, Integer.MIN_VALUE, 3, i1.Q0(new v0(0)));
                return;
            case 7:
                this.f16516b.f16524g.O0(this.f16517c, Integer.MIN_VALUE, 1, i1.Q0(new k2.f0(15)));
                return;
            case 8:
                this.f16516b.f16524g.M0(this.f16517c, Integer.MIN_VALUE);
                return;
            default:
                this.f16516b.f16524g.M0(this.f16517c, Integer.MIN_VALUE);
                return;
        }
    }
}
