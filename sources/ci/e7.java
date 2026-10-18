package ci;
public final class e7 implements Runnable {
    public final int f5291a;
    public final g7 f5292b;

    public e7(g7 g7Var, int i10) {
        this.f5291a = i10;
        this.f5292b = g7Var;
    }

    @Override
    public final void run() {
        switch (this.f5291a) {
            case 0:
                this.f5292b.e();
                return;
            default:
                this.f5292b.b();
                return;
        }
    }
}
