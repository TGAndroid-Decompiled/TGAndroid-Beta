package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.g80;
import org.telegram.ui.qa0;
public final class s5 implements RequestDelegate {
    public final int f12564a;
    public final long f12565b;
    public final Object f12566c;

    public s5(Object obj, long j3, int i7) {
        this.f12564a = i7;
        this.f12566c = obj;
        this.f12565b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12564a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.q2((p6) this.f12566c, this.f12565b, tLObject, 6));
                return;
            default:
                qa0 qa0Var = (qa0) this.f12566c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new g80(qa0Var, tLObject, this.f12565b, 1));
                    return;
                }
                return;
        }
    }
}
