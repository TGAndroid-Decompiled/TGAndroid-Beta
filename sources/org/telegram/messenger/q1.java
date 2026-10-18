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
    public final int f19308a = 0;
    public final boolean f19309b;
    public final boolean f19310c;
    public final boolean d;
    public final Object e;
    public final Object f19311f;

    public q1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f19311f = hashMap;
        this.f19309b = z10;
        this.f19310c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f19308a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f19311f, this.f19309b, this.f19310c, this.d);
                return;
            default:
                ey eyVar = (ey) this.e;
                Activity activity = (Activity) this.f19311f;
                if (eyVar.getParentActivity() != null) {
                    eyVar.f36715t2 = false;
                    boolean z10 = this.f19309b;
                    boolean z11 = this.f19310c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        eyVar.A0 = true;
                        if (z10 && rj0.o(activity)) {
                            we0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new nn(1, new qy(8, eyVar, activity)));
                            return;
                        } else if (z11 && eyVar.U1 && eyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.f5.v(activity, new mv(eyVar, 0)).f20601a;
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
        this.f19309b = z10;
        this.f19310c = z11;
        this.d = z12;
        this.f19311f = activity;
    }
}
