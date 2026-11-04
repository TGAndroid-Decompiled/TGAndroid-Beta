package ii;

import ei.h9;
import org.telegram.messenger.hp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u2 implements RequestDelegate {
    public final int f15255a;
    public final v2 f15256b;

    public u2(v2 v2Var, int i3) {
        this.f15255a = i3;
        this.f15256b = v2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15255a) {
            case 0:
                a3 a3Var = this.f15256b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    hp.s1(a3Var.I).O3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new x1(a3Var, 16));
                return;
            default:
                org.telegram.messenger.g0.h3(new h9(this.f15256b, tLObject, tL_error, 15));
                return;
        }
    }
}
