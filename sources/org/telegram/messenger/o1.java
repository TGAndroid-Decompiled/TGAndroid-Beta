package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.et;
import org.telegram.ui.fk0;
import org.telegram.ui.sy;
import org.telegram.ui.xv;
public final class o1 implements Runnable {
    public final int f18735a = 0;
    public final boolean f18736b;
    public final boolean f18737c;
    public final boolean d;
    public final Object f18738e;
    public final Object f18739f;

    public o1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.f18738e = contactsController;
        this.f18739f = hashMap;
        this.f18736b = z10;
        this.f18737c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f18735a) {
            case 0:
                ((ContactsController) this.f18738e).lambda$syncPhoneBookByAlert$7((HashMap) this.f18739f, this.f18736b, this.f18737c, this.d);
                return;
            default:
                sy syVar = (sy) this.f18738e;
                Activity activity = (Activity) this.f18739f;
                if (syVar.getParentActivity() != null) {
                    syVar.f42018t2 = false;
                    boolean z10 = this.f18736b;
                    boolean z11 = this.f18737c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        syVar.A0 = true;
                        if (z10 && fk0.p(activity)) {
                            ff0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new tn(1, new et(2, syVar, activity)));
                            return;
                        } else if (z11 && syVar.U1 && syVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.v(activity, new xv(syVar, 0)).f20404a;
                            syVar.T1 = a2Var;
                            syVar.showDialog(a2Var);
                            return;
                        } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.g5) {
                                org.telegram.ui.ActionBar.a2 v = ((org.telegram.ui.g5) activity).v(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                syVar.T1 = v;
                                syVar.showDialog(v);
                                return;
                            }
                            return;
                        } else {
                            syVar.h3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public o1(sy syVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f18738e = syVar;
        this.f18736b = z10;
        this.f18737c = z11;
        this.d = z12;
        this.f18739f = activity;
    }
}
