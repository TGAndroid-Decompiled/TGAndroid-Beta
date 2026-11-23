package bi;

import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.t60;
public final class e6 implements Runnable {
    public final int f3600a;
    public final a70 f3601b;

    public e6(a70 a70Var, int i7) {
        this.f3600a = i7;
        this.f3601b = a70Var;
    }

    @Override
    public final void run() {
        switch (this.f3600a) {
            case 0:
                this.f3601b.s();
                return;
            case 1:
                t60 t60Var = this.f3601b.f33386m;
                if (t60Var != null) {
                    org.telegram.messenger.g0.v1(t60Var.getContentView());
                    return;
                }
                return;
            case 2:
                t60 t60Var2 = this.f3601b.f33386m;
                if (t60Var2 != null) {
                    org.telegram.messenger.g0.v1(t60Var2.getContentView());
                    return;
                }
                return;
            case 3:
                t60 t60Var3 = this.f3601b.f33386m;
                if (t60Var3 != null) {
                    org.telegram.messenger.g0.v1(t60Var3.getContentView());
                    return;
                }
                return;
            case 4:
                t60 t60Var4 = this.f3601b.f33386m;
                if (t60Var4 != null) {
                    org.telegram.messenger.g0.v1(t60Var4.getContentView());
                    return;
                }
                return;
            case 5:
                t60 t60Var5 = this.f3601b.f33386m;
                if (t60Var5 != null) {
                    org.telegram.messenger.g0.v1(t60Var5.getContentView());
                    return;
                }
                return;
            case 6:
                t60 t60Var6 = this.f3601b.f33386m;
                if (t60Var6 != null) {
                    org.telegram.messenger.g0.v1(t60Var6.getContentView());
                    return;
                }
                return;
            case 7:
                this.f3601b.s();
                return;
            default:
                this.f3601b.s();
                return;
        }
    }
}
