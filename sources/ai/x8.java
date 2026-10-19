package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.df0;
public final class x8 implements Runnable {
    public final int f2448a;
    public final boolean[] f2449b;
    public final Utilities.Callback f2450c;

    public x8(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f2448a = i10;
        this.f2449b = zArr;
        this.f2450c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f2448a) {
            case 0:
                boolean[] zArr = this.f2449b;
                if (!zArr[0] && (callback = this.f2450c) != null) {
                    callback.run("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f2449b;
                if (!zArr2[0] && (callback2 = this.f2450c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new df0(4), 220L);
                return;
            default:
                boolean[] zArr3 = this.f2449b;
                if (!zArr3[0] && (callback3 = this.f2450c) != null) {
                    zArr3[0] = true;
                    callback3.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public x8(ga gaVar, boolean[] zArr, Utilities.Callback callback) {
        this.f2448a = 0;
        this.f2449b = zArr;
        this.f2450c = callback;
    }
}
