package bi;
public final class c7 implements Runnable {
    public final int f3529a;
    public final org.telegram.ui.ActionBar.k5 f3530b;

    public c7(org.telegram.ui.ActionBar.k5 k5Var, int i7) {
        this.f3529a = i7;
        this.f3530b = k5Var;
    }

    @Override
    public final void run() {
        switch (this.f3529a) {
            case 0:
                this.f3530b.a(true);
                return;
            case 1:
                this.f3530b.a(true);
                return;
            default:
                org.telegram.ui.ActionBar.k5 k5Var = this.f3530b;
                if (!k5Var.I && k5Var.S) {
                    k5Var.c();
                    return;
                }
                return;
        }
    }
}
