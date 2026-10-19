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
import org.telegram.ui.qn;
import org.telegram.ui.qt;
import org.telegram.ui.to;
public final class i4 implements RequestDelegate {
    public final int f1474a;
    public final boolean f1475b;
    public final Object f1476c;
    public final Object d;
    public final Object e;

    public i4(ei.t1 t1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f1474a = 1;
        this.f1476c = t1Var;
        this.f1475b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1474a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o4((k7) this.f1476c, tL_error, (Utilities.Callback) this.d, (TwoStepVerificationActivity) this.e, this.f1475b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ei.s1((ei.t1) this.f1476c, tLObject, this.f1475b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new o4((org.telegram.ui.ie) this.f1476c, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.d, this.f1475b, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ei.s1((Object) ((qn) this.f1476c), (Object) ((pf.c) this.d), tLObject, (Object) ((x3) this.e), this.f1475b, 14));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new o4((to) this.f1476c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.f1475b, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ei.s1((bz) this.f1476c, (String) this.d, this.f1475b, (String) this.e, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new o4((qt) this.f1476c, tLObject, (ei.d) this.d, this.f1475b, (HashSet) this.e, tL_error));
                return;
        }
    }

    public i4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f1474a = i10;
        this.f1476c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1475b = z10;
    }

    public i4(Object obj, Object obj2, boolean z10, Serializable serializable, int i10) {
        this.f1474a = i10;
        this.f1476c = obj;
        this.d = obj2;
        this.f1475b = z10;
        this.e = serializable;
    }

    public i4(org.telegram.ui.ie ieVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10) {
        this.f1474a = 2;
        this.f1476c = ieVar;
        this.e = twoStepVerificationActivity;
        this.d = activity;
        this.f1475b = z10;
    }
}
