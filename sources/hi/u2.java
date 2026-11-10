package hi;

import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u2 implements RequestDelegate {
    public final int f14980a;
    public final v2 f14981b;

    public u2(v2 v2Var, int i7) {
        this.f14980a = i7;
        this.f14981b = v2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14980a) {
            case 0:
                a3 a3Var = this.f14981b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    qp.s1(a3Var.H).O3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new x1(a3Var, 16));
                return;
            default:
                org.telegram.messenger.g0.h3(new fi.x1(this.f14981b, tLObject, tL_error, false, 13));
                return;
        }
    }
}
