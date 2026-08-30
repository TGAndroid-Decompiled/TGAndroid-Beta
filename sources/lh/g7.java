package lh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class g7 implements DialogInterface.OnDismissListener {
    public final int f12506a = 0;
    public final boolean[] f12507b;
    public final Utilities.Callback f12508c;

    public g7(Utilities.Callback callback, boolean[] zArr) {
        this.f12508c = callback;
        this.f12507b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12506a) {
            case 0:
                Utilities.Callback callback = this.f12508c;
                if (callback != null && !this.f12507b[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f12507b;
                if (!zArr[0]) {
                    this.f12508c.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public g7(boolean[] zArr, Utilities.Callback callback) {
        this.f12507b = zArr;
        this.f12508c = callback;
    }
}
