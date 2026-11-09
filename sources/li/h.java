package li;

import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.l60;
public final class h implements Runnable {
    public final int f18615a;
    public final l60 f18616b;

    public h(l60 l60Var, int i7) {
        this.f18615a = i7;
        this.f18616b = l60Var;
    }

    @Override
    public final void run() {
        switch (this.f18615a) {
            case 0:
                this.f18616b.s();
                return;
            case 1:
                this.f18616b.s();
                return;
            case 2:
                this.f18616b.s();
                return;
            case 3:
                g60 g60Var = this.f18616b.f35607m;
                if (g60Var != null) {
                    org.telegram.messenger.g0.v1(g60Var.getContentView());
                    return;
                }
                return;
            case 4:
                g60 g60Var2 = this.f18616b.f35607m;
                if (g60Var2 != null) {
                    org.telegram.messenger.g0.v1(g60Var2.getContentView());
                    return;
                }
                return;
            case 5:
                g60 g60Var3 = this.f18616b.f35607m;
                if (g60Var3 != null) {
                    org.telegram.messenger.g0.v1(g60Var3.getContentView());
                    return;
                }
                return;
            case 6:
                g60 g60Var4 = this.f18616b.f35607m;
                if (g60Var4 != null) {
                    org.telegram.messenger.g0.v1(g60Var4.getContentView());
                    return;
                }
                return;
            case 7:
                g60 g60Var5 = this.f18616b.f35607m;
                if (g60Var5 != null) {
                    org.telegram.messenger.g0.v1(g60Var5.getContentView());
                    return;
                }
                return;
            default:
                g60 g60Var6 = this.f18616b.f35607m;
                if (g60Var6 != null) {
                    org.telegram.messenger.g0.v1(g60Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
