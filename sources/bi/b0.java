package bi;
public final class b0 implements Runnable {
    public final int f3388a;
    public final m0 f3389b;

    public b0(m0 m0Var, int i7) {
        this.f3388a = i7;
        this.f3389b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f3388a) {
            case 0:
                this.f3389b.onBackPressed();
                return;
            default:
                this.f3389b.f1();
                return;
        }
    }
}
