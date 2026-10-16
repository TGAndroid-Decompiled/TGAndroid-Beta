package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.qn;
import org.telegram.ui.dw;
import org.telegram.ui.kk0;
import org.telegram.ui.mt;
import org.telegram.ui.yy;
public final class q1 implements Runnable {
    public final int f17851a = 0;
    public final boolean f17852b;
    public final boolean f17853c;
    public final boolean d;
    public final Object e;
    public final Object f17854f;

    public q1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f17854f = hashMap;
        this.f17852b = z10;
        this.f17853c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f17851a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f17854f, this.f17852b, this.f17853c, this.d);
                return;
            default:
                yy yyVar = (yy) this.e;
                Activity activity = (Activity) this.f17854f;
                if (yyVar.getParentActivity() != null) {
                    yyVar.f42082t2 = false;
                    boolean z10 = this.f17852b;
                    boolean z11 = this.f17853c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        yyVar.A0 = true;
                        if (z10 && kk0.o(activity)) {
                            df0.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new qn(1, new mt(2, yyVar, activity)));
                            return;
                        } else if (z11 && yyVar.U1 && yyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.v(activity, new dw(yyVar, 0)).f19248a;
                            yyVar.T1 = a2Var;
                            yyVar.showDialog(a2Var);
                            return;
                        } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            if (activity instanceof org.telegram.ui.l5) {
                                org.telegram.ui.ActionBar.a2 v = ((org.telegram.ui.l5) activity).v(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                                yyVar.T1 = v;
                                yyVar.showDialog(v);
                                return;
                            }
                            return;
                        } else {
                            yyVar.h3(true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public q1(yy yyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = yyVar;
        this.f17852b = z10;
        this.f17853c = z11;
        this.d = z12;
        this.f17854f = activity;
    }
}
