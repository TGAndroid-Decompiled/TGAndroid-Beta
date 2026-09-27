package ci;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.uy;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bu;
import org.telegram.ui.dp;
import org.telegram.ui.kg;
import org.telegram.ui.me;
import org.telegram.ui.xn;
public final class t1 implements RequestDelegate {
    public final int f5532a;
    public final boolean f5533b;
    public final Object f5534c;
    public final Object d;
    public final Object e;

    public t1(w1 w1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f5532a = 0;
        this.f5534c = w1Var;
        this.f5533b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5532a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1((w1) this.f5534c, tLObject, this.f5533b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.c1((me) this.f5534c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.f5533b, tLObject, 6));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new u1((Object) ((xn) this.f5534c), (Object) ((nf.e) this.d), tLObject, (Object) ((kg) this.e), this.f5533b, 15));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.c1((dp) this.f5534c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.f5533b, tL_error, 8));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new u1((uy) this.f5534c, (String) this.e, this.f5533b, (String) this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i2.c1((bu) this.f5534c, tLObject, (d) this.d, this.f5533b, (HashSet) this.e, tL_error, 10));
                return;
        }
    }

    public t1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f5532a = i10;
        this.f5534c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5533b = z10;
    }

    public t1(uy uyVar, String str, boolean z10, String str2) {
        this.f5532a = 4;
        this.f5534c = uyVar;
        this.e = str;
        this.f5533b = z10;
        this.d = str2;
    }

    public t1(bu buVar, d dVar, boolean z10, HashSet hashSet) {
        this.f5532a = 5;
        this.f5534c = buVar;
        this.d = dVar;
        this.f5533b = z10;
        this.e = hashSet;
    }
}
