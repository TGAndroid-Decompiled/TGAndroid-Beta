package m4;

import ai.g3;
public final class b implements Runnable {
    public final int f14473a;
    public final a0 f14474b;
    public final r f14475c;

    public b(a0 a0Var, r rVar, int i10) {
        this.f14473a = i10;
        this.f14474b = a0Var;
        this.f14475c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f14473a) {
            case 0:
                a0 a0Var = this.f14474b;
                if (!a0Var.j()) {
                    if (a0Var.f14467x) {
                        r rVar = this.f14475c;
                        if (!a0.k(rVar)) {
                            if (a0Var.i(rVar)) {
                                a0Var.f14467x = false;
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
                this.f14474b.f14452g.N0(this.f14475c, Integer.MIN_VALUE, 7, g1.P0(new ai.i(9)));
                return;
            case 2:
                this.f14474b.f14452g.N0(this.f14475c, Integer.MIN_VALUE, 12, g1.P0(new ai.i(11)));
                return;
            case 3:
                this.f14474b.f14452g.N0(this.f14475c, Integer.MIN_VALUE, 11, g1.P0(new ai.i(8)));
                return;
            case 4:
                this.f14474b.f14452g.N0(this.f14475c, Integer.MIN_VALUE, 3, g1.P0(new ai.i(14)));
                return;
            case 5:
                this.f14474b.f14452g.N0(this.f14475c, Integer.MIN_VALUE, 1, g1.P0(new ai.i(5)));
                return;
            case 6:
                g1 g1Var = this.f14474b.f14452g;
                g1Var.getClass();
                r rVar2 = this.f14475c;
                g1Var.N0(rVar2, Integer.MIN_VALUE, 1, g1.P0(new g3(2, g1Var, rVar2)));
                return;
            case 7:
                g1 g1Var2 = this.f14474b.f14452g;
                g1Var2.getClass();
                r rVar3 = this.f14475c;
                g1Var2.N0(rVar3, Integer.MIN_VALUE, 1, g1.P0(new g3(2, g1Var2, rVar3)));
                return;
            case 8:
                this.f14474b.f14452g.N0(this.f14475c, Integer.MIN_VALUE, 1, g1.P0(new ai.i(5)));
                return;
            default:
                this.f14474b.f14452g.N0(this.f14475c, Integer.MIN_VALUE, 9, g1.P0(new ai.i(12)));
                return;
        }
    }
}
