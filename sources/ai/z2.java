package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z2 implements RequestDelegate {
    public final int f2522a = 1;
    public final k7 f2523b;
    public final long f2524c;
    public final long d;
    public final long e;
    public final Object f2525f;

    public z2(k7 k7Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f2523b = k7Var;
        this.f2524c = j10;
        this.d = j11;
        this.f2525f = callback;
        this.e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2522a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f2523b, (org.telegram.ui.ActionBar.b2) this.f2525f, tLObject, this.f2524c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new g3(this.f2523b, tLObject, this.f2524c, this.d, (Utilities.Callback) this.f2525f, tL_error, this.e));
                return;
        }
    }

    public z2(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, long j10, long j11, long j12) {
        this.f2523b = k7Var;
        this.f2525f = b2Var;
        this.f2524c = j10;
        this.d = j11;
        this.e = j12;
    }
}
