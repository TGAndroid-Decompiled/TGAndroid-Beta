package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g3 implements RequestDelegate {
    public final int f12096a;
    public final h5 f12097b;

    public g3(h5 h5Var, int i10) {
        this.f12096a = i10;
        this.f12097b = h5Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f12096a) {
            case 0:
                final h5 h5Var = this.f12097b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                h5.a0(h5Var, tLObject, tL_error);
                                return;
                            default:
                                h5.y0(h5Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final h5 h5Var2 = this.f12097b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                h5.a0(h5Var2, tLObject, tL_error);
                                return;
                            default:
                                h5.y0(h5Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
