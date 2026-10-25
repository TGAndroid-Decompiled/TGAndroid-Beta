package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r4 implements RequestDelegate {
    public final int f5325a;
    public final h7 f5326b;

    public r4(h7 h7Var, int i10) {
        this.f5325a = i10;
        this.f5326b = h7Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f5325a) {
            case 0:
                final h7 h7Var = this.f5326b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                h7.R(h7Var, tLObject, tL_error);
                                return;
                            default:
                                h7.C0(h7Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final h7 h7Var2 = this.f5326b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                h7.R(h7Var2, tLObject, tL_error);
                                return;
                            default:
                                h7.C0(h7Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
