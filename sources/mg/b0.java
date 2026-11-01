package mg;

import org.telegram.messenger.r20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements RequestDelegate {
    public final int f13075a;
    public final r20 f13076b;
    public final r20 f13077c;

    public b0(r20 r20Var, r20 r20Var2, int i10) {
        this.f13075a = i10;
        this.f13076b = r20Var;
        this.f13077c = r20Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13075a) {
            case 0:
                org.telegram.messenger.i0.g3(new li.s(tL_error, this.f13076b, this.f13077c, 7));
                return;
            default:
                org.telegram.messenger.i0.g3(new ag.q0((Object) tL_error, (Object) this.f13076b, tLObject, (Object) this.f13077c, 14));
                return;
        }
    }
}
