package m4;
public final class e implements Runnable {
    public final int f16576a;
    public final f0 f16577b;
    public final v f16578c;

    public e(f0 f0Var, v vVar, int i10) {
        this.f16576a = i10;
        this.f16577b = f0Var;
        this.f16578c = vVar;
    }

    @Override
    public final void run() {
        switch (this.f16576a) {
            case 0:
                f0 f0Var = this.f16577b;
                if (!f0Var.j()) {
                    if (f0Var.f16600x) {
                        v vVar = this.f16578c;
                        if (!f0.k(vVar)) {
                            if (f0Var.i(vVar)) {
                                f0Var.f16600x = false;
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
                this.f16577b.f16585g.O0(this.f16578c, Integer.MIN_VALUE, 1, i1.Q0(new k2.f(19)));
                return;
            case 2:
                this.f16577b.f16585g.O0(this.f16578c, Integer.MIN_VALUE, 9, i1.Q0(new k2.f(28)));
                return;
            case 3:
                this.f16577b.f16585g.O0(this.f16578c, Integer.MIN_VALUE, 7, i1.Q0(new k2.f(24)));
                return;
            case 4:
                this.f16577b.f16585g.O0(this.f16578c, Integer.MIN_VALUE, 12, i1.Q0(new k2.f(27)));
                return;
            case 5:
                this.f16577b.f16585g.O0(this.f16578c, Integer.MIN_VALUE, 11, i1.Q0(new k2.f(23)));
                return;
            case 6:
                this.f16577b.f16585g.O0(this.f16578c, Integer.MIN_VALUE, 3, i1.Q0(new v0(4)));
                return;
            case 7:
                this.f16577b.f16585g.O0(this.f16578c, Integer.MIN_VALUE, 1, i1.Q0(new k2.f(19)));
                return;
            case 8:
                this.f16577b.f16585g.M0(this.f16578c, Integer.MIN_VALUE);
                return;
            default:
                this.f16577b.f16585g.M0(this.f16578c, Integer.MIN_VALUE);
                return;
        }
    }
}
