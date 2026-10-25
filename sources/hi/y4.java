package hi;
public final class y4 implements Runnable {
    public final int f13383a;
    public final z4 f13384b;

    public y4(z4 z4Var, int i10) {
        this.f13383a = i10;
        this.f13384b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f13383a) {
            case 0:
                z4 z4Var = this.f13384b;
                if (z4Var.f13408w) {
                    z4Var.d();
                    return;
                }
                return;
            default:
                this.f13384b.invalidateSelf();
                return;
        }
    }
}
