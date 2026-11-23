package di;

import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y7 implements RequestDelegate {
    public final int f10044a;
    public final w10 f10045b;

    public y7(w10 w10Var, int i7) {
        this.f10044a = i7;
        this.f10045b = w10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10044a) {
            case 0:
                org.telegram.messenger.g0.g3(new e8(tLObject, this.f10045b, 0));
                return;
            default:
                org.telegram.messenger.g0.g3(new fi.l4(1, this.f10045b, tL_error));
                return;
        }
    }
}
