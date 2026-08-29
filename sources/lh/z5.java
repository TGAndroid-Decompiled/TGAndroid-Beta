package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ba0;
public final class z5 implements RequestDelegate {
    public final long f16464a;
    public final ba0 f16465b;
    public final s6 f16466c;

    public z5(s6 s6Var, long j10, ba0 ba0Var) {
        this.f16466c = s6Var;
        this.f16464a = j10;
        this.f16465b = ba0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new jh.c2(this, tLObject, this.f16464a, this.f16465b, 9));
    }
}
