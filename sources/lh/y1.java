package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f13360a = 1;
    public final g5 f13361b;
    public final long f13362c;
    public final long d;
    public final long e;
    public final Object f13363f;

    public y1(g5 g5Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f13361b = g5Var;
        this.f13362c = j10;
        this.d = j11;
        this.f13363f = callback;
        this.e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13360a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l2(this.f13361b, (org.telegram.ui.ActionBar.d2) this.f13363f, tLObject, this.f13362c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l2(this.f13361b, tLObject, this.f13362c, this.d, (Utilities.Callback) this.f13363f, tL_error, this.e));
                return;
        }
    }

    public y1(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, long j10, long j11, long j12) {
        this.f13361b = g5Var;
        this.f13363f = d2Var;
        this.f13362c = j10;
        this.d = j11;
        this.e = j12;
    }
}
