package lh;

import org.telegram.messenger.Utilities;
public final class x0 implements Runnable {
    public final int f13072a;
    public final g2 f13073b;
    public final Utilities.Callback f13074c;

    public x0(g2 g2Var, Utilities.Callback callback, int i10) {
        this.f13072a = i10;
        this.f13073b = g2Var;
        this.f13074c = callback;
    }

    @Override
    public final void run() {
        switch (this.f13072a) {
            case 0:
                g2 g2Var = this.f13073b;
                Utilities.Callback callback = this.f13074c;
                if (callback != null) {
                    g2Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                g2Var.dismiss();
                return;
            case 1:
                g2 g2Var2 = this.f13073b;
                Utilities.Callback callback2 = this.f13074c;
                if (callback2 != null) {
                    g2Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                g2Var2.dismiss();
                return;
            default:
                g2 g2Var3 = this.f13073b;
                Utilities.Callback callback3 = this.f13074c;
                if (callback3 != null) {
                    g2Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                g2Var3.dismiss();
                return;
        }
    }
}
