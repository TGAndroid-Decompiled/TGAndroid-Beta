package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xa0;
public final class c8 implements RequestDelegate {
    public final long f2904a;
    public final xa0 f2905b;
    public final x8 f2906c;

    public c8(x8 x8Var, long j10, xa0 xa0Var) {
        this.f2906c = x8Var;
        this.f2904a = j10;
        this.f2905b = xa0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new b8(this, tLObject, this.f2904a, this.f2905b, 1));
    }
}
