package ag;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class f0 implements RequestDelegate {

    public final int f372a;

    public final i1 f373b;

    public f0(i1 i1Var, int i10) {
        this.f372a = i10;
        this.f373b = i1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f372a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(4, this.f373b, tLObject));
                break;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                i1 i1Var = this.f373b;
                if (!z10) {
                    i1Var.getClass();
                } else {
                    AndroidUtilities.runOnUIThread(i1Var.D0);
                }
                break;
            default:
                i1.U(this.f373b, tLObject, tL_error);
                break;
        }
    }
}
