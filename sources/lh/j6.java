package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j6 implements RequestDelegate {
    public final int f12652a;
    public final t7 f12653b;

    public j6(t7 t7Var, int i10) {
        this.f12652a = i10;
        this.f12653b = t7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12652a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r6(this.f12653b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new r6(this.f12653b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new r6(this.f12653b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new r6(this.f12653b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r6(this.f12653b, tLObject, 4));
                return;
        }
    }
}
