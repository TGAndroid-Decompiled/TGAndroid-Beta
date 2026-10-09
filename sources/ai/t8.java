package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t8 implements RequestDelegate {
    public final long f1749a;
    public final Utilities.Callback f1750b;
    public final m9 f1751c;

    public t8(m9 m9Var, long j3, Utilities.Callback callback) {
        this.f1751c = m9Var;
        this.f1749a = j3;
        this.f1750b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new r8(this, tLObject, this.f1749a, this.f1750b, 2));
    }
}
