package ii;

import java.util.HashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.messenger.ob;
import org.telegram.messenger.r10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements RequestDelegate {
    public final int f16306a = 1;
    public final long f16307b;
    public final int f16308c;
    public final gs d;
    public final Object f16309e;
    public final Object f16310f;
    public final Object f16311g;

    public e(np npVar, HashMap hashMap, String str, a0.h hVar, long j3, int i7) {
        this.d = npVar;
        this.f16309e = hashMap;
        this.f16310f = str;
        this.f16311g = hVar;
        this.f16307b = j3;
        this.f16308c = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16306a) {
            case 0:
                g0.g3(new i(tL_error, tLObject, (TwoStepVerificationActivity) this.d, (g2) this.f16309e, this.f16307b, (r10) this.f16310f, (Runnable) this.f16311g, this.f16308c));
                return;
            default:
                g0.g3(new ob((np) this.d, (HashMap) this.f16309e, (String) this.f16310f, tLObject, (a0.h) this.f16311g, this.f16307b, this.f16308c));
                return;
        }
    }

    public e(TwoStepVerificationActivity twoStepVerificationActivity, g2 g2Var, long j3, r10 r10Var, Runnable runnable, int i7) {
        this.d = twoStepVerificationActivity;
        this.f16309e = g2Var;
        this.f16307b = j3;
        this.f16310f = r10Var;
        this.f16311g = runnable;
        this.f16308c = i7;
    }
}
