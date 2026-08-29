package jh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class f7 implements DialogInterface.OnDismissListener {
    public final int f12067a = 0;
    public final boolean[] f12068b;
    public final Utilities.Callback f12069c;

    public f7(Utilities.Callback callback, boolean[] zArr) {
        this.f12069c = callback;
        this.f12068b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12067a) {
            case 0:
                Utilities.Callback callback = this.f12069c;
                if (callback != null && !this.f12068b[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f12068b;
                if (!zArr[0]) {
                    this.f12069c.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public f7(boolean[] zArr, Utilities.Callback callback) {
        this.f12068b = zArr;
        this.f12069c = callback;
    }
}
