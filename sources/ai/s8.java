package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ra0;
public final class s8 implements RequestDelegate {
    public final long f1710a;
    public final ra0 f1711b;
    public final m9 f1712c;

    public s8(m9 m9Var, long j3, ra0 ra0Var) {
        this.f1712c = m9Var;
        this.f1710a = j3;
        this.f1711b = ra0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new r8(this, tLObject, this.f1710a, this.f1711b, 1));
    }
}
