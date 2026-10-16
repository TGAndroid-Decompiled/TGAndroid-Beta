package di;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dz;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fo;
import org.telegram.ui.hu;
import org.telegram.ui.kf;
import org.telegram.ui.kp;
import org.telegram.ui.qe;
public final class s1 implements RequestDelegate {
    public final int f7746a;
    public final boolean f7747b;
    public final Object f7748c;
    public final Object d;
    public final Object e;

    public s1(v1 v1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f7746a = 0;
        this.f7748c = v1Var;
        this.f7747b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f7746a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1((v1) this.f7748c, tLObject, this.f7747b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.f1((qe) this.f7748c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.f7747b, tLObject, 6));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t1((Object) ((fo) this.f7748c), (Object) ((pf.c) this.d), tLObject, (Object) ((kf) this.e), this.f7747b, 14));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.f1((kp) this.f7748c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.f7747b, tL_error, 9));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new t1((dz) this.f7748c, (String) this.e, this.f7747b, (String) this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i2.f1((hu) this.f7748c, tLObject, (d) this.d, this.f7747b, (HashSet) this.e, tL_error, 11));
                return;
        }
    }

    public s1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f7746a = i10;
        this.f7748c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f7747b = z10;
    }

    public s1(dz dzVar, String str, boolean z10, String str2) {
        this.f7746a = 4;
        this.f7748c = dzVar;
        this.e = str;
        this.f7747b = z10;
        this.d = str2;
    }

    public s1(hu huVar, d dVar, boolean z10, HashSet hashSet) {
        this.f7746a = 5;
        this.f7748c = huVar;
        this.d = dVar;
        this.f7747b = z10;
        this.e = hashSet;
    }
}
