package ci;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x7 implements RequestDelegate {
    public final int f6362a;
    public final e9 f6363b;

    public x7(e9 e9Var, int i3) {
        this.f6362a = i3;
        this.f6363b = e9Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6362a) {
            case 0:
                org.telegram.messenger.g0.h3(new a8(this.f6363b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new a8(this.f6363b, tLObject, 1));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new a8(this.f6363b, tLObject, 2));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new a8(this.f6363b, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.h3(new a8(this.f6363b, tLObject, 4));
                return;
        }
    }
}
