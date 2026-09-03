package mh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class g7 implements DialogInterface.OnDismissListener {
    public final int f14125a = 0;
    public final boolean[] f14126b;
    public final Utilities.Callback f14127c;

    public g7(Utilities.Callback callback, boolean[] zArr) {
        this.f14127c = callback;
        this.f14126b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14125a) {
            case 0:
                Utilities.Callback callback = this.f14127c;
                if (callback != null && !this.f14126b[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f14126b;
                if (!zArr[0]) {
                    this.f14127c.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public g7(boolean[] zArr, Utilities.Callback callback) {
        this.f14126b = zArr;
        this.f14127c = callback;
    }
}
