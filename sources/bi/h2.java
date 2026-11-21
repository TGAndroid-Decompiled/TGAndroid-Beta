package bi;

import org.telegram.messenger.x10;
public final class h2 implements Runnable {
    public final int f3692a;
    public final n3 f3693b;
    public final x10 f3694c;

    public h2(n3 n3Var, x10 x10Var, int i7) {
        this.f3692a = i7;
        this.f3693b = n3Var;
        this.f3694c = x10Var;
    }

    @Override
    public final void run() {
        switch (this.f3692a) {
            case 0:
                n3 n3Var = this.f3693b;
                x10 x10Var = this.f3694c;
                if (x10Var != null) {
                    n3Var.getClass();
                    x10Var.a(Boolean.FALSE);
                }
                n3Var.dismiss();
                return;
            case 1:
                n3 n3Var2 = this.f3693b;
                x10 x10Var2 = this.f3694c;
                if (x10Var2 != null) {
                    n3Var2.getClass();
                    x10Var2.a(Boolean.FALSE);
                }
                n3Var2.dismiss();
                return;
            default:
                n3 n3Var3 = this.f3693b;
                x10 x10Var3 = this.f3694c;
                if (x10Var3 != null) {
                    n3Var3.getClass();
                    x10Var3.a(Boolean.FALSE);
                }
                n3Var3.dismiss();
                return;
        }
    }
}
