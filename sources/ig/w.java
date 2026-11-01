package ig;
public final class w implements Runnable {
    public final int f8496a;
    public final a0 f8497b;

    public w(a0 a0Var, int i10) {
        this.f8496a = i10;
        this.f8497b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f8496a) {
            case 0:
                a0 a0Var = this.f8497b;
                h hVar = a0Var.A;
                if (hVar != null) {
                    a0Var.f8247a.g(hVar);
                    a0Var.A = null;
                    return;
                }
                return;
            default:
                this.f8497b.a(null, true, null);
                return;
        }
    }
}
