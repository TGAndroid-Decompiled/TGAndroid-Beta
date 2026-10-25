package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.r80;
public final class p6 implements RequestDelegate {
    public final long f8907a;
    public final r80 f8908b;
    public final h7 f8909c;

    public p6(h7 h7Var, long j10, r80 r80Var) {
        this.f8909c = h7Var;
        this.f8907a = j10;
        this.f8908b = r80Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new bi.y2(this, tLObject, this.f8907a, this.f8908b, 9));
    }
}
