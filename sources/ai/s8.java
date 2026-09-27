package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s8 implements RequestDelegate {
    public final long f1510a;
    public final Utilities.Callback f1511b;
    public final l9 f1512c;

    public s8(l9 l9Var, long j3, Utilities.Callback callback) {
        this.f1512c = l9Var;
        this.f1510a = j3;
        this.f1511b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new q8(this, tLObject, this.f1510a, this.f1511b, 2));
    }
}
