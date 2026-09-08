package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z7 implements RequestDelegate {
    public final long f4089a;
    public final e2.h f4090b;
    public final u8 f4091c;

    public z7(u8 u8Var, long j3, e2.h hVar) {
        this.f4091c = u8Var;
        this.f4089a = j3;
        this.f4090b = hVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new x7(this, tLObject, this.f4089a, this.f4090b, 2));
    }
}
