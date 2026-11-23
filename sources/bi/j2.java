package bi;

import org.telegram.messenger.y10;
public final class j2 implements Runnable {
    public final int f3712a;
    public final p3 f3713b;
    public final y10 f3714c;

    public j2(p3 p3Var, y10 y10Var, int i7) {
        this.f3712a = i7;
        this.f3713b = p3Var;
        this.f3714c = y10Var;
    }

    @Override
    public final void run() {
        switch (this.f3712a) {
            case 0:
                p3 p3Var = this.f3713b;
                y10 y10Var = this.f3714c;
                if (y10Var != null) {
                    p3Var.getClass();
                    y10Var.a(Boolean.FALSE);
                }
                p3Var.dismiss();
                return;
            case 1:
                p3 p3Var2 = this.f3713b;
                y10 y10Var2 = this.f3714c;
                if (y10Var2 != null) {
                    p3Var2.getClass();
                    y10Var2.a(Boolean.FALSE);
                }
                p3Var2.dismiss();
                return;
            default:
                p3 p3Var3 = this.f3713b;
                y10 y10Var3 = this.f3714c;
                if (y10Var3 != null) {
                    p3Var3.getClass();
                    y10Var3.a(Boolean.FALSE);
                }
                p3Var3.dismiss();
                return;
        }
    }
}
