package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ff0;
public final class w8 implements Runnable {
    public final int f2378a;
    public final boolean[] f2379b;
    public final Utilities.Callback f2380c;

    public w8(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f2378a = i10;
        this.f2379b = zArr;
        this.f2380c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f2378a) {
            case 0:
                boolean[] zArr = this.f2379b;
                if (!zArr[0] && (callback = this.f2380c) != null) {
                    callback.run("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f2379b;
                if (!zArr2[0] && (callback2 = this.f2380c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new ff0(4), 220L);
                return;
            default:
                boolean[] zArr3 = this.f2379b;
                if (!zArr3[0] && (callback3 = this.f2380c) != null) {
                    zArr3[0] = true;
                    callback3.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public w8(ga gaVar, boolean[] zArr, Utilities.Callback callback) {
        this.f2378a = 0;
        this.f2379b = zArr;
        this.f2380c = callback;
    }
}
