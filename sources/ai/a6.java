package ai;
public final class a6 implements Runnable {
    public final int f495a;
    public final h6 f496b;

    public a6(h6 h6Var, int i3) {
        this.f495a = i3;
        this.f496b = h6Var;
    }

    @Override
    public final void run() {
        switch (this.f495a) {
            case 0:
                this.f496b.d1();
                return;
            default:
                h6 h6Var = this.f496b;
                h6Var.f684b2.O(true);
                org.telegram.messenger.g0.i3(new a6(h6Var, 0), 150L);
                return;
        }
    }
}
