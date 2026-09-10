package m4;
public final class b implements Runnable {
    public final int f13288a;
    public final b0 f13289b;
    public final r f13290c;

    public b(b0 b0Var, r rVar, int i10) {
        this.f13288a = i10;
        this.f13289b = b0Var;
        this.f13290c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f13288a) {
            case 0:
                b0 b0Var = this.f13289b;
                if (!b0Var.j()) {
                    if (b0Var.f13310x) {
                        r rVar = this.f13290c;
                        if (!b0.k(rVar)) {
                            if (b0Var.i(rVar)) {
                                b0Var.f13310x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    b0Var.e.getClass();
                    return;
                }
                return;
            case 1:
                this.f13289b.f13295g.N0(this.f13290c, Integer.MIN_VALUE, 7, h1.P0(new gg.g0(7)));
                return;
            case 2:
                this.f13289b.f13295g.N0(this.f13290c, Integer.MIN_VALUE, 12, h1.P0(new gg.g0(9)));
                return;
            case 3:
                this.f13289b.f13295g.N0(this.f13290c, Integer.MIN_VALUE, 11, h1.P0(new gg.g0(6)));
                return;
            case 4:
                this.f13289b.f13295g.N0(this.f13290c, Integer.MIN_VALUE, 3, h1.P0(new gg.g0(12)));
                return;
            case 5:
                this.f13289b.f13295g.N0(this.f13290c, Integer.MIN_VALUE, 1, h1.P0(new gg.g0(3)));
                return;
            case 6:
                h1 h1Var = this.f13289b.f13295g;
                h1Var.getClass();
                r rVar2 = this.f13290c;
                h1Var.N0(rVar2, Integer.MIN_VALUE, 1, h1.P0(new q0(1, h1Var, rVar2)));
                return;
            case 7:
                h1 h1Var2 = this.f13289b.f13295g;
                h1Var2.getClass();
                r rVar3 = this.f13290c;
                h1Var2.N0(rVar3, Integer.MIN_VALUE, 1, h1.P0(new q0(1, h1Var2, rVar3)));
                return;
            case 8:
                this.f13289b.f13295g.N0(this.f13290c, Integer.MIN_VALUE, 1, h1.P0(new gg.g0(3)));
                return;
            default:
                this.f13289b.f13295g.N0(this.f13290c, Integer.MIN_VALUE, 9, h1.P0(new gg.g0(10)));
                return;
        }
    }
}
