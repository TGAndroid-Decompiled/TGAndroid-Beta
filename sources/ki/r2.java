package ki;

import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r2 implements RequestDelegate {
    public final int f18531a;
    public final s2 f18532b;

    public r2(s2 s2Var, int i7) {
        this.f18531a = i7;
        this.f18532b = s2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18531a) {
            case 0:
                x2 x2Var = this.f18532b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    np.s1(x2Var.I).O3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new x1(x2Var, 16));
                return;
            default:
                org.telegram.messenger.g0.h3(new n(this.f18532b, tLObject, tL_error, 2));
                return;
        }
    }
}
