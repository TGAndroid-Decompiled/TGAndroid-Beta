package lh;
public final class z2 implements Runnable {
    public final int f13130a;
    public final n3 f13131b;

    public z2(n3 n3Var, int i10) {
        this.f13130a = i10;
        this.f13131b = n3Var;
    }

    @Override
    public final void run() {
        switch (this.f13130a) {
            case 0:
                this.f13131b.setReordering(true);
                return;
            case 1:
                this.f13131b.setReordering(true);
                return;
            case 2:
                this.f13131b.f(false);
                return;
            default:
                this.f13131b.setReordering(true);
                return;
        }
    }
}
