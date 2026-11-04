package ci;

import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i2 implements RequestDelegate {
    public final int f5278a = 1;
    public final l6 f5279b;
    public final long f5280c;
    public final long d;
    public final long f5281e;
    public final Object f5282f;

    public i2(l6 l6Var, long j10, long j11, u10 u10Var, long j12) {
        this.f5279b = l6Var;
        this.f5280c = j10;
        this.d = j11;
        this.f5282f = u10Var;
        this.f5281e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5278a) {
            case 0:
                org.telegram.messenger.g0.h3(new q2(this.f5279b, (org.telegram.ui.ActionBar.s1) this.f5282f, tLObject, this.f5280c, this.d, this.f5281e, tL_error));
                return;
            default:
                org.telegram.messenger.g0.h3(new q2(this.f5279b, tLObject, this.f5280c, this.d, (u10) this.f5282f, tL_error, this.f5281e));
                return;
        }
    }

    public i2(l6 l6Var, org.telegram.ui.ActionBar.s1 s1Var, long j10, long j11, long j12) {
        this.f5279b = l6Var;
        this.f5282f = s1Var;
        this.f5280c = j10;
        this.d = j11;
        this.f5281e = j12;
    }
}
