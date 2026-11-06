package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.dh0;
public final class j4 implements Runnable {
    public final int f23477a = 0;
    public final boolean f23478b;
    public final boolean f23479c;
    public final boolean d;
    public final Object f23480e;
    public final Object f23481f;

    public j4(g5 g5Var, HashMap hashMap, boolean z9, boolean z10, boolean z11) {
        this.f23480e = g5Var;
        this.f23481f = hashMap;
        this.f23478b = z9;
        this.f23479c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i7 = this.f23477a;
        Object obj = this.f23481f;
        Object obj2 = this.f23480e;
        switch (i7) {
            case 0:
                g5 g5Var = (g5) obj2;
                HashMap hashMap = (HashMap) obj;
                if (r2.f25199a) {
                    a8.b("sync contacts by alert");
                }
                g5Var.F(hashMap, true, this.f23478b, this.f23479c, false, false, this.d);
                return;
            default:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) obj2;
                Activity activity = (Activity) obj;
                if (wwVar.getParentActivity() != null) {
                    wwVar.f51625t2 = false;
                    boolean z9 = this.f23478b;
                    boolean z10 = this.f23479c;
                    boolean z11 = this.d;
                    if (z9 || z10 || z11) {
                        wwVar.A0 = true;
                        if (z9 && dh0.J0(activity)) {
                            c8.ia.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.mm(new org.telegram.ui.Components.ex(10, wwVar, activity), 1));
                            return;
                        } else if (z10 && wwVar.U1 && wwVar.getUserConfig().U && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.v(activity, new org.telegram.ui.iu(wwVar, 0)).f27293a;
                            wwVar.T1 = u1Var;
                            wwVar.showDialog(u1Var);
                            return;
                        } else if (z11 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.g5) {
                                org.telegram.ui.ActionBar.u1 v = ((org.telegram.ui.g5) activity).v(2131624118, hd.M0(2131747298, null));
                                wwVar.T1 = v;
                                wwVar.showDialog(v);
                                return;
                            }
                            return;
                        } else {
                            wwVar.u3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public j4(org.telegram.ui.ww wwVar, boolean z9, boolean z10, boolean z11, Activity activity) {
        this.f23480e = wwVar;
        this.f23478b = z9;
        this.f23479c = z10;
        this.d = z11;
        this.f23481f = activity;
    }
}
