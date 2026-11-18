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
    public final int f16278a = 1;
    public final long f16279b;
    public final int f16280c;
    public final fs d;
    public final Object f16281e;
    public final Object f16282f;
    public final Object f16283g;

    public e(mp mpVar, HashMap hashMap, String str, a0.h hVar, long j3, int i7) {
        this.d = mpVar;
        this.f16281e = hashMap;
        this.f16282f = str;
        this.f16283g = hVar;
        this.f16279b = j3;
        this.f16280c = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16278a) {
            case 0:
                g0.g3(new i(tL_error, tLObject, (TwoStepVerificationActivity) this.d, (h2) this.f16281e, this.f16279b, (q10) this.f16282f, (Runnable) this.f16283g, this.f16280c));
                return;
            default:
                g0.g3(new nb((mp) this.d, (HashMap) this.f16281e, (String) this.f16282f, tLObject, (a0.h) this.f16283g, this.f16279b, this.f16280c));
                return;
        }
    }

    public e(TwoStepVerificationActivity twoStepVerificationActivity, h2 h2Var, long j3, q10 q10Var, Runnable runnable, int i7) {
        this.d = twoStepVerificationActivity;
        this.f16281e = h2Var;
        this.f16279b = j3;
        this.f16282f = q10Var;
        this.f16283g = runnable;
        this.f16280c = i7;
    }
}
