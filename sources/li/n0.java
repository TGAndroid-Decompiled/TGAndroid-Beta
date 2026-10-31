package li;
public final class n0 implements Runnable {
    public final int f12183a;
    public final a4.l f12184b;
    public final Exception f12185c;

    public n0(a4.l lVar, Exception exc, int i10) {
        this.f12183a = i10;
        this.f12184b = lVar;
        this.f12185c = exc;
    }

    @Override
    public final void run() {
        switch (this.f12183a) {
            case 0:
                x0 x0Var = (x0) this.f12184b.f279b;
                x0Var.f12316m.a("recording segment interrupted in state=".concat(i0.a.A(x0Var.Z)), this.f12185c);
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
                ((x0) this.f12184b.f279b).h(this.f12185c);
                return;
        }
    }
}
