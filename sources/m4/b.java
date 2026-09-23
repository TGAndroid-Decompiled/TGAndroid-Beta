package m4;
public final class b implements Runnable {
    public final int f14460a;
    public final a0 f14461b;
    public final r f14462c;

    public b(a0 a0Var, r rVar, int i10) {
        this.f14460a = i10;
        this.f14461b = a0Var;
        this.f14462c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f14460a) {
            case 0:
                a0 a0Var = this.f14461b;
                if (!a0Var.j()) {
                    if (a0Var.f14457x) {
                        r rVar = this.f14462c;
                        if (!a0.k(rVar)) {
                            if (a0Var.i(rVar)) {
                                a0Var.f14457x = false;
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
                this.f14461b.f14442g.N0(this.f14462c, Integer.MIN_VALUE, 7, b1.P0(new p0(0)));
                return;
            case 2:
                this.f14461b.f14442g.N0(this.f14462c, Integer.MIN_VALUE, 12, b1.P0(new p0(3)));
                return;
            case 3:
                this.f14461b.f14442g.N0(this.f14462c, Integer.MIN_VALUE, 11, b1.P0(new j2.e(28)));
                return;
            case 4:
                this.f14461b.f14442g.N0(this.f14462c, Integer.MIN_VALUE, 3, b1.P0(new p0(10)));
                return;
            case 5:
                this.f14461b.f14442g.N0(this.f14462c, Integer.MIN_VALUE, 1, b1.P0(new j2.e(25)));
                return;
            case 6:
                b1 b1Var = this.f14461b.f14442g;
                b1Var.getClass();
                r rVar2 = this.f14462c;
                b1Var.N0(rVar2, Integer.MIN_VALUE, 1, b1.P0(new ah.b(26, b1Var, rVar2)));
                return;
            case 7:
                b1 b1Var2 = this.f14461b.f14442g;
                b1Var2.getClass();
                r rVar3 = this.f14462c;
                b1Var2.N0(rVar3, Integer.MIN_VALUE, 1, b1.P0(new ah.b(26, b1Var2, rVar3)));
                return;
            case 8:
                this.f14461b.f14442g.N0(this.f14462c, Integer.MIN_VALUE, 1, b1.P0(new j2.e(25)));
                return;
            default:
                this.f14461b.f14442g.N0(this.f14462c, Integer.MIN_VALUE, 9, b1.P0(new p0(4)));
                return;
        }
    }
}
