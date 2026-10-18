package ai;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class r9 implements DialogInterface.OnDismissListener {
    public final int f2117a = 0;
    public final boolean[] f2118b;
    public final Utilities.Callback f2119c;

    public r9(Utilities.Callback callback, boolean[] zArr) {
        this.f2119c = callback;
        this.f2118b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2117a) {
            case 0:
                Utilities.Callback callback = this.f2119c;
                if (callback != null && !this.f2118b[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f2118b;
                if (!zArr[0]) {
                    this.f2119c.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public r9(boolean[] zArr, Utilities.Callback callback) {
        this.f2118b = zArr;
        this.f2119c = callback;
    }
}
