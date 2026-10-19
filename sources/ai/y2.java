package ai;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uk0;
public final class y2 implements Utilities.Callback2 {
    public final int f2471a;
    public final Object f2472b;
    public final Object f2473c;
    public final Object d;
    public final Object e;

    public y2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2471a = i10;
        this.f2472b = obj;
        this.f2473c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i10 = this.f2471a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f2473c;
        Object obj6 = this.f2472b;
        switch (i10) {
            case 0:
                k7.i0((k7) obj6, (Utilities.Callback2) obj5, (ArrayList) obj4, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                k7.d0((k7) obj6, (pf.c) obj5, (ug.m1) obj4, (t3) obj3, (TL_stars.starGiftDepositPayload) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                g51 g51Var = (g51) obj5;
                String str = (String) obj4;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.b2) obj6).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    g51Var.run();
                    return;
                }
                org.telegram.ui.ActionBar.f3 f3Var = uk0.f42005a;
                if (f3Var != null) {
                    f3Var.dismiss();
                    uk0.f42005a = null;
                }
                org.telegram.ui.Components.xc a2 = uk0.a();
                int i11 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                if (TextUtils.isEmpty(str)) {
                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                } else {
                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, d6Var));
                }
                a2.M(string, replaceSingleLinkBold, i11).j();
                return;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj6;
                ci.z7 z7Var = (ci.z7) obj5;
                String str2 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.d6 d6Var2 = a1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(a1Var.M).lambda$processUpdates$377(updates, false);
                    a1Var.x(z7Var, "requested_chat_sent", org.telegram.ui.web.a1.A(str2, "req_id"));
                    long j10 = a1Var.U.f20422id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20422id);
                    org.telegram.ui.web.e0 e0Var = new org.telegram.ui.web.e0(a1Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(e0Var);
                    }
                    org.telegram.ui.web.g0 g0Var = a1Var.f42558c;
                    if (g0Var != null) {
                        g0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    new org.telegram.ui.Components.xc(a1Var, d6Var2).f0(tL_error2, false);
                    a1Var.x(z7Var, "requested_chat_failed", org.telegram.ui.web.a1.A(str2, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.xc(a1Var, d6Var2).e0("UNKNOWN_BUTTON", false);
                    a1Var.x(z7Var, "requested_chat_failed", org.telegram.ui.web.a1.A(str2, "req_id"));
                    return;
                }
        }
    }
}
