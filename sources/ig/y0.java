package ig;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
public final class y0 implements RequestDelegate {
    public final int f13127a;
    public final c1 f13128b;

    public y0(c1 c1Var, int i10) {
        this.f13127a = i10;
        this.f13128b = c1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f13127a) {
            case 0:
                final c1 c1Var = this.f13128b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                c1 c1Var2 = c1Var;
                                c1Var2.f12876b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    xc.d0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    sl.q(R.string.UnknownError, xc.a0(c1Var2), null);
                                    return;
                                } else {
                                    c1Var2.finishFragment();
                                    return;
                                }
                            default:
                                c1 c1Var3 = c1Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    c1Var3.f12876b.a(0.0f);
                                    xc.d0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    c1Var3.f12876b.a(0.0f);
                                    sl.q(R.string.UnknownError, xc.a0(c1Var3), null);
                                    return;
                                } else {
                                    c1Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final c1 c1Var2 = this.f13128b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                c1 c1Var22 = c1Var2;
                                c1Var22.f12876b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    xc.d0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    sl.q(R.string.UnknownError, xc.a0(c1Var22), null);
                                    return;
                                } else {
                                    c1Var22.finishFragment();
                                    return;
                                }
                            default:
                                c1 c1Var3 = c1Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    c1Var3.f12876b.a(0.0f);
                                    xc.d0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    c1Var3.f12876b.a(0.0f);
                                    sl.q(R.string.UnknownError, xc.a0(c1Var3), null);
                                    return;
                                } else {
                                    c1Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
