package lh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class p5 implements DialogInterface.OnDismissListener {
    public final int f12902a;
    public final Object f12903b;
    public final boolean[] f12904c;
    public final Object d;
    public final Object e;

    public p5(t7 t7Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f12902a = i10;
        this.f12903b = callback;
        this.f12904c = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12902a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.f12903b;
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                if (callback != null && !this.f12904c[0]) {
                    callback.run(Boolean.FALSE);
                    if (!zArr[0]) {
                        callback2.run("cancelled", 0L);
                        zArr[0] = true;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Utilities.Callback callback3 = (Utilities.Callback) this.f12903b;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.e;
                if (callback3 != null && !this.f12904c[0]) {
                    callback3.run(Boolean.FALSE);
                    if (!zArr2[0] && callback4 != null) {
                        callback4.run("cancelled");
                        zArr2[0] = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f12903b;
                nh.j7 j7Var = (nh.j7) this.d;
                String str = (String) this.e;
                c1Var.getClass();
                boolean[] zArr3 = this.f12904c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    c1Var.z(j7Var, "requested_chat_failed", org.telegram.ui.web.c1.B(str, "req_id"));
                    return;
                }
                return;
        }
    }

    public p5(org.telegram.ui.web.c1 c1Var, boolean[] zArr, nh.j7 j7Var, String str) {
        this.f12902a = 2;
        this.f12903b = c1Var;
        this.f12904c = zArr;
        this.d = j7Var;
        this.e = str;
    }
}
