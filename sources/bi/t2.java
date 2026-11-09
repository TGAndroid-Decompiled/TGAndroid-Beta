package bi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t2 implements RequestDelegate {
    public final int f4730a = 1;
    public final k7 f4731b;
    public final long f4732c;
    public final long d;
    public final long f4733e;
    public final Object f4734f;

    public t2(k7 k7Var, long j3, long j10, c20 c20Var, long j11) {
        this.f4731b = k7Var;
        this.f4732c = j3;
        this.d = j10;
        this.f4734f = c20Var;
        this.f4733e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4730a) {
            case 0:
                org.telegram.messenger.g0.h3(new c3(this.f4731b, (org.telegram.ui.ActionBar.u1) this.f4734f, tLObject, this.f4732c, this.d, this.f4733e, tL_error));
                return;
            default:
                org.telegram.messenger.g0.h3(new c3(this.f4731b, tLObject, this.f4732c, this.d, (c20) this.f4734f, tL_error, this.f4733e));
                return;
        }
    }

    public t2(k7 k7Var, org.telegram.ui.ActionBar.u1 u1Var, long j3, long j10, long j11) {
        this.f4731b = k7Var;
        this.f4734f = u1Var;
        this.f4732c = j3;
        this.d = j10;
        this.f4733e = j11;
    }
}
