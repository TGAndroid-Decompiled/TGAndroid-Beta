package gh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class s5 implements DialogInterface.OnDismissListener {
    public final int f8873a;
    public final Utilities.Callback f8874b;
    public final boolean[] f8875c;
    public final boolean[] d;
    public final Object f8876e;

    public s5(v7 v7Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i9) {
        this.f8873a = i9;
        this.f8874b = callback;
        this.f8875c = zArr;
        this.d = zArr2;
        this.f8876e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8873a) {
            case 0:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f8876e;
                Utilities.Callback callback = this.f8874b;
                if (callback != null && !this.f8875c[0]) {
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
                Utilities.Callback callback3 = (Utilities.Callback) this.f8876e;
                Utilities.Callback callback4 = this.f8874b;
                if (callback4 != null && !this.f8875c[0]) {
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
