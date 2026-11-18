package di;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.in;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yx;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.go;
import org.telegram.ui.ne;
import org.telegram.ui.ws;
import org.telegram.ui.xd;
public final class j3 implements RequestDelegate {
    public final int f9074a;
    public final boolean f9075b;
    public final Object f9076c;
    public final Object d;
    public final Object f9077e;

    public j3(hi.s1 s1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f9074a = 1;
        this.f9076c = s1Var;
        this.f9075b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.f9077e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9074a) {
            case 0:
                org.telegram.messenger.g0.g3(new o3(0, (f6) this.f9076c, tL_error, (x10) this.d, (TwoStepVerificationActivity) this.f9077e, tLObject, this.f9075b));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new ai.n((Object) ((hi.s1) this.f9076c), tLObject, this.f9075b, (TLObject) ((TLRPC.TL_messages_getInlineBotResults) this.d), (String) this.f9077e, 1));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new in((org.telegram.messenger.x6) this.f9076c, tLObject, (TLRPC.TL_textWithEntities) this.d, (org.telegram.ui.ActionBar.u1) this.f9077e, this.f9075b, 2));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new o3((xd) this.f9076c, tL_error, (TwoStepVerificationActivity) this.f9077e, (Activity) this.d, this.f9075b, tLObject));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new ai.n((bn) this.f9076c, (vf.b) this.d, tLObject, (ne) this.f9077e, this.f9075b, 7));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new o3((go) this.f9076c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.f9077e, this.f9075b, tL_error));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new ai.n((yx) this.f9076c, (String) this.d, this.f9075b, (String) this.f9077e, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new o3((ws) this.f9076c, tLObject, (hi.d) this.d, this.f9075b, (HashSet) this.f9077e, tL_error));
                return;
        }
    }

    public j3(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f9074a = i7;
        this.f9076c = obj;
        this.d = obj2;
        this.f9077e = obj3;
        this.f9075b = z10;
    }

    public j3(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.f9074a = i7;
        this.f9076c = obj;
        this.d = obj2;
        this.f9075b = z10;
        this.f9077e = obj3;
    }

    public j3(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10) {
        this.f9074a = 3;
        this.f9076c = xdVar;
        this.f9077e = twoStepVerificationActivity;
        this.d = activity;
        this.f9075b = z10;
    }
}
