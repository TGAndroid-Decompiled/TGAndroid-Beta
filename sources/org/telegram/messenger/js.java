package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
public final class js implements gs, fs {
    public final int f25028a;
    public final Object f25029b;
    public final Object f25030c;

    public js(fs fsVar, Object obj, int i7) {
        this.f25028a = i7;
        this.f25030c = fsVar;
        this.f25029b = obj;
    }

    @Override
    public void b() {
        ((xi.e) this.f25029b).b();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        switch (this.f25028a) {
            case 0:
                fs fsVar = (fs) ((WeakReference) this.f25030c).get();
                if (fsVar != null) {
                    fsVar.didReceivedNotification(i7, i10, objArr);
                    return;
                }
                a8.d("MEMORY_LEAK observer " + i7 + " with destroyed WeakReference");
                b();
                return;
            case 1:
                if (i7 == 277) {
                    ((org.telegram.ui.ActionBar.t1) this.f25029b).dismiss();
                    ks.e().n(this, i7);
                    g0.h3(new org.telegram.ui.kz(this, 13), 100L);
                    return;
                }
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f25030c;
                if (i7 == 309) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        ks.e().n(this, 309);
                        if (iArr[0] == 0) {
                            Activity activity = v0Var.f53576a0;
                            if (activity != null) {
                                v0Var.f53587h0 = org.telegram.ui.t9.j0(activity, 3, new org.telegram.ui.ActionBar.i5(v0Var));
                                return;
                            }
                            return;
                        }
                        v0Var.x((fi.f7) this.f25029b, "scan_qr_popup_closed", new JSONObject());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public js(ks ksVar, fs fsVar) {
        this.f25028a = 0;
        this.f25029b = new xi.e(ksVar, this);
        this.f25030c = new WeakReference(fsVar);
    }
}
