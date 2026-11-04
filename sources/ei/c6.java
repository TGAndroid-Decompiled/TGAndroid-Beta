package ei;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.la0;
import org.telegram.ui.z70;
public final class c6 implements RequestDelegate {
    public final int f10150a;
    public final long f10151b;
    public final Object f10152c;

    public c6(Object obj, long j10, int i3) {
        this.f10150a = i3;
        this.f10152c = obj;
        this.f10151b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10150a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.r1((z6) this.f10152c, this.f10151b, tLObject, 6));
                return;
            default:
                la0 la0Var = (la0) this.f10152c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new z70(la0Var, tLObject, this.f10151b, 1));
                    return;
                }
                return;
        }
    }
}
