package bi;
public final class e8 implements Runnable {
    public final int f3513a;
    public final l8 f3514b;

    public e8(l8 l8Var, int i7) {
        this.f3513a = i7;
        this.f3514b = l8Var;
    }

    @Override
    public final void run() {
        switch (this.f3513a) {
            case 0:
                this.f3514b.e1();
                return;
            default:
                l8 l8Var = this.f3514b;
                l8Var.f3813e2.O(true);
                org.telegram.messenger.g0.h3(new e8(l8Var, 0), 150L);
                return;
        }
    }
}
