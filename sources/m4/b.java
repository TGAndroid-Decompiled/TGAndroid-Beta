package m4;
public final class b implements Runnable {
    public final int f16063a;
    public final a0 f16064b;
    public final r f16065c;

    public b(a0 a0Var, r rVar, int i10) {
        this.f16063a = i10;
        this.f16064b = a0Var;
        this.f16065c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f16063a) {
            case 0:
                a0 a0Var = this.f16064b;
                if (!a0Var.j()) {
                    if (a0Var.f16056x) {
                        r rVar = this.f16065c;
                        if (!a0.k(rVar)) {
                            if (a0Var.i(rVar)) {
                                a0Var.f16056x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    a0Var.f16039e.getClass();
                    return;
                }
                return;
            case 1:
                this.f16064b.f16041g.N0(this.f16065c, Integer.MIN_VALUE, 7, a1.P0(new o0(3)));
                return;
            case 2:
                this.f16064b.f16041g.N0(this.f16065c, Integer.MIN_VALUE, 12, a1.P0(new o0(6)));
                return;
            case 3:
                this.f16064b.f16041g.N0(this.f16065c, Integer.MIN_VALUE, 11, a1.P0(new o0(1)));
                return;
            case 4:
                this.f16064b.f16041g.N0(this.f16065c, Integer.MIN_VALUE, 3, a1.P0(new o0(13)));
                return;
            case 5:
                this.f16064b.f16041g.N0(this.f16065c, Integer.MIN_VALUE, 1, a1.P0(new j2.e(28)));
                return;
            case 6:
                a1 a1Var = this.f16064b.f16041g;
                a1Var.getClass();
                r rVar2 = this.f16065c;
                a1Var.N0(rVar2, Integer.MIN_VALUE, 1, a1.P0(new ah.b(27, a1Var, rVar2)));
                return;
            case 7:
                a1 a1Var2 = this.f16064b.f16041g;
                a1Var2.getClass();
                r rVar3 = this.f16065c;
                a1Var2.N0(rVar3, Integer.MIN_VALUE, 1, a1.P0(new ah.b(27, a1Var2, rVar3)));
                return;
            case 8:
                this.f16064b.f16041g.N0(this.f16065c, Integer.MIN_VALUE, 1, a1.P0(new j2.e(28)));
                return;
            default:
                this.f16064b.f16041g.N0(this.f16065c, Integer.MIN_VALUE, 9, a1.P0(new o0(7)));
                return;
        }
    }
}
