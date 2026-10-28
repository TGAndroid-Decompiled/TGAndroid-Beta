package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t80;
public final class p6 implements RequestDelegate {
    public final long f8906a;
    public final t80 f8907b;
    public final h7 f8908c;

    public p6(h7 h7Var, long j10, t80 t80Var) {
        this.f8908c = h7Var;
        this.f8906a = j10;
        this.f8907b = t80Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new bi.y2(this, tLObject, this.f8906a, this.f8907b, 9));
    }
}
