package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w4 implements RequestDelegate {
    public final int f2352a;
    public final l7 f2353b;

    public w4(l7 l7Var, int i10) {
        this.f2352a = i10;
        this.f2353b = l7Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f2352a) {
            case 0:
                final l7 l7Var = this.f2353b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                l7.R(l7Var, tLObject, tL_error);
                                return;
                            default:
                                l7.C0(l7Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final l7 l7Var2 = this.f2353b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                l7.R(l7Var2, tLObject, tL_error);
                                return;
                            default:
                                l7.C0(l7Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
