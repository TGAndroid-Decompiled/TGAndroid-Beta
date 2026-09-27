package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ra0;
public final class r8 implements RequestDelegate {
    public final long f1472a;
    public final ra0 f1473b;
    public final l9 f1474c;

    public r8(l9 l9Var, long j3, ra0 ra0Var) {
        this.f1474c = l9Var;
        this.f1472a = j3;
        this.f1473b = ra0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new q8(this, tLObject, this.f1472a, this.f1473b, 1));
    }
}
