package di;

import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y7 implements RequestDelegate {
    public final int f10082a;
    public final x10 f10083b;

    public y7(x10 x10Var, int i7) {
        this.f10082a = i7;
        this.f10083b = x10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10082a) {
            case 0:
                org.telegram.messenger.g0.g3(new d8(tLObject, this.f10083b, 0));
                return;
            default:
                org.telegram.messenger.g0.g3(new w2(29, this.f10083b, tL_error));
                return;
        }
    }
}
