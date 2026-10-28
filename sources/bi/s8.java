package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.w90;
public final class s8 implements Runnable {
    public final int f5410a;
    public final boolean[] f5411b;
    public final Utilities.Callback f5412c;

    public s8(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f5410a = i10;
        this.f5411b = zArr;
        this.f5412c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f5410a) {
            case 0:
                boolean[] zArr = this.f5411b;
                if (!zArr[0] && (callback = this.f5412c) != null) {
                    callback.run("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f5411b;
                if (!zArr2[0] && (callback2 = this.f5412c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new w90(7), 220L);
                return;
            default:
                boolean[] zArr3 = this.f5411b;
                if (!zArr3[0] && (callback3 = this.f5412c) != null) {
                    zArr3[0] = true;
                    callback3.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public s8(ca caVar, boolean[] zArr, Utilities.Callback callback) {
        this.f5410a = 0;
        this.f5411b = zArr;
        this.f5412c = callback;
    }
}
