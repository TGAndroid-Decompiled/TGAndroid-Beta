package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.ey;
import org.telegram.ui.mv;
import org.telegram.ui.tj0;
public final class r1 implements Runnable {
    public final int f19412a = 0;
    public final boolean f19413b;
    public final boolean f19414c;
    public final boolean d;
    public final Object e;
    public final Object f19415f;

    public r1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f19415f = hashMap;
        this.f19413b = z10;
        this.f19414c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f19412a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f19415f, this.f19413b, this.f19414c, this.d);
                return;
            default:
                ey eyVar = (ey) this.e;
                Activity activity = (Activity) this.f19415f;
                if (eyVar.getParentActivity() != null) {
                    eyVar.f37112t2 = false;
                    boolean z10 = this.f19413b;
                    boolean z11 = this.f19414c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        eyVar.A0 = true;
                        if (z10 && tj0.n(activity)) {
                            ze0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new ln(1, new oy(8, eyVar, activity)));
                            return;
                        } else if (z11 && eyVar.U1 && eyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.d5.v(activity, new mv(eyVar, 0)).f20679a;
                            eyVar.T1 = c2Var;
                            eyVar.showDialog(c2Var);
                            return;
                        } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.l5) {
                                org.telegram.ui.ActionBar.c2 v = ((org.telegram.ui.l5) activity).v(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                eyVar.T1 = v;
                                eyVar.showDialog(v);
                                return;
                            }
                            return;
                        } else {
                            eyVar.g3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public r1(ey eyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = eyVar;
        this.f19413b = z10;
        this.f19414c = z11;
        this.d = z12;
        this.f19415f = activity;
    }
}
