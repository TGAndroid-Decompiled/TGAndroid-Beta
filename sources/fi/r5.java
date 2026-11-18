package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.f80;
import org.telegram.ui.pa0;
public final class r5 implements RequestDelegate {
    public final int f12505a;
    public final long f12506b;
    public final Object f12507c;

    public r5(Object obj, long j3, int i7) {
        this.f12505a = i7;
        this.f12507c = obj;
        this.f12506b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12505a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.m2((p6) this.f12507c, this.f12506b, tLObject, 6));
                return;
            default:
                pa0 pa0Var = (pa0) this.f12507c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new f80(pa0Var, tLObject, this.f12506b, 1));
                    return;
                }
                return;
        }
    }
}
