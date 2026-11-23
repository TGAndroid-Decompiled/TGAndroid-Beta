package bi;

import org.telegram.messenger.y10;
public final class h2 implements Runnable {
    public final int f3696a;
    public final n3 f3697b;
    public final y10 f3698c;

    public h2(n3 n3Var, y10 y10Var, int i7) {
        this.f3696a = i7;
        this.f3697b = n3Var;
        this.f3698c = y10Var;
    }

    @Override
    public final void run() {
        switch (this.f3696a) {
            case 0:
                n3 n3Var = this.f3697b;
                y10 y10Var = this.f3698c;
                if (y10Var != null) {
                    n3Var.getClass();
                    y10Var.a(Boolean.FALSE);
                }
                n3Var.dismiss();
                return;
            case 1:
                n3 n3Var2 = this.f3697b;
                y10 y10Var2 = this.f3698c;
                if (y10Var2 != null) {
                    n3Var2.getClass();
                    y10Var2.a(Boolean.FALSE);
                }
                n3Var2.dismiss();
                return;
            default:
                n3 n3Var3 = this.f3697b;
                y10 y10Var3 = this.f3698c;
                if (y10Var3 != null) {
                    n3Var3.getClass();
                    y10Var3.a(Boolean.FALSE);
                }
                n3Var3.dismiss();
                return;
        }
    }
}
