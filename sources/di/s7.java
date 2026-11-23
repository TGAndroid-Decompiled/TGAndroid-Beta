package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s7 implements RequestDelegate {
    public final int f9753a;
    public final y8 f9754b;

    public s7(y8 y8Var, int i7) {
        this.f9753a = i7;
        this.f9754b = y8Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9753a) {
            case 0:
                org.telegram.messenger.g0.g3(new w7(this.f9754b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new w7(this.f9754b, tLObject, 1));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new w7(this.f9754b, tLObject, 2));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new w7(this.f9754b, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.g3(new w7(this.f9754b, tLObject, 4));
                return;
        }
    }
}
