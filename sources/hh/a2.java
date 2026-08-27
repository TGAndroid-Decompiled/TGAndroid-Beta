package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class a2 implements RequestDelegate {

    public final int f8943a = 1;

    public final i5 f8944b;

    public final long f8945c;
    public final long d;

    public final long f8946e;

    public final Object f8947f;

    public a2(i5 i5Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f8944b = i5Var;
        this.f8945c = j10;
        this.d = j11;
        this.f8947f = callback;
        this.f8946e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8943a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n2(this.f8944b, (org.telegram.ui.ActionBar.b2) this.f8947f, tLObject, this.f8945c, this.d, this.f8946e, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new n2(this.f8944b, tLObject, this.f8945c, this.d, (Utilities.Callback) this.f8947f, tL_error, this.f8946e));
                break;
        }
    }

    public a2(i5 i5Var, org.telegram.ui.ActionBar.b2 b2Var, long j10, long j11, long j12) {
        this.f8944b = i5Var;
        this.f8947f = b2Var;
        this.f8945c = j10;
        this.d = j11;
        this.f8946e = j12;
    }
}
