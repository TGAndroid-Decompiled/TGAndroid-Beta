package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r8 implements RequestDelegate {
    public final long f1478a;
    public final e2.h f1479b;
    public final l9 f1480c;

    public r8(l9 l9Var, long j3, e2.h hVar) {
        this.f1480c = l9Var;
        this.f1478a = j3;
        this.f1479b = hVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new p8(this, tLObject, this.f1478a, this.f1479b, 2));
    }
}
