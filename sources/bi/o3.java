package bi;
public final class o3 implements Runnable {
    public final int f3967a;
    public final s3 f3968b;

    public o3(s3 s3Var, int i7) {
        this.f3967a = i7;
        this.f3968b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f3967a) {
            case 0:
                s3 s3Var = this.f3968b;
                if (s3Var.f4073l2) {
                    s3Var.f4073l2 = false;
                    s3Var.d2.setLoading(false);
                    s3Var.g1();
                    return;
                }
                return;
            case 1:
                s3 s3Var2 = this.f3968b;
                if (!s3Var2.f4071j2) {
                    s3Var2.f4071j2 = true;
                    s3Var2.f4070i2 = false;
                    s3Var2.f4069h2 = false;
                    s3Var2.dismiss();
                    Runnable runnable = s3Var2.f4079r2;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                if (!s3Var2.f4072k2) {
                    s3Var2.f4072k2 = true;
                    ai.c1 c1Var = s3Var2.f4081t2;
                    if (c1Var != null) {
                        c1Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                this.f3968b.f1();
                return;
            default:
                this.f3968b.dismiss();
                return;
        }
    }
}
