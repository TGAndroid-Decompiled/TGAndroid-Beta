package bi;

import org.telegram.messenger.x10;
public final class d2 implements Runnable {
    public final int f3539a;
    public final j3 f3540b;
    public final x10 f3541c;

    public d2(j3 j3Var, x10 x10Var, int i7) {
        this.f3539a = i7;
        this.f3540b = j3Var;
        this.f3541c = x10Var;
    }

    @Override
    public final void run() {
        switch (this.f3539a) {
            case 0:
                j3 j3Var = this.f3540b;
                x10 x10Var = this.f3541c;
                if (x10Var != null) {
                    j3Var.getClass();
                    x10Var.a(Boolean.FALSE);
                }
                j3Var.dismiss();
                return;
            case 1:
                j3 j3Var2 = this.f3540b;
                x10 x10Var2 = this.f3541c;
                if (x10Var2 != null) {
                    j3Var2.getClass();
                    x10Var2.a(Boolean.FALSE);
                }
                j3Var2.dismiss();
                return;
            default:
                j3 j3Var3 = this.f3540b;
                x10 x10Var3 = this.f3541c;
                if (x10Var3 != null) {
                    j3Var3.getClass();
                    x10Var3.a(Boolean.FALSE);
                }
                j3Var3.dismiss();
                return;
        }
    }
}
