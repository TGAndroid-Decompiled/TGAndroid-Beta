package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.kj0;
public final class w8 implements Runnable {
    public final int f2376a;
    public final boolean[] f2377b;
    public final Utilities.Callback f2378c;

    public w8(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f2376a = i10;
        this.f2377b = zArr;
        this.f2378c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f2376a) {
            case 0:
                boolean[] zArr = this.f2377b;
                if (!zArr[0] && (callback = this.f2378c) != null) {
                    callback.run("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f2377b;
                if (!zArr2[0] && (callback2 = this.f2378c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new kj0(3), 220L);
                return;
            default:
                boolean[] zArr3 = this.f2377b;
                if (!zArr3[0] && (callback3 = this.f2378c) != null) {
                    zArr3[0] = true;
                    callback3.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public w8(ga gaVar, boolean[] zArr, Utilities.Callback callback) {
        this.f2376a = 0;
        this.f2377b = zArr;
        this.f2378c = callback;
    }
}
