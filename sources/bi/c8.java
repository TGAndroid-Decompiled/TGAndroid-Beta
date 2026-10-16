package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wa0;
public final class c8 implements RequestDelegate {
    public final long f2908a;
    public final wa0 f2909b;
    public final x8 f2910c;

    public c8(x8 x8Var, long j10, wa0 wa0Var) {
        this.f2910c = x8Var;
        this.f2908a = j10;
        this.f2909b = wa0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new b8(this, tLObject, this.f2908a, this.f2909b, 1));
    }
}
