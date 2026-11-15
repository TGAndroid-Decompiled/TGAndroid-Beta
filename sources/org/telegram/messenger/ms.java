package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
public final class ms implements js, is {
    public final int f25091a;
    public final Object f25092b;
    public final Object f25093c;

    public ms(is isVar, Object obj, int i7) {
        this.f25091a = i7;
        this.f25093c = isVar;
        this.f25092b = obj;
    }

    @Override
    public void b() {
        ((xi.e) this.f25092b).b();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        switch (this.f25091a) {
            case 0:
                is isVar = (is) ((WeakReference) this.f25093c).get();
                if (isVar != null) {
                    isVar.didReceivedNotification(i7, i10, objArr);
                    return;
                }
                a8.d("MEMORY_LEAK observer " + i7 + " with destroyed WeakReference");
                b();
                return;
            case 1:
                if (i7 == 274) {
                    ((org.telegram.ui.ActionBar.t1) this.f25092b).dismiss();
                    ns.e().n(this, i7);
                    g0.i3(new org.telegram.ui.iz(this, 13), 100L);
                    return;
                }
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f25093c;
                if (i7 == 306) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        ns.e().n(this, 306);
                        if (iArr[0] == 0) {
                            Activity activity = v0Var.f52812a0;
                            if (activity != null) {
                                v0Var.f52823h0 = org.telegram.ui.t9.j0(activity, 3, new org.telegram.ui.Components.cf(v0Var));
                                return;
                            }
                            return;
                        }
                        v0Var.x((fi.i7) this.f25092b, "scan_qr_popup_closed", new JSONObject());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ms(ns nsVar, is isVar) {
        this.f25091a = 0;
        this.f25092b = new xi.e(nsVar, this);
        this.f25093c = new WeakReference(isVar);
    }
}
