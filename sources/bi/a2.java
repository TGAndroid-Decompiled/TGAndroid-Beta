package bi;
public final class a2 implements Runnable {
    public final int f3438a;
    public final k7 f3439b;
    public final long f3440c;

    public a2(k7 k7Var, long j3, int i7) {
        this.f3438a = i7;
        this.f3439b = k7Var;
        this.f3440c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f3438a;
        long j3 = this.f3440c;
        k7 k7Var = this.f3439b;
        switch (i7) {
            case 0:
                k7Var.T1(j3);
                return;
            case 1:
                k7Var.T1(j3);
                return;
            case 2:
                z1 z1Var = k7Var.f4190p3;
                k7Var.s2(1, true, null);
                if (j3 > 0) {
                    org.telegram.messenger.g0.r(z1Var);
                    org.telegram.messenger.g0.h3(z1Var);
                    return;
                }
                return;
            case 3:
                k7Var.T1(j3);
                return;
            case 4:
                k7Var.T1(j3);
                return;
            case 5:
                new zh.g1(k7Var.getContext(), k7Var.f28669a, this.f3440c, null, new y3(k7Var, 1)).show();
                return;
            case 6:
                tc tcVar = new tc(k7Var.getContext(), k7Var.I0, this.f3440c, 10, null, new a4(2, k7Var, new boolean[]{false}), 0L);
                tcVar.setOnDismissListener(new j4(k7Var, 0));
                tcVar.show();
                return;
            case 7:
                k7Var.T1(j3);
                return;
            case 8:
                new zh.g1(k7Var.getContext(), k7Var.f28669a, this.f3440c, null, new y3(k7Var, 1)).show();
                return;
            case 9:
                k7Var.T1(j3);
                return;
            case 10:
                new zh.g1(k7Var.getContext(), k7Var.f28669a, this.f3440c, null, new y3(k7Var, 1)).show();
                return;
            case 11:
                k7Var.T1(j3);
                return;
            default:
                new zh.g1(k7Var.getContext(), k7Var.f28669a, this.f3440c, null, new y3(k7Var, 1)).show();
                return;
        }
    }
}
