package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o80;
public final class q6 implements RequestDelegate {
    public final long f5848a;
    public final o80 f5849b;
    public final i7 f5850c;

    public q6(i7 i7Var, long j10, o80 o80Var) {
        this.f5850c = i7Var;
        this.f5848a = j10;
        this.f5849b = o80Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ai.b2(this, tLObject, this.f5848a, this.f5849b, 9));
    }
}
