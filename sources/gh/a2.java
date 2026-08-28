package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a2 implements RequestDelegate {
    public final int f7771a = 1;
    public final k5 f7772b;
    public final long f7773c;
    public final long d;
    public final long f7774e;
    public final Object f7775f;

    public a2(k5 k5Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f7772b = k5Var;
        this.f7773c = j10;
        this.d = j11;
        this.f7775f = callback;
        this.f7774e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f7771a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n2(this.f7772b, (org.telegram.ui.ActionBar.c2) this.f7775f, tLObject, this.f7773c, this.d, this.f7774e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n2(this.f7772b, tLObject, this.f7773c, this.d, (Utilities.Callback) this.f7775f, tL_error, this.f7774e));
                return;
        }
    }

    public a2(k5 k5Var, org.telegram.ui.ActionBar.c2 c2Var, long j10, long j11, long j12) {
        this.f7772b = k5Var;
        this.f7775f = c2Var;
        this.f7773c = j10;
        this.d = j11;
        this.f7774e = j12;
    }
}
