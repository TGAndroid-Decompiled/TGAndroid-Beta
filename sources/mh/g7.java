package mh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class g7 implements DialogInterface.OnDismissListener {
    public final int f14123a = 0;
    public final boolean[] f14124b;
    public final Utilities.Callback f14125c;

    public g7(Utilities.Callback callback, boolean[] zArr) {
        this.f14125c = callback;
        this.f14124b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14123a) {
            case 0:
                Utilities.Callback callback = this.f14125c;
                if (callback != null && !this.f14124b[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f14124b;
                if (!zArr[0]) {
                    this.f14125c.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public g7(boolean[] zArr, Utilities.Callback callback) {
        this.f14124b = zArr;
        this.f14125c = callback;
    }
}
