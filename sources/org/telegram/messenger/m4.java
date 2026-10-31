package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.ji0;
public final class m4 implements Runnable {
    public final int f16865a = 0;
    public final boolean f16866b;
    public final boolean f16867c;
    public final boolean d;
    public final Object e;
    public final Object f16868f;

    public m4(i5 i5Var, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = i5Var;
        this.f16868f = hashMap;
        this.f16866b = z10;
        this.f16867c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int i10 = this.f16865a;
        Object obj = this.f16868f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                i5 i5Var = (i5) obj2;
                HashMap hashMap = (HashMap) obj;
                if (v2.f18448a) {
                    f8.b("sync contacts by alert");
                }
                i5Var.F(hashMap, true, this.f16866b, this.f16867c, false, false, this.d);
                return;
            default:
                org.telegram.ui.ay ayVar = (org.telegram.ui.ay) obj2;
                Activity activity = (Activity) obj;
                if (ayVar.getParentActivity() != null) {
                    ayVar.f35872t2 = false;
                    boolean z10 = this.f16866b;
                    boolean z11 = this.f16867c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        ayVar.A0 = true;
                        if (z10 && ji0.J0(activity)) {
                            w7.c6.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.um(new org.telegram.ui.Components.vg(16, ayVar, activity), 1));
                            return;
                        } else if (z11 && ayVar.U1 && ayVar.getUserConfig().U && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.v(activity, new org.telegram.ui.lv(ayVar, 0)).f20134a;
                            ayVar.T1 = x1Var;
                            ayVar.showDialog(x1Var);
                            return;
                        } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.f5) {
                                org.telegram.ui.ActionBar.x1 v = ((org.telegram.ui.f5) activity).v(2131624116, cd.L0(2131747315, null));
                                ayVar.T1 = v;
                                ayVar.showDialog(v);
                                return;
                            }
                            return;
                        } else {
                            ayVar.t3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public m4(org.telegram.ui.ay ayVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = ayVar;
        this.f16866b = z10;
        this.f16867c = z11;
        this.d = z12;
        this.f16868f = activity;
    }
}
