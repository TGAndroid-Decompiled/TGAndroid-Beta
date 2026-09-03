package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b6 implements RequestDelegate {
    public final long f16899a;
    public final h5.d f16900b;
    public final t6 f16901c;

    public b6(t6 t6Var, long j10, h5.d dVar) {
        this.f16901c = t6Var;
        this.f16899a = j10;
        this.f16900b = dVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new mh.b2(this, tLObject, this.f16899a, this.f16900b, 10));
    }
}
