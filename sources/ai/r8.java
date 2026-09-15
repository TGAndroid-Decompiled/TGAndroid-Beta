package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r8 implements RequestDelegate {
    public final long f1476a;
    public final e2.h f1477b;
    public final l9 f1478c;

    public r8(l9 l9Var, long j3, e2.h hVar) {
        this.f1478c = l9Var;
        this.f1476a = j3;
        this.f1477b = hVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new p8(this, tLObject, this.f1476a, this.f1477b, 2));
    }
}
