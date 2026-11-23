package bi;
public final class h7 implements Runnable {
    public final int f3647a;
    public final org.telegram.ui.ActionBar.k5 f3648b;

    public h7(org.telegram.ui.ActionBar.k5 k5Var, int i7) {
        this.f3647a = i7;
        this.f3648b = k5Var;
    }

    @Override
    public final void run() {
        switch (this.f3647a) {
            case 0:
                this.f3648b.a(true);
                return;
            case 1:
                this.f3648b.a(true);
                return;
            default:
                org.telegram.ui.ActionBar.k5 k5Var = this.f3648b;
                if (!k5Var.I && k5Var.S) {
                    k5Var.c();
                    return;
                }
                return;
        }
    }
}
