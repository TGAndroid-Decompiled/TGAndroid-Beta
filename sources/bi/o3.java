package bi;
public final class o3 implements Runnable {
    public final int f3749a;
    public final c4 f3750b;

    public o3(c4 c4Var, int i7) {
        this.f3749a = i7;
        this.f3750b = c4Var;
    }

    @Override
    public final void run() {
        switch (this.f3749a) {
            case 0:
                this.f3750b.setReordering(true);
                return;
            case 1:
                this.f3750b.setReordering(true);
                return;
            case 2:
                this.f3750b.f(false);
                return;
            default:
                this.f3750b.setReordering(true);
                return;
        }
    }
}
