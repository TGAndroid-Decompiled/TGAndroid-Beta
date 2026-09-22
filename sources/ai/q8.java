package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ta0;
public final class q8 implements RequestDelegate {
    public final long f1429a;
    public final ta0 f1430b;
    public final l9 f1431c;

    public q8(l9 l9Var, long j3, ta0 ta0Var) {
        this.f1431c = l9Var;
        this.f1429a = j3;
        this.f1430b = ta0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new p8(this, tLObject, this.f1429a, this.f1430b, 1));
    }
}
