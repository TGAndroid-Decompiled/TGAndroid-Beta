package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f13107a = 1;
    public final h5 f13108b;
    public final long f13109c;
    public final long d;
    public final long f13110e;
    public final Object f13111f;

    public y1(h5 h5Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f13108b = h5Var;
        this.f13109c = j10;
        this.d = j11;
        this.f13111f = callback;
        this.f13110e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13107a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l2(this.f13108b, (org.telegram.ui.ActionBar.c2) this.f13111f, tLObject, this.f13109c, this.d, this.f13110e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l2(this.f13108b, tLObject, this.f13109c, this.d, (Utilities.Callback) this.f13111f, tL_error, this.f13110e));
                return;
        }
    }

    public y1(h5 h5Var, org.telegram.ui.ActionBar.c2 c2Var, long j10, long j11, long j12) {
        this.f13108b = h5Var;
        this.f13111f = c2Var;
        this.f13109c = j10;
        this.d = j11;
        this.f13110e = j12;
    }
}
