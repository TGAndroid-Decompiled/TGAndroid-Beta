package ai;
public final class j9 implements Runnable {
    public final int f1193a;
    public final l9 f1194b;

    public j9(l9 l9Var, int i10) {
        this.f1193a = i10;
        this.f1194b = l9Var;
    }

    @Override
    public final void run() {
        switch (this.f1193a) {
            case 0:
                this.f1194b.e();
                return;
            default:
                this.f1194b.b();
                return;
        }
    }
}
