package ai;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class r9 implements DialogInterface.OnDismissListener {
    public final int f2129a = 0;
    public final boolean[] f2130b;
    public final Utilities.Callback f2131c;

    public r9(Utilities.Callback callback, boolean[] zArr) {
        this.f2131c = callback;
        this.f2130b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2129a) {
            case 0:
                Utilities.Callback callback = this.f2131c;
                if (callback != null && !this.f2130b[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f2130b;
                if (!zArr[0]) {
                    this.f2131c.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public r9(boolean[] zArr, Utilities.Callback callback) {
        this.f2130b = zArr;
        this.f2131c = callback;
    }
}
