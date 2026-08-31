package mh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class p5 implements DialogInterface.OnDismissListener {
    public final int f14583a;
    public final Utilities.Callback f14584b;
    public final boolean[] f14585c;
    public final boolean[] d;
    public final Object f14586e;

    public p5(t7 t7Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f14583a = i10;
        this.f14584b = callback;
        this.f14585c = zArr;
        this.d = zArr2;
        this.f14586e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14583a) {
            case 0:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f14586e;
                Utilities.Callback callback = this.f14584b;
                if (callback != null && !this.f14585c[0]) {
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
                Utilities.Callback callback3 = (Utilities.Callback) this.f14586e;
                Utilities.Callback callback4 = this.f14584b;
                if (callback4 != null && !this.f14585c[0]) {
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
