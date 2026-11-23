package bi;
public final class b0 implements Runnable {
    public final int f3386a;
    public final m0 f3387b;

    public b0(m0 m0Var, int i7) {
        this.f3386a = i7;
        this.f3387b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f3386a) {
            case 0:
                this.f3387b.onBackPressed();
                return;
            default:
                this.f3387b.g1();
                return;
        }
    }
}
