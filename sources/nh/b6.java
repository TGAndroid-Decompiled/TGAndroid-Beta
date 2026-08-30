package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b6 implements RequestDelegate {
    public final long f15122a;
    public final h5.d f15123b;
    public final t6 f15124c;

    public b6(t6 t6Var, long j10, h5.d dVar) {
        this.f15124c = t6Var;
        this.f15122a = j10;
        this.f15123b = dVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new lh.c2(this, tLObject, this.f15122a, this.f15123b, 10));
    }
}
