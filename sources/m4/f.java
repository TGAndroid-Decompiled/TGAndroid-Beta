package m4;
public final class f implements Runnable {
    public final int f12735a;
    public final f0 f12736b;
    public final w f12737c;

    public f(f0 f0Var, w wVar, int i10) {
        this.f12735a = i10;
        this.f12736b = f0Var;
        this.f12737c = wVar;
    }

    @Override
    public final void run() {
        switch (this.f12735a) {
            case 0:
                f0 f0Var = this.f12736b;
                if (!f0Var.j()) {
                    if (f0Var.f12757x) {
                        w wVar = this.f12737c;
                        if (!f0.k(wVar)) {
                            if (f0Var.i(wVar)) {
                                f0Var.f12757x = false;
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
                this.f12736b.f12742g.Q0(this.f12737c, Integer.MIN_VALUE, 1, j1.S0(new k2.k0(18)));
                return;
            case 2:
                this.f12736b.f12742g.Q0(this.f12737c, Integer.MIN_VALUE, 9, j1.S0(new k2.k0(27)));
                return;
            case 3:
                this.f12736b.f12742g.Q0(this.f12737c, Integer.MIN_VALUE, 7, j1.S0(new k2.k0(23)));
                return;
            case 4:
                this.f12736b.f12742g.Q0(this.f12737c, Integer.MIN_VALUE, 12, j1.S0(new k2.k0(26)));
                return;
            case 5:
                this.f12736b.f12742g.Q0(this.f12737c, Integer.MIN_VALUE, 11, j1.S0(new k2.k0(22)));
                return;
            case 6:
                this.f12736b.f12742g.Q0(this.f12737c, Integer.MIN_VALUE, 3, j1.S0(new v0(3)));
                return;
            case 7:
                this.f12736b.f12742g.Q0(this.f12737c, Integer.MIN_VALUE, 1, j1.S0(new k2.k0(18)));
                return;
            case 8:
                this.f12736b.f12742g.O0(this.f12737c, Integer.MIN_VALUE);
                return;
            default:
                this.f12736b.f12742g.O0(this.f12737c, Integer.MIN_VALUE);
                return;
        }
    }
}
