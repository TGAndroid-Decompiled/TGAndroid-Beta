package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s8 implements RequestDelegate {
    public final long f1513a;
    public final Utilities.Callback f1514b;
    public final l9 f1515c;

    public s8(l9 l9Var, long j3, Utilities.Callback callback) {
        this.f1515c = l9Var;
        this.f1513a = j3;
        this.f1514b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new q8(this, tLObject, this.f1513a, this.f1514b, 2));
    }
}
