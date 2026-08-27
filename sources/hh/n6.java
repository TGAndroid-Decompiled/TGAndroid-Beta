package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.tq0;

public final class n6 implements Runnable {

    public final int f9786a;

    public final boolean[] f9787b;

    public final Utilities.Callback f9788c;

    public n6(u7 u7Var, boolean[] zArr, Utilities.Callback callback) {
        this.f9786a = 0;
        this.f9787b = zArr;
        this.f9788c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f9786a) {
            case 0:
                boolean[] zArr = this.f9787b;
                if (!zArr[0] && (callback = this.f9788c) != null) {
                    callback.run("cancelled");
                    zArr[0] = true;
                    break;
                }
                break;
            case 1:
                boolean[] zArr2 = this.f9787b;
                if (!zArr2[0] && (callback2 = this.f9788c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new tq0(3), 220L);
                break;
            default:
                boolean[] zArr3 = this.f9787b;
                if (!zArr3[0] && (callback3 = this.f9788c) != null) {
                    zArr3[0] = true;
                    callback3.run(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    public n6(boolean[] zArr, Utilities.Callback callback, int i10) {
        this.f9786a = i10;
        this.f9787b = zArr;
        this.f9788c = callback;
    }
}
