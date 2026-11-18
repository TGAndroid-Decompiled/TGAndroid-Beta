package bi;
public final class b0 implements Runnable {
    public final int f3428a;
    public final m0 f3429b;

    public b0(m0 m0Var, int i7) {
        this.f3428a = i7;
        this.f3429b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f3428a) {
            case 0:
                this.f3429b.onBackPressed();
                return;
            default:
                this.f3429b.g1();
                return;
        }
    }
}
