package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
public final class ou0 implements fn7, gn7 {
    public final byte a;
    public final Object b;
    public final Object c;

    public ou0(jn7 jn7Var, fn7 fn7Var) {
        this.a = (byte) 2;
        this.b = new u8a(jn7Var, this);
        this.c = new WeakReference(fn7Var);
    }

    @Override
    public final void a() {
        ((u8a) this.b).a();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (i == 310) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        jn7.e().n(this, 310);
                        rv0 rv0Var = (rv0) obj2;
                        if (iArr[0] == 0) {
                            Activity activity = rv0Var.a0;
                            if (activity != null) {
                                rv0Var.h0 = la1.i0(activity, 3, new ri6(rv0Var, (byte) 11));
                                return;
                            }
                            return;
                        }
                        rv0Var.u((pv0) obj, "scan_qr_popup_closed", new JSONObject());
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (i == 278) {
                    ((id) obj).dismiss();
                    jn7.e().n(this, i);
                    hl.d3(new ea5(this, (byte) 16), 100L);
                    return;
                }
                return;
            default:
                fn7 fn7Var = (fn7) ((WeakReference) obj2).get();
                if (fn7Var != null) {
                    fn7Var.didReceivedNotification(i, i2, objArr);
                    return;
                }
                cc4.d("MEMORY_LEAK observer " + i + " with destroyed WeakReference");
                a();
                return;
        }
    }

    public ou0(fn7 fn7Var, Object obj, byte b) {
        this.a = b;
        this.c = fn7Var;
        this.b = obj;
    }
}
