package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q6 implements RequestDelegate {
    public final long f9056a;
    public final Utilities.Callback f9057b;
    public final h7 f9058c;

    public q6(h7 h7Var, long j10, Utilities.Callback callback) {
        this.f9058c = h7Var;
        this.f9056a = j10;
        this.f9057b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new bi.y2(this, tLObject, this.f9056a, this.f9057b, 10));
    }
}
