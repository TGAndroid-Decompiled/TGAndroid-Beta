package cg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements RequestDelegate {
    public final int f3062a;
    public final v0 f3063b;

    public a0(v0 v0Var, int i10) {
        this.f3062a = i10;
        this.f3063b = v0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3062a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(17, this.f3063b, tLObject));
                return;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                v0 v0Var = this.f3063b;
                if (z10) {
                    AndroidUtilities.runOnUIThread(v0Var.D0);
                    return;
                } else {
                    v0Var.getClass();
                    return;
                }
            default:
                v0.U(this.f3063b, tLObject, tL_error);
                return;
        }
    }
}
