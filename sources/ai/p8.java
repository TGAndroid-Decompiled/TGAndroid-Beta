package ai;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class p8 implements DialogInterface.OnDismissListener {
    public final int f2025a;
    public final Utilities.Callback2 f2026b;
    public final boolean[] f2027c;

    public p8(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f2025a = i10;
        this.f2026b = callback2;
        this.f2027c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2025a) {
            case 0:
                Utilities.Callback2 callback2 = this.f2026b;
                if (callback2 != null && !this.f2027c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f2026b;
                if (callback22 != null && !this.f2027c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f2026b;
                if (callback23 != null && !this.f2027c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
