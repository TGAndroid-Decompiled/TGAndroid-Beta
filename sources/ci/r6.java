package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r6 implements RequestDelegate {
    public final long f5920a;
    public final Utilities.Callback f5921b;
    public final i7 f5922c;

    public r6(i7 i7Var, long j10, Utilities.Callback callback) {
        this.f5922c = i7Var;
        this.f5920a = j10;
        this.f5921b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ai.b2(this, tLObject, this.f5920a, this.f5921b, 10));
    }
}
