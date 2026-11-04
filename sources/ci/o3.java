package ci;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.bn;
import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mx;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.qs;
import org.telegram.ui.wm;
import org.telegram.ui.xd;
import org.telegram.ui.yn;
public final class o3 implements RequestDelegate {
    public final int f5677a;
    public final boolean f5678b;
    public final Object f5679c;
    public final Object d;
    public final Object f5680e;

    public o3(gi.r1 r1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f5677a = 1;
        this.f5679c = r1Var;
        this.f5678b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.f5680e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5677a) {
            case 0:
                org.telegram.messenger.g0.h3(new v3(0, (l6) this.f5679c, tL_error, (u10) this.d, (TwoStepVerificationActivity) this.f5680e, tLObject, this.f5678b));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new gi.q1((gi.r1) this.f5679c, tLObject, this.f5678b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.f5680e, 0));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new bn((org.telegram.messenger.x6) this.f5679c, tLObject, (TLRPC.TL_textWithEntities) this.d, (org.telegram.ui.ActionBar.s1) this.f5680e, this.f5678b, 2));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new v3((xd) this.f5679c, tL_error, (TwoStepVerificationActivity) this.f5680e, (Activity) this.d, this.f5678b, tLObject));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new gi.q1((Object) ((wm) this.f5679c), (Object) ((sf.b) this.d), tLObject, (Object) ((g3) this.f5680e), this.f5678b, 6));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new v3((yn) this.f5679c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.f5680e, this.f5678b, tL_error));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new gi.q1((mx) this.f5679c, (String) this.d, this.f5678b, (String) this.f5680e, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new v3((qs) this.f5679c, tLObject, (gi.d) this.d, this.f5678b, (HashSet) this.f5680e, tL_error));
                return;
        }
    }

    public o3(Object obj, Object obj2, Object obj3, boolean z10, int i3) {
        this.f5677a = i3;
        this.f5679c = obj;
        this.d = obj2;
        this.f5680e = obj3;
        this.f5678b = z10;
    }

    public o3(Object obj, Object obj2, boolean z10, Object obj3, int i3) {
        this.f5677a = i3;
        this.f5679c = obj;
        this.d = obj2;
        this.f5678b = z10;
        this.f5680e = obj3;
    }

    public o3(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10) {
        this.f5677a = 3;
        this.f5679c = xdVar;
        this.f5680e = twoStepVerificationActivity;
        this.d = activity;
        this.f5678b = z10;
    }
}
