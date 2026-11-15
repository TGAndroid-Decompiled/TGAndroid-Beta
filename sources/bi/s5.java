package bi;
public final class s5 implements Runnable {
    public final int f3865a;
    public final z5 f3866b;

    public s5(z5 z5Var, int i7) {
        this.f3865a = i7;
        this.f3866b = z5Var;
    }

    @Override
    public final void run() {
        switch (this.f3865a) {
            case 0:
                this.f3866b.d1();
                return;
            default:
                z5 z5Var = this.f3866b;
                z5Var.f4033e2.O(true);
                org.telegram.messenger.g0.i3(new s5(z5Var, 0), 150L);
                return;
        }
    }
}
