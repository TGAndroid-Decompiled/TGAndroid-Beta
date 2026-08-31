package fg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements RequestDelegate {
    public final int f6236a;
    public final v0 f6237b;

    public a0(v0 v0Var, int i10) {
        this.f6236a = i10;
        this.f6237b = v0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6236a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(25, this.f6237b, tLObject));
                return;
            case 1:
                boolean z4 = tLObject instanceof TLRPC.TL_boolTrue;
                v0 v0Var = this.f6237b;
                if (z4) {
                    AndroidUtilities.runOnUIThread(v0Var.E0);
                    return;
                } else {
                    v0Var.getClass();
                    return;
                }
            default:
                v0.U(this.f6237b, tLObject, tL_error);
                return;
        }
    }
}
