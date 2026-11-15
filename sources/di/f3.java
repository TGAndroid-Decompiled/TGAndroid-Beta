package di;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.in;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tx;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.eo;
import org.telegram.ui.vs;
import org.telegram.ui.xd;
public final class f3 implements RequestDelegate {
    public final int f8531a;
    public final boolean f8532b;
    public final Object f8533c;
    public final Object d;
    public final Object f8534e;

    public f3(hi.r1 r1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f8531a = 1;
        this.f8533c = r1Var;
        this.f8532b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.f8534e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8531a) {
            case 0:
                org.telegram.messenger.g0.h3(new m3(0, (c6) this.f8533c, tL_error, (z10) this.d, (TwoStepVerificationActivity) this.f8534e, tLObject, this.f8532b));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ai.j((Object) ((hi.r1) this.f8533c), tLObject, this.f8532b, (TLObject) ((TLRPC.TL_messages_getInlineBotResults) this.d), (String) this.f8534e, 1));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new in((org.telegram.messenger.x6) this.f8533c, tLObject, (TLRPC.TL_textWithEntities) this.d, (org.telegram.ui.ActionBar.t1) this.f8534e, this.f8532b, 2));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new m3((xd) this.f8533c, tL_error, (TwoStepVerificationActivity) this.f8534e, (Activity) this.d, this.f8532b, tLObject));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new ai.j((an) this.f8533c, (vf.b) this.d, tLObject, (z2) this.f8534e, this.f8532b, 7));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new m3((eo) this.f8533c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.f8534e, this.f8532b, tL_error));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new ai.j((tx) this.f8533c, (String) this.d, this.f8532b, (String) this.f8534e, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new m3((vs) this.f8533c, tLObject, (hi.d) this.d, this.f8532b, (HashSet) this.f8534e, tL_error));
                return;
        }
    }

    public f3(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f8531a = i7;
        this.f8533c = obj;
        this.d = obj2;
        this.f8534e = obj3;
        this.f8532b = z10;
    }

    public f3(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.f8531a = i7;
        this.f8533c = obj;
        this.d = obj2;
        this.f8532b = z10;
        this.f8534e = obj3;
    }

    public f3(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10) {
        this.f8531a = 3;
        this.f8533c = xdVar;
        this.f8534e = twoStepVerificationActivity;
        this.d = activity;
        this.f8532b = z10;
    }
}
