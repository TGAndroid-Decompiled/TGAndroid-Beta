package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b3 implements RequestDelegate {
    public final int f1018a = 1;
    public final k7 f1019b;
    public final long f1020c;
    public final long d;
    public final long e;
    public final Object f1021f;

    public b3(k7 k7Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f1019b = k7Var;
        this.f1020c = j10;
        this.d = j11;
        this.f1021f = callback;
        this.e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1018a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i3(this.f1019b, (org.telegram.ui.ActionBar.b2) this.f1021f, tLObject, this.f1020c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i3(this.f1019b, tLObject, this.f1020c, this.d, (Utilities.Callback) this.f1021f, tL_error, this.e));
                return;
        }
    }

    public b3(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, long j10, long j11, long j12) {
        this.f1019b = k7Var;
        this.f1021f = b2Var;
        this.f1020c = j10;
        this.d = j11;
        this.e = j12;
    }
}
