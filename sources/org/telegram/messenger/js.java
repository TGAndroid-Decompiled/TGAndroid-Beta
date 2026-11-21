package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
public final class js implements gs, fs {
    public final int f24946a;
    public final Object f24947b;
    public final Object f24948c;

    public js(fs fsVar, Object obj, int i7) {
        this.f24946a = i7;
        this.f24948c = fsVar;
        this.f24947b = obj;
    }

    @Override
    public void b() {
        ((xi.e) this.f24947b).b();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        switch (this.f24946a) {
            case 0:
                fs fsVar = (fs) ((WeakReference) this.f24948c).get();
                if (fsVar != null) {
                    fsVar.didReceivedNotification(i7, i10, objArr);
                    return;
                }
                a8.d("MEMORY_LEAK observer " + i7 + " with destroyed WeakReference");
                b();
                return;
            case 1:
                if (i7 == 277) {
                    ((org.telegram.ui.ActionBar.t1) this.f24947b).dismiss();
                    ks.e().n(this, i7);
                    g0.h3(new org.telegram.ui.lz(this, 13), 100L);
                    return;
                }
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f24948c;
                if (i7 == 309) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        ks.e().n(this, 309);
                        if (iArr[0] == 0) {
                            Activity activity = v0Var.f53338a0;
                            if (activity != null) {
                                v0Var.f53349h0 = org.telegram.ui.t9.j0(activity, 3, new org.telegram.ui.Cells.c5(v0Var));
                                return;
                            }
                            return;
                        }
                        v0Var.x((fi.f7) this.f24947b, "scan_qr_popup_closed", new JSONObject());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public js(ks ksVar, fs fsVar) {
        this.f24946a = 0;
        this.f24947b = new xi.e(ksVar, this);
        this.f24948c = new WeakReference(fsVar);
    }
}
