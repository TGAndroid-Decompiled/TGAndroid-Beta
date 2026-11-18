package di;

import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g2 implements RequestDelegate {
    public final int f8850a = 1;
    public final f6 f8851b;
    public final long f8852c;
    public final long d;
    public final long f8853e;
    public final Object f8854f;

    public g2(f6 f6Var, long j3, long j10, x10 x10Var, long j11) {
        this.f8851b = f6Var;
        this.f8852c = j3;
        this.d = j10;
        this.f8854f = x10Var;
        this.f8853e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8850a) {
            case 0:
                org.telegram.messenger.g0.g3(new u2(this.f8851b, (org.telegram.ui.ActionBar.u1) this.f8854f, tLObject, this.f8852c, this.d, this.f8853e, tL_error));
                return;
            default:
                org.telegram.messenger.g0.g3(new u2(this.f8851b, tLObject, this.f8852c, this.d, (x10) this.f8854f, tL_error, this.f8853e));
                return;
        }
    }

    public g2(f6 f6Var, org.telegram.ui.ActionBar.u1 u1Var, long j3, long j10, long j11) {
        this.f8851b = f6Var;
        this.f8854f = u1Var;
        this.f8852c = j3;
        this.d = j10;
        this.f8853e = j11;
    }
}
