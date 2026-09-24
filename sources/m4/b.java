package m4;
public final class b implements Runnable {
    public final int f14701a;
    public final a0 f14702b;
    public final r f14703c;

    public b(a0 a0Var, r rVar, int i10) {
        this.f14701a = i10;
        this.f14702b = a0Var;
        this.f14703c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f14701a) {
            case 0:
                a0 a0Var = this.f14702b;
                if (!a0Var.j()) {
                    if (a0Var.f14695x) {
                        r rVar = this.f14703c;
                        if (!a0.k(rVar)) {
                            if (a0Var.i(rVar)) {
                                a0Var.f14695x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    a0Var.e.getClass();
                    return;
                }
                return;
            case 1:
                this.f14702b.f14680g.N0(this.f14703c, Integer.MIN_VALUE, 7, a1.P0(new o0(2)));
                return;
            case 2:
                this.f14702b.f14680g.N0(this.f14703c, Integer.MIN_VALUE, 12, a1.P0(new o0(5)));
                return;
            case 3:
                this.f14702b.f14680g.N0(this.f14703c, Integer.MIN_VALUE, 11, a1.P0(new o0(0)));
                return;
            case 4:
                this.f14702b.f14680g.N0(this.f14703c, Integer.MIN_VALUE, 3, a1.P0(new o0(12)));
                return;
            case 5:
                this.f14702b.f14680g.N0(this.f14703c, Integer.MIN_VALUE, 1, a1.P0(new j2.e(27)));
                return;
            case 6:
                a1 a1Var = this.f14702b.f14680g;
                a1Var.getClass();
                r rVar2 = this.f14703c;
                a1Var.N0(rVar2, Integer.MIN_VALUE, 1, a1.P0(new ah.b(27, a1Var, rVar2)));
                return;
            case 7:
                a1 a1Var2 = this.f14702b.f14680g;
                a1Var2.getClass();
                r rVar3 = this.f14703c;
                a1Var2.N0(rVar3, Integer.MIN_VALUE, 1, a1.P0(new ah.b(27, a1Var2, rVar3)));
                return;
            case 8:
                this.f14702b.f14680g.N0(this.f14703c, Integer.MIN_VALUE, 1, a1.P0(new j2.e(27)));
                return;
            default:
                this.f14702b.f14680g.N0(this.f14703c, Integer.MIN_VALUE, 9, a1.P0(new o0(6)));
                return;
        }
    }
}
