package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ff0;
public final class w8 implements Runnable {
    public final int f2375a;
    public final boolean[] f2376b;
    public final Utilities.Callback f2377c;

    public w8(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f2375a = i10;
        this.f2376b = zArr;
        this.f2377c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f2375a) {
            case 0:
                boolean[] zArr = this.f2376b;
                if (!zArr[0] && (callback = this.f2377c) != null) {
                    callback.run("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f2376b;
                if (!zArr2[0] && (callback2 = this.f2377c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new ff0(4), 220L);
                return;
            default:
                boolean[] zArr3 = this.f2376b;
                if (!zArr3[0] && (callback3 = this.f2377c) != null) {
                    zArr3[0] = true;
                    callback3.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public w8(fa faVar, boolean[] zArr, Utilities.Callback callback) {
        this.f2375a = 0;
        this.f2376b = zArr;
        this.f2377c = callback;
    }
}
