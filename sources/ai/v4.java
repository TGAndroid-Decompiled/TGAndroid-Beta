package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v4 implements RequestDelegate {
    public final int f2295a;
    public final k7 f2296b;

    public v4(k7 k7Var, int i10) {
        this.f2295a = i10;
        this.f2296b = k7Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f2295a) {
            case 0:
                final k7 k7Var = this.f2296b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                k7.e1(k7Var, tLObject, tL_error);
                                return;
                            default:
                                k7.x0(k7Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final k7 k7Var2 = this.f2296b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                k7.e1(k7Var2, tLObject, tL_error);
                                return;
                            default:
                                k7.x0(k7Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
