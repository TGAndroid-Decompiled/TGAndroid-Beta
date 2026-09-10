package gg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wc;
public final class e1 implements RequestDelegate {
    public final int f8870a;
    public final k1 f8871b;

    public e1(k1 k1Var, int i10) {
        this.f8870a = i10;
        this.f8871b = k1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f8870a) {
            case 0:
                final k1 k1Var = this.f8871b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                k1 k1Var2 = k1Var;
                                k1Var2.f8927b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    wc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.a2.p(R.string.UnknownError, wc.a0(k1Var2), null);
                                    return;
                                } else {
                                    k1Var2.finishFragment();
                                    return;
                                }
                            default:
                                k1 k1Var3 = k1Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    k1Var3.f8927b.a(0.0f);
                                    wc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    k1Var3.f8927b.a(0.0f);
                                    org.telegram.messenger.a2.p(R.string.UnknownError, wc.a0(k1Var3), null);
                                    return;
                                } else {
                                    k1Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final k1 k1Var2 = this.f8871b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                k1 k1Var22 = k1Var2;
                                k1Var22.f8927b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    wc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.a2.p(R.string.UnknownError, wc.a0(k1Var22), null);
                                    return;
                                } else {
                                    k1Var22.finishFragment();
                                    return;
                                }
                            default:
                                k1 k1Var3 = k1Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    k1Var3.f8927b.a(0.0f);
                                    wc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    k1Var3.f8927b.a(0.0f);
                                    org.telegram.messenger.a2.p(R.string.UnknownError, wc.a0(k1Var3), null);
                                    return;
                                } else {
                                    k1Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
