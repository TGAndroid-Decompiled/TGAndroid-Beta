package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.vn;
import org.telegram.ui.aw;
import org.telegram.ui.hk0;
import org.telegram.ui.jt;
import org.telegram.ui.vy;
public final class r1 implements Runnable {
    public final int f18735a = 0;
    public final boolean f18736b;
    public final boolean f18737c;
    public final boolean d;
    public final Object f18738e;
    public final Object f18739f;

    public r1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
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
                vy vyVar = (vy) this.f18738e;
                Activity activity = (Activity) this.f18739f;
                if (vyVar.getParentActivity() != null) {
                    vyVar.f42982t2 = false;
                    boolean z10 = this.f18736b;
                    boolean z11 = this.f18737c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        vyVar.A0 = true;
                        if (z10 && hk0.p(activity)) {
                            if0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new vn(1, new jt(2, vyVar, activity)));
                            return;
                        } else if (z11 && vyVar.U1 && vyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.v(activity, new aw(vyVar, 0)).f20142a;
                            vyVar.T1 = a2Var;
                            vyVar.showDialog(a2Var);
                            return;
                        } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.k5) {
                                org.telegram.ui.ActionBar.a2 v = ((org.telegram.ui.k5) activity).v(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                vyVar.T1 = v;
                                vyVar.showDialog(v);
                                return;
                            }
                            return;
                        } else {
                            vyVar.h3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public r1(vy vyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f18738e = vyVar;
        this.f18736b = z10;
        this.f18737c = z11;
        this.d = z12;
        this.f18739f = activity;
    }
}
