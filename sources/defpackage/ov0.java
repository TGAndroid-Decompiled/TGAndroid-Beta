package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
public final class ov0 implements jm7, km7 {
    public final byte a;
    public final Object b;
    public final Object c;

    public ov0(nm7 nm7Var, jm7 jm7Var) {
        this.a = (byte) 2;
        this.b = new e7a(nm7Var, this);
        this.c = new WeakReference(jm7Var);
    }

    @Override
    public final void a() {
        ((e7a) this.b).a();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (i == 311) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        nm7.e().n(this, 311);
                        qw0 qw0Var = (qw0) obj2;
                        if (iArr[0] == 0) {
                            Activity activity = qw0Var.a0;
                            if (activity != null) {
                                qw0Var.h0 = lb1.j0(activity, 3, new ni6(qw0Var, (byte) 11));
                                return;
                            }
                            return;
                        }
                        qw0Var.u((ow0) obj, "scan_qr_popup_closed", new JSONObject());
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (i == 279) {
                    ((he) obj).dismiss();
                    nm7.e().n(this, i);
                    gm.d3(new kg5(this, (byte) 8), 100L);
                    return;
                }
                return;
            default:
                jm7 jm7Var = (jm7) ((WeakReference) obj2).get();
                if (jm7Var != null) {
                    jm7Var.didReceivedNotification(i, i2, objArr);
                    return;
                }
                fc4.d("MEMORY_LEAK observer " + i + " with destroyed WeakReference");
                a();
                return;
        }
    }

    public ov0(jm7 jm7Var, Object obj, byte b) {
        this.a = b;
        this.c = jm7Var;
        this.b = obj;
    }
}
