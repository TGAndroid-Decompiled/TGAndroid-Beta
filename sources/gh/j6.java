package gh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class j6 implements DialogInterface.OnDismissListener {
    public final int f8348a;
    public final Utilities.Callback2 f8349b;
    public final boolean[] f8350c;

    public j6(Utilities.Callback2 callback2, boolean[] zArr, int i9) {
        this.f8348a = i9;
        this.f8349b = callback2;
        this.f8350c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8348a) {
            case 0:
                Utilities.Callback2 callback2 = this.f8349b;
                if (callback2 != null && !this.f8350c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f8349b;
                if (callback22 != null && !this.f8350c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f8349b;
                if (callback23 != null && !this.f8350c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
