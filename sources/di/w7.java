package di;

import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w7 implements RequestDelegate {
    public final int f9697a;
    public final z10 f9698b;

    public w7(z10 z10Var, int i7) {
        this.f9697a = i7;
        this.f9698b = z10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9697a) {
            case 0:
                org.telegram.messenger.g0.h3(new b8(tLObject, this.f9698b, 0));
                return;
            default:
                org.telegram.messenger.g0.h3(new s2(27, this.f9698b, tL_error));
                return;
        }
    }
}
