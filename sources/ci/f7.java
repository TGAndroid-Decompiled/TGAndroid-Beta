package ci;
public final class f7 implements Runnable {
    public final int f5390a;
    public final h7 f5391b;

    public f7(h7 h7Var, int i10) {
        this.f5390a = i10;
        this.f5391b = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f5390a) {
            case 0:
                this.f5391b.e();
                return;
            default:
                this.f5391b.b();
                return;
        }
    }
}
