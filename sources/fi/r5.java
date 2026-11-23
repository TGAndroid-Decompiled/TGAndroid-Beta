package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.g80;
import org.telegram.ui.qa0;
public final class r5 implements RequestDelegate {
    public final int f12497a;
    public final long f12498b;
    public final Object f12499c;

    public r5(Object obj, long j3, int i7) {
        this.f12497a = i7;
        this.f12499c = obj;
        this.f12498b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12497a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.s2((p6) this.f12499c, this.f12498b, tLObject, 6));
                return;
            default:
                qa0 qa0Var = (qa0) this.f12499c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new g80(qa0Var, tLObject, this.f12498b, 1));
                    return;
                }
                return;
        }
    }
}
