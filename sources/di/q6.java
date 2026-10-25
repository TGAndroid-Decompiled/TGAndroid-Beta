package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q6 implements RequestDelegate {
    public final long f9057a;
    public final Utilities.Callback f9058b;
    public final h7 f9059c;

    public q6(h7 h7Var, long j10, Utilities.Callback callback) {
        this.f9059c = h7Var;
        this.f9057a = j10;
        this.f9058b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new bi.y2(this, tLObject, this.f9057a, this.f9058b, 10));
    }
}
