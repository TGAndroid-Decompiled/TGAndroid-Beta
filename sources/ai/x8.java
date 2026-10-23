package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.if0;
public final class x8 implements Runnable {
    public final int f2451a;
    public final boolean[] f2452b;
    public final Utilities.Callback f2453c;

    public x8(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f2451a = i10;
        this.f2452b = zArr;
        this.f2453c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f2451a) {
            case 0:
                boolean[] zArr = this.f2452b;
                if (!zArr[0] && (callback = this.f2453c) != null) {
                    callback.run("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f2452b;
                if (!zArr2[0] && (callback2 = this.f2453c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new if0(4), 220L);
                return;
            default:
                boolean[] zArr3 = this.f2452b;
                if (!zArr3[0] && (callback3 = this.f2453c) != null) {
                    zArr3[0] = true;
                    callback3.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public x8(ha haVar, boolean[] zArr, Utilities.Callback callback) {
        this.f2451a = 0;
        this.f2452b = zArr;
        this.f2453c = callback;
    }
}
