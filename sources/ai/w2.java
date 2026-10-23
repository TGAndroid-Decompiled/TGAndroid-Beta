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
import org.telegram.ui.Components.n51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xk0;
public final class w2 implements Utilities.Callback2 {
    public final int f2346a;
    public final Object f2347b;
    public final Object f2348c;
    public final Object d;
    public final Object e;

    public w2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2346a = i10;
        this.f2347b = obj;
        this.f2348c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i10 = this.f2346a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f2348c;
        Object obj6 = this.f2347b;
        switch (i10) {
            case 0:
                l7.g0((l7) obj6, (Utilities.Callback2) obj5, (ArrayList) obj4, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                l7.n0((l7) obj6, (pf.c) obj5, (ug.l1) obj4, (u3) obj3, (TL_stars.starGiftDepositPayload) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                n51 n51Var = (n51) obj5;
                String str = (String) obj4;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.c2) obj6).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    n51Var.run();
                    return;
                }
                org.telegram.ui.ActionBar.h3 h3Var = xk0.f43614a;
                if (h3Var != null) {
                    h3Var.dismiss();
                    xk0.f43614a = null;
                }
                org.telegram.ui.Components.xc a2 = xk0.a();
                int i11 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                if (TextUtils.isEmpty(str)) {
                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                } else {
                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, g6Var));
                }
                a2.M(string, replaceSingleLinkBold, i11).j();
                return;
            default:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj6;
                ci.y7 y7Var = (ci.y7) obj5;
                String str2 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.g6 g6Var2 = b1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(b1Var.M).lambda$processUpdates$377(updates, false);
                    b1Var.x(y7Var, "requested_chat_sent", org.telegram.ui.web.b1.A(str2, "req_id"));
                    long j10 = b1Var.U.f20490id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20490id);
                    org.telegram.ui.web.f0 f0Var = new org.telegram.ui.web.f0(b1Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(f0Var);
                    }
                    org.telegram.ui.web.h0 h0Var = b1Var.f43047c;
                    if (h0Var != null) {
                        h0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    new org.telegram.ui.Components.xc(b1Var, g6Var2).f0(tL_error2, false);
                    b1Var.x(y7Var, "requested_chat_failed", org.telegram.ui.web.b1.A(str2, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.xc(b1Var, g6Var2).e0("UNKNOWN_BUTTON", false);
                    b1Var.x(y7Var, "requested_chat_failed", org.telegram.ui.web.b1.A(str2, "req_id"));
                    return;
                }
        }
    }
}
