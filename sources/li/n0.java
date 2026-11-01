package li;
public final class n0 implements Runnable {
    public final int f12184a;
    public final a4.l f12185b;
    public final Exception f12186c;

    public n0(a4.l lVar, Exception exc, int i10) {
        this.f12184a = i10;
        this.f12185b = lVar;
        this.f12186c = exc;
    }

    @Override
    public final void run() {
        switch (this.f12184a) {
            case 0:
                x0 x0Var = (x0) this.f12185b.f279b;
                x0Var.f12317m.a("recording segment interrupted in state=".concat(i0.a.A(x0Var.Z)), this.f12186c);
                int i10 = x0Var.Z;
                if (i10 == 3) {
                    x0Var.q();
                    return;
                } else if (i10 == 2) {
                    x0Var.D = true;
                    return;
                } else {
                    return;
                }
            default:
                ((x0) this.f12185b.f279b).h(this.f12186c);
                return;
        }
    }
}
