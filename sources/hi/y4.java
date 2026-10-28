package hi;
public final class y4 implements Runnable {
    public final int f13382a;
    public final z4 f13383b;

    public y4(z4 z4Var, int i10) {
        this.f13382a = i10;
        this.f13383b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f13382a) {
            case 0:
                z4 z4Var = this.f13383b;
                if (z4Var.f13407w) {
                    z4Var.d();
                    return;
                }
                return;
            default:
                this.f13383b.invalidateSelf();
                return;
        }
    }
}
