package hh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

public final class h7 implements DialogInterface.OnDismissListener {

    public final int f9391a = 0;

    public final boolean[] f9392b;

    public final Utilities.Callback f9393c;

    public h7(Utilities.Callback callback, boolean[] zArr) {
        this.f9393c = callback;
        this.f9392b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9391a) {
            case 0:
                Utilities.Callback callback = this.f9393c;
                if (callback != null && !this.f9392b[0]) {
                    callback.run(Boolean.FALSE);
                    break;
                }
                break;
            default:
                boolean[] zArr = this.f9392b;
                if (!zArr[0]) {
                    this.f9393c.run(Boolean.FALSE);
                    zArr[0] = true;
                }
                break;
        }
    }

    public h7(boolean[] zArr, Utilities.Callback callback) {
        this.f9392b = zArr;
        this.f9393c = callback;
    }
}
