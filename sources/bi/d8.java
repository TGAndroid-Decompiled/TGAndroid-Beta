package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d8 implements RequestDelegate {
    public final long f2955a;
    public final Utilities.Callback f2956b;
    public final x8 f2957c;

    public d8(x8 x8Var, long j10, Utilities.Callback callback) {
        this.f2957c = x8Var;
        this.f2955a = j10;
        this.f2956b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new b8(this, tLObject, this.f2955a, this.f2956b, 2));
    }
}
