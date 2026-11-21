package di;
public final class m1 implements Runnable {
    public final int f9322a;
    public final f6 f9323b;
    public final long f9324c;

    public m1(f6 f6Var, long j3, int i7) {
        this.f9322a = i7;
        this.f9323b = f6Var;
        this.f9324c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f9322a;
        long j3 = this.f9324c;
        f6 f6Var = this.f9323b;
        switch (i7) {
            case 0:
                f6Var.h2(j3);
                return;
            case 1:
                f6Var.h2(j3);
                return;
            case 2:
                k1 k1Var = f6Var.f8829t3;
                f6Var.H2(1, true, null);
                if (j3 > 0) {
                    org.telegram.messenger.g0.r(k1Var);
                    org.telegram.messenger.g0.g3(k1Var);
                    return;
                }
                return;
            case 3:
                f6Var.h2(j3);
                return;
            case 4:
                f6Var.h2(j3);
                return;
            case 5:
                f6Var.d2(j3);
                return;
            case 6:
                fb fbVar = new fb(f6Var.getContext(), f6Var.J0, this.f9324c, 10, null, new f2(6, f6Var, new boolean[]{false}), 0L);
                fbVar.setOnDismissListener(new n3(f6Var, 0));
                fbVar.show();
                return;
            case 7:
                f6Var.h2(j3);
                return;
            case 8:
                f6Var.d2(j3);
                return;
            case 9:
                f6Var.h2(j3);
                return;
            case 10:
                f6Var.d2(j3);
                return;
            case 11:
                f6Var.h2(j3);
                return;
            default:
                f6Var.d2(j3);
                return;
        }
    }
}
