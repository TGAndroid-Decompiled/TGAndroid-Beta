package ci;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vy;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.du;
import org.telegram.ui.ep;
import org.telegram.ui.lg;
import org.telegram.ui.me;
import org.telegram.ui.yn;
public final class t1 implements RequestDelegate {
    public final int f5953a;
    public final boolean f5954b;
    public final Object f5955c;
    public final Object d;
    public final Object f5956e;

    public t1(w1 w1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f5953a = 0;
        this.f5955c = w1Var;
        this.f5954b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.f5956e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5953a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1((w1) this.f5955c, tLObject, this.f5954b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.f5956e, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.c1((me) this.f5955c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.f5956e, this.f5954b, tLObject, 6));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new u1((Object) ((yn) this.f5955c), (Object) ((nf.e) this.d), tLObject, (Object) ((lg) this.f5956e), this.f5954b, 15));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.c1((ep) this.f5955c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.f5956e, this.f5954b, tL_error, 8));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new u1((vy) this.f5955c, (String) this.f5956e, this.f5954b, (String) this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i2.c1((du) this.f5955c, tLObject, (d) this.d, this.f5954b, (HashSet) this.f5956e, tL_error, 10));
                return;
        }
    }

    public t1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f5953a = i10;
        this.f5955c = obj;
        this.d = obj2;
        this.f5956e = obj3;
        this.f5954b = z10;
    }

    public t1(vy vyVar, String str, boolean z10, String str2) {
        this.f5953a = 4;
        this.f5955c = vyVar;
        this.f5956e = str;
        this.f5954b = z10;
        this.d = str2;
    }

    public t1(du duVar, d dVar, boolean z10, HashSet hashSet) {
        this.f5953a = 5;
        this.f5955c = duVar;
        this.d = dVar;
        this.f5954b = z10;
        this.f5956e = hashSet;
    }
}
