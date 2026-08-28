package fh;

import org.telegram.messenger.Utilities;
public final class c1 implements Runnable {
    public final int f6395a;
    public final p2 f6396b;
    public final Utilities.Callback f6397c;

    public c1(p2 p2Var, Utilities.Callback callback, int i9) {
        this.f6395a = i9;
        this.f6396b = p2Var;
        this.f6397c = callback;
    }

    @Override
    public final void run() {
        switch (this.f6395a) {
            case 0:
                p2 p2Var = this.f6396b;
                Utilities.Callback callback = this.f6397c;
                if (callback != null) {
                    p2Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                p2Var.dismiss();
                return;
            case 1:
                p2 p2Var2 = this.f6396b;
                Utilities.Callback callback2 = this.f6397c;
                if (callback2 != null) {
                    p2Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                p2Var2.dismiss();
                return;
            default:
                p2 p2Var3 = this.f6396b;
                Utilities.Callback callback3 = this.f6397c;
                if (callback3 != null) {
                    p2Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                p2Var3.dismiss();
                return;
        }
    }
}
