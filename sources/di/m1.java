package di;
public final class m1 implements Runnable {
    public final int f9042a;
    public final c6 f9043b;
    public final long f9044c;

    public m1(c6 c6Var, long j3, int i7) {
        this.f9042a = i7;
        this.f9043b = c6Var;
        this.f9044c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f9042a;
        long j3 = this.f9044c;
        c6 c6Var = this.f9043b;
        switch (i7) {
            case 0:
                c6Var.V1(j3);
                return;
            case 1:
                c6Var.V1(j3);
                return;
            case 2:
                l1 l1Var = c6Var.f8339q3;
                c6Var.t2(1, true, null);
                if (j3 > 0) {
                    org.telegram.messenger.g0.r(l1Var);
                    org.telegram.messenger.g0.h3(l1Var);
                    return;
                }
                return;
            case 3:
                c6Var.V1(j3);
                return;
            case 4:
                c6Var.V1(j3);
                return;
            case 5:
                c6Var.U1(j3);
                return;
            case 6:
                bb bbVar = new bb(c6Var.getContext(), c6Var.J0, this.f9044c, 10, null, new s2(4, c6Var, new boolean[]{false}), 0L);
                bbVar.setOnDismissListener(new k3(c6Var, 0));
                bbVar.show();
                return;
            case 7:
                c6Var.V1(j3);
                return;
            case 8:
                c6Var.U1(j3);
                return;
            case 9:
                c6Var.V1(j3);
                return;
            case 10:
                c6Var.U1(j3);
                return;
            case 11:
                c6Var.V1(j3);
                return;
            default:
                c6Var.U1(j3);
                return;
        }
    }
}
