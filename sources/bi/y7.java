package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ta0;
public final class y7 implements RequestDelegate {
    public final long f4044a;
    public final ta0 f4045b;
    public final u8 f4046c;

    public y7(u8 u8Var, long j3, ta0 ta0Var) {
        this.f4046c = u8Var;
        this.f4044a = j3;
        this.f4045b = ta0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new x7(this, tLObject, this.f4044a, this.f4045b, 1));
    }
}
