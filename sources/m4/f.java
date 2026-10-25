package m4;
public final class f implements Runnable {
    public final int f18038a;
    public final f0 f18039b;
    public final w f18040c;

    public f(f0 f0Var, w wVar, int i10) {
        this.f18038a = i10;
        this.f18039b = f0Var;
        this.f18040c = wVar;
    }

    @Override
    public final void run() {
        switch (this.f18038a) {
            case 0:
                f0 f0Var = this.f18039b;
                if (!f0Var.j()) {
                    if (f0Var.f18060x) {
                        w wVar = this.f18040c;
                        if (!f0.k(wVar)) {
                            if (f0Var.i(wVar)) {
                                f0Var.f18060x = false;
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
                this.f18039b.f18045g.O0(this.f18040c, Integer.MIN_VALUE, 1, j1.Q0(new jh.l(16)));
                return;
            case 2:
                this.f18039b.f18045g.O0(this.f18040c, Integer.MIN_VALUE, 9, j1.Q0(new jh.l(25)));
                return;
            case 3:
                this.f18039b.f18045g.O0(this.f18040c, Integer.MIN_VALUE, 7, j1.Q0(new jh.l(21)));
                return;
            case 4:
                this.f18039b.f18045g.O0(this.f18040c, Integer.MIN_VALUE, 12, j1.Q0(new jh.l(24)));
                return;
            case 5:
                this.f18039b.f18045g.O0(this.f18040c, Integer.MIN_VALUE, 11, j1.Q0(new jh.l(20)));
                return;
            case 6:
                this.f18039b.f18045g.O0(this.f18040c, Integer.MIN_VALUE, 3, j1.Q0(new x0(1)));
                return;
            case 7:
                this.f18039b.f18045g.O0(this.f18040c, Integer.MIN_VALUE, 1, j1.Q0(new jh.l(16)));
                return;
            case 8:
                this.f18039b.f18045g.M0(this.f18040c, Integer.MIN_VALUE);
                return;
            default:
                this.f18039b.f18045g.M0(this.f18040c, Integer.MIN_VALUE);
                return;
        }
    }
}
