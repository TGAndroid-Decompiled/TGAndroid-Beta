package ai;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class r9 implements DialogInterface.OnDismissListener {
    public final int f2116a = 0;
    public final boolean[] f2117b;
    public final Utilities.Callback f2118c;

    public r9(Utilities.Callback callback, boolean[] zArr) {
        this.f2118c = callback;
        this.f2117b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2116a) {
            case 0:
                Utilities.Callback callback = this.f2118c;
                if (callback != null && !this.f2117b[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f2117b;
                if (!zArr[0]) {
                    this.f2118c.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public r9(boolean[] zArr, Utilities.Callback callback) {
        this.f2117b = zArr;
        this.f2118c = callback;
    }
}
