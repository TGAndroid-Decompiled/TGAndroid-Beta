package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ka0;
public final class a6 implements RequestDelegate {
    public final long f16845a;
    public final ka0 f16846b;
    public final t6 f16847c;

    public a6(t6 t6Var, long j10, ka0 ka0Var) {
        this.f16847c = t6Var;
        this.f16845a = j10;
        this.f16846b = ka0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new mh.b2(this, tLObject, this.f16845a, this.f16846b, 9));
    }
}
