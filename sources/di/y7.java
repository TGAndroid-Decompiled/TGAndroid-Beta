package di;

import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y7 implements RequestDelegate {
    public final int f10046a;
    public final y10 f10047b;

    public y7(y10 y10Var, int i7) {
        this.f10046a = i7;
        this.f10047b = y10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10046a) {
            case 0:
                org.telegram.messenger.g0.g3(new e8(tLObject, this.f10047b, 0));
                return;
            default:
                org.telegram.messenger.g0.g3(new w2(29, this.f10047b, tL_error));
                return;
        }
    }
}
