package bi;
public final class k3 implements Runnable {
    public final int f3781a;
    public final o3 f3782b;

    public k3(o3 o3Var, int i7) {
        this.f3781a = i7;
        this.f3782b = o3Var;
    }

    @Override
    public final void run() {
        switch (this.f3781a) {
            case 0:
                o3 o3Var = this.f3782b;
                if (o3Var.f3901l2) {
                    o3Var.f3901l2 = false;
                    o3Var.d2.setLoading(false);
                    o3Var.g1();
                    return;
                }
                return;
            case 1:
                o3 o3Var2 = this.f3782b;
                if (!o3Var2.f3899j2) {
                    o3Var2.f3899j2 = true;
                    o3Var2.f3898i2 = false;
                    o3Var2.f3897h2 = false;
                    o3Var2.dismiss();
                    Runnable runnable = o3Var2.f3907r2;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                if (!o3Var2.f3900k2) {
                    o3Var2.f3900k2 = true;
                    ai.a1 a1Var = o3Var2.f3909t2;
                    if (a1Var != null) {
                        a1Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                this.f3782b.f1();
                return;
            default:
                this.f3782b.dismiss();
                return;
        }
    }
}
