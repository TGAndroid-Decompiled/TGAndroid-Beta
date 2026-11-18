package bi;

import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.y60;
public final class b6 implements Runnable {
    public final int f3441a;
    public final y60 f3442b;

    public b6(y60 y60Var, int i7) {
        this.f3441a = i7;
        this.f3442b = y60Var;
    }

    @Override
    public final void run() {
        switch (this.f3441a) {
            case 0:
                this.f3442b.s();
                return;
            case 1:
                r60 r60Var = this.f3442b.f42364m;
                if (r60Var != null) {
                    org.telegram.messenger.g0.v1(r60Var.getContentView());
                    return;
                }
                return;
            case 2:
                r60 r60Var2 = this.f3442b.f42364m;
                if (r60Var2 != null) {
                    org.telegram.messenger.g0.v1(r60Var2.getContentView());
                    return;
                }
                return;
            case 3:
                r60 r60Var3 = this.f3442b.f42364m;
                if (r60Var3 != null) {
                    org.telegram.messenger.g0.v1(r60Var3.getContentView());
                    return;
                }
                return;
            case 4:
                r60 r60Var4 = this.f3442b.f42364m;
                if (r60Var4 != null) {
                    org.telegram.messenger.g0.v1(r60Var4.getContentView());
                    return;
                }
                return;
            case 5:
                r60 r60Var5 = this.f3442b.f42364m;
                if (r60Var5 != null) {
                    org.telegram.messenger.g0.v1(r60Var5.getContentView());
                    return;
                }
                return;
            case 6:
                r60 r60Var6 = this.f3442b.f42364m;
                if (r60Var6 != null) {
                    org.telegram.messenger.g0.v1(r60Var6.getContentView());
                    return;
                }
                return;
            case 7:
                this.f3442b.s();
                return;
            default:
                this.f3442b.s();
                return;
        }
    }
}
