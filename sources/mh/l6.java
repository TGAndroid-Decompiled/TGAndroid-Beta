package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.sj0;
public final class l6 implements Runnable {
    public final int f14393a;
    public final boolean[] f14394b;
    public final Utilities.Callback f14395c;

    public l6(t7 t7Var, boolean[] zArr, Utilities.Callback callback) {
        this.f14393a = 0;
        this.f14394b = zArr;
        this.f14395c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f14393a) {
            case 0:
                boolean[] zArr = this.f14394b;
                if (!zArr[0] && (callback = this.f14395c) != null) {
                    callback.run("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f14394b;
                if (!zArr2[0] && (callback2 = this.f14395c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new sj0(4), 220L);
                return;
            default:
                boolean[] zArr3 = this.f14394b;
                if (!zArr3[0] && (callback3 = this.f14395c) != null) {
                    zArr3[0] = true;
                    callback3.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public l6(boolean[] zArr, Utilities.Callback callback, int i10) {
        this.f14393a = i10;
        this.f14394b = zArr;
        this.f14395c = callback;
    }
}
