package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w4 implements RequestDelegate {
    public final int f2349a;
    public final l7 f2350b;

    public w4(l7 l7Var, int i10) {
        this.f2349a = i10;
        this.f2350b = l7Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f2349a) {
            case 0:
                final l7 l7Var = this.f2350b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                l7.S(l7Var, tLObject, tL_error);
                                return;
                            default:
                                l7.D0(l7Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final l7 l7Var2 = this.f2350b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                l7.S(l7Var2, tLObject, tL_error);
                                return;
                            default:
                                l7.D0(l7Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
