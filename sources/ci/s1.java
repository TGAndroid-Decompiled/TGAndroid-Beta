package ci;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iz;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bu;
import org.telegram.ui.df;
import org.telegram.ui.fp;
import org.telegram.ui.ke;
import org.telegram.ui.zn;
public final class s1 implements RequestDelegate {
    public final int f5931a;
    public final boolean f5932b;
    public final Object f5933c;
    public final Object d;
    public final Object f5934e;

    public s1(v1 v1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f5931a = 0;
        this.f5933c = v1Var;
        this.f5932b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.f5934e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5931a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1((v1) this.f5933c, tLObject, this.f5932b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.f5934e, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.c1((ke) this.f5933c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.f5934e, this.f5932b, tLObject, 6));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t1((Object) ((zn) this.f5933c), (Object) ((of.e) this.d), tLObject, (Object) ((df) this.f5934e), this.f5932b, 15));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.c1((fp) this.f5933c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.f5934e, this.f5932b, tL_error, 9));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new t1((iz) this.f5933c, (String) this.f5934e, this.f5932b, (String) this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i2.c1((bu) this.f5933c, tLObject, (d) this.d, this.f5932b, (HashSet) this.f5934e, tL_error, 11));
                return;
        }
    }

    public s1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f5931a = i10;
        this.f5933c = obj;
        this.d = obj2;
        this.f5934e = obj3;
        this.f5932b = z10;
    }

    public s1(iz izVar, String str, boolean z10, String str2) {
        this.f5931a = 4;
        this.f5933c = izVar;
        this.f5934e = str;
        this.f5932b = z10;
        this.d = str2;
    }

    public s1(bu buVar, d dVar, boolean z10, HashSet hashSet) {
        this.f5931a = 5;
        this.f5933c = buVar;
        this.d = dVar;
        this.f5932b = z10;
        this.f5934e = hashSet;
    }
}
