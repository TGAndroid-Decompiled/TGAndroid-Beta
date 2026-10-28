package m4;
public final class f implements Runnable {
    public final int f18037a;
    public final f0 f18038b;
    public final w f18039c;

    public f(f0 f0Var, w wVar, int i10) {
        this.f18037a = i10;
        this.f18038b = f0Var;
        this.f18039c = wVar;
    }

    @Override
    public final void run() {
        switch (this.f18037a) {
            case 0:
                f0 f0Var = this.f18038b;
                if (!f0Var.j()) {
                    if (f0Var.f18059x) {
                        w wVar = this.f18039c;
                        if (!f0.k(wVar)) {
                            if (f0Var.i(wVar)) {
                                f0Var.f18059x = false;
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
                this.f18038b.f18044g.O0(this.f18039c, Integer.MIN_VALUE, 1, j1.Q0(new jh.l(16)));
                return;
            case 2:
                this.f18038b.f18044g.O0(this.f18039c, Integer.MIN_VALUE, 9, j1.Q0(new jh.l(25)));
                return;
            case 3:
                this.f18038b.f18044g.O0(this.f18039c, Integer.MIN_VALUE, 7, j1.Q0(new jh.l(21)));
                return;
            case 4:
                this.f18038b.f18044g.O0(this.f18039c, Integer.MIN_VALUE, 12, j1.Q0(new jh.l(24)));
                return;
            case 5:
                this.f18038b.f18044g.O0(this.f18039c, Integer.MIN_VALUE, 11, j1.Q0(new jh.l(20)));
                return;
            case 6:
                this.f18038b.f18044g.O0(this.f18039c, Integer.MIN_VALUE, 3, j1.Q0(new x0(1)));
                return;
            case 7:
                this.f18038b.f18044g.O0(this.f18039c, Integer.MIN_VALUE, 1, j1.Q0(new jh.l(16)));
                return;
            case 8:
                this.f18038b.f18044g.M0(this.f18039c, Integer.MIN_VALUE);
                return;
            default:
                this.f18038b.f18044g.M0(this.f18039c, Integer.MIN_VALUE);
                return;
        }
    }
}
