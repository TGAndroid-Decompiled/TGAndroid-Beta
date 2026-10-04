package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s8 implements RequestDelegate {
    public final long f1642a;
    public final Utilities.Callback f1643b;
    public final l9 f1644c;

    public s8(l9 l9Var, long j3, Utilities.Callback callback) {
        this.f1644c = l9Var;
        this.f1642a = j3;
        this.f1643b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new q8(this, tLObject, this.f1642a, this.f1643b, 2));
    }
}
