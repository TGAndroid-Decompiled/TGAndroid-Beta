package m4;
public final class b implements Runnable {
    public final int f15727a;
    public final c0 f15728b;
    public final r f15729c;

    public b(c0 c0Var, r rVar, int i10) {
        this.f15727a = i10;
        this.f15728b = c0Var;
        this.f15729c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f15727a) {
            case 0:
                c0 c0Var = this.f15728b;
                if (!c0Var.j()) {
                    if (c0Var.f15752x) {
                        r rVar = this.f15729c;
                        if (!c0.k(rVar)) {
                            if (c0Var.i(rVar)) {
                                c0Var.f15752x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    c0Var.f15735e.getClass();
                    return;
                }
                return;
            case 1:
                this.f15728b.f15737g.M0(this.f15729c, Integer.MIN_VALUE, 7, c1.O0(new j2.e(27)));
                return;
            case 2:
                this.f15728b.f15737g.M0(this.f15729c, Integer.MIN_VALUE, 12, c1.O0(new r0(0)));
                return;
            case 3:
                this.f15728b.f15737g.M0(this.f15729c, Integer.MIN_VALUE, 11, c1.O0(new j2.e(25)));
                return;
            case 4:
                this.f15728b.f15737g.M0(this.f15729c, Integer.MIN_VALUE, 3, c1.O0(new r0(7)));
                return;
            case 5:
                this.f15728b.f15737g.M0(this.f15729c, Integer.MIN_VALUE, 1, c1.O0(new j2.e(22)));
                return;
            case 6:
                c1 c1Var = this.f15728b.f15737g;
                c1Var.getClass();
                r rVar2 = this.f15729c;
                c1Var.M0(rVar2, Integer.MIN_VALUE, 1, c1.O0(new ah.b(27, c1Var, rVar2)));
                return;
            case 7:
                c1 c1Var2 = this.f15728b.f15737g;
                c1Var2.getClass();
                r rVar3 = this.f15729c;
                c1Var2.M0(rVar3, Integer.MIN_VALUE, 1, c1.O0(new ah.b(27, c1Var2, rVar3)));
                return;
            case 8:
                this.f15728b.f15737g.M0(this.f15729c, Integer.MIN_VALUE, 1, c1.O0(new j2.e(22)));
                return;
            default:
                this.f15728b.f15737g.M0(this.f15729c, Integer.MIN_VALUE, 9, c1.O0(new r0(1)));
                return;
        }
    }
}
