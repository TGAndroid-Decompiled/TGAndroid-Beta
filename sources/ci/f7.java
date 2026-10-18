package ci;
public final class f7 implements Runnable {
    public final int f5393a;
    public final h7 f5394b;

    public f7(h7 h7Var, int i10) {
        this.f5393a = i10;
        this.f5394b = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f5393a) {
            case 0:
                this.f5394b.e();
                return;
            default:
                this.f5394b.b();
                return;
        }
    }
}
