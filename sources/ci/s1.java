package ci;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iz;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.au;
import org.telegram.ui.cf;
import org.telegram.ui.fp;
import org.telegram.ui.je;
import org.telegram.ui.zn;
public final class s1 implements RequestDelegate {
    public final int f5930a;
    public final boolean f5931b;
    public final Object f5932c;
    public final Object d;
    public final Object f5933e;

    public s1(v1 v1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f5930a = 0;
        this.f5932c = v1Var;
        this.f5931b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.f5933e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5930a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1((v1) this.f5932c, tLObject, this.f5931b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.f5933e, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.c1((je) this.f5932c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.f5933e, this.f5931b, tLObject, 6));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t1((Object) ((zn) this.f5932c), (Object) ((of.e) this.d), tLObject, (Object) ((cf) this.f5933e), this.f5931b, 15));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.c1((fp) this.f5932c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.f5933e, this.f5931b, tL_error, 9));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new t1((iz) this.f5932c, (String) this.f5933e, this.f5931b, (String) this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i2.c1((au) this.f5932c, tLObject, (d) this.d, this.f5931b, (HashSet) this.f5933e, tL_error, 11));
                return;
        }
    }

    public s1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f5930a = i10;
        this.f5932c = obj;
        this.d = obj2;
        this.f5933e = obj3;
        this.f5931b = z10;
    }

    public s1(iz izVar, String str, boolean z10, String str2) {
        this.f5930a = 4;
        this.f5932c = izVar;
        this.f5933e = str;
        this.f5931b = z10;
        this.d = str2;
    }

    public s1(au auVar, d dVar, boolean z10, HashSet hashSet) {
        this.f5930a = 5;
        this.f5932c = auVar;
        this.d = dVar;
        this.f5931b = z10;
        this.f5933e = hashSet;
    }
}
