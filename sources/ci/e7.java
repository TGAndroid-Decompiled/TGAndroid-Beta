package ci;
public final class e7 implements Runnable {
    public final int f5293a;
    public final g7 f5294b;

    public e7(g7 g7Var, int i10) {
        this.f5293a = i10;
        this.f5294b = g7Var;
    }

    @Override
    public final void run() {
        switch (this.f5293a) {
            case 0:
                this.f5294b.e();
                return;
            default:
                this.f5294b.b();
                return;
        }
    }
}
