package li;

import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.k60;
public final class h implements Runnable {
    public final int f18612a;
    public final k60 f18613b;

    public h(k60 k60Var, int i7) {
        this.f18612a = i7;
        this.f18613b = k60Var;
    }

    @Override
    public final void run() {
        switch (this.f18612a) {
            case 0:
                this.f18613b.s();
                return;
            case 1:
                this.f18613b.s();
                return;
            case 2:
                this.f18613b.s();
                return;
            case 3:
                f60 f60Var = this.f18613b.f35206m;
                if (f60Var != null) {
                    org.telegram.messenger.g0.v1(f60Var.getContentView());
                    return;
                }
                return;
            case 4:
                f60 f60Var2 = this.f18613b.f35206m;
                if (f60Var2 != null) {
                    org.telegram.messenger.g0.v1(f60Var2.getContentView());
                    return;
                }
                return;
            case 5:
                f60 f60Var3 = this.f18613b.f35206m;
                if (f60Var3 != null) {
                    org.telegram.messenger.g0.v1(f60Var3.getContentView());
                    return;
                }
                return;
            case 6:
                f60 f60Var4 = this.f18613b.f35206m;
                if (f60Var4 != null) {
                    org.telegram.messenger.g0.v1(f60Var4.getContentView());
                    return;
                }
                return;
            case 7:
                f60 f60Var5 = this.f18613b.f35206m;
                if (f60Var5 != null) {
                    org.telegram.messenger.g0.v1(f60Var5.getContentView());
                    return;
                }
                return;
            default:
                f60 f60Var6 = this.f18613b.f35206m;
                if (f60Var6 != null) {
                    org.telegram.messenger.g0.v1(f60Var6.getContentView());
                    return;
                }
                return;
        }
    }
}
