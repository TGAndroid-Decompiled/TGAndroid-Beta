package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e3 implements RequestDelegate {
    public final int f9015a;
    public final g3 f9016b;

    public e3(g3 g3Var, int i10) {
        this.f9015a = i10;
        this.f9016b = g3Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9015a) {
            case 0:
                l3 l3Var = this.f9016b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(l3Var.G).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new f2(l3Var, 17));
                return;
            default:
                AndroidUtilities.runOnUIThread(new a3.k0(this.f9016b, tLObject, tL_error, 26));
                return;
        }
    }
}
