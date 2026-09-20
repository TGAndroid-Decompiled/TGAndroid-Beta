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
    public final int f5545a;
    public final boolean f5546b;
    public final Object f5547c;
    public final Object d;
    public final Object e;

    public t1(w1 w1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f5545a = 0;
        this.f5547c = w1Var;
        this.f5546b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5545a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1((w1) this.f5547c, tLObject, this.f5546b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.b1((ke) this.f5547c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.f5546b, tLObject, 6));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new u1((Object) ((zn) this.f5547c), (Object) ((nf.e) this.d), tLObject, (Object) ((kg) this.e), this.f5546b, 15));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.b1((fp) this.f5547c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.f5546b, tL_error, 8));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new u1((sy) this.f5547c, (String) this.e, this.f5546b, (String) this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i2.b1((du) this.f5547c, tLObject, (d) this.d, this.f5546b, (HashSet) this.e, tL_error, 10));
                return;
        }
    }

    public t1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f5545a = i10;
        this.f5547c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5546b = z10;
    }

    public t1(sy syVar, String str, boolean z10, String str2) {
        this.f5545a = 4;
        this.f5547c = syVar;
        this.e = str;
        this.f5546b = z10;
        this.d = str2;
    }

    public t1(du duVar, d dVar, boolean z10, HashSet hashSet) {
        this.f5545a = 5;
        this.f5547c = duVar;
        this.d = dVar;
        this.f5546b = z10;
        this.e = hashSet;
    }
}
