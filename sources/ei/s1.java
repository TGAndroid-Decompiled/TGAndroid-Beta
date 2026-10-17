package ei;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bz;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ke;
import org.telegram.ui.sn;
import org.telegram.ui.st;
import org.telegram.ui.vo;
public final class s1 implements RequestDelegate {
    public final int f9764a;
    public final boolean f9765b;
    public final Object f9766c;
    public final Object d;
    public final Object e;

    public s1(t1 t1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f9764a = 0;
        this.f9766c = t1Var;
        this.f9765b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9764a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.e2((Object) ((t1) this.f9766c), tLObject, this.f9765b, (Object) ((TLRPC.TL_messages_getInlineBotResults) this.d), (Object) ((String) this.e), 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.d1((ke) this.f9766c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.f9765b, tLObject, 6));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ai.e2((sn) this.f9766c, (pf.c) this.d, tLObject, (ai.t3) this.e, this.f9765b, 15));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.d1((vo) this.f9766c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.f9765b, tL_error, 9));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ai.e2((bz) this.f9766c, (String) this.e, this.f9765b, (String) this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i2.d1((st) this.f9766c, tLObject, (d) this.d, this.f9765b, (HashSet) this.e, tL_error, 11));
                return;
        }
    }

    public s1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f9764a = i10;
        this.f9766c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f9765b = z10;
    }

    public s1(bz bzVar, String str, boolean z10, String str2) {
        this.f9764a = 4;
        this.f9766c = bzVar;
        this.e = str;
        this.f9765b = z10;
        this.d = str2;
    }

    public s1(st stVar, d dVar, boolean z10, HashSet hashSet) {
        this.f9764a = 5;
        this.f9766c = stVar;
        this.d = dVar;
        this.f9765b = z10;
        this.e = hashSet;
    }
}
