package ai;
public final class j9 implements Runnable {
    public final int f1191a;
    public final l9 f1192b;

    public j9(l9 l9Var, int i10) {
        this.f1191a = i10;
        this.f1192b = l9Var;
    }

    @Override
    public final void run() {
        switch (this.f1191a) {
            case 0:
                this.f1192b.e();
                return;
            default:
                this.f1192b.b();
                return;
        }
    }
}
