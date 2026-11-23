package bi;
public final class o3 implements Runnable {
    public final int f3972a;
    public final s3 f3973b;

    public o3(s3 s3Var, int i7) {
        this.f3972a = i7;
        this.f3973b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f3972a) {
            case 0:
                s3 s3Var = this.f3973b;
                if (s3Var.f4075l2) {
                    s3Var.f4075l2 = false;
                    s3Var.d2.setLoading(false);
                    s3Var.g1();
                    return;
                }
                return;
            case 1:
                s3 s3Var2 = this.f3973b;
                if (!s3Var2.f4073j2) {
                    s3Var2.f4073j2 = true;
                    s3Var2.f4072i2 = false;
                    s3Var2.f4071h2 = false;
                    s3Var2.dismiss();
                    Runnable runnable = s3Var2.f4081r2;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                if (!s3Var2.f4074k2) {
                    s3Var2.f4074k2 = true;
                    ai.j1 j1Var = s3Var2.f4083t2;
                    if (j1Var != null) {
                        j1Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                this.f3973b.f1();
                return;
            default:
                this.f3973b.dismiss();
                return;
        }
    }
}
