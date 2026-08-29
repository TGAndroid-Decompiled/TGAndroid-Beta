package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j6 implements RequestDelegate {
    public final int f12339a;
    public final s7 f12340b;

    public j6(s7 s7Var, int i10) {
        this.f12339a = i10;
        this.f12340b = s7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12339a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q6(this.f12340b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new q6(this.f12340b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new q6(this.f12340b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new q6(this.f12340b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q6(this.f12340b, tLObject, 4));
                return;
        }
    }
}
