package bi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t2 implements RequestDelegate {
    public final int f4732a = 1;
    public final k7 f4733b;
    public final long f4734c;
    public final long d;
    public final long f4735e;
    public final Object f4736f;

    public t2(k7 k7Var, long j3, long j10, c20 c20Var, long j11) {
        this.f4733b = k7Var;
        this.f4734c = j3;
        this.d = j10;
        this.f4736f = c20Var;
        this.f4735e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4732a) {
            case 0:
                org.telegram.messenger.g0.h3(new c3(this.f4733b, (org.telegram.ui.ActionBar.u1) this.f4736f, tLObject, this.f4734c, this.d, this.f4735e, tL_error));
                return;
            default:
                org.telegram.messenger.g0.h3(new c3(this.f4733b, tLObject, this.f4734c, this.d, (c20) this.f4736f, tL_error, this.f4735e));
                return;
        }
    }

    public t2(k7 k7Var, org.telegram.ui.ActionBar.u1 u1Var, long j3, long j10, long j11) {
        this.f4733b = k7Var;
        this.f4736f = u1Var;
        this.f4734c = j3;
        this.d = j10;
        this.f4735e = j11;
    }
}
