package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.lj0;
public final class o6 implements Runnable {
    public final int f8687a;
    public final boolean[] f8688b;
    public final Utilities.Callback f8689c;

    public o6(v7 v7Var, boolean[] zArr, Utilities.Callback callback) {
        this.f8687a = 0;
        this.f8688b = zArr;
        this.f8689c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f8687a) {
            case 0:
                boolean[] zArr = this.f8688b;
                if (!zArr[0] && (callback = this.f8689c) != null) {
                    callback.run("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f8688b;
                if (!zArr2[0] && (callback2 = this.f8689c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new lj0(4), 220L);
                return;
            default:
                boolean[] zArr3 = this.f8688b;
                if (!zArr3[0] && (callback3 = this.f8689c) != null) {
                    zArr3[0] = true;
                    callback3.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public o6(boolean[] zArr, Utilities.Callback callback, int i9) {
        this.f8687a = i9;
        this.f8688b = zArr;
        this.f8689c = callback;
    }
}
