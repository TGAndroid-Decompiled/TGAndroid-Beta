package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g3 implements RequestDelegate {
    public final int f6642a;
    public final i3 f6643b;

    public g3(i3 i3Var, int i10) {
        this.f6642a = i10;
        this.f6643b = i3Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6642a) {
            case 0:
                n3 n3Var = this.f6643b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(n3Var.G).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new h2(n3Var, 17));
                return;
            default:
                AndroidUtilities.runOnUIThread(new a3.k0(this.f6643b, tLObject, tL_error, 16));
                return;
        }
    }
}
