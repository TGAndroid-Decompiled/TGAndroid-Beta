package ci;
public final class f7 implements Runnable {
    public final int f5392a;
    public final h7 f5393b;

    public f7(h7 h7Var, int i10) {
        this.f5392a = i10;
        this.f5393b = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f5392a) {
            case 0:
                this.f5393b.e();
                return;
            default:
                this.f5393b.b();
                return;
        }
    }
}
