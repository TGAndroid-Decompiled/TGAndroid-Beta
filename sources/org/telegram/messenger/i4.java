package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.fh0;
public final class i4 implements Runnable {
    public final int f24278a = 0;
    public final boolean f24279b;
    public final boolean f24280c;
    public final boolean d;
    public final Object f24281e;
    public final Object f24282f;

    public i4(g5 g5Var, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.f24281e = g5Var;
        this.f24282f = hashMap;
        this.f24279b = z10;
        this.f24280c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int i7 = this.f24278a;
        Object obj = this.f24282f;
        Object obj2 = this.f24281e;
        switch (i7) {
            case 0:
                g5 g5Var = (g5) obj2;
                HashMap hashMap = (HashMap) obj;
                if (r2.f26206a) {
                    a8.b("sync contacts by alert");
                }
                g5Var.F(hashMap, true, this.f24279b, this.f24280c, false, false, this.d);
                return;
            default:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj2;
                Activity activity = (Activity) obj;
                if (ywVar.getParentActivity() != null) {
                    ywVar.f53718v2 = false;
                    boolean z10 = this.f24279b;
                    boolean z11 = this.f24280c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        ywVar.B0 = true;
                        if (z10 && fh0.J0(activity)) {
                            c8.ka.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.um(new org.telegram.ui.Components.gh(15, ywVar, activity), 1));
                            return;
                        } else if (z11 && ywVar.W1 && ywVar.getUserConfig().V && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.t4.v(activity, new org.telegram.ui.ku(ywVar, 0)).f28392a;
                            ywVar.V1 = t1Var;
                            ywVar.showDialog(t1Var);
                            return;
                        } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.g5) {
                                org.telegram.ui.ActionBar.t1 v = ((org.telegram.ui.g5) activity).v(2131624119, hd.M0(2131747299, null));
                                ywVar.V1 = v;
                                ywVar.showDialog(v);
                                return;
                            }
                            return;
                        } else {
                            ywVar.u3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public i4(org.telegram.ui.yw ywVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f24281e = ywVar;
        this.f24279b = z10;
        this.f24280c = z11;
        this.d = z12;
        this.f24282f = activity;
    }
}
