package jh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class g6 implements DialogInterface.OnDismissListener {
    public final int f12122a;
    public final Utilities.Callback2 f12123b;
    public final boolean[] f12124c;

    public g6(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f12122a = i10;
        this.f12123b = callback2;
        this.f12124c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12122a) {
            case 0:
                Utilities.Callback2 callback2 = this.f12123b;
                if (callback2 != null && !this.f12124c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f12123b;
                if (callback22 != null && !this.f12124c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f12123b;
                if (callback23 != null && !this.f12124c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
