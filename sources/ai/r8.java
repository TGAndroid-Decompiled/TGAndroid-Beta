package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pa0;
public final class r8 implements RequestDelegate {
    public final long f1470a;
    public final pa0 f1471b;
    public final l9 f1472c;

    public r8(l9 l9Var, long j3, pa0 pa0Var) {
        this.f1472c = l9Var;
        this.f1470a = j3;
        this.f1471b = pa0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new q8(this, tLObject, this.f1470a, this.f1471b, 1));
    }
}
