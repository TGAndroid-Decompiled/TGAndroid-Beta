package bi;
public final class y5 implements Runnable {
    public final int f4309a;
    public final m6 f4310b;

    public y5(m6 m6Var, int i7) {
        this.f4309a = i7;
        this.f4310b = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f4309a) {
            case 0:
                this.f4310b.setReordering(true);
                return;
            case 1:
                this.f4310b.setReordering(true);
                return;
            case 2:
                this.f4310b.f(false);
                return;
            default:
                this.f4310b.setReordering(true);
                return;
        }
    }
}
