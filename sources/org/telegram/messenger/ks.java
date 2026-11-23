package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
public final class ks implements hs, gs {
    public final int f25133a;
    public final Object f25134b;
    public final Object f25135c;

    public ks(gs gsVar, Object obj, int i7) {
        this.f25133a = i7;
        this.f25135c = gsVar;
        this.f25134b = obj;
    }

    @Override
    public void b() {
        ((xi.e) this.f25134b).b();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        switch (this.f25133a) {
            case 0:
                gs gsVar = (gs) ((WeakReference) this.f25135c).get();
                if (gsVar != null) {
                    gsVar.didReceivedNotification(i7, i10, objArr);
                    return;
                }
                a8.d("MEMORY_LEAK observer " + i7 + " with destroyed WeakReference");
                b();
                return;
            case 1:
                if (i7 == 277) {
                    ((org.telegram.ui.ActionBar.t1) this.f25134b).dismiss();
                    ls.e().n(this, i7);
                    g0.h3(new org.telegram.ui.lz(this, 13), 100L);
                    return;
                }
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f25135c;
                if (i7 == 309) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        ls.e().n(this, 309);
                        if (iArr[0] == 0) {
                            Activity activity = v0Var.f53342a0;
                            if (activity != null) {
                                v0Var.f53353h0 = org.telegram.ui.t9.j0(activity, 3, new org.telegram.ui.Cells.c5(v0Var));
                                return;
                            }
                            return;
                        }
                        v0Var.x((fi.f7) this.f25134b, "scan_qr_popup_closed", new JSONObject());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ks(ls lsVar, gs gsVar) {
        this.f25133a = 0;
        this.f25134b = new xi.e(lsVar, this);
        this.f25135c = new WeakReference(gsVar);
    }
}
