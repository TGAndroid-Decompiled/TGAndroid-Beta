package bi;
public final class w5 implements Runnable {
    public final int f4184a;
    public final k6 f4185b;

    public w5(k6 k6Var, int i7) {
        this.f4184a = i7;
        this.f4185b = k6Var;
    }

    @Override
    public final void run() {
        switch (this.f4184a) {
            case 0:
                this.f4185b.setReordering(true);
                return;
            case 1:
                this.f4185b.setReordering(true);
                return;
            case 2:
                this.f4185b.f(false);
                return;
            default:
                this.f4185b.setReordering(true);
                return;
        }
    }
}
