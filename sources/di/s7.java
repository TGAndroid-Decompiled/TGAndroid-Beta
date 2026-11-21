package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s7 implements RequestDelegate {
    public final int f9750a;
    public final y8 f9751b;

    public s7(y8 y8Var, int i7) {
        this.f9750a = i7;
        this.f9751b = y8Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9750a) {
            case 0:
                org.telegram.messenger.g0.g3(new w7(this.f9751b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new w7(this.f9751b, tLObject, 1));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new w7(this.f9751b, tLObject, 2));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new w7(this.f9751b, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.g3(new w7(this.f9751b, tLObject, 4));
                return;
        }
    }
}
