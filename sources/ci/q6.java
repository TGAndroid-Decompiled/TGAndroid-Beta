package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q6 implements RequestDelegate {
    public final long f5784a;
    public final Utilities.Callback f5785b;
    public final h7 f5786c;

    public q6(h7 h7Var, long j10, Utilities.Callback callback) {
        this.f5786c = h7Var;
        this.f5784a = j10;
        this.f5785b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ai.b3(this, tLObject, this.f5784a, this.f5785b, 10));
    }
}
