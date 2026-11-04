package ci;
public final class t1 implements Runnable {
    public final int f6011a;
    public final l6 f6012b;
    public final long f6013c;

    public t1(l6 l6Var, long j10, int i3) {
        this.f6011a = i3;
        this.f6012b = l6Var;
        this.f6013c = j10;
    }

    @Override
    public final void run() {
        int i3 = this.f6011a;
        long j10 = this.f6013c;
        l6 l6Var = this.f6012b;
        switch (i3) {
            case 0:
                l6Var.U1(j10);
                return;
            case 1:
                l6Var.U1(j10);
                return;
            case 2:
                s1 s1Var = l6Var.f5471n3;
                l6Var.s2(1, true, null);
                if (j10 > 0) {
                    org.telegram.messenger.g0.r(s1Var);
                    org.telegram.messenger.g0.h3(s1Var);
                    return;
                }
                return;
            case 3:
                l6Var.U1(j10);
                return;
            case 4:
                l6Var.U1(j10);
                return;
            case 5:
                new ai.b3(l6Var.getContext(), l6Var.f28583a, this.f6013c, null, new k3(l6Var, 1)).show();
                return;
            case 6:
                mb mbVar = new mb(l6Var.getContext(), l6Var.J0, this.f6013c, 10, null, new e0(9, l6Var, new boolean[]{false}), 0L);
                mbVar.setOnDismissListener(new t3(l6Var, 0));
                mbVar.show();
                return;
            case 7:
                l6Var.U1(j10);
                return;
            case 8:
                new ai.b3(l6Var.getContext(), l6Var.f28583a, this.f6013c, null, new k3(l6Var, 1)).show();
                return;
            case 9:
                l6Var.U1(j10);
                return;
            case 10:
                new ai.b3(l6Var.getContext(), l6Var.f28583a, this.f6013c, null, new k3(l6Var, 1)).show();
                return;
            case 11:
                l6Var.U1(j10);
                return;
            default:
                new ai.b3(l6Var.getContext(), l6Var.f28583a, this.f6013c, null, new k3(l6Var, 1)).show();
                return;
        }
    }
}
