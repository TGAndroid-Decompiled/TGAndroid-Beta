package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.ck0;
import org.telegram.ui.ey;
import org.telegram.ui.mv;
public final class s1 implements Runnable {
    public final int f21162a = 0;
    public final boolean f21163b;
    public final boolean f21164c;
    public final boolean d;
    public final Object e;
    public final Object f21165f;

    public s1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f21165f = hashMap;
        this.f21163b = z10;
        this.f21164c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f21162a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f21165f, this.f21163b, this.f21164c, this.d);
                return;
            default:
                ey eyVar = (ey) this.e;
                Activity activity = (Activity) this.f21165f;
                if (eyVar.getParentActivity() != null) {
                    eyVar.f39076t2 = false;
                    boolean z10 = this.f21163b;
                    boolean z11 = this.f21164c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        eyVar.A0 = true;
                        if (z10 && ck0.n(activity)) {
                            ye0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new on(1, new oy(10, eyVar, activity)));
                            return;
                        } else if (z11 && eyVar.U1 && eyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.v(activity, new mv(eyVar, 0)).f22369a;
                            eyVar.T1 = e2Var;
                            eyVar.showDialog(e2Var);
                            return;
                        } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.k5) {
                                org.telegram.ui.ActionBar.e2 w10 = ((org.telegram.ui.k5) activity).w(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                eyVar.T1 = w10;
                                eyVar.showDialog(w10);
                                return;
                            }
                            return;
                        } else {
                            eyVar.r3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public s1(ey eyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = eyVar;
        this.f21163b = z10;
        this.f21164c = z11;
        this.d = z12;
        this.f21165f = activity;
    }
}
