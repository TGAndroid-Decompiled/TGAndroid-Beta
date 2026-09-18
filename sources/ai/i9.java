package ai;
public final class i9 implements Runnable {
    public final int f1013a;
    public final k9 f1014b;

    public i9(k9 k9Var, int i10) {
        this.f1013a = i10;
        this.f1014b = k9Var;
    }

    @Override
    public final void run() {
        switch (this.f1013a) {
            case 0:
                this.f1014b.e();
                return;
            default:
                this.f1014b.b();
                return;
        }
    }
}
