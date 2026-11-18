package bi;
public final class k3 implements Runnable {
    public final int f3803a;
    public final o3 f3804b;

    public k3(o3 o3Var, int i7) {
        this.f3803a = i7;
        this.f3804b = o3Var;
    }

    @Override
    public final void run() {
        switch (this.f3803a) {
            case 0:
                o3 o3Var = this.f3804b;
                if (o3Var.f3935l2) {
                    o3Var.f3935l2 = false;
                    o3Var.d2.setLoading(false);
                    o3Var.g1();
                    return;
                }
                return;
            case 1:
                o3 o3Var2 = this.f3804b;
                if (!o3Var2.f3933j2) {
                    o3Var2.f3933j2 = true;
                    o3Var2.f3932i2 = false;
                    o3Var2.f3931h2 = false;
                    o3Var2.dismiss();
                    Runnable runnable = o3Var2.f3941r2;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                if (!o3Var2.f3934k2) {
                    o3Var2.f3934k2 = true;
                    ai.a1 a1Var = o3Var2.f3943t2;
                    if (a1Var != null) {
                        a1Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                this.f3804b.f1();
                return;
            default:
                this.f3804b.dismiss();
                return;
        }
    }
}
