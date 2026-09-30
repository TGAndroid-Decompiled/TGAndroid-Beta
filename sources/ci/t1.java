package ci;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vy;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cp;
import org.telegram.ui.hg;
import org.telegram.ui.je;
import org.telegram.ui.wn;
import org.telegram.ui.yt;
public final class t1 implements RequestDelegate {
    public final int f5534a;
    public final boolean f5535b;
    public final Object f5536c;
    public final Object d;
    public final Object e;

    public t1(w1 w1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f5534a = 0;
        this.f5536c = w1Var;
        this.f5535b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5534a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1((w1) this.f5536c, tLObject, this.f5535b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.c1((je) this.f5536c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.f5535b, tLObject, 6));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new u1((Object) ((wn) this.f5536c), (Object) ((nf.e) this.d), tLObject, (Object) ((hg) this.e), this.f5535b, 15));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.c1((cp) this.f5536c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.f5535b, tL_error, 8));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new u1((vy) this.f5536c, (String) this.e, this.f5535b, (String) this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i2.c1((yt) this.f5536c, tLObject, (d) this.d, this.f5535b, (HashSet) this.e, tL_error, 10));
                return;
        }
    }

    public t1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f5534a = i10;
        this.f5536c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5535b = z10;
    }

    public t1(vy vyVar, String str, boolean z10, String str2) {
        this.f5534a = 4;
        this.f5536c = vyVar;
        this.e = str;
        this.f5535b = z10;
        this.d = str2;
    }

    public t1(yt ytVar, d dVar, boolean z10, HashSet hashSet) {
        this.f5534a = 5;
        this.f5536c = ytVar;
        this.d = dVar;
        this.f5535b = z10;
        this.e = hashSet;
    }
}
