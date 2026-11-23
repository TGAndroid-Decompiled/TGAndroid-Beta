package bi;

import org.telegram.ui.Components.q60;
import org.telegram.ui.Components.x60;
public final class h6 implements Runnable {
    public final int f3645a;
    public final x60 f3646b;

    public h6(x60 x60Var, int i7) {
        this.f3645a = i7;
        this.f3646b = x60Var;
    }

    @Override
    public final void run() {
        switch (this.f3645a) {
            case 0:
                this.f3646b.s();
                return;
            case 1:
                q60 q60Var = this.f3646b.f41881m;
                if (q60Var != null) {
                    org.telegram.messenger.g0.v1(q60Var.getContentView());
                    return;
                }
                return;
            case 2:
                q60 q60Var2 = this.f3646b.f41881m;
                if (q60Var2 != null) {
                    org.telegram.messenger.g0.v1(q60Var2.getContentView());
                    return;
                }
                return;
            case 3:
                q60 q60Var3 = this.f3646b.f41881m;
                if (q60Var3 != null) {
                    org.telegram.messenger.g0.v1(q60Var3.getContentView());
                    return;
                }
                return;
            case 4:
                q60 q60Var4 = this.f3646b.f41881m;
                if (q60Var4 != null) {
                    org.telegram.messenger.g0.v1(q60Var4.getContentView());
                    return;
                }
                return;
            case 5:
                q60 q60Var5 = this.f3646b.f41881m;
                if (q60Var5 != null) {
                    org.telegram.messenger.g0.v1(q60Var5.getContentView());
                    return;
                }
                return;
            case 6:
                q60 q60Var6 = this.f3646b.f41881m;
                if (q60Var6 != null) {
                    org.telegram.messenger.g0.v1(q60Var6.getContentView());
                    return;
                }
                return;
            case 7:
                this.f3646b.s();
                return;
            default:
                this.f3646b.s();
                return;
        }
    }
}
