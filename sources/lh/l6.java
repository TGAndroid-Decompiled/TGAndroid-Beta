package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.c21;
public final class l6 implements Runnable {
    public final int f12761a;
    public final boolean[] f12762b;
    public final Utilities.Callback f12763c;

    public l6(t7 t7Var, boolean[] zArr, Utilities.Callback callback) {
        this.f12761a = 0;
        this.f12762b = zArr;
        this.f12763c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f12761a) {
            case 0:
                boolean[] zArr = this.f12762b;
                if (!zArr[0] && (callback = this.f12763c) != null) {
                    callback.run("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f12762b;
                if (!zArr2[0] && (callback2 = this.f12763c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new c21(2), 220L);
                return;
            default:
                boolean[] zArr3 = this.f12762b;
                if (!zArr3[0] && (callback3 = this.f12763c) != null) {
                    zArr3[0] = true;
                    callback3.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public l6(boolean[] zArr, Utilities.Callback callback, int i10) {
        this.f12761a = i10;
        this.f12762b = zArr;
        this.f12763c = callback;
    }
}
