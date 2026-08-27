package hh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

public final class r5 implements DialogInterface.OnDismissListener {

    public final int f9991a;

    public final Utilities.Callback f9992b;

    public final boolean[] f9993c;
    public final boolean[] d;

    public final Object f9994e;

    public r5(u7 u7Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f9991a = i10;
        this.f9992b = callback;
        this.f9993c = zArr;
        this.d = zArr2;
        this.f9994e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9991a) {
            case 0:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f9994e;
                Utilities.Callback callback = this.f9992b;
                if (callback != null && !this.f9993c[0]) {
                    callback.run(Boolean.FALSE);
                    boolean[] zArr = this.d;
                    if (!zArr[0]) {
                        callback2.run("cancelled", 0L);
                        zArr[0] = true;
                    }
                    break;
                }
                break;
            default:
                Utilities.Callback callback3 = (Utilities.Callback) this.f9994e;
                Utilities.Callback callback4 = this.f9992b;
                if (callback4 != null && !this.f9993c[0]) {
                    callback4.run(Boolean.FALSE);
                    boolean[] zArr2 = this.d;
                    if (!zArr2[0] && callback3 != null) {
                        callback3.run("cancelled");
                        zArr2[0] = true;
                        break;
                    }
                }
                break;
        }
    }
}
