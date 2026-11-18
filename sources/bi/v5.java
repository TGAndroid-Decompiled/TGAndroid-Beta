package bi;
public final class v5 implements Runnable {
    public final int f4126a;
    public final j6 f4127b;

    public v5(j6 j6Var, int i7) {
        this.f4126a = i7;
        this.f4127b = j6Var;
    }

    @Override
    public final void run() {
        switch (this.f4126a) {
            case 0:
                this.f4127b.setReordering(true);
                return;
            case 1:
                this.f4127b.setReordering(true);
                return;
            case 2:
                this.f4127b.f(false);
                return;
            default:
                this.f4127b.setReordering(true);
                return;
        }
    }
}
