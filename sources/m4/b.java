package m4;

import bi.t2;
public final class b implements Runnable {
    public final int f15879a;
    public final a0 f15880b;
    public final r f15881c;

    public b(a0 a0Var, r rVar, int i10) {
        this.f15879a = i10;
        this.f15880b = a0Var;
        this.f15881c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f15879a) {
            case 0:
                a0 a0Var = this.f15880b;
                if (!a0Var.j()) {
                    if (a0Var.f15873x) {
                        r rVar = this.f15881c;
                        if (!a0.k(rVar)) {
                            if (a0Var.i(rVar)) {
                                a0Var.f15873x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    a0Var.f15856e.getClass();
                    return;
                }
                return;
            case 1:
                this.f15880b.f15858g.N0(this.f15881c, Integer.MIN_VALUE, 7, f1.P0(new bi.f(9)));
                return;
            case 2:
                this.f15880b.f15858g.N0(this.f15881c, Integer.MIN_VALUE, 12, f1.P0(new bi.f(11)));
                return;
            case 3:
                this.f15880b.f15858g.N0(this.f15881c, Integer.MIN_VALUE, 11, f1.P0(new bi.f(8)));
                return;
            case 4:
                this.f15880b.f15858g.N0(this.f15881c, Integer.MIN_VALUE, 3, f1.P0(new bi.f(14)));
                return;
            case 5:
                this.f15880b.f15858g.N0(this.f15881c, Integer.MIN_VALUE, 1, f1.P0(new bi.f(5)));
                return;
            case 6:
                f1 f1Var = this.f15880b.f15858g;
                f1Var.getClass();
                r rVar2 = this.f15881c;
                f1Var.N0(rVar2, Integer.MIN_VALUE, 1, f1.P0(new t2(2, f1Var, rVar2)));
                return;
            case 7:
                f1 f1Var2 = this.f15880b.f15858g;
                f1Var2.getClass();
                r rVar3 = this.f15881c;
                f1Var2.N0(rVar3, Integer.MIN_VALUE, 1, f1.P0(new t2(2, f1Var2, rVar3)));
                return;
            case 8:
                this.f15880b.f15858g.N0(this.f15881c, Integer.MIN_VALUE, 1, f1.P0(new bi.f(5)));
                return;
            default:
                this.f15880b.f15858g.N0(this.f15881c, Integer.MIN_VALUE, 9, f1.P0(new bi.f(12)));
                return;
        }
    }
}
