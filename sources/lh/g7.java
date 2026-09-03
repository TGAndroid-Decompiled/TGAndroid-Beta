package lh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class g7 implements DialogInterface.OnDismissListener {
    public final int f12490a = 0;
    public final boolean[] f12491b;
    public final Utilities.Callback f12492c;

    public g7(Utilities.Callback callback, boolean[] zArr) {
        this.f12492c = callback;
        this.f12491b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12490a) {
            case 0:
                Utilities.Callback callback = this.f12492c;
                if (callback != null && !this.f12491b[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f12491b;
                if (!zArr[0]) {
                    this.f12492c.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public g7(boolean[] zArr, Utilities.Callback callback) {
        this.f12491b = zArr;
        this.f12492c = callback;
    }
}
