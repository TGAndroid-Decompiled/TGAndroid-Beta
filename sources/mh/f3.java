package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f3 implements RequestDelegate {
    public final int f14014a;
    public final g5 f14015b;

    public f3(g5 g5Var, int i10) {
        this.f14014a = i10;
        this.f14015b = g5Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f14014a) {
            case 0:
                final g5 g5Var = this.f14015b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                g5.a0(g5Var, tLObject, tL_error);
                                return;
                            default:
                                g5.y0(g5Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final g5 g5Var2 = this.f14015b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                g5.a0(g5Var2, tLObject, tL_error);
                                return;
                            default:
                                g5.y0(g5Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
