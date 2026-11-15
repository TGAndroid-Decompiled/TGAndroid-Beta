package bi;
public final class t4 implements Runnable {
    public final int f3880a;
    public final org.telegram.ui.ActionBar.g5 f3881b;

    public t4(org.telegram.ui.ActionBar.g5 g5Var, int i7) {
        this.f3880a = i7;
        this.f3881b = g5Var;
    }

    @Override
    public final void run() {
        switch (this.f3880a) {
            case 0:
                this.f3881b.a(true);
                return;
            case 1:
                this.f3881b.a(true);
                return;
            default:
                org.telegram.ui.ActionBar.g5 g5Var = this.f3881b;
                if (!g5Var.E && g5Var.O) {
                    g5Var.c();
                    return;
                }
                return;
        }
    }
}
