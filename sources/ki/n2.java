package ki;

import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n2 implements RequestDelegate {
    public final int f18805a;
    public final o2 f18806b;

    public n2(o2 o2Var, int i7) {
        this.f18805a = i7;
        this.f18806b = o2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18805a) {
            case 0:
                t2 t2Var = this.f18806b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    mp.u1(t2Var.I).V3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new t1(t2Var, 16));
                return;
            default:
                org.telegram.messenger.g0.g3(new kg.i0(this.f18806b, tLObject, tL_error, 6));
                return;
        }
    }
}
