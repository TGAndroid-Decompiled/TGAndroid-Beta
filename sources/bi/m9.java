package bi;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class m9 implements DialogInterface.OnDismissListener {
    public final int f5100a = 0;
    public final boolean[] f5101b;
    public final Utilities.Callback f5102c;

    public m9(Utilities.Callback callback, boolean[] zArr) {
        this.f5102c = callback;
        this.f5101b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5100a) {
            case 0:
                Utilities.Callback callback = this.f5102c;
                if (callback != null && !this.f5101b[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f5101b;
                if (!zArr[0]) {
                    this.f5102c.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public m9(boolean[] zArr, Utilities.Callback callback) {
        this.f5101b = zArr;
        this.f5102c = callback;
    }
}
