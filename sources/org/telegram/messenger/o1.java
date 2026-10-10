package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.ft;
import org.telegram.ui.gk0;
import org.telegram.ui.ty;
import org.telegram.ui.yv;
public final class o1 implements Runnable {
    public final int f18700a = 0;
    public final boolean f18701b;
    public final boolean f18702c;
    public final boolean d;
    public final Object f18703e;
    public final Object f18704f;

    public o1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.f18703e = contactsController;
        this.f18704f = hashMap;
        this.f18701b = z10;
        this.f18702c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f18700a) {
            case 0:
                ((ContactsController) this.f18703e).lambda$syncPhoneBookByAlert$7((HashMap) this.f18704f, this.f18701b, this.f18702c, this.d);
                return;
            default:
                ty tyVar = (ty) this.f18703e;
                Activity activity = (Activity) this.f18704f;
                if (tyVar.getParentActivity() != null) {
                    tyVar.f42295t2 = false;
                    boolean z10 = this.f18701b;
                    boolean z11 = this.f18702c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        tyVar.A0 = true;
                        if (z10 && gk0.p(activity)) {
                            gf0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new tn(1, new ft(2, tyVar, activity)));
                            return;
                        } else if (z11 && tyVar.U1 && tyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.g5.v(activity, new yv(tyVar, 0)).f20378a;
                            tyVar.T1 = b2Var;
                            tyVar.showDialog(b2Var);
                            return;
                        } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.h5) {
                                org.telegram.ui.ActionBar.b2 v = ((org.telegram.ui.h5) activity).v(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                tyVar.T1 = v;
                                tyVar.showDialog(v);
                                return;
                            }
                            return;
                        } else {
                            tyVar.h3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public o1(ty tyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f18703e = tyVar;
        this.f18701b = z10;
        this.f18702c = z11;
        this.d = z12;
        this.f18704f = activity;
    }
}
