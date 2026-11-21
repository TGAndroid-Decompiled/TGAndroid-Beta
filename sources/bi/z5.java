package bi;
public final class z5 implements Runnable {
    public final int f4335a;
    public final n6 f4336b;

    public z5(n6 n6Var, int i7) {
        this.f4335a = i7;
        this.f4336b = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f4335a) {
            case 0:
                this.f4336b.setReordering(true);
                return;
            case 1:
                this.f4336b.setReordering(true);
                return;
            case 2:
                this.f4336b.f(false);
                return;
            default:
                this.f4336b.setReordering(true);
                return;
        }
    }
}
