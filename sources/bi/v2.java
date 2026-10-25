package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v2 implements RequestDelegate {
    public final int f5545a = 1;
    public final h7 f5546b;
    public final long f5547c;
    public final long d;
    public final long e;
    public final Object f5548f;

    public v2(h7 h7Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f5546b = h7Var;
        this.f5547c = j10;
        this.d = j11;
        this.f5548f = callback;
        this.e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5545a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e3(this.f5546b, (org.telegram.ui.ActionBar.e2) this.f5548f, tLObject, this.f5547c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new e3(this.f5546b, tLObject, this.f5547c, this.d, (Utilities.Callback) this.f5548f, tL_error, this.e));
                return;
        }
    }

    public v2(h7 h7Var, org.telegram.ui.ActionBar.e2 e2Var, long j10, long j11, long j12) {
        this.f5546b = h7Var;
        this.f5548f = e2Var;
        this.f5547c = j10;
        this.d = j11;
        this.e = j12;
    }
}
