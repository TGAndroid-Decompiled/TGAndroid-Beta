package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sa0;
public final class r8 implements RequestDelegate {
    public final long f1599a;
    public final sa0 f1600b;
    public final l9 f1601c;

    public r8(l9 l9Var, long j3, sa0 sa0Var) {
        this.f1601c = l9Var;
        this.f1599a = j3;
        this.f1600b = sa0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new q8(this, tLObject, this.f1599a, this.f1600b, 1));
    }
}
