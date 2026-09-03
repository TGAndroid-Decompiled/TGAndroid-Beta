package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.sj0;
public final class l6 implements Runnable {
    public final int f14395a;
    public final boolean[] f14396b;
    public final Utilities.Callback f14397c;

    public l6(t7 t7Var, boolean[] zArr, Utilities.Callback callback) {
        this.f14395a = 0;
        this.f14396b = zArr;
        this.f14397c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f14395a) {
            case 0:
                boolean[] zArr = this.f14396b;
                if (!zArr[0] && (callback = this.f14397c) != null) {
                    callback.run("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f14396b;
                if (!zArr2[0] && (callback2 = this.f14397c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new sj0(4), 220L);
                return;
            default:
                boolean[] zArr3 = this.f14396b;
                if (!zArr3[0] && (callback3 = this.f14397c) != null) {
                    zArr3[0] = true;
                    callback3.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public l6(boolean[] zArr, Utilities.Callback callback, int i10) {
        this.f14395a = i10;
        this.f14396b = zArr;
        this.f14397c = callback;
    }
}
