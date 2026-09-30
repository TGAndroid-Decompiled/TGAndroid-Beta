package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oa0;
public final class r8 implements RequestDelegate {
    public final long f1475a;
    public final oa0 f1476b;
    public final l9 f1477c;

    public r8(l9 l9Var, long j3, oa0 oa0Var) {
        this.f1477c = l9Var;
        this.f1475a = j3;
        this.f1476b = oa0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new q8(this, tLObject, this.f1475a, this.f1476b, 1));
    }
}
