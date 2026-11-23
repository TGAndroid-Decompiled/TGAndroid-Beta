package ki;

import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m2 implements RequestDelegate {
    public final int f18885a;
    public final o2 f18886b;

    public m2(o2 o2Var, int i7) {
        this.f18885a = i7;
        this.f18886b = o2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18885a) {
            case 0:
                t2 t2Var = this.f18886b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    mp.u1(t2Var.I).V3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new s1(t2Var, 16));
                return;
            default:
                org.telegram.messenger.g0.g3(new kg.x(this.f18886b, tLObject, tL_error, 8));
                return;
        }
    }
}
