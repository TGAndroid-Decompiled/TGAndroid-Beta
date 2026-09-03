package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.j21;
public final class l6 implements Runnable {
    public final int f12745a;
    public final boolean[] f12746b;
    public final Utilities.Callback f12747c;

    public l6(t7 t7Var, boolean[] zArr, Utilities.Callback callback) {
        this.f12745a = 0;
        this.f12746b = zArr;
        this.f12747c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f12745a) {
            case 0:
                boolean[] zArr = this.f12746b;
                if (!zArr[0] && (callback = this.f12747c) != null) {
                    callback.run("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f12746b;
                if (!zArr2[0] && (callback2 = this.f12747c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new j21(2), 220L);
                return;
            default:
                boolean[] zArr3 = this.f12746b;
                if (!zArr3[0] && (callback3 = this.f12747c) != null) {
                    zArr3[0] = true;
                    callback3.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public l6(boolean[] zArr, Utilities.Callback callback, int i10) {
        this.f12745a = i10;
        this.f12746b = zArr;
        this.f12747c = callback;
    }
}
