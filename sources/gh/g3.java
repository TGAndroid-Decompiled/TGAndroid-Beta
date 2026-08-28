package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g3 implements RequestDelegate {
    public final int f8098a;
    public final k5 f8099b;

    public g3(k5 k5Var, int i9) {
        this.f8098a = i9;
        this.f8099b = k5Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f8098a) {
            case 0:
                final k5 k5Var = this.f8099b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                k5.Z(k5Var, tLObject, tL_error);
                                return;
                            default:
                                k5.x0(k5Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final k5 k5Var2 = this.f8099b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                k5.Z(k5Var2, tLObject, tL_error);
                                return;
                            default:
                                k5.x0(k5Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
