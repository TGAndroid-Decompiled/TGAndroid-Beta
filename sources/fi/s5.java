package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.g80;
import org.telegram.ui.qa0;
public final class s5 implements RequestDelegate {
    public final int f12561a;
    public final long f12562b;
    public final Object f12563c;

    public s5(Object obj, long j3, int i7) {
        this.f12561a = i7;
        this.f12563c = obj;
        this.f12562b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12561a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.q2((p6) this.f12563c, this.f12562b, tLObject, 6));
                return;
            default:
                qa0 qa0Var = (qa0) this.f12563c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new g80(qa0Var, tLObject, this.f12562b, 1));
                    return;
                }
                return;
        }
    }
}
