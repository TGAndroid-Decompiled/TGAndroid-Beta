package m4;
public final class b implements Runnable {
    public final int f15977a;
    public final b0 f15978b;
    public final r f15979c;

    public b(b0 b0Var, r rVar, int i10) {
        this.f15977a = i10;
        this.f15978b = b0Var;
        this.f15979c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f15977a) {
            case 0:
                b0 b0Var = this.f15978b;
                if (!b0Var.j()) {
                    if (b0Var.f16000x) {
                        r rVar = this.f15979c;
                        if (!b0.k(rVar)) {
                            if (b0Var.i(rVar)) {
                                b0Var.f16000x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    b0Var.f15983e.getClass();
                    return;
                }
                return;
            case 1:
                this.f15978b.f15985g.M0(this.f15979c, Integer.MIN_VALUE, 7, b1.O0(new j2.e(27)));
                return;
            case 2:
                this.f15978b.f15985g.M0(this.f15979c, Integer.MIN_VALUE, 12, b1.O0(new q0(0)));
                return;
            case 3:
                this.f15978b.f15985g.M0(this.f15979c, Integer.MIN_VALUE, 11, b1.O0(new j2.e(25)));
                return;
            case 4:
                this.f15978b.f15985g.M0(this.f15979c, Integer.MIN_VALUE, 3, b1.O0(new q0(7)));
                return;
            case 5:
                this.f15978b.f15985g.M0(this.f15979c, Integer.MIN_VALUE, 1, b1.O0(new j2.e(22)));
                return;
            case 6:
                b1 b1Var = this.f15978b.f15985g;
                b1Var.getClass();
                r rVar2 = this.f15979c;
                b1Var.M0(rVar2, Integer.MIN_VALUE, 1, b1.O0(new ah.b(27, b1Var, rVar2)));
                return;
            case 7:
                b1 b1Var2 = this.f15978b.f15985g;
                b1Var2.getClass();
                r rVar3 = this.f15979c;
                b1Var2.M0(rVar3, Integer.MIN_VALUE, 1, b1.O0(new ah.b(27, b1Var2, rVar3)));
                return;
            case 8:
                this.f15978b.f15985g.M0(this.f15979c, Integer.MIN_VALUE, 1, b1.O0(new j2.e(22)));
                return;
            default:
                this.f15978b.f15985g.M0(this.f15979c, Integer.MIN_VALUE, 9, b1.O0(new q0(1)));
                return;
        }
    }
}
