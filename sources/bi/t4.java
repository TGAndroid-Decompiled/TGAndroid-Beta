package bi;
public final class t4 implements Runnable {
    public final int f3877a;
    public final org.telegram.ui.ActionBar.g5 f3878b;

    public t4(org.telegram.ui.ActionBar.g5 g5Var, int i7) {
        this.f3877a = i7;
        this.f3878b = g5Var;
    }

    @Override
    public final void run() {
        switch (this.f3877a) {
            case 0:
                this.f3878b.a(true);
                return;
            case 1:
                this.f3878b.a(true);
                return;
            default:
                org.telegram.ui.ActionBar.g5 g5Var = this.f3878b;
                if (!g5Var.E && g5Var.O) {
                    g5Var.c();
                    return;
                }
                return;
        }
    }
}
