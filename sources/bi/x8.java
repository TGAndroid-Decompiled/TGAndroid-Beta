package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x8 implements RequestDelegate {
    public final int f5043a;
    public final ea f5044b;

    public x8(ea eaVar, int i7) {
        this.f5043a = i7;
        this.f5044b = eaVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5043a) {
            case 0:
                org.telegram.messenger.g0.h3(new a9(this.f5044b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new a9(this.f5044b, tLObject, 1));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new a9(this.f5044b, tLObject, 2));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new a9(this.f5044b, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.h3(new a9(this.f5044b, tLObject, 4));
                return;
        }
    }
}
