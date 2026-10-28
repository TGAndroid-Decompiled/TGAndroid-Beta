package di;
public final class e7 implements Runnable {
    public final int f8523a;
    public final g7 f8524b;

    public e7(g7 g7Var, int i10) {
        this.f8523a = i10;
        this.f8524b = g7Var;
    }

    @Override
    public final void run() {
        switch (this.f8523a) {
            case 0:
                this.f8524b.e();
                return;
            default:
                this.f8524b.b();
                return;
        }
    }
}
