package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ca0;

public final class y5 implements RequestDelegate {

    public final long f14153a;

    public final ca0 f14154b;

    public final s6 f14155c;

    public y5(s6 s6Var, long j10, ca0 ca0Var) {
        this.f14155c = s6Var;
        this.f14153a = j10;
        this.f14154b = ca0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new hh.e2(this, tLObject, this.f14153a, this.f14154b, 9));
    }
}
