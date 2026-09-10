package bi;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zy;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.du;
import org.telegram.ui.eo;
import org.telegram.ui.jp;
import org.telegram.ui.ng;
public final class d2 implements RequestDelegate {
    public final int f2538a;
    public final boolean f2539b;
    public final Object f2540c;
    public final Object d;
    public final Object e;

    public d2(h2 h2Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f2538a = 0;
        this.f2540c = h2Var;
        this.f2539b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2538a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e2((h2) this.f2540c, tLObject, this.f2539b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.a1((org.telegram.ui.le) this.f2540c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.f2539b, tLObject, 6));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new e2((Object) ((eo) this.f2540c), (Object) ((nf.e) this.d), tLObject, (Object) ((ng) this.e), this.f2539b, 14));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.a1((jp) this.f2540c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.f2539b, tL_error, 8));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new e2((zy) this.f2540c, (String) this.e, this.f2539b, (String) this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i2.a1((du) this.f2540c, tLObject, (d) this.d, this.f2539b, (HashSet) this.e, tL_error, 10));
                return;
        }
    }

    public d2(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f2538a = i10;
        this.f2540c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2539b = z10;
    }

    public d2(zy zyVar, String str, boolean z10, String str2) {
        this.f2538a = 4;
        this.f2540c = zyVar;
        this.e = str;
        this.f2539b = z10;
        this.d = str2;
    }

    public d2(du duVar, d dVar, boolean z10, HashSet hashSet) {
        this.f2538a = 5;
        this.f2540c = duVar;
        this.d = dVar;
        this.f2539b = z10;
        this.e = hashSet;
    }
}
