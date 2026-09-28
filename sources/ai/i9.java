package ai;
public final class i9 implements Runnable {
    public final int f998a;
    public final k9 f999b;

    public i9(k9 k9Var, int i10) {
        this.f998a = i10;
        this.f999b = k9Var;
    }

    @Override
    public final void run() {
        switch (this.f998a) {
            case 0:
                this.f999b.e();
                return;
            default:
                this.f999b.b();
                return;
        }
    }
}
