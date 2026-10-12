package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ta0;
public final class s8 implements RequestDelegate {
    public final long f1708a;
    public final ta0 f1709b;
    public final m9 f1710c;

    public s8(m9 m9Var, long j3, ta0 ta0Var) {
        this.f1710c = m9Var;
        this.f1708a = j3;
        this.f1709b = ta0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new r8(this, tLObject, this.f1708a, this.f1709b, 1));
    }
}
