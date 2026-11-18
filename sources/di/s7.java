package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s7 implements RequestDelegate {
    public final int f9721a;
    public final x8 f9722b;

    public s7(x8 x8Var, int i7) {
        this.f9721a = i7;
        this.f9722b = x8Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9721a) {
            case 0:
                org.telegram.messenger.g0.g3(new w7(this.f9722b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new w7(this.f9722b, tLObject, 1));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new w7(this.f9722b, tLObject, 2));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new w7(this.f9722b, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.g3(new w7(this.f9722b, tLObject, 4));
                return;
        }
    }
}
