package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p7 implements RequestDelegate {
    public final int f9226a;
    public final u8 f9227b;

    public p7(u8 u8Var, int i7) {
        this.f9226a = i7;
        this.f9227b = u8Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9226a) {
            case 0:
                org.telegram.messenger.g0.h3(new s7(this.f9227b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new s7(this.f9227b, tLObject, 1));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new s7(this.f9227b, tLObject, 2));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new s7(this.f9227b, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.h3(new s7(this.f9227b, tLObject, 4));
                return;
        }
    }
}
