package di;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.in;
import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xx;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.fo;
import org.telegram.ui.ne;
import org.telegram.ui.vs;
import org.telegram.ui.xd;
public final class j3 implements RequestDelegate {
    public final int f9058a;
    public final boolean f9059b;
    public final Object f9060c;
    public final Object d;
    public final Object f9061e;

    public j3(hi.z1 z1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f9058a = 1;
        this.f9060c = z1Var;
        this.f9059b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.f9061e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9058a) {
            case 0:
                org.telegram.messenger.g0.g3(new o3(0, (f6) this.f9060c, tL_error, (w10) this.d, (TwoStepVerificationActivity) this.f9061e, tLObject, this.f9059b));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new ai.e((Object) ((hi.z1) this.f9060c), tLObject, this.f9059b, (TLObject) ((TLRPC.TL_messages_getInlineBotResults) this.d), (String) this.f9061e, 1));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new in((org.telegram.messenger.x6) this.f9060c, tLObject, (TLRPC.TL_textWithEntities) this.d, (org.telegram.ui.ActionBar.t1) this.f9061e, this.f9059b, 2));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new o3((xd) this.f9060c, tL_error, (TwoStepVerificationActivity) this.f9061e, (Activity) this.d, this.f9059b, tLObject));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new ai.e((bn) this.f9060c, (vf.b) this.d, tLObject, (ne) this.f9061e, this.f9059b, 7));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new o3((fo) this.f9060c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.f9061e, this.f9059b, tL_error));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new ai.e((xx) this.f9060c, (String) this.d, this.f9059b, (String) this.f9061e, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new o3((vs) this.f9060c, tLObject, (hi.e) this.d, this.f9059b, (HashSet) this.f9061e, tL_error));
                return;
        }
    }

    public j3(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f9058a = i7;
        this.f9060c = obj;
        this.d = obj2;
        this.f9061e = obj3;
        this.f9059b = z10;
    }

    public j3(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.f9058a = i7;
        this.f9060c = obj;
        this.d = obj2;
        this.f9059b = z10;
        this.f9061e = obj3;
    }

    public j3(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10) {
        this.f9058a = 3;
        this.f9060c = xdVar;
        this.f9061e = twoStepVerificationActivity;
        this.d = activity;
        this.f9059b = z10;
    }
}
