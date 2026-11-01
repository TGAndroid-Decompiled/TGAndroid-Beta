package mg;

import org.telegram.messenger.e20;
public final class a1 implements Runnable {
    public final int f13068a;
    public final c1 f13069b;

    public a1(c1 c1Var, int i10) {
        this.f13068a = i10;
        this.f13069b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f13068a) {
            case 0:
                c1.l1(this.f13069b);
                return;
            default:
                c1 c1Var = this.f13069b;
                kg.v1 v1Var = new kg.v1(c1Var.f26727o1, e20.f15506s0, null, null, null, c1Var.I0);
                v1Var.B2 = true;
                v1Var.C2 = true;
                v1Var.U1 = true;
                c1Var.f26727o1.showDialog(v1Var);
                return;
        }
    }
}
