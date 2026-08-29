package jh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class p5 implements DialogInterface.OnDismissListener {
    public final int f12613a;
    public final Utilities.Callback f12614b;
    public final boolean[] f12615c;
    public final boolean[] d;
    public final Object f12616e;

    public p5(s7 s7Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f12613a = i10;
        this.f12614b = callback;
        this.f12615c = zArr;
        this.d = zArr2;
        this.f12616e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12613a) {
            case 0:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f12616e;
                Utilities.Callback callback = this.f12614b;
                if (callback != null && !this.f12615c[0]) {
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
                Utilities.Callback callback3 = (Utilities.Callback) this.f12616e;
                Utilities.Callback callback4 = this.f12614b;
                if (callback4 != null && !this.f12615c[0]) {
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
