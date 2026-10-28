package bi;

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
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fl0;
public final class s2 implements Utilities.Callback2 {
    public final int f5387a;
    public final Object f5388b;
    public final Object f5389c;
    public final Object d;
    public final Object e;

    public s2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f5387a = i10;
        this.f5388b = obj;
        this.f5389c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i10 = this.f5387a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f5389c;
        Object obj6 = this.f5388b;
        switch (i10) {
            case 0:
                h7.g0((h7) obj6, (Utilities.Callback2) obj5, (ArrayList) obj4, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                h7.n0((h7) obj6, (qf.c) obj5, (vg.n1) obj4, (q3) obj3, (TL_stars.starGiftDepositPayload) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                w51 w51Var = (w51) obj5;
                String str = (String) obj4;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.e2) obj6).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    w51Var.run();
                    return;
                }
                org.telegram.ui.ActionBar.k3 k3Var = fl0.f39397a;
                if (k3Var != null) {
                    k3Var.dismiss();
                    fl0.f39397a = null;
                }
                org.telegram.ui.Components.wc a2 = fl0.a();
                int i11 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                if (TextUtils.isEmpty(str)) {
                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                } else {
                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Gi, u6Var));
                }
                a2.M(string, replaceSingleLinkBold, i11).j();
                return;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj6;
                di.x7 x7Var = (di.x7) obj5;
                String str2 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.u6 u6Var2 = a1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(a1Var.M).lambda$processUpdates$379(updates, false);
                    a1Var.x(x7Var, "requested_chat_sent", org.telegram.ui.web.a1.A(str2, "req_id"));
                    long j10 = a1Var.U.f22177id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f22177id);
                    org.telegram.ui.web.e0 e0Var = new org.telegram.ui.web.e0(a1Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(e0Var);
                    }
                    org.telegram.ui.web.g0 g0Var = a1Var.f44669c;
                    if (g0Var != null) {
                        g0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    new org.telegram.ui.Components.wc(a1Var, u6Var2).g0(tL_error2, false);
                    a1Var.x(x7Var, "requested_chat_failed", org.telegram.ui.web.a1.A(str2, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.wc(a1Var, u6Var2).f0("UNKNOWN_BUTTON", false);
                    a1Var.x(x7Var, "requested_chat_failed", org.telegram.ui.web.a1.A(str2, "req_id"));
                    return;
                }
        }
    }
}
