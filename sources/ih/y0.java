package ih;

import org.telegram.messenger.Utilities;
public final class y0 implements Runnable {
    public final int f9517a;
    public final h2 f9518b;
    public final Utilities.Callback f9519c;

    public y0(h2 h2Var, Utilities.Callback callback, int i10) {
        this.f9517a = i10;
        this.f9518b = h2Var;
        this.f9519c = callback;
    }

    @Override
    public final void run() {
        switch (this.f9517a) {
            case 0:
                h2 h2Var = this.f9518b;
                Utilities.Callback callback = this.f9519c;
                if (callback != null) {
                    h2Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                h2Var.dismiss();
                return;
            case 1:
                h2 h2Var2 = this.f9518b;
                Utilities.Callback callback2 = this.f9519c;
                if (callback2 != null) {
                    h2Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                h2Var2.dismiss();
                return;
            default:
                h2 h2Var3 = this.f9518b;
                Utilities.Callback callback3 = this.f9519c;
                if (callback3 != null) {
                    h2Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                h2Var3.dismiss();
                return;
        }
    }
}
