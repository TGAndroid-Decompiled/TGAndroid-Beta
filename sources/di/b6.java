package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ea0;
import org.telegram.ui.pa0;
public final class b6 implements RequestDelegate {
    public final int f8846a;
    public final long f8847b;
    public final Object f8848c;

    public b6(Object obj, long j3, int i7) {
        this.f8846a = i7;
        this.f8848c = obj;
        this.f8847b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8846a) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.d3((y6) this.f8848c, this.f8847b, tLObject, 5));
                return;
            default:
                pa0 pa0Var = (pa0) this.f8848c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new ea0(pa0Var, tLObject, this.f8847b, 0));
                    return;
                }
                return;
        }
    }
}
