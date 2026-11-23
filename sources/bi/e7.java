package bi;
public final class e7 implements Runnable {
    public final int f3602a;
    public final org.telegram.ui.ActionBar.j5 f3603b;

    public e7(org.telegram.ui.ActionBar.j5 j5Var, int i7) {
        this.f3602a = i7;
        this.f3603b = j5Var;
    }

    @Override
    public final void run() {
        switch (this.f3602a) {
            case 0:
                this.f3603b.a(true);
                return;
            case 1:
                this.f3603b.a(true);
                return;
            default:
                org.telegram.ui.ActionBar.j5 j5Var = this.f3603b;
                if (!j5Var.I && j5Var.S) {
                    j5Var.c();
                    return;
                }
                return;
        }
    }
}
