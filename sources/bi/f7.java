package bi;
public final class f7 implements Runnable {
    public final int f3625a;
    public final org.telegram.ui.ActionBar.j5 f3626b;

    public f7(org.telegram.ui.ActionBar.j5 j5Var, int i7) {
        this.f3625a = i7;
        this.f3626b = j5Var;
    }

    @Override
    public final void run() {
        switch (this.f3625a) {
            case 0:
                this.f3626b.a(true);
                return;
            case 1:
                this.f3626b.a(true);
                return;
            default:
                org.telegram.ui.ActionBar.j5 j5Var = this.f3626b;
                if (!j5Var.I && j5Var.S) {
                    j5Var.c();
                    return;
                }
                return;
        }
    }
}
