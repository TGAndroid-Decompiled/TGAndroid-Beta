package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t8 implements RequestDelegate {
    public final long f1747a;
    public final Utilities.Callback f1748b;
    public final m9 f1749c;

    public t8(m9 m9Var, long j3, Utilities.Callback callback) {
        this.f1749c = m9Var;
        this.f1747a = j3;
        this.f1748b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new r8(this, tLObject, this.f1747a, this.f1748b, 2));
    }
}
