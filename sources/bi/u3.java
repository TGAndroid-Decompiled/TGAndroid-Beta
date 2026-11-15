package bi;

import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.m60;
public final class u3 implements Runnable {
    public final int f3895a;
    public final m60 f3896b;

    public u3(m60 m60Var, int i7) {
        this.f3895a = i7;
        this.f3896b = m60Var;
    }

    @Override
    public final void run() {
        switch (this.f3895a) {
            case 0:
                this.f3896b.s();
                return;
            case 1:
                i60 i60Var = this.f3896b.f37101m;
                if (i60Var != null) {
                    org.telegram.messenger.g0.v1(i60Var.getContentView());
                    return;
                }
                return;
            case 2:
                i60 i60Var2 = this.f3896b.f37101m;
                if (i60Var2 != null) {
                    org.telegram.messenger.g0.v1(i60Var2.getContentView());
                    return;
                }
                return;
            case 3:
                i60 i60Var3 = this.f3896b.f37101m;
                if (i60Var3 != null) {
                    org.telegram.messenger.g0.v1(i60Var3.getContentView());
                    return;
                }
                return;
            case 4:
                i60 i60Var4 = this.f3896b.f37101m;
                if (i60Var4 != null) {
                    org.telegram.messenger.g0.v1(i60Var4.getContentView());
                    return;
                }
                return;
            case 5:
                i60 i60Var5 = this.f3896b.f37101m;
                if (i60Var5 != null) {
                    org.telegram.messenger.g0.v1(i60Var5.getContentView());
                    return;
                }
                return;
            case 6:
                i60 i60Var6 = this.f3896b.f37101m;
                if (i60Var6 != null) {
                    org.telegram.messenger.g0.v1(i60Var6.getContentView());
                    return;
                }
                return;
            case 7:
                this.f3896b.s();
                return;
            default:
                this.f3896b.s();
                return;
        }
    }
}
