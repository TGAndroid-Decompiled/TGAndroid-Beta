package di;

import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y7 implements RequestDelegate {
    public final int f10080a;
    public final x10 f10081b;

    public y7(x10 x10Var, int i7) {
        this.f10080a = i7;
        this.f10081b = x10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10080a) {
            case 0:
                org.telegram.messenger.g0.g3(new e8(tLObject, this.f10081b, 0));
                return;
            default:
                org.telegram.messenger.g0.g3(new fi.l4(1, this.f10081b, tL_error));
                return;
        }
    }
}
