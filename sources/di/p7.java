package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p7 implements RequestDelegate {
    public final int f9234a;
    public final v8 f9235b;

    public p7(v8 v8Var, int i7) {
        this.f9234a = i7;
        this.f9235b = v8Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9234a) {
            case 0:
                org.telegram.messenger.g0.h3(new s7(this.f9235b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new s7(this.f9235b, tLObject, 1));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new s7(this.f9235b, tLObject, 2));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new s7(this.f9235b, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.h3(new s7(this.f9235b, tLObject, 4));
                return;
        }
    }
}
