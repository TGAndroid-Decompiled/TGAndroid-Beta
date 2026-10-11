package m4;
public final class b implements Runnable {
    public final int f16038a;
    public final b0 f16039b;
    public final r f16040c;

    public b(b0 b0Var, r rVar, int i10) {
        this.f16038a = i10;
        this.f16039b = b0Var;
        this.f16040c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f16038a) {
            case 0:
                b0 b0Var = this.f16039b;
                if (!b0Var.j()) {
                    if (b0Var.f16061x) {
                        r rVar = this.f16040c;
                        if (!b0.k(rVar)) {
                            if (b0Var.i(rVar)) {
                                b0Var.f16061x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    b0Var.f16044e.getClass();
                    return;
                }
                return;
            case 1:
                this.f16039b.f16046g.M0(this.f16040c, Integer.MIN_VALUE, 7, c1.O0(new j2.e(29)));
                return;
            case 2:
                this.f16039b.f16046g.M0(this.f16040c, Integer.MIN_VALUE, 12, c1.O0(new p0(2)));
                return;
            case 3:
                this.f16039b.f16046g.M0(this.f16040c, Integer.MIN_VALUE, 11, c1.O0(new j2.e(27)));
                return;
            case 4:
                this.f16039b.f16046g.M0(this.f16040c, Integer.MIN_VALUE, 3, c1.O0(new p0(9)));
                return;
            case 5:
                this.f16039b.f16046g.M0(this.f16040c, Integer.MIN_VALUE, 1, c1.O0(new j2.e(24)));
                return;
            case 6:
                c1 c1Var = this.f16039b.f16046g;
                c1Var.getClass();
                r rVar2 = this.f16040c;
                c1Var.M0(rVar2, Integer.MIN_VALUE, 1, c1.O0(new ah.b(28, c1Var, rVar2)));
                return;
            case 7:
                c1 c1Var2 = this.f16039b.f16046g;
                c1Var2.getClass();
                r rVar3 = this.f16040c;
                c1Var2.M0(rVar3, Integer.MIN_VALUE, 1, c1.O0(new ah.b(28, c1Var2, rVar3)));
                return;
            case 8:
                this.f16039b.f16046g.M0(this.f16040c, Integer.MIN_VALUE, 1, c1.O0(new j2.e(24)));
                return;
            default:
                this.f16039b.f16046g.M0(this.f16040c, Integer.MIN_VALUE, 9, c1.O0(new p0(3)));
                return;
        }
    }
}
