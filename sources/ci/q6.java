package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.m80;
public final class q6 implements RequestDelegate {
    public final long f5845a;
    public final m80 f5846b;
    public final i7 f5847c;

    public q6(i7 i7Var, long j10, m80 m80Var) {
        this.f5847c = i7Var;
        this.f5845a = j10;
        this.f5846b = m80Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ai.c3(this, tLObject, this.f5845a, this.f5846b, 9));
    }
}
