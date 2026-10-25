package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g3 implements RequestDelegate {
    public final int f12997a;
    public final h3 f12998b;

    public g3(h3 h3Var, int i10) {
        this.f12997a = i10;
        this.f12998b = h3Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12997a) {
            case 0:
                m3 m3Var = this.f12998b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(m3Var.H).lambda$processUpdates$379((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new g2(m3Var, 16));
                return;
            default:
                AndroidUtilities.runOnUIThread(new e2.m0(this.f12998b, tLObject, tL_error, 12));
                return;
        }
    }
}
