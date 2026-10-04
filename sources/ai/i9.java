package ai;
public final class i9 implements Runnable {
    public final int f1083a;
    public final k9 f1084b;

    public i9(k9 k9Var, int i10) {
        this.f1083a = i10;
        this.f1084b = k9Var;
    }

    @Override
    public final void run() {
        switch (this.f1083a) {
            case 0:
                this.f1084b.e();
                return;
            default:
                this.f1084b.b();
                return;
        }
    }
}
