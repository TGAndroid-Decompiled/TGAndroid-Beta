package bi;
public final class b0 implements Runnable {
    public final int f3391a;
    public final m0 f3392b;

    public b0(m0 m0Var, int i7) {
        this.f3391a = i7;
        this.f3392b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f3391a) {
            case 0:
                this.f3392b.onBackPressed();
                return;
            default:
                this.f3392b.f1();
                return;
        }
    }
}
