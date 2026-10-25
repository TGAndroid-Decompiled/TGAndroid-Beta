package bi;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class m8 implements DialogInterface.OnDismissListener {
    public final int f5097a;
    public final Utilities.Callback2 f5098b;
    public final boolean[] f5099c;

    public m8(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f5097a = i10;
        this.f5098b = callback2;
        this.f5099c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5097a) {
            case 0:
                Utilities.Callback2 callback2 = this.f5098b;
                if (callback2 != null && !this.f5099c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f5098b;
                if (callback22 != null && !this.f5099c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f5098b;
                if (callback23 != null && !this.f5099c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
