package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class z5 implements RequestDelegate {

    public final long f14189a;

    public final d5.d f14190b;

    public final s6 f14191c;

    public z5(s6 s6Var, long j10, d5.d dVar) {
        this.f14191c = s6Var;
        this.f14189a = j10;
        this.f14190b = dVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new hh.e2(this, tLObject, this.f14189a, this.f14190b, 10));
    }
}
