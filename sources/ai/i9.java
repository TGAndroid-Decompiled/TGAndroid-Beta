package ai;
public final class i9 implements Runnable {
    public final int f1001a;
    public final k9 f1002b;

    public i9(k9 k9Var, int i10) {
        this.f1001a = i10;
        this.f1002b = k9Var;
    }

    @Override
    public final void run() {
        switch (this.f1001a) {
            case 0:
                this.f1002b.e();
                return;
            default:
                this.f1002b.b();
                return;
        }
    }
}
