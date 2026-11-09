package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ga0;
import org.telegram.ui.ra0;
public final class c6 implements RequestDelegate {
    public final int f8872a;
    public final long f8873b;
    public final Object f8874c;

    public c6(Object obj, long j3, int i7) {
        this.f8872a = i7;
        this.f8874c = obj;
        this.f8873b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8872a) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.d3((z6) this.f8874c, this.f8873b, tLObject, 5));
                return;
            default:
                ra0 ra0Var = (ra0) this.f8874c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new ga0(ra0Var, tLObject, this.f8873b, 0));
                    return;
                }
                return;
        }
    }
}
