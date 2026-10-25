package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.ak0;
import org.telegram.ui.cy;
import org.telegram.ui.kv;
public final class s1 implements Runnable {
    public final int f21189a = 0;
    public final boolean f21190b;
    public final boolean f21191c;
    public final boolean d;
    public final Object e;
    public final Object f21192f;

    public s1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f21192f = hashMap;
        this.f21190b = z10;
        this.f21191c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f21189a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f21192f, this.f21190b, this.f21191c, this.d);
                return;
            default:
                cy cyVar = (cy) this.e;
                Activity activity = (Activity) this.f21192f;
                if (cyVar.getParentActivity() != null) {
                    cyVar.f38661t2 = false;
                    boolean z10 = this.f21190b;
                    boolean z11 = this.f21191c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        cyVar.A0 = true;
                        if (z10 && ak0.n(activity)) {
                            xe0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new on(1, new oy(10, cyVar, activity)));
                            return;
                        } else if (z11 && cyVar.U1 && cyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.v(activity, new kv(cyVar, 0)).f22366a;
                            cyVar.T1 = e2Var;
                            cyVar.showDialog(e2Var);
                            return;
                        } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.k5) {
                                org.telegram.ui.ActionBar.e2 w10 = ((org.telegram.ui.k5) activity).w(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                cyVar.T1 = w10;
                                cyVar.showDialog(w10);
                                return;
                            }
                            return;
                        } else {
                            cyVar.r3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public s1(cy cyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = cyVar;
        this.f21190b = z10;
        this.f21191c = z11;
        this.d = z12;
        this.f21192f = activity;
    }
}
