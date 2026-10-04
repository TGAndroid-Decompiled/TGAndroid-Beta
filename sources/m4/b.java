package m4;
public final class b implements Runnable {
    public final int f16062a;
    public final a0 f16063b;
    public final r f16064c;

    public b(a0 a0Var, r rVar, int i10) {
        this.f16062a = i10;
        this.f16063b = a0Var;
        this.f16064c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f16062a) {
            case 0:
                a0 a0Var = this.f16063b;
                if (!a0Var.j()) {
                    if (a0Var.f16055x) {
                        r rVar = this.f16064c;
                        if (!a0.k(rVar)) {
                            if (a0Var.i(rVar)) {
                                a0Var.f16055x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    a0Var.f16038e.getClass();
                    return;
                }
                return;
            case 1:
                this.f16063b.f16040g.N0(this.f16064c, Integer.MIN_VALUE, 7, a1.P0(new o0(3)));
                return;
            case 2:
                this.f16063b.f16040g.N0(this.f16064c, Integer.MIN_VALUE, 12, a1.P0(new o0(6)));
                return;
            case 3:
                this.f16063b.f16040g.N0(this.f16064c, Integer.MIN_VALUE, 11, a1.P0(new o0(1)));
                return;
            case 4:
                this.f16063b.f16040g.N0(this.f16064c, Integer.MIN_VALUE, 3, a1.P0(new o0(13)));
                return;
            case 5:
                this.f16063b.f16040g.N0(this.f16064c, Integer.MIN_VALUE, 1, a1.P0(new j2.e(28)));
                return;
            case 6:
                a1 a1Var = this.f16063b.f16040g;
                a1Var.getClass();
                r rVar2 = this.f16064c;
                a1Var.N0(rVar2, Integer.MIN_VALUE, 1, a1.P0(new ah.b(27, a1Var, rVar2)));
                return;
            case 7:
                a1 a1Var2 = this.f16063b.f16040g;
                a1Var2.getClass();
                r rVar3 = this.f16064c;
                a1Var2.N0(rVar3, Integer.MIN_VALUE, 1, a1.P0(new ah.b(27, a1Var2, rVar3)));
                return;
            case 8:
                this.f16063b.f16040g.N0(this.f16064c, Integer.MIN_VALUE, 1, a1.P0(new j2.e(28)));
                return;
            default:
                this.f16063b.f16040g.N0(this.f16064c, Integer.MIN_VALUE, 9, a1.P0(new o0(7)));
                return;
        }
    }
}
