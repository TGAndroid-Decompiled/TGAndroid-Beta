package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f13376a = 1;
    public final g5 f13377b;
    public final long f13378c;
    public final long d;
    public final long e;
    public final Object f13379f;

    public y1(g5 g5Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f13377b = g5Var;
        this.f13378c = j10;
        this.d = j11;
        this.f13379f = callback;
        this.e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13376a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l2(this.f13377b, (org.telegram.ui.ActionBar.d2) this.f13379f, tLObject, this.f13378c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l2(this.f13377b, tLObject, this.f13378c, this.d, (Utilities.Callback) this.f13379f, tL_error, this.e));
                return;
        }
    }

    public y1(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, long j10, long j11, long j12) {
        this.f13377b = g5Var;
        this.f13379f = d2Var;
        this.f13378c = j10;
        this.d = j11;
        this.e = j12;
    }
}
