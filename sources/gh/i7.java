package gh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class i7 implements DialogInterface.OnDismissListener {
    public final int f8302a = 0;
    public final boolean[] f8303b;
    public final Utilities.Callback f8304c;

    public i7(Utilities.Callback callback, boolean[] zArr) {
        this.f8304c = callback;
        this.f8303b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8302a) {
            case 0:
                Utilities.Callback callback = this.f8304c;
                if (callback != null && !this.f8303b[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f8303b;
                if (!zArr[0]) {
                    this.f8304c.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public i7(boolean[] zArr, Utilities.Callback callback) {
        this.f8303b = zArr;
        this.f8304c = callback;
    }
}
