package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r8 implements RequestDelegate {
    public final long f1481a;
    public final e2.h f1482b;
    public final l9 f1483c;

    public r8(l9 l9Var, long j3, e2.h hVar) {
        this.f1483c = l9Var;
        this.f1481a = j3;
        this.f1482b = hVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new p8(this, tLObject, this.f1481a, this.f1482b, 2));
    }
}
