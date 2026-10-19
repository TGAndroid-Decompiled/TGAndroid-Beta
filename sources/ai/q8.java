package ai;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class q8 implements DialogInterface.OnDismissListener {
    public final int f2074a;
    public final Utilities.Callback2 f2075b;
    public final boolean[] f2076c;

    public q8(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f2074a = i10;
        this.f2075b = callback2;
        this.f2076c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2074a) {
            case 0:
                Utilities.Callback2 callback2 = this.f2075b;
                if (callback2 != null && !this.f2076c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f2075b;
                if (callback22 != null && !this.f2076c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f2075b;
                if (callback23 != null && !this.f2076c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
