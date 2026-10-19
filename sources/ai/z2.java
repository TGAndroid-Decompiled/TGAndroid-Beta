package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z2 implements RequestDelegate {
    public final int f2528a = 1;
    public final l7 f2529b;
    public final long f2530c;
    public final long d;
    public final long e;
    public final Object f2531f;

    public z2(l7 l7Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f2529b = l7Var;
        this.f2530c = j10;
        this.d = j11;
        this.f2531f = callback;
        this.e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2528a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i3(this.f2529b, (org.telegram.ui.ActionBar.b2) this.f2531f, tLObject, this.f2530c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i3(this.f2529b, tLObject, this.f2530c, this.d, (Utilities.Callback) this.f2531f, tL_error, this.e));
                return;
        }
    }

    public z2(l7 l7Var, org.telegram.ui.ActionBar.b2 b2Var, long j10, long j11, long j12) {
        this.f2529b = l7Var;
        this.f2531f = b2Var;
        this.f2530c = j10;
        this.d = j11;
        this.e = j12;
    }
}
