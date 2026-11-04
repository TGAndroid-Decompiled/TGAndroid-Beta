package ei;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.p60;
public final class h6 implements RequestDelegate {
    public final long f10370a;
    public final p60 f10371b;
    public final z6 f10372c;

    public h6(z6 z6Var, long j10, p60 p60Var) {
        this.f10372c = z6Var;
        this.f10370a = j10;
        this.f10371b = p60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new ci.l2(this, tLObject, this.f10370a, this.f10371b, 9));
    }
}
