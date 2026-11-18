package bi;
public final class b0 implements Runnable {
    public final int f3445a;
    public final m0 f3446b;

    public b0(m0 m0Var, int i7) {
        this.f3445a = i7;
        this.f3446b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f3445a) {
            case 0:
                this.f3446b.onBackPressed();
                return;
            default:
                this.f3446b.g1();
                return;
        }
    }
}
