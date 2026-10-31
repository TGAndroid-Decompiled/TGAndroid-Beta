package ig;
public final class w implements Runnable {
    public final int f8495a;
    public final a0 f8496b;

    public w(a0 a0Var, int i10) {
        this.f8495a = i10;
        this.f8496b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f8495a) {
            case 0:
                a0 a0Var = this.f8496b;
                h hVar = a0Var.A;
                if (hVar != null) {
                    a0Var.f8246a.g(hVar);
                    a0Var.A = null;
                    return;
                }
                return;
            default:
                this.f8496b.a(null, true, null);
                return;
        }
    }
}
