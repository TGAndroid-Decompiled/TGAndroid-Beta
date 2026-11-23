package bi;
public final class q3 implements Runnable {
    public final int f3994a;
    public final u3 f3995b;

    public q3(u3 u3Var, int i7) {
        this.f3994a = i7;
        this.f3995b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f3994a) {
            case 0:
                u3 u3Var = this.f3995b;
                if (u3Var.f4107l2) {
                    u3Var.f4107l2 = false;
                    u3Var.d2.setLoading(false);
                    u3Var.g1();
                    return;
                }
                return;
            case 1:
                u3 u3Var2 = this.f3995b;
                if (!u3Var2.f4105j2) {
                    u3Var2.f4105j2 = true;
                    u3Var2.f4104i2 = false;
                    u3Var2.f4103h2 = false;
                    u3Var2.dismiss();
                    Runnable runnable = u3Var2.f4113r2;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                if (!u3Var2.f4106k2) {
                    u3Var2.f4106k2 = true;
                    ai.e1 e1Var = u3Var2.f4115t2;
                    if (e1Var != null) {
                        e1Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                this.f3995b.f1();
                return;
            default:
                this.f3995b.dismiss();
                return;
        }
    }
}
