package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.la0;
public final class a6 implements RequestDelegate {
    public final long f15053a;
    public final la0 f15054b;
    public final t6 f15055c;

    public a6(t6 t6Var, long j10, la0 la0Var) {
        this.f15055c = t6Var;
        this.f15053a = j10;
        this.f15054b = la0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new lh.c2(this, tLObject, this.f15053a, this.f15054b, 9));
    }
}
