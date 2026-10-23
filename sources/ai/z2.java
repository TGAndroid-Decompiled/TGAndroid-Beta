package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z2 implements RequestDelegate {
    public final int f2532a = 1;
    public final l7 f2533b;
    public final long f2534c;
    public final long d;
    public final long e;
    public final Object f2535f;

    public z2(l7 l7Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f2533b = l7Var;
        this.f2534c = j10;
        this.d = j11;
        this.f2535f = callback;
        this.e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2532a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i3(this.f2533b, (org.telegram.ui.ActionBar.c2) this.f2535f, tLObject, this.f2534c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i3(this.f2533b, tLObject, this.f2534c, this.d, (Utilities.Callback) this.f2535f, tL_error, this.e));
                return;
        }
    }

    public z2(l7 l7Var, org.telegram.ui.ActionBar.c2 c2Var, long j10, long j11, long j12) {
        this.f2533b = l7Var;
        this.f2535f = c2Var;
        this.f2534c = j10;
        this.d = j11;
        this.e = j12;
    }
}
