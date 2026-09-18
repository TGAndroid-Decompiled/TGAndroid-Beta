package m4;

import ai.g3;
public final class b implements Runnable {
    public final int f14660a;
    public final a0 f14661b;
    public final r f14662c;

    public b(a0 a0Var, r rVar, int i10) {
        this.f14660a = i10;
        this.f14661b = a0Var;
        this.f14662c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f14660a) {
            case 0:
                a0 a0Var = this.f14661b;
                if (!a0Var.j()) {
                    if (a0Var.f14654x) {
                        r rVar = this.f14662c;
                        if (!a0.k(rVar)) {
                            if (a0Var.i(rVar)) {
                                a0Var.f14654x = false;
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
                this.f14661b.f14639g.N0(this.f14662c, Integer.MIN_VALUE, 7, f1.P0(new ai.i(9)));
                return;
            case 2:
                this.f14661b.f14639g.N0(this.f14662c, Integer.MIN_VALUE, 12, f1.P0(new ai.i(11)));
                return;
            case 3:
                this.f14661b.f14639g.N0(this.f14662c, Integer.MIN_VALUE, 11, f1.P0(new ai.i(8)));
                return;
            case 4:
                this.f14661b.f14639g.N0(this.f14662c, Integer.MIN_VALUE, 3, f1.P0(new ai.i(14)));
                return;
            case 5:
                this.f14661b.f14639g.N0(this.f14662c, Integer.MIN_VALUE, 1, f1.P0(new ai.i(5)));
                return;
            case 6:
                f1 f1Var = this.f14661b.f14639g;
                f1Var.getClass();
                r rVar2 = this.f14662c;
                f1Var.N0(rVar2, Integer.MIN_VALUE, 1, f1.P0(new g3(2, f1Var, rVar2)));
                return;
            case 7:
                f1 f1Var2 = this.f14661b.f14639g;
                f1Var2.getClass();
                r rVar3 = this.f14662c;
                f1Var2.N0(rVar3, Integer.MIN_VALUE, 1, f1.P0(new g3(2, f1Var2, rVar3)));
                return;
            case 8:
                this.f14661b.f14639g.N0(this.f14662c, Integer.MIN_VALUE, 1, f1.P0(new ai.i(5)));
                return;
            default:
                this.f14661b.f14639g.N0(this.f14662c, Integer.MIN_VALUE, 9, f1.P0(new ai.i(12)));
                return;
        }
    }
}
