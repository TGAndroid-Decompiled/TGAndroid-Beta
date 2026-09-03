package kh;

import org.telegram.messenger.Utilities;
public final class x0 implements Runnable {
    public final int f11029a;
    public final g2 f11030b;
    public final Utilities.Callback f11031c;

    public x0(g2 g2Var, Utilities.Callback callback, int i10) {
        this.f11029a = i10;
        this.f11030b = g2Var;
        this.f11031c = callback;
    }

    @Override
    public final void run() {
        switch (this.f11029a) {
            case 0:
                g2 g2Var = this.f11030b;
                Utilities.Callback callback = this.f11031c;
                if (callback != null) {
                    g2Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                g2Var.dismiss();
                return;
            case 1:
                g2 g2Var2 = this.f11030b;
                Utilities.Callback callback2 = this.f11031c;
                if (callback2 != null) {
                    g2Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                g2Var2.dismiss();
                return;
            default:
                g2 g2Var3 = this.f11030b;
                Utilities.Callback callback3 = this.f11031c;
                if (callback3 != null) {
                    g2Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                g2Var3.dismiss();
                return;
        }
    }
}
