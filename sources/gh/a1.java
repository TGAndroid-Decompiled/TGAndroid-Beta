package gh;

import org.telegram.messenger.Utilities;

public final class a1 implements Runnable {

    public final int f7131a;

    public final k2 f7132b;

    public final Utilities.Callback f7133c;

    public a1(k2 k2Var, Utilities.Callback callback, int i10) {
        this.f7131a = i10;
        this.f7132b = k2Var;
        this.f7133c = callback;
    }

    @Override
    public final void run() {
        switch (this.f7131a) {
            case 0:
                k2 k2Var = this.f7132b;
                Utilities.Callback callback = this.f7133c;
                if (callback != null) {
                    k2Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                k2Var.dismiss();
                break;
            case 1:
                k2 k2Var2 = this.f7132b;
                Utilities.Callback callback2 = this.f7133c;
                if (callback2 != null) {
                    k2Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                k2Var2.dismiss();
                break;
            default:
                k2 k2Var3 = this.f7132b;
                Utilities.Callback callback3 = this.f7133c;
                if (callback3 != null) {
                    k2Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                k2Var3.dismiss();
                break;
        }
    }
}
