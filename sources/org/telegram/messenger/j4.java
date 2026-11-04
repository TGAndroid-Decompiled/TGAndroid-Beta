package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.zg0;
public final class j4 implements Runnable {
    public final int f23635a = 0;
    public final boolean f23636b;
    public final boolean f23637c;
    public final boolean d;
    public final Object f23638e;
    public final Object f23639f;

    public j4(g5 g5Var, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.f23638e = g5Var;
        this.f23639f = hashMap;
        this.f23636b = z10;
        this.f23637c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int i3 = this.f23635a;
        Object obj = this.f23639f;
        Object obj2 = this.f23638e;
        switch (i3) {
            case 0:
                g5 g5Var = (g5) obj2;
                HashMap hashMap = (HashMap) obj;
                if (r2.f25040a) {
                    a8.b("sync contacts by alert");
                }
                g5Var.F(hashMap, true, this.f23636b, this.f23637c, false, false, this.d);
                return;
            default:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) obj2;
                Activity activity = (Activity) obj;
                if (uwVar.getParentActivity() != null) {
                    uwVar.f50305u2 = false;
                    boolean z10 = this.f23636b;
                    boolean z11 = this.f23637c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        uwVar.B0 = true;
                        if (z10 && zg0.J0(activity)) {
                            b8.nf.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.lm(new org.telegram.ui.Components.ei(13, uwVar, activity), 1));
                            return;
                        } else if (z11 && uwVar.V1 && uwVar.getUserConfig().V && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.s1 s1Var = org.telegram.ui.Components.t4.v(activity, new org.telegram.ui.gu(uwVar, 0)).f27343a;
                            uwVar.U1 = s1Var;
                            uwVar.showDialog(s1Var);
                            return;
                        } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.i5) {
                                org.telegram.ui.ActionBar.s1 v = ((org.telegram.ui.i5) activity).v(2131624118, bd.M0(2131747307, null));
                                uwVar.U1 = v;
                                uwVar.showDialog(v);
                                return;
                            }
                            return;
                        } else {
                            uwVar.u3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public j4(org.telegram.ui.uw uwVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f23638e = uwVar;
        this.f23636b = z10;
        this.f23637c = z11;
        this.d = z12;
        this.f23639f = activity;
    }
}
