package ii;

import java.util.HashMap;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.mp;
import org.telegram.messenger.nb;
import org.telegram.messenger.q10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements RequestDelegate {
    public final int f16303a = 1;
    public final long f16304b;
    public final int f16305c;
    public final fs d;
    public final Object f16306e;
    public final Object f16307f;
    public final Object f16308g;

    public e(mp mpVar, HashMap hashMap, String str, a0.h hVar, long j3, int i7) {
        this.d = mpVar;
        this.f16306e = hashMap;
        this.f16307f = str;
        this.f16308g = hVar;
        this.f16304b = j3;
        this.f16305c = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16303a) {
            case 0:
                g0.g3(new i(tL_error, tLObject, (TwoStepVerificationActivity) this.d, (g2) this.f16306e, this.f16304b, (q10) this.f16307f, (Runnable) this.f16308g, this.f16305c));
                return;
            default:
                g0.g3(new nb((mp) this.d, (HashMap) this.f16306e, (String) this.f16307f, tLObject, (a0.h) this.f16308g, this.f16304b, this.f16305c));
                return;
        }
    }

    public e(TwoStepVerificationActivity twoStepVerificationActivity, g2 g2Var, long j3, q10 q10Var, Runnable runnable, int i7) {
        this.d = twoStepVerificationActivity;
        this.f16306e = g2Var;
        this.f16304b = j3;
        this.f16307f = q10Var;
        this.f16308g = runnable;
        this.f16305c = i7;
    }
}
