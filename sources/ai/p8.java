package ai;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class p8 implements DialogInterface.OnDismissListener {
    public final int f2024a;
    public final Utilities.Callback2 f2025b;
    public final boolean[] f2026c;

    public p8(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f2024a = i10;
        this.f2025b = callback2;
        this.f2026c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2024a) {
            case 0:
                Utilities.Callback2 callback2 = this.f2025b;
                if (callback2 != null && !this.f2026c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f2025b;
                if (callback22 != null && !this.f2026c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f2025b;
                if (callback23 != null && !this.f2026c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
