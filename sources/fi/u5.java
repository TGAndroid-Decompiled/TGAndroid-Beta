package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.d80;
import org.telegram.ui.pa0;
public final class u5 implements RequestDelegate {
    public final int f12398a;
    public final long f12399b;
    public final Object f12400c;

    public u5(Object obj, long j3, int i7) {
        this.f12398a = i7;
        this.f12400c = obj;
        this.f12399b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12398a) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.m1((s6) this.f12400c, this.f12399b, tLObject, 6));
                return;
            default:
                pa0 pa0Var = (pa0) this.f12400c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new d80(pa0Var, tLObject, this.f12399b, 1));
                    return;
                }
                return;
        }
    }
}
