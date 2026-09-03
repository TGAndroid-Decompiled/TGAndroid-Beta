package lh;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zk0;
public final class z1 implements Utilities.Callback2 {
    public final int f13408a;
    public final Object f13409b;
    public final Object f13410c;
    public final Serializable d;
    public final Object e;

    public z1(Object obj, Object obj2, Serializable serializable, Object obj3, int i10) {
        this.f13408a = i10;
        this.f13409b = obj;
        this.f13410c = obj2;
        this.d = serializable;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i10 = this.f13408a;
        Object obj3 = this.e;
        Serializable serializable = this.d;
        Object obj4 = this.f13410c;
        Object obj5 = this.f13409b;
        switch (i10) {
            case 0:
                g5.c0((g5) obj5, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.d2) obj5).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    zk0.f40496a = g3Var;
                    g3Var.show();
                    return;
                }
                org.telegram.ui.ActionBar.g3 g3Var2 = zk0.f40496a;
                if (g3Var2 != null) {
                    g3Var2.dismiss();
                    zk0.f40496a = null;
                }
                qc a2 = zk0.a();
                int i11 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                if (TextUtils.isEmpty(str)) {
                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                } else {
                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var));
                }
                a2.M(string, replaceSingleLinkBold, i11).j();
                return;
            default:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj5;
                nh.j7 j7Var = (nh.j7) obj4;
                String str2 = (String) serializable;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.f6 f6Var2 = c1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(c1Var.J).processUpdates(updates, false);
                    c1Var.z(j7Var, "requested_chat_sent", org.telegram.ui.web.c1.B(str2, "req_id"));
                    long j10 = c1Var.R.f19306id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f19306id);
                    org.telegram.ui.web.e0 e0Var = new org.telegram.ui.web.e0(c1Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(e0Var);
                    }
                    org.telegram.ui.web.g0 g0Var = c1Var.f39385c;
                    if (g0Var != null) {
                        g0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    new qc(c1Var, f6Var2).d0(tL_error2, false);
                    c1Var.z(j7Var, "requested_chat_failed", org.telegram.ui.web.c1.B(str2, "req_id"));
                    return;
                } else {
                    new qc(c1Var, f6Var2).c0("UNKNOWN_BUTTON", false);
                    c1Var.z(j7Var, "requested_chat_failed", org.telegram.ui.web.c1.B(str2, "req_id"));
                    return;
                }
        }
    }
}
