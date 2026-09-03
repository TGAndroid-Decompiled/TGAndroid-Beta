package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x1 implements RequestDelegate {
    public final int f15030a = 1;
    public final g5 f15031b;
    public final long f15032c;
    public final long d;
    public final long f15033e;
    public final Object f15034f;

    public x1(g5 g5Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f15031b = g5Var;
        this.f15032c = j10;
        this.d = j11;
        this.f15034f = callback;
        this.f15033e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15030a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k2(this.f15031b, (org.telegram.ui.ActionBar.d2) this.f15034f, tLObject, this.f15032c, this.d, this.f15033e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k2(this.f15031b, tLObject, this.f15032c, this.d, (Utilities.Callback) this.f15034f, tL_error, this.f15033e));
                return;
        }
    }

    public x1(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, long j10, long j11, long j12) {
        this.f15031b = g5Var;
        this.f15034f = d2Var;
        this.f15032c = j10;
        this.d = j11;
        this.f15033e = j12;
    }
}
