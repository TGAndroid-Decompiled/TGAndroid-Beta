package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
public final class fu0 implements gk7, hk7 {
    public final byte a;
    public final Object b;
    public final Object c;

    public fu0(kk7 kk7Var, gk7 gk7Var) {
        this.a = (byte) 2;
        this.b = new wtc(kk7Var, this);
        this.c = new WeakReference(gk7Var);
    }

    @Override
    public final void a() {
        ((wtc) this.b).a();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (i == 309) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        kk7.e().n(this, 309);
                        hv0 hv0Var = (hv0) obj2;
                        if (iArr[0] == 0) {
                            Activity activity = hv0Var.a0;
                            if (activity != null) {
                                hv0Var.h0 = da1.i0(activity, 3, new l69(hv0Var, (byte) 12));
                                return;
                            }
                            return;
                        }
                        hv0Var.u((ev0) obj, "scan_qr_popup_closed", new JSONObject());
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (i == 277) {
                    ((hd) obj).dismiss();
                    kk7.e().n(this, i);
                    gl.d3(new tp5(this, (byte) 1), 100L);
                    return;
                }
                return;
            default:
                gk7 gk7Var = (gk7) ((WeakReference) obj2).get();
                if (gk7Var != null) {
                    gk7Var.didReceivedNotification(i, i2, objArr);
                    return;
                }
                fa4.d("MEMORY_LEAK observer " + i + " with destroyed WeakReference");
                a();
                return;
        }
    }

    public fu0(gk7 gk7Var, Object obj, byte b) {
        this.a = b;
        this.c = gk7Var;
        this.b = obj;
    }
}
