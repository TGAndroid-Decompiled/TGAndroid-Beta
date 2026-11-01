package bi;

import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.z60;
public final class j implements Runnable {
    public final int f3105a;
    public final z60 f3106b;

    public j(z60 z60Var, int i10) {
        this.f3105a = i10;
        this.f3106b = z60Var;
    }

    @Override
    public final void run() {
        switch (this.f3105a) {
            case 0:
                this.f3106b.s();
                return;
            case 1:
                this.f3106b.s();
                return;
            case 2:
                this.f3106b.s();
                return;
            case 3:
                u60 u60Var = this.f3106b.f33034m;
                if (u60Var != null) {
                    org.telegram.messenger.i0.v1(u60Var.getContentView());
                    return;
                }
                return;
            case 4:
                u60 u60Var2 = this.f3106b.f33034m;
                if (u60Var2 != null) {
                    org.telegram.messenger.i0.v1(u60Var2.getContentView());
                    return;
                }
                return;
            case 5:
                u60 u60Var3 = this.f3106b.f33034m;
                if (u60Var3 != null) {
                    org.telegram.messenger.i0.v1(u60Var3.getContentView());
                    return;
                }
                return;
            case 6:
                u60 u60Var4 = this.f3106b.f33034m;
                if (u60Var4 != null) {
                    org.telegram.messenger.i0.v1(u60Var4.getContentView());
                    return;
                }
                return;
            case 7:
                u60 u60Var5 = this.f3106b.f33034m;
                if (u60Var5 != null) {
                    org.telegram.messenger.i0.v1(u60Var5.getContentView());
                    return;
                }
                return;
            default:
                u60 u60Var6 = this.f3106b.f33034m;
                if (u60Var6 != null) {
                    org.telegram.messenger.i0.v1(u60Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
