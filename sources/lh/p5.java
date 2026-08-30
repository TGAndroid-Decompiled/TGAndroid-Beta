package lh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class p5 implements DialogInterface.OnDismissListener {
    public final int f12918a;
    public final Utilities.Callback f12919b;
    public final boolean[] f12920c;
    public final boolean[] d;
    public final Object e;

    public p5(t7 t7Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f12918a = i10;
        this.f12919b = callback;
        this.f12920c = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12918a) {
            case 0:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                Utilities.Callback callback = this.f12919b;
                if (callback != null && !this.f12920c[0]) {
                    callback.run(Boolean.FALSE);
                    boolean[] zArr = this.d;
                    if (!zArr[0]) {
                        callback2.run("cancelled", 0L);
                        zArr[0] = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                Utilities.Callback callback4 = this.f12919b;
                if (callback4 != null && !this.f12920c[0]) {
                    callback4.run(Boolean.FALSE);
                    boolean[] zArr2 = this.d;
                    if (!zArr2[0] && callback3 != null) {
                        callback3.run("cancelled");
                        zArr2[0] = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
