package ai;
public final class i9 implements Runnable {
    public final int f1010a;
    public final k9 f1011b;

    public i9(k9 k9Var, int i10) {
        this.f1010a = i10;
        this.f1011b = k9Var;
    }

    @Override
    public final void run() {
        switch (this.f1010a) {
            case 0:
                this.f1011b.e();
                return;
            default:
                this.f1011b.b();
                return;
        }
    }
}
