package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.f80;
import org.telegram.ui.pa0;
public final class s5 implements RequestDelegate {
    public final int f12526a;
    public final long f12527b;
    public final Object f12528c;

    public s5(Object obj, long j3, int i7) {
        this.f12526a = i7;
        this.f12528c = obj;
        this.f12527b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12526a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.s2((p6) this.f12528c, this.f12527b, tLObject, 6));
                return;
            default:
                pa0 pa0Var = (pa0) this.f12528c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new f80(pa0Var, tLObject, this.f12527b, 1));
                    return;
                }
                return;
        }
    }
}
