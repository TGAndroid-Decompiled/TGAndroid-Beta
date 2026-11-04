package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
public final class gs implements ds, cs {
    public final int f22761a;
    public final Object f22762b;
    public final Object f22763c;

    public gs(cs csVar, Object obj, int i3) {
        this.f22761a = i3;
        this.f22763c = csVar;
        this.f22762b = obj;
    }

    @Override
    public void a() {
        ((za.p) this.f22762b).a();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        switch (this.f22761a) {
            case 0:
                cs csVar = (cs) ((WeakReference) this.f22763c).get();
                if (csVar != null) {
                    csVar.didReceivedNotification(i3, i10, objArr);
                    return;
                }
                a8.d("MEMORY_LEAK observer " + i3 + " with destroyed WeakReference");
                a();
                return;
            case 1:
                if (i3 == 274) {
                    ((org.telegram.ui.ActionBar.s1) this.f22762b).dismiss();
                    hs.e().n(this, i3);
                    g0.i3(new org.telegram.ui.fz(this, 12), 100L);
                    return;
                }
                return;
            default:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.f22763c;
                if (i3 == 306) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        hs.e().n(this, 306);
                        if (iArr[0] == 0) {
                            Activity activity = w0Var.f51061a0;
                            if (activity != null) {
                                w0Var.f51072h0 = org.telegram.ui.s9.j0(activity, 3, new org.telegram.ui.Components.y00(w0Var));
                                return;
                            }
                            return;
                        }
                        w0Var.x((ei.p7) this.f22762b, "scan_qr_popup_closed", new JSONObject());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public gs(hs hsVar, cs csVar) {
        this.f22761a = 0;
        this.f22762b = new za.p(hsVar, this);
        this.f22763c = new WeakReference(csVar);
    }
}
