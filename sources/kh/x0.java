package kh;

import org.telegram.messenger.Utilities;
public final class x0 implements Runnable {
    public final int f10915a;
    public final h2 f10916b;
    public final Utilities.Callback f10917c;

    public x0(h2 h2Var, Utilities.Callback callback, int i10) {
        this.f10915a = i10;
        this.f10916b = h2Var;
        this.f10917c = callback;
    }

    @Override
    public final void run() {
        switch (this.f10915a) {
            case 0:
                h2 h2Var = this.f10916b;
                Utilities.Callback callback = this.f10917c;
                if (callback != null) {
                    h2Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                h2Var.dismiss();
                return;
            case 1:
                h2 h2Var2 = this.f10916b;
                Utilities.Callback callback2 = this.f10917c;
                if (callback2 != null) {
                    h2Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                h2Var2.dismiss();
                return;
            default:
                h2 h2Var3 = this.f10916b;
                Utilities.Callback callback3 = this.f10917c;
                if (callback3 != null) {
                    h2Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                h2Var3.dismiss();
                return;
        }
    }
}
