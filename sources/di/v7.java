package di;

import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v7 implements RequestDelegate {
    public final int f9611a;
    public final z10 f9612b;

    public v7(z10 z10Var, int i7) {
        this.f9611a = i7;
        this.f9612b = z10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9611a) {
            case 0:
                org.telegram.messenger.g0.h3(new a8(tLObject, this.f9612b, 0));
                return;
            default:
                org.telegram.messenger.g0.h3(new s2(27, this.f9612b, tL_error));
                return;
        }
    }
}
