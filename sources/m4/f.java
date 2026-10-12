package m4;
public final class f implements Runnable {
    public final int f15421a;
    public final f0 f15422b;
    public final w f15423c;

    public f(f0 f0Var, w wVar, int i10) {
        this.f15421a = i10;
        this.f15422b = f0Var;
        this.f15423c = wVar;
    }

    @Override
    public final void run() {
        switch (this.f15421a) {
            case 0:
                f0 f0Var = this.f15422b;
                if (!f0Var.j()) {
                    if (f0Var.f15443x) {
                        w wVar = this.f15423c;
                        if (!f0.k(wVar)) {
                            if (f0Var.i(wVar)) {
                                f0Var.f15443x = false;
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
                this.f15422b.f15428g.O0(this.f15423c, Integer.MIN_VALUE, 1, j1.Q0(new k2.y0(15)));
                return;
            case 2:
                this.f15422b.f15428g.O0(this.f15423c, Integer.MIN_VALUE, 9, j1.Q0(new k2.y0(24)));
                return;
            case 3:
                this.f15422b.f15428g.O0(this.f15423c, Integer.MIN_VALUE, 7, j1.Q0(new k2.y0(20)));
                return;
            case 4:
                this.f15422b.f15428g.O0(this.f15423c, Integer.MIN_VALUE, 12, j1.Q0(new k2.y0(23)));
                return;
            case 5:
                this.f15422b.f15428g.O0(this.f15423c, Integer.MIN_VALUE, 11, j1.Q0(new k2.y0(19)));
                return;
            case 6:
                this.f15422b.f15428g.O0(this.f15423c, Integer.MIN_VALUE, 3, j1.Q0(new w0(0)));
                return;
            case 7:
                this.f15422b.f15428g.O0(this.f15423c, Integer.MIN_VALUE, 1, j1.Q0(new k2.y0(15)));
                return;
            case 8:
                this.f15422b.f15428g.M0(this.f15423c, Integer.MIN_VALUE);
                return;
            default:
                this.f15422b.f15428g.M0(this.f15423c, Integer.MIN_VALUE);
                return;
        }
    }
}
