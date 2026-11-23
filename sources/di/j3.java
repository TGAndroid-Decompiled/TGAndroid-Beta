package di;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.jn;
import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ay;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.go;
import org.telegram.ui.ne;
import org.telegram.ui.ws;
import org.telegram.ui.xd;
public final class j3 implements RequestDelegate {
    public final int f9097a;
    public final boolean f9098b;
    public final Object f9099c;
    public final Object d;
    public final Object f9100e;

    public j3(hi.r1 r1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f9097a = 1;
        this.f9099c = r1Var;
        this.f9098b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.f9100e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9097a) {
            case 0:
                org.telegram.messenger.g0.g3(new o3(0, (f6) this.f9099c, tL_error, (y10) this.d, (TwoStepVerificationActivity) this.f9100e, tLObject, this.f9098b));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new ai.i((Object) ((hi.r1) this.f9099c), tLObject, this.f9098b, (TLObject) ((TLRPC.TL_messages_getInlineBotResults) this.d), (String) this.f9100e, 1));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new jn((org.telegram.messenger.x6) this.f9099c, tLObject, (TLRPC.TL_textWithEntities) this.d, (org.telegram.ui.ActionBar.t1) this.f9100e, this.f9098b, 2));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new o3((xd) this.f9099c, tL_error, (TwoStepVerificationActivity) this.f9100e, (Activity) this.d, this.f9098b, tLObject));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new ai.i((bn) this.f9099c, (vf.b) this.d, tLObject, (ne) this.f9100e, this.f9098b, 7));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new o3((go) this.f9099c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.f9100e, this.f9098b, tL_error));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new ai.i((ay) this.f9099c, (String) this.d, this.f9098b, (String) this.f9100e, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new o3((ws) this.f9099c, tLObject, (hi.e) this.d, this.f9098b, (HashSet) this.f9100e, tL_error));
                return;
        }
    }

    public j3(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f9097a = i7;
        this.f9099c = obj;
        this.d = obj2;
        this.f9100e = obj3;
        this.f9098b = z10;
    }

    public j3(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.f9097a = i7;
        this.f9099c = obj;
        this.d = obj2;
        this.f9098b = z10;
        this.f9100e = obj3;
    }

    public j3(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10) {
        this.f9097a = 3;
        this.f9099c = xdVar;
        this.f9100e = twoStepVerificationActivity;
        this.d = activity;
        this.f9098b = z10;
    }
}
