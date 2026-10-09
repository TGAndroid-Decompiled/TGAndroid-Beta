package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.ft;
import org.telegram.ui.gk0;
import org.telegram.ui.ty;
import org.telegram.ui.yv;
public final class o1 implements Runnable {
    public final int f18696a = 0;
    public final boolean f18697b;
    public final boolean f18698c;
    public final boolean d;
    public final Object f18699e;
    public final Object f18700f;

    public o1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.f18699e = contactsController;
        this.f18700f = hashMap;
        this.f18697b = z10;
        this.f18698c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f18696a) {
            case 0:
                ((ContactsController) this.f18699e).lambda$syncPhoneBookByAlert$7((HashMap) this.f18700f, this.f18697b, this.f18698c, this.d);
                return;
            default:
                ty tyVar = (ty) this.f18699e;
                Activity activity = (Activity) this.f18700f;
                if (tyVar.getParentActivity() != null) {
                    tyVar.f42249t2 = false;
                    boolean z10 = this.f18697b;
                    boolean z11 = this.f18698c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        tyVar.A0 = true;
                        if (z10 && gk0.p(activity)) {
                            ef0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new tn(1, new ft(2, tyVar, activity)));
                            return;
                        } else if (z11 && tyVar.U1 && tyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.g5.v(activity, new yv(tyVar, 0)).f20374a;
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
        this.f18699e = tyVar;
        this.f18697b = z10;
        this.f18698c = z11;
        this.d = z12;
        this.f18700f = activity;
    }
}
