package ai;
public final class i9 implements Runnable {
    public final int f1000a;
    public final k9 f1001b;

    public i9(k9 k9Var, int i10) {
        this.f1000a = i10;
        this.f1001b = k9Var;
    }

    @Override
    public final void run() {
        switch (this.f1000a) {
            case 0:
                this.f1001b.e();
                return;
            default:
                this.f1001b.b();
                return;
        }
    }
}
