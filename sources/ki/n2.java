package ki;

import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n2 implements RequestDelegate {
    public final int f18802a;
    public final o2 f18803b;

    public n2(o2 o2Var, int i7) {
        this.f18802a = i7;
        this.f18803b = o2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18802a) {
            case 0:
                t2 t2Var = this.f18803b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    mp.u1(t2Var.I).V3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new t1(t2Var, 16));
                return;
            default:
                org.telegram.messenger.g0.g3(new kg.i0(this.f18803b, tLObject, tL_error, 6));
                return;
        }
    }
}
