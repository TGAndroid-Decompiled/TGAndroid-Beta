package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ef0;
public final class l6 implements Runnable {
    public final int f12432a;
    public final boolean[] f12433b;
    public final Utilities.Callback f12434c;

    public l6(s7 s7Var, boolean[] zArr, Utilities.Callback callback) {
        this.f12432a = 0;
        this.f12433b = zArr;
        this.f12434c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f12432a) {
            case 0:
                boolean[] zArr = this.f12433b;
                if (!zArr[0] && (callback = this.f12434c) != null) {
                    callback.run("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f12433b;
                if (!zArr2[0] && (callback2 = this.f12434c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new ef0(6), 220L);
                return;
            default:
                boolean[] zArr3 = this.f12433b;
                if (!zArr3[0] && (callback3 = this.f12434c) != null) {
                    zArr3[0] = true;
                    callback3.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public l6(boolean[] zArr, Utilities.Callback callback, int i10) {
        this.f12432a = i10;
        this.f12433b = zArr;
        this.f12434c = callback;
    }
}
