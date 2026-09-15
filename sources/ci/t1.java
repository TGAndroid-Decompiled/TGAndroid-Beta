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
import org.telegram.ui.cu;
import org.telegram.ui.hp;
import org.telegram.ui.je;
import org.telegram.ui.mg;
public final class t1 implements RequestDelegate {
    public final int f5539a;
    public final boolean f5540b;
    public final Object f5541c;
    public final Object d;
    public final Object e;

    public t1(w1 w1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f5539a = 0;
        this.f5541c = w1Var;
        this.f5540b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5539a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1((w1) this.f5541c, tLObject, this.f5540b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.b1((je) this.f5541c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.f5540b, tLObject, 6));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new u1((Object) ((bo) this.f5541c), (Object) ((nf.e) this.d), tLObject, (Object) ((mg) this.e), this.f5540b, 14));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.b1((hp) this.f5541c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.f5540b, tL_error, 8));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new u1((sy) this.f5541c, (String) this.e, this.f5540b, (String) this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i2.b1((cu) this.f5541c, tLObject, (d) this.d, this.f5540b, (HashSet) this.e, tL_error, 10));
                return;
        }
    }

    public t1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f5539a = i10;
        this.f5541c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5540b = z10;
    }

    public t1(sy syVar, String str, boolean z10, String str2) {
        this.f5539a = 4;
        this.f5541c = syVar;
        this.e = str;
        this.f5540b = z10;
        this.d = str2;
    }

    public t1(cu cuVar, d dVar, boolean z10, HashSet hashSet) {
        this.f5539a = 5;
        this.f5541c = cuVar;
        this.d = dVar;
        this.f5540b = z10;
        this.e = hashSet;
    }
}
