package bi;
public final class t8 implements Runnable {
    public final int f3754a;
    public final w8 f3755b;

    public t8(w8 w8Var, int i10) {
        this.f3754a = i10;
        this.f3755b = w8Var;
    }

    @Override
    public final void run() {
        switch (this.f3754a) {
            case 0:
                this.f3755b.e();
                return;
            default:
                this.f3755b.b();
                return;
        }
    }
}
