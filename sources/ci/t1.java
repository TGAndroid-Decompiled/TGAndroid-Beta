package ci;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sy;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.du;
import org.telegram.ui.fp;
import org.telegram.ui.ke;
import org.telegram.ui.kg;
import org.telegram.ui.zn;
public final class t1 implements RequestDelegate {
    public final int f5543a;
    public final boolean f5544b;
    public final Object f5545c;
    public final Object d;
    public final Object e;

    public t1(w1 w1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f5543a = 0;
        this.f5545c = w1Var;
        this.f5544b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5543a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1((w1) this.f5545c, tLObject, this.f5544b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.b1((ke) this.f5545c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.f5544b, tLObject, 6));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new u1((Object) ((zn) this.f5545c), (Object) ((nf.e) this.d), tLObject, (Object) ((kg) this.e), this.f5544b, 15));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.b1((fp) this.f5545c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.f5544b, tL_error, 8));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new u1((sy) this.f5545c, (String) this.e, this.f5544b, (String) this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i2.b1((du) this.f5545c, tLObject, (d) this.d, this.f5544b, (HashSet) this.e, tL_error, 10));
                return;
        }
    }

    public t1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f5543a = i10;
        this.f5545c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5544b = z10;
    }

    public t1(sy syVar, String str, boolean z10, String str2) {
        this.f5543a = 4;
        this.f5545c = syVar;
        this.e = str;
        this.f5544b = z10;
        this.d = str2;
    }

    public t1(du duVar, d dVar, boolean z10, HashSet hashSet) {
        this.f5543a = 5;
        this.f5545c = duVar;
        this.d = dVar;
        this.f5544b = z10;
        this.e = hashSet;
    }
}
