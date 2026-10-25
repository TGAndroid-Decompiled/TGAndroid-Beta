package bi;

import android.app.Activity;
import java.io.Serializable;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.az;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ke;
import org.telegram.ui.rt;
import org.telegram.ui.un;
import org.telegram.ui.xo;
public final class d4 implements RequestDelegate {
    public final int f4489a;
    public final boolean f4490b;
    public final Object f4491c;
    public final Object d;
    public final Object e;

    public d4(fi.s1 s1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f4489a = 1;
        this.f4491c = s1Var;
        this.f4490b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4489a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k4((h7) this.f4491c, tL_error, (Utilities.Callback) this.d, (TwoStepVerificationActivity) this.e, this.f4490b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fi.r1((fi.s1) this.f4491c, tLObject, this.f4490b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new k4((ke) this.f4491c, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.d, this.f4490b, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new fi.r1((Object) ((un) this.f4491c), (Object) ((qf.c) this.d), tLObject, (Object) ((t3) this.e), this.f4490b, 14));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new k4((xo) this.f4491c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.f4490b, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new fi.r1((az) this.f4491c, (String) this.d, this.f4490b, (String) this.e, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k4((rt) this.f4491c, tLObject, (fi.d) this.d, this.f4490b, (HashSet) this.e, tL_error));
                return;
        }
    }

    public d4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f4489a = i10;
        this.f4491c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f4490b = z10;
    }

    public d4(Object obj, Object obj2, boolean z10, Serializable serializable, int i10) {
        this.f4489a = i10;
        this.f4491c = obj;
        this.d = obj2;
        this.f4490b = z10;
        this.e = serializable;
    }

    public d4(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10) {
        this.f4489a = 2;
        this.f4491c = keVar;
        this.e = twoStepVerificationActivity;
        this.d = activity;
        this.f4490b = z10;
    }
}
