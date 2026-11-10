package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
public final class ps implements ms, ls {
    public final int f24623a;
    public final Object f24624b;
    public final Object f24625c;

    public ps(ls lsVar, Object obj, int i7) {
        this.f24623a = i7;
        this.f24625c = lsVar;
        this.f24624b = obj;
    }

    @Override
    public void b() {
        ((ab.b0) this.f24624b).b();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        switch (this.f24623a) {
            case 0:
                ls lsVar = (ls) ((WeakReference) this.f24625c).get();
                if (lsVar != null) {
                    lsVar.didReceivedNotification(i7, i10, objArr);
                    return;
                }
                a8.d("MEMORY_LEAK observer " + i7 + " with destroyed WeakReference");
                b();
                return;
            case 1:
                if (i7 == 274) {
                    ((org.telegram.ui.ActionBar.u1) this.f24624b).dismiss();
                    qs.e().n(this, i7);
                    g0.i3(new org.telegram.ui.kz(this, 13), 100L);
                    return;
                }
                return;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f24625c;
                if (i7 == 306) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        qs.e().n(this, 306);
                        if (iArr[0] == 0) {
                            Activity activity = x0Var.W;
                            if (activity != null) {
                                x0Var.f51306g0 = org.telegram.ui.s9.j0(activity, 3, new org.telegram.ui.Components.m(x0Var));
                                return;
                            }
                            return;
                        }
                        x0Var.x((di.p7) this.f24624b, "scan_qr_popup_closed", new JSONObject());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ps(qs qsVar, ls lsVar) {
        this.f24623a = 0;
        this.f24624b = new ab.b0(qsVar, this);
        this.f24625c = new WeakReference(lsVar);
    }
}
