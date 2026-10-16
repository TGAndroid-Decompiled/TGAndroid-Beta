package bi;
public final class t8 implements Runnable {
    public final int f3758a;
    public final w8 f3759b;

    public t8(w8 w8Var, int i10) {
        this.f3758a = i10;
        this.f3759b = w8Var;
    }

    @Override
    public final void run() {
        switch (this.f3758a) {
            case 0:
                this.f3759b.e();
                return;
            default:
                this.f3759b.b();
                return;
        }
    }
}
