package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.m80;
public final class q6 implements RequestDelegate {
    public final long f5847a;
    public final m80 f5848b;
    public final i7 f5849c;

    public q6(i7 i7Var, long j10, m80 m80Var) {
        this.f5849c = i7Var;
        this.f5847a = j10;
        this.f5848b = m80Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ai.b2(this, tLObject, this.f5847a, this.f5848b, 9));
    }
}
