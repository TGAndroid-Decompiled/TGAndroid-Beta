package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.we0;
import org.telegram.ui.ey;
import org.telegram.ui.mv;
import org.telegram.ui.rj0;
public final class q1 implements Runnable {
    public final int f19316a = 0;
    public final boolean f19317b;
    public final boolean f19318c;
    public final boolean d;
    public final Object e;
    public final Object f19319f;

    public q1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f19319f = hashMap;
        this.f19317b = z10;
        this.f19318c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f19316a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f19319f, this.f19317b, this.f19318c, this.d);
                return;
            default:
                ey eyVar = (ey) this.e;
                Activity activity = (Activity) this.f19319f;
                if (eyVar.getParentActivity() != null) {
                    eyVar.f36731t2 = false;
                    boolean z10 = this.f19317b;
                    boolean z11 = this.f19318c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        eyVar.A0 = true;
                        if (z10 && rj0.o(activity)) {
                            we0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new nn(1, new qy(8, eyVar, activity)));
                            return;
                        } else if (z11 && eyVar.U1 && eyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.f5.v(activity, new mv(eyVar, 0)).f20608a;
                            eyVar.T1 = b2Var;
                            eyVar.showDialog(b2Var);
                            return;
                        } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.m5) {
                                org.telegram.ui.ActionBar.b2 v = ((org.telegram.ui.m5) activity).v(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                eyVar.T1 = v;
                                eyVar.showDialog(v);
                                return;
                            }
                            return;
                        } else {
                            eyVar.h3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public q1(ey eyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = eyVar;
        this.f19317b = z10;
        this.f19318c = z11;
        this.d = z12;
        this.f19319f = activity;
    }
}
