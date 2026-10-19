package ig;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.kk;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
public final class z0 implements RequestDelegate {
    public final int f13096a;
    public final d1 f13097b;

    public z0(d1 d1Var, int i10) {
        this.f13096a = i10;
        this.f13097b = d1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f13096a) {
            case 0:
                final d1 d1Var = this.f13097b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                d1 d1Var2 = d1Var;
                                d1Var2.f12853b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    xc.d0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    kk.q(R.string.UnknownError, xc.a0(d1Var2), null);
                                    return;
                                } else {
                                    d1Var2.finishFragment();
                                    return;
                                }
                            default:
                                d1 d1Var3 = d1Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    d1Var3.f12853b.a(0.0f);
                                    xc.d0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    d1Var3.f12853b.a(0.0f);
                                    kk.q(R.string.UnknownError, xc.a0(d1Var3), null);
                                    return;
                                } else {
                                    d1Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final d1 d1Var2 = this.f13097b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                d1 d1Var22 = d1Var2;
                                d1Var22.f12853b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    xc.d0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    kk.q(R.string.UnknownError, xc.a0(d1Var22), null);
                                    return;
                                } else {
                                    d1Var22.finishFragment();
                                    return;
                                }
                            default:
                                d1 d1Var3 = d1Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    d1Var3.f12853b.a(0.0f);
                                    xc.d0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    d1Var3.f12853b.a(0.0f);
                                    kk.q(R.string.UnknownError, xc.a0(d1Var3), null);
                                    return;
                                } else {
                                    d1Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
