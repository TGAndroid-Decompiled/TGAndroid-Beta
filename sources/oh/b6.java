package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b6 implements RequestDelegate {
    public final long f16897a;
    public final h5.d f16898b;
    public final t6 f16899c;

    public b6(t6 t6Var, long j10, h5.d dVar) {
        this.f16899c = t6Var;
        this.f16897a = j10;
        this.f16898b = dVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new mh.b2(this, tLObject, this.f16897a, this.f16898b, 10));
    }
}
