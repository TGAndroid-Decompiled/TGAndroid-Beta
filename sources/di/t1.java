package di;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sy;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.co;
import org.telegram.ui.du;
import org.telegram.ui.ip;
import org.telegram.ui.ke;
import org.telegram.ui.mg;
public final class t1 implements RequestDelegate {
    public final int f8191a;
    public final boolean f8192b;
    public final Object f8193c;
    public final Object d;
    public final Object f8194e;

    public t1(w1 w1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f8191a = 0;
        this.f8193c = w1Var;
        this.f8192b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.f8194e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8191a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1((w1) this.f8193c, tLObject, this.f8192b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.f8194e, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.b1((ke) this.f8193c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.f8194e, this.f8192b, tLObject, 6));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new u1((Object) ((co) this.f8193c), (Object) ((of.e) this.d), tLObject, (Object) ((mg) this.f8194e), this.f8192b, 14));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.b1((ip) this.f8193c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.f8194e, this.f8192b, tL_error, 8));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new u1((sy) this.f8193c, (String) this.f8194e, this.f8192b, (String) this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i2.b1((du) this.f8193c, tLObject, (d) this.d, this.f8192b, (HashSet) this.f8194e, tL_error, 10));
                return;
        }
    }

    public t1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f8191a = i10;
        this.f8193c = obj;
        this.d = obj2;
        this.f8194e = obj3;
        this.f8192b = z10;
    }

    public t1(sy syVar, String str, boolean z10, String str2) {
        this.f8191a = 4;
        this.f8193c = syVar;
        this.f8194e = str;
        this.f8192b = z10;
        this.d = str2;
    }

    public t1(du duVar, d dVar, boolean z10, HashSet hashSet) {
        this.f8191a = 5;
        this.f8193c = duVar;
        this.d = dVar;
        this.f8192b = z10;
        this.f8194e = hashSet;
    }
}
