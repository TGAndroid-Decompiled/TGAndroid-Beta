package bi;
public final class b6 implements Runnable {
    public final int f3414a;
    public final p6 f3415b;

    public b6(p6 p6Var, int i7) {
        this.f3414a = i7;
        this.f3415b = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f3414a) {
            case 0:
                this.f3415b.setReordering(true);
                return;
            case 1:
                this.f3415b.setReordering(true);
                return;
            case 2:
                this.f3415b.f(false);
                return;
            default:
                this.f3415b.setReordering(true);
                return;
        }
    }
}
