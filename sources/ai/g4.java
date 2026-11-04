package ai;

import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.f60;
public final class g4 implements Runnable {
    public final int f660a;
    public final f60 f661b;

    public g4(f60 f60Var, int i3) {
        this.f660a = i3;
        this.f661b = f60Var;
    }

    @Override
    public final void run() {
        switch (this.f660a) {
            case 0:
                this.f661b.s();
                return;
            case 1:
                b60 b60Var = this.f661b.f33737m;
                if (b60Var != null) {
                    org.telegram.messenger.g0.v1(b60Var.getContentView());
                    return;
                }
                return;
            case 2:
                b60 b60Var2 = this.f661b.f33737m;
                if (b60Var2 != null) {
                    org.telegram.messenger.g0.v1(b60Var2.getContentView());
                    return;
                }
                return;
            case 3:
                b60 b60Var3 = this.f661b.f33737m;
                if (b60Var3 != null) {
                    org.telegram.messenger.g0.v1(b60Var3.getContentView());
                    return;
                }
                return;
            case 4:
                b60 b60Var4 = this.f661b.f33737m;
                if (b60Var4 != null) {
                    org.telegram.messenger.g0.v1(b60Var4.getContentView());
                    return;
                }
                return;
            case 5:
                b60 b60Var5 = this.f661b.f33737m;
                if (b60Var5 != null) {
                    org.telegram.messenger.g0.v1(b60Var5.getContentView());
                    return;
                }
                return;
            case 6:
                b60 b60Var6 = this.f661b.f33737m;
                if (b60Var6 != null) {
                    org.telegram.messenger.g0.v1(b60Var6.getContentView());
                    return;
                }
                return;
            case 7:
                this.f661b.s();
                return;
            default:
                this.f661b.s();
                return;
        }
    }
}
