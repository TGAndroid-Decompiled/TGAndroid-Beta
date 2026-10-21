package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.cy;
import org.telegram.ui.kv;
import org.telegram.ui.pj0;
public final class r1 implements Runnable {
    public final int f19400a = 0;
    public final boolean f19401b;
    public final boolean f19402c;
    public final boolean d;
    public final Object e;
    public final Object f19403f;

    public r1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f19403f = hashMap;
        this.f19401b = z10;
        this.f19402c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f19400a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f19403f, this.f19401b, this.f19402c, this.d);
                return;
            default:
                cy cyVar = (cy) this.e;
                Activity activity = (Activity) this.f19403f;
                if (cyVar.getParentActivity() != null) {
                    cyVar.f36170t2 = false;
                    boolean z10 = this.f19401b;
                    boolean z11 = this.f19402c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        cyVar.A0 = true;
                        if (z10 && pj0.o(activity)) {
                            xe0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new nn(1, new qy(8, cyVar, activity)));
                            return;
                        } else if (z11 && cyVar.U1 && cyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.f5.v(activity, new kv(cyVar, 0)).f20605a;
                            cyVar.T1 = b2Var;
                            cyVar.showDialog(b2Var);
                            return;
                        } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.m5) {
                                org.telegram.ui.ActionBar.b2 v = ((org.telegram.ui.m5) activity).v(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                cyVar.T1 = v;
                                cyVar.showDialog(v);
                                return;
                            }
                            return;
                        } else {
                            cyVar.h3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public r1(cy cyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = cyVar;
        this.f19401b = z10;
        this.f19402c = z11;
        this.d = z12;
        this.f19403f = activity;
    }
}
