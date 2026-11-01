package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.hi0;
public final class m4 implements Runnable {
    public final int f17035a = 0;
    public final boolean f17036b;
    public final boolean f17037c;
    public final boolean d;
    public final Object e;
    public final Object f17038f;

    public m4(i5 i5Var, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = i5Var;
        this.f17038f = hashMap;
        this.f17036b = z10;
        this.f17037c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int i10 = this.f17035a;
        Object obj = this.f17038f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                i5 i5Var = (i5) obj2;
                HashMap hashMap = (HashMap) obj;
                if (v2.f18578a) {
                    f8.b("sync contacts by alert");
                }
                i5Var.F(hashMap, true, this.f17036b, this.f17037c, false, false, this.d);
                return;
            default:
                org.telegram.ui.zx zxVar = (org.telegram.ui.zx) obj2;
                Activity activity = (Activity) obj;
                if (zxVar.getParentActivity() != null) {
                    zxVar.f44215t2 = false;
                    boolean z10 = this.f17036b;
                    boolean z11 = this.f17037c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        zxVar.A0 = true;
                        if (z10 && hi0.J0(activity)) {
                            w7.c6.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.um(new org.telegram.ui.Components.vg(17, zxVar, activity), 1));
                            return;
                        } else if (z11 && zxVar.U1 && zxVar.getUserConfig().U && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.v(activity, new org.telegram.ui.kv(zxVar, 0)).f20135a;
                            zxVar.T1 = x1Var;
                            zxVar.showDialog(x1Var);
                            return;
                        } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.f5) {
                                org.telegram.ui.ActionBar.x1 v = ((org.telegram.ui.f5) activity).v(2131624116, dd.L0(2131747315, null));
                                zxVar.T1 = v;
                                zxVar.showDialog(v);
                                return;
                            }
                            return;
                        } else {
                            zxVar.u3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public m4(org.telegram.ui.zx zxVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = zxVar;
        this.f17036b = z10;
        this.f17037c = z11;
        this.d = z12;
        this.f17038f = activity;
    }
}
