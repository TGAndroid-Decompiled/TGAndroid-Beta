package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y2 implements RequestDelegate {
    public final int f2477a = 1;
    public final k7 f2478b;
    public final long f2479c;
    public final long d;
    public final long e;
    public final Object f2480f;

    public y2(k7 k7Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f2478b = k7Var;
        this.f2479c = j10;
        this.d = j11;
        this.f2480f = callback;
        this.e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2477a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h3(this.f2478b, (org.telegram.ui.ActionBar.b2) this.f2480f, tLObject, this.f2479c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new h3(this.f2478b, tLObject, this.f2479c, this.d, (Utilities.Callback) this.f2480f, tL_error, this.e));
                return;
        }
    }

    public y2(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, long j10, long j11, long j12) {
        this.f2478b = k7Var;
        this.f2480f = b2Var;
        this.f2479c = j10;
        this.d = j11;
        this.e = j12;
    }
}
