package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x8 implements RequestDelegate {
    public final int f5040a;
    public final ea f5041b;

    public x8(ea eaVar, int i7) {
        this.f5040a = i7;
        this.f5041b = eaVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5040a) {
            case 0:
                org.telegram.messenger.g0.h3(new a9(this.f5041b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new a9(this.f5041b, tLObject, 1));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new a9(this.f5041b, tLObject, 2));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new a9(this.f5041b, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.h3(new a9(this.f5041b, tLObject, 4));
                return;
        }
    }
}
