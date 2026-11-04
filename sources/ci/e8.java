package ci;

import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e8 implements RequestDelegate {
    public final int f5027a;
    public final u10 f5028b;

    public e8(u10 u10Var, int i3) {
        this.f5027a = i3;
        this.f5028b = u10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5027a) {
            case 0:
                org.telegram.messenger.g0.h3(new j8(tLObject, this.f5028b, 0));
                return;
            default:
                org.telegram.messenger.g0.h3(new ei.b0(9, this.f5028b, tL_error));
                return;
        }
    }
}
