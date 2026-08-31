package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ka0;
public final class a6 implements RequestDelegate {
    public final long f16843a;
    public final ka0 f16844b;
    public final t6 f16845c;

    public a6(t6 t6Var, long j10, ka0 ka0Var) {
        this.f16845c = t6Var;
        this.f16843a = j10;
        this.f16844b = ka0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new mh.b2(this, tLObject, this.f16843a, this.f16844b, 9));
    }
}
