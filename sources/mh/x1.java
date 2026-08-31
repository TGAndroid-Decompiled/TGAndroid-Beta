package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x1 implements RequestDelegate {
    public final int f15028a = 1;
    public final g5 f15029b;
    public final long f15030c;
    public final long d;
    public final long f15031e;
    public final Object f15032f;

    public x1(g5 g5Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f15029b = g5Var;
        this.f15030c = j10;
        this.d = j11;
        this.f15032f = callback;
        this.f15031e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15028a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k2(this.f15029b, (org.telegram.ui.ActionBar.d2) this.f15032f, tLObject, this.f15030c, this.d, this.f15031e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k2(this.f15029b, tLObject, this.f15030c, this.d, (Utilities.Callback) this.f15032f, tL_error, this.f15031e));
                return;
        }
    }

    public x1(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, long j10, long j11, long j12) {
        this.f15029b = g5Var;
        this.f15032f = d2Var;
        this.f15030c = j10;
        this.d = j11;
        this.f15031e = j12;
    }
}
