package kh;
public final class z2 implements Runnable {
    public final int f11079a;
    public final m3 f11080b;

    public z2(m3 m3Var, int i10) {
        this.f11079a = i10;
        this.f11080b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f11079a) {
            case 0:
                this.f11080b.setReordering(true);
                return;
            case 1:
                this.f11080b.setReordering(true);
                return;
            case 2:
                this.f11080b.f(false);
                return;
            default:
                this.f11080b.setReordering(true);
                return;
        }
    }
}
