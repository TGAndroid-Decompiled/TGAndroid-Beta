package ai;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class r9 implements DialogInterface.OnDismissListener {
    public final int f2124a = 0;
    public final boolean[] f2125b;
    public final Utilities.Callback f2126c;

    public r9(Utilities.Callback callback, boolean[] zArr) {
        this.f2126c = callback;
        this.f2125b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2124a) {
            case 0:
                Utilities.Callback callback = this.f2126c;
                if (callback != null && !this.f2125b[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f2125b;
                if (!zArr[0]) {
                    this.f2126c.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public r9(boolean[] zArr, Utilities.Callback callback) {
        this.f2125b = zArr;
        this.f2126c = callback;
    }
}
