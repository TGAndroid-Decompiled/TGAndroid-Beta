package ki;

import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m2 implements RequestDelegate {
    public final int f18812a;
    public final n2 f18813b;

    public m2(n2 n2Var, int i7) {
        this.f18812a = i7;
        this.f18813b = n2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18812a) {
            case 0:
                s2 s2Var = this.f18813b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    mp.u1(s2Var.I).V3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new s1(s2Var, 16));
                return;
            default:
                org.telegram.messenger.g0.g3(new kg.y(this.f18813b, tLObject, tL_error, 7));
                return;
        }
    }
}
