package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.s80;
public final class p6 implements RequestDelegate {
    public final long f5732a;
    public final s80 f5733b;
    public final h7 f5734c;

    public p6(h7 h7Var, long j10, s80 s80Var) {
        this.f5734c = h7Var;
        this.f5732a = j10;
        this.f5733b = s80Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ai.c3(this, tLObject, this.f5732a, this.f5733b, 9));
    }
}
