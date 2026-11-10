package bi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e9 implements RequestDelegate {
    public final int f3802a;
    public final c20 f3803b;

    public e9(c20 c20Var, int i7) {
        this.f3802a = i7;
        this.f3803b = c20Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3802a) {
            case 0:
                org.telegram.messenger.g0.h3(new j9(tLObject, this.f3803b, 0));
                return;
            default:
                org.telegram.messenger.g0.h3(new di.z0(6, this.f3803b, tL_error));
                return;
        }
    }
}
