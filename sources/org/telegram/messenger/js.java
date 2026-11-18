package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
public final class js implements gs, fs {
    public final int f24921a;
    public final Object f24922b;
    public final Object f24923c;

    public js(fs fsVar, Object obj, int i7) {
        this.f24921a = i7;
        this.f24923c = fsVar;
        this.f24922b = obj;
    }

    @Override
    public void b() {
        ((xi.e) this.f24922b).b();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        switch (this.f24921a) {
            case 0:
                fs fsVar = (fs) ((WeakReference) this.f24923c).get();
                if (fsVar != null) {
                    fsVar.didReceivedNotification(i7, i10, objArr);
                    return;
                }
                a8.d("MEMORY_LEAK observer " + i7 + " with destroyed WeakReference");
                b();
                return;
            case 1:
                if (i7 == 276) {
                    ((org.telegram.ui.ActionBar.u1) this.f24922b).dismiss();
                    ks.e().n(this, i7);
                    g0.h3(new org.telegram.ui.lz(this, 13), 100L);
                    return;
                }
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f24923c;
                if (i7 == 308) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        ks.e().n(this, 308);
                        if (iArr[0] == 0) {
                            Activity activity = v0Var.f53344a0;
                            if (activity != null) {
                                v0Var.f53355h0 = org.telegram.ui.t9.j0(activity, 3, new org.telegram.ui.Cells.b5(v0Var));
                                return;
                            }
                            return;
                        }
                        v0Var.x((fi.f7) this.f24922b, "scan_qr_popup_closed", new JSONObject());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public js(ks ksVar, fs fsVar) {
        this.f24921a = 0;
        this.f24922b = new xi.e(ksVar, this);
        this.f24923c = new WeakReference(fsVar);
    }
}
