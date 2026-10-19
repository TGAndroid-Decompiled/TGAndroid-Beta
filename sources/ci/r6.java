package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r6 implements RequestDelegate {
    public final long f5918a;
    public final Utilities.Callback f5919b;
    public final i7 f5920c;

    public r6(i7 i7Var, long j10, Utilities.Callback callback) {
        this.f5920c = i7Var;
        this.f5918a = j10;
        this.f5919b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ai.c3(this, tLObject, this.f5918a, this.f5919b, 10));
    }
}
