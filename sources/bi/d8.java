package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d8 implements RequestDelegate {
    public final long f2959a;
    public final Utilities.Callback f2960b;
    public final x8 f2961c;

    public d8(x8 x8Var, long j10, Utilities.Callback callback) {
        this.f2961c = x8Var;
        this.f2959a = j10;
        this.f2960b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new b8(this, tLObject, this.f2959a, this.f2960b, 2));
    }
}
