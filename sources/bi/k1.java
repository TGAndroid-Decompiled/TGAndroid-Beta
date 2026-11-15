package bi;

import org.telegram.messenger.z10;
public final class k1 implements Runnable {
    public final int f3643a;
    public final s2 f3644b;
    public final z10 f3645c;

    public k1(s2 s2Var, z10 z10Var, int i7) {
        this.f3643a = i7;
        this.f3644b = s2Var;
        this.f3645c = z10Var;
    }

    @Override
    public final void run() {
        switch (this.f3643a) {
            case 0:
                s2 s2Var = this.f3644b;
                z10 z10Var = this.f3645c;
                if (z10Var != null) {
                    s2Var.getClass();
                    z10Var.a(Boolean.FALSE);
                }
                s2Var.dismiss();
                return;
            case 1:
                s2 s2Var2 = this.f3644b;
                z10 z10Var2 = this.f3645c;
                if (z10Var2 != null) {
                    s2Var2.getClass();
                    z10Var2.a(Boolean.FALSE);
                }
                s2Var2.dismiss();
                return;
            default:
                s2 s2Var3 = this.f3644b;
                z10 z10Var3 = this.f3645c;
                if (z10Var3 != null) {
                    s2Var3.getClass();
                    z10Var3.a(Boolean.FALSE);
                }
                s2Var3.dismiss();
                return;
        }
    }
}
