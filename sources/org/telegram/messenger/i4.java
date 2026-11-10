package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.gh0;
public final class i4 implements Runnable {
    public final int f23045a = 0;
    public final boolean f23046b;
    public final boolean f23047c;
    public final boolean d;
    public final Object f23048e;
    public final Object f23049f;

    public i4(g5 g5Var, HashMap hashMap, boolean z9, boolean z10, boolean z11) {
        this.f23048e = g5Var;
        this.f23049f = hashMap;
        this.f23046b = z9;
        this.f23047c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i7 = this.f23045a;
        Object obj = this.f23049f;
        Object obj2 = this.f23048e;
        switch (i7) {
            case 0:
                g5 g5Var = (g5) obj2;
                HashMap hashMap = (HashMap) obj;
                if (r2.f25216a) {
                    a8.b("sync contacts by alert");
                }
                g5Var.F(hashMap, true, this.f23046b, this.f23047c, false, false, this.d);
                return;
            default:
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) obj2;
                Activity activity = (Activity) obj;
                if (zwVar.getParentActivity() != null) {
                    zwVar.f52658u2 = false;
                    boolean z9 = this.f23046b;
                    boolean z10 = this.f23047c;
                    boolean z11 = this.d;
                    if (z9 || z10 || z11) {
                        zwVar.A0 = true;
                        if (z9 && gh0.J0(activity)) {
                            c8.ia.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.lm(new org.telegram.ui.Components.ex(10, zwVar, activity), 1));
                            return;
                        } else if (z10 && zwVar.V1 && zwVar.getUserConfig().U && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.u4.v(activity, new org.telegram.ui.lu(zwVar, 0)).f27300a;
                            zwVar.U1 = u1Var;
                            zwVar.showDialog(u1Var);
                            return;
                        } else if (z11 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.g5) {
                                org.telegram.ui.ActionBar.u1 v = ((org.telegram.ui.g5) activity).v(2131624118, id.M0(2131747299, null));
                                zwVar.U1 = v;
                                zwVar.showDialog(v);
                                return;
                            }
                            return;
                        } else {
                            zwVar.u3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public i4(org.telegram.ui.zw zwVar, boolean z9, boolean z10, boolean z11, Activity activity) {
        this.f23048e = zwVar;
        this.f23046b = z9;
        this.f23047c = z10;
        this.d = z11;
        this.f23049f = activity;
    }
}
