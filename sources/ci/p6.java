package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o80;
public final class p6 implements RequestDelegate {
    public final long f5728a;
    public final o80 f5729b;
    public final h7 f5730c;

    public p6(h7 h7Var, long j10, o80 o80Var) {
        this.f5730c = h7Var;
        this.f5728a = j10;
        this.f5729b = o80Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ai.b3(this, tLObject, this.f5728a, this.f5729b, 9));
    }
}
