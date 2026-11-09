package bi;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.messenger.ln;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.px;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cn;
import org.telegram.ui.fo;
import org.telegram.ui.us;
public final class d4 implements RequestDelegate {
    public final int f3648a;
    public final boolean f3649b;
    public final Object f3650c;
    public final Object d;
    public final Object f3651e;

    public d4(fi.r1 r1Var, boolean z9, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f3648a = 1;
        this.f3650c = r1Var;
        this.f3649b = z9;
        this.d = tL_messages_getInlineBotResults;
        this.f3651e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3648a) {
            case 0:
                org.telegram.messenger.g0.h3(new l4(0, (k7) this.f3650c, tL_error, (c20) this.d, (TwoStepVerificationActivity) this.f3651e, tLObject, this.f3649b));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new fi.q1((fi.r1) this.f3650c, tLObject, this.f3649b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.f3651e, 0));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ln((org.telegram.messenger.x6) this.f3650c, tLObject, (TLRPC.TL_textWithEntities) this.d, (org.telegram.ui.ActionBar.u1) this.f3651e, this.f3649b, 2));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new l4((org.telegram.ui.zd) this.f3650c, tL_error, (TwoStepVerificationActivity) this.f3651e, (Activity) this.d, this.f3649b, tLObject));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new fi.q1((Object) ((cn) this.f3650c), (Object) ((vf.b) this.d), tLObject, (Object) ((t3) this.f3651e), this.f3649b, 6));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new l4((fo) this.f3650c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.f3651e, this.f3649b, tL_error));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new fi.q1((px) this.f3650c, (String) this.d, this.f3649b, (String) this.f3651e, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new l4((us) this.f3650c, tLObject, (fi.d) this.d, this.f3649b, (HashSet) this.f3651e, tL_error));
                return;
        }
    }

    public d4(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.f3648a = i7;
        this.f3650c = obj;
        this.d = obj2;
        this.f3651e = obj3;
        this.f3649b = z9;
    }

    public d4(Object obj, Object obj2, boolean z9, Object obj3, int i7) {
        this.f3648a = i7;
        this.f3650c = obj;
        this.d = obj2;
        this.f3649b = z9;
        this.f3651e = obj3;
    }

    public d4(org.telegram.ui.zd zdVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z9) {
        this.f3648a = 3;
        this.f3650c = zdVar;
        this.f3651e = twoStepVerificationActivity;
        this.d = activity;
        this.f3649b = z9;
    }
}
