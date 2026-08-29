package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a6 implements RequestDelegate {
    public final long f15337a;
    public final f5.d f15338b;
    public final s6 f15339c;

    public a6(s6 s6Var, long j10, f5.d dVar) {
        this.f15339c = s6Var;
        this.f15337a = j10;
        this.f15338b = dVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new jh.c2(this, tLObject, this.f15337a, this.f15338b, 10));
    }
}
