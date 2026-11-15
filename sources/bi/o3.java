package bi;
public final class o3 implements Runnable {
    public final int f3752a;
    public final c4 f3753b;

    public o3(c4 c4Var, int i7) {
        this.f3752a = i7;
        this.f3753b = c4Var;
    }

    @Override
    public final void run() {
        switch (this.f3752a) {
            case 0:
                this.f3753b.setReordering(true);
                return;
            case 1:
                this.f3753b.setReordering(true);
                return;
            case 2:
                this.f3753b.f(false);
                return;
            default:
                this.f3753b.setReordering(true);
                return;
        }
    }
}
