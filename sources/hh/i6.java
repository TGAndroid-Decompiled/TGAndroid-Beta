package hh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

public final class i6 implements DialogInterface.OnDismissListener {

    public final int f9487a;

    public final Utilities.Callback2 f9488b;

    public final boolean[] f9489c;

    public i6(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f9487a = i10;
        this.f9488b = callback2;
        this.f9489c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9487a) {
            case 0:
                Utilities.Callback2 callback2 = this.f9488b;
                if (callback2 != null && !this.f9489c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                Utilities.Callback2 callback3 = this.f9488b;
                if (callback3 != null && !this.f9489c[0]) {
                    callback3.run(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                Utilities.Callback2 callback4 = this.f9488b;
                if (callback4 != null && !this.f9489c[0]) {
                    callback4.run(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }
}
