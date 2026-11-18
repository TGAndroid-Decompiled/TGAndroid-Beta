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
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements RequestDelegate {
    public final int f16281a = 1;
    public final long f16282b;
    public final int f16283c;
    public final fs d;
    public final Object f16284e;
    public final Object f16285f;
    public final Object f16286g;

    public e(mp mpVar, HashMap hashMap, String str, a0.h hVar, long j3, int i7) {
        this.d = mpVar;
        this.f16284e = hashMap;
        this.f16285f = str;
        this.f16286g = hVar;
        this.f16282b = j3;
        this.f16283c = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16281a) {
            case 0:
                g0.g3(new i(tL_error, tLObject, (TwoStepVerificationActivity) this.d, (h2) this.f16284e, this.f16282b, (q10) this.f16285f, (Runnable) this.f16286g, this.f16283c));
                return;
            default:
                g0.g3(new nb((mp) this.d, (HashMap) this.f16284e, (String) this.f16285f, tLObject, (a0.h) this.f16286g, this.f16282b, this.f16283c));
                return;
        }
    }

    public e(TwoStepVerificationActivity twoStepVerificationActivity, h2 h2Var, long j3, q10 q10Var, Runnable runnable, int i7) {
        this.d = twoStepVerificationActivity;
        this.f16284e = h2Var;
        this.f16282b = j3;
        this.f16285f = q10Var;
        this.f16286g = runnable;
        this.f16283c = i7;
    }
}
