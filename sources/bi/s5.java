package bi;
public final class s5 implements Runnable {
    public final int f3868a;
    public final z5 f3869b;

    public s5(z5 z5Var, int i7) {
        this.f3868a = i7;
        this.f3869b = z5Var;
    }

    @Override
    public final void run() {
        switch (this.f3868a) {
            case 0:
                this.f3869b.d1();
                return;
            default:
                z5 z5Var = this.f3869b;
                z5Var.f4036e2.O(true);
                org.telegram.messenger.g0.i3(new s5(z5Var, 0), 150L);
                return;
        }
    }
}
