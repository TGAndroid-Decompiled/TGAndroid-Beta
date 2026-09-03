package lh;
public final class z2 implements Runnable {
    public final int f13132a;
    public final n3 f13133b;

    public z2(n3 n3Var, int i10) {
        this.f13132a = i10;
        this.f13133b = n3Var;
    }

    @Override
    public final void run() {
        switch (this.f13132a) {
            case 0:
                this.f13133b.setReordering(true);
                return;
            case 1:
                this.f13133b.setReordering(true);
                return;
            case 2:
                this.f13133b.f(false);
                return;
            default:
                this.f13133b.setReordering(true);
                return;
        }
    }
}
