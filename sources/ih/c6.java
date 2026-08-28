package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.y90;
public final class c6 implements RequestDelegate {
    public final long f11290a;
    public final y90 f11291b;
    public final v6 f11292c;

    public c6(v6 v6Var, long j10, y90 y90Var) {
        this.f11292c = v6Var;
        this.f11290a = j10;
        this.f11291b = y90Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new gh.e2(this, tLObject, this.f11290a, this.f11291b, 9));
    }
}
