package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d3 implements RequestDelegate {
    public final int f8284a;
    public final f3 f8285b;

    public d3(f3 f3Var, int i10) {
        this.f8284a = i10;
        this.f8285b = f3Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8284a) {
            case 0:
                k3 k3Var = this.f8285b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(k3Var.G).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new e2(k3Var, 17));
                return;
            default:
                AndroidUtilities.runOnUIThread(new a3.k0(this.f8285b, tLObject, tL_error, 26));
                return;
        }
    }
}
