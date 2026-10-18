package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x2 implements RequestDelegate {
    public final int f2422a = 1;
    public final k7 f2423b;
    public final long f2424c;
    public final long d;
    public final long e;
    public final Object f2425f;

    public x2(k7 k7Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f2423b = k7Var;
        this.f2424c = j10;
        this.d = j11;
        this.f2425f = callback;
        this.e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2422a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e3(this.f2423b, (org.telegram.ui.ActionBar.b2) this.f2425f, tLObject, this.f2424c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new e3(this.f2423b, tLObject, this.f2424c, this.d, (Utilities.Callback) this.f2425f, tL_error, this.e));
                return;
        }
    }

    public x2(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, long j10, long j11, long j12) {
        this.f2423b = k7Var;
        this.f2425f = b2Var;
        this.f2424c = j10;
        this.d = j11;
        this.e = j12;
    }
}
