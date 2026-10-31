package mg;

import org.telegram.messenger.d20;
public final class a1 implements Runnable {
    public final int f13067a;
    public final c1 f13068b;

    public a1(c1 c1Var, int i10) {
        this.f13067a = i10;
        this.f13068b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f13067a) {
            case 0:
                c1.l1(this.f13068b);
                return;
            default:
                c1 c1Var = this.f13068b;
                kg.v1 v1Var = new kg.v1(c1Var.f26669o1, d20.f15147s0, null, null, null, c1Var.I0);
                v1Var.B2 = true;
                v1Var.C2 = true;
                v1Var.U1 = true;
                c1Var.f26669o1.showDialog(v1Var);
                return;
        }
    }
}
