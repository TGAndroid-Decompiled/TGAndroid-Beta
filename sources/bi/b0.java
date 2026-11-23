package bi;
public final class b0 implements Runnable {
    public final int f3421a;
    public final m0 f3422b;

    public b0(m0 m0Var, int i7) {
        this.f3421a = i7;
        this.f3422b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f3421a) {
            case 0:
                this.f3422b.onBackPressed();
                return;
            default:
                this.f3422b.g1();
                return;
        }
    }
}
