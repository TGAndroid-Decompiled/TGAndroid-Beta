package ci;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sy;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bo;
import org.telegram.ui.eu;
import org.telegram.ui.hp;
import org.telegram.ui.le;
import org.telegram.ui.og;
public final class t1 implements RequestDelegate {
    public final int f5544a;
    public final boolean f5545b;
    public final Object f5546c;
    public final Object d;
    public final Object e;

    public t1(w1 w1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f5544a = 0;
        this.f5546c = w1Var;
        this.f5545b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5544a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1((w1) this.f5546c, tLObject, this.f5545b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.b1((le) this.f5546c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.f5545b, tLObject, 6));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new u1((Object) ((bo) this.f5546c), (Object) ((nf.e) this.d), tLObject, (Object) ((og) this.e), this.f5545b, 14));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.b1((hp) this.f5546c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.f5545b, tL_error, 8));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new u1((sy) this.f5546c, (String) this.e, this.f5545b, (String) this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i2.b1((eu) this.f5546c, tLObject, (d) this.d, this.f5545b, (HashSet) this.e, tL_error, 10));
                return;
        }
    }

    public t1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f5544a = i10;
        this.f5546c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5545b = z10;
    }

    public t1(sy syVar, String str, boolean z10, String str2) {
        this.f5544a = 4;
        this.f5546c = syVar;
        this.e = str;
        this.f5545b = z10;
        this.d = str2;
    }

    public t1(eu euVar, d dVar, boolean z10, HashSet hashSet) {
        this.f5544a = 5;
        this.f5546c = euVar;
        this.d = dVar;
        this.f5545b = z10;
        this.e = hashSet;
    }
}
