package mh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class p5 implements DialogInterface.OnDismissListener {
    public final int f14585a;
    public final Utilities.Callback f14586b;
    public final boolean[] f14587c;
    public final boolean[] d;
    public final Object f14588e;

    public p5(t7 t7Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f14585a = i10;
        this.f14586b = callback;
        this.f14587c = zArr;
        this.d = zArr2;
        this.f14588e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14585a) {
            case 0:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f14588e;
                Utilities.Callback callback = this.f14586b;
                if (callback != null && !this.f14587c[0]) {
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
                Utilities.Callback callback3 = (Utilities.Callback) this.f14588e;
                Utilities.Callback callback4 = this.f14586b;
                if (callback4 != null && !this.f14587c[0]) {
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
