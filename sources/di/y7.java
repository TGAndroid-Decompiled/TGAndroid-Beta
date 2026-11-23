package di;

import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y7 implements RequestDelegate {
    public final int f10083a;
    public final y10 f10084b;

    public y7(y10 y10Var, int i7) {
        this.f10083a = i7;
        this.f10084b = y10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10083a) {
            case 0:
                org.telegram.messenger.g0.g3(new e8(tLObject, this.f10084b, 0));
                return;
            default:
                org.telegram.messenger.g0.g3(new fi.l4(1, this.f10084b, tL_error));
                return;
        }
    }
}
