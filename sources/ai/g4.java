package ai;

import android.app.Activity;
import java.io.Serializable;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bz;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.sn;
import org.telegram.ui.st;
import org.telegram.ui.vo;
public final class g4 implements RequestDelegate {
    public final int f1339a;
    public final boolean f1340b;
    public final Object f1341c;
    public final Object d;
    public final Object e;

    public g4(ei.t1 t1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f1339a = 1;
        this.f1341c = t1Var;
        this.f1340b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1339a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m4((k7) this.f1341c, tL_error, (Utilities.Callback) this.d, (TwoStepVerificationActivity) this.e, this.f1340b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ei.s1((ei.t1) this.f1341c, tLObject, this.f1340b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new m4((org.telegram.ui.ke) this.f1341c, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.d, this.f1340b, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ei.s1((Object) ((sn) this.f1341c), (Object) ((pf.c) this.d), tLObject, (Object) ((t3) this.e), this.f1340b, 14));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new m4((vo) this.f1341c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.f1340b, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ei.s1((bz) this.f1341c, (String) this.d, this.f1340b, (String) this.e, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4((st) this.f1341c, tLObject, (ei.d) this.d, this.f1340b, (HashSet) this.e, tL_error));
                return;
        }
    }

    public g4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f1339a = i10;
        this.f1341c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1340b = z10;
    }

    public g4(Object obj, Object obj2, boolean z10, Serializable serializable, int i10) {
        this.f1339a = i10;
        this.f1341c = obj;
        this.d = obj2;
        this.f1340b = z10;
        this.e = serializable;
    }

    public g4(org.telegram.ui.ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10) {
        this.f1339a = 2;
        this.f1341c = keVar;
        this.e = twoStepVerificationActivity;
        this.d = activity;
        this.f1340b = z10;
    }
}
