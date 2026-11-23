package ii;

import java.util.HashMap;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.mp;
import org.telegram.messenger.nb;
import org.telegram.messenger.p10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements RequestDelegate {
    public final int f16369a = 1;
    public final long f16370b;
    public final int f16371c;
    public final fs d;
    public final Object f16372e;
    public final Object f16373f;
    public final Object f16374g;

    public e(mp mpVar, HashMap hashMap, String str, a0.h hVar, long j3, int i7) {
        this.d = mpVar;
        this.f16372e = hashMap;
        this.f16373f = str;
        this.f16374g = hVar;
        this.f16370b = j3;
        this.f16371c = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16369a) {
            case 0:
                g0.g3(new i(tL_error, tLObject, (TwoStepVerificationActivity) this.d, (g2) this.f16372e, this.f16370b, (p10) this.f16373f, (Runnable) this.f16374g, this.f16371c));
                return;
            default:
                g0.g3(new nb((mp) this.d, (HashMap) this.f16372e, (String) this.f16373f, tLObject, (a0.h) this.f16374g, this.f16370b, this.f16371c));
                return;
        }
    }

    public e(TwoStepVerificationActivity twoStepVerificationActivity, g2 g2Var, long j3, p10 p10Var, Runnable runnable, int i7) {
        this.d = twoStepVerificationActivity;
        this.f16372e = g2Var;
        this.f16370b = j3;
        this.f16373f = p10Var;
        this.f16374g = runnable;
        this.f16371c = i7;
    }
}
