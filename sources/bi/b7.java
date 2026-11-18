package bi;
public final class b7 implements Runnable {
    public final int f3443a;
    public final org.telegram.ui.ActionBar.k5 f3444b;

    public b7(org.telegram.ui.ActionBar.k5 k5Var, int i7) {
        this.f3443a = i7;
        this.f3444b = k5Var;
    }

    @Override
    public final void run() {
        switch (this.f3443a) {
            case 0:
                this.f3444b.a(true);
                return;
            case 1:
                this.f3444b.a(true);
                return;
            default:
                org.telegram.ui.ActionBar.k5 k5Var = this.f3444b;
                if (!k5Var.I && k5Var.S) {
                    k5Var.c();
                    return;
                }
                return;
        }
    }
}
