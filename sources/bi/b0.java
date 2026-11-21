package bi;
public final class b0 implements Runnable {
    public final int f3414a;
    public final m0 f3415b;

    public b0(m0 m0Var, int i7) {
        this.f3414a = i7;
        this.f3415b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f3414a) {
            case 0:
                this.f3415b.onBackPressed();
                return;
            default:
                this.f3415b.g1();
                return;
        }
    }
}
