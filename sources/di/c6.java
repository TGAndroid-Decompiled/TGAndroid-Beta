package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ha0;
import org.telegram.ui.sa0;
public final class c6 implements RequestDelegate {
    public final int f8877a;
    public final long f8878b;
    public final Object f8879c;

    public c6(Object obj, long j3, int i7) {
        this.f8877a = i7;
        this.f8879c = obj;
        this.f8878b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8877a) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.d3((z6) this.f8879c, this.f8878b, tLObject, 5));
                return;
            default:
                sa0 sa0Var = (sa0) this.f8879c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new ha0(sa0Var, tLObject, this.f8878b, 0));
                    return;
                }
                return;
        }
    }
}
