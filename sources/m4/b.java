package m4;

import bi.t2;
public final class b implements Runnable {
    public final int f15852a;
    public final a0 f15853b;
    public final r f15854c;

    public b(a0 a0Var, r rVar, int i10) {
        this.f15852a = i10;
        this.f15853b = a0Var;
        this.f15854c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f15852a) {
            case 0:
                a0 a0Var = this.f15853b;
                if (!a0Var.j()) {
                    if (a0Var.f15846x) {
                        r rVar = this.f15854c;
                        if (!a0.k(rVar)) {
                            if (a0Var.i(rVar)) {
                                a0Var.f15846x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    a0Var.f15829e.getClass();
                    return;
                }
                return;
            case 1:
                this.f15853b.f15831g.N0(this.f15854c, Integer.MIN_VALUE, 7, f1.P0(new bi.f(9)));
                return;
            case 2:
                this.f15853b.f15831g.N0(this.f15854c, Integer.MIN_VALUE, 12, f1.P0(new bi.f(11)));
                return;
            case 3:
                this.f15853b.f15831g.N0(this.f15854c, Integer.MIN_VALUE, 11, f1.P0(new bi.f(8)));
                return;
            case 4:
                this.f15853b.f15831g.N0(this.f15854c, Integer.MIN_VALUE, 3, f1.P0(new bi.f(14)));
                return;
            case 5:
                this.f15853b.f15831g.N0(this.f15854c, Integer.MIN_VALUE, 1, f1.P0(new bi.f(5)));
                return;
            case 6:
                f1 f1Var = this.f15853b.f15831g;
                f1Var.getClass();
                r rVar2 = this.f15854c;
                f1Var.N0(rVar2, Integer.MIN_VALUE, 1, f1.P0(new t2(2, f1Var, rVar2)));
                return;
            case 7:
                f1 f1Var2 = this.f15853b.f15831g;
                f1Var2.getClass();
                r rVar3 = this.f15854c;
                f1Var2.N0(rVar3, Integer.MIN_VALUE, 1, f1.P0(new t2(2, f1Var2, rVar3)));
                return;
            case 8:
                this.f15853b.f15831g.N0(this.f15854c, Integer.MIN_VALUE, 1, f1.P0(new bi.f(5)));
                return;
            default:
                this.f15853b.f15831g.N0(this.f15854c, Integer.MIN_VALUE, 9, f1.P0(new bi.f(12)));
                return;
        }
    }
}
