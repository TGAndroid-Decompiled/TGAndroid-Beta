package mg;

import org.telegram.messenger.q20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements RequestDelegate {
    public final int f13074a;
    public final q20 f13075b;
    public final q20 f13076c;

    public b0(q20 q20Var, q20 q20Var2, int i10) {
        this.f13074a = i10;
        this.f13075b = q20Var;
        this.f13076c = q20Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13074a) {
            case 0:
                org.telegram.messenger.i0.g3(new li.s(tL_error, this.f13075b, this.f13076c, 7));
                return;
            default:
                org.telegram.messenger.i0.g3(new ag.q0((Object) tL_error, (Object) this.f13075b, tLObject, (Object) this.f13076c, 14));
                return;
        }
    }
}
