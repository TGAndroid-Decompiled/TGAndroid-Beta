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
    public final int f16272a = 1;
    public final long f16273b;
    public final int f16274c;
    public final gs d;
    public final Object f16275e;
    public final Object f16276f;
    public final Object f16277g;

    public e(np npVar, HashMap hashMap, String str, a0.h hVar, long j3, int i7) {
        this.d = npVar;
        this.f16275e = hashMap;
        this.f16276f = str;
        this.f16277g = hVar;
        this.f16273b = j3;
        this.f16274c = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16272a) {
            case 0:
                g0.g3(new i(tL_error, tLObject, (TwoStepVerificationActivity) this.d, (g2) this.f16275e, this.f16273b, (r10) this.f16276f, (Runnable) this.f16277g, this.f16274c));
                return;
            default:
                g0.g3(new ob((np) this.d, (HashMap) this.f16275e, (String) this.f16276f, tLObject, (a0.h) this.f16277g, this.f16273b, this.f16274c));
                return;
        }
    }

    public e(TwoStepVerificationActivity twoStepVerificationActivity, g2 g2Var, long j3, r10 r10Var, Runnable runnable, int i7) {
        this.d = twoStepVerificationActivity;
        this.f16275e = g2Var;
        this.f16273b = j3;
        this.f16276f = r10Var;
        this.f16277g = runnable;
        this.f16274c = i7;
    }
}
