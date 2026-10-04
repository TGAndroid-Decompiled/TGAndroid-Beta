package hg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yc;
public final class a1 implements RequestDelegate {
    public final int f11102a;
    public final e1 f11103b;

    public a1(e1 e1Var, int i10) {
        this.f11102a = i10;
        this.f11103b = e1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f11102a) {
            case 0:
                final e1 e1Var = this.f11103b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                e1 e1Var2 = e1Var;
                                e1Var2.f11155b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    yc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    bi.o(R.string.UnknownError, yc.a0(e1Var2), null);
                                    return;
                                } else {
                                    e1Var2.finishFragment();
                                    return;
                                }
                            default:
                                e1 e1Var3 = e1Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    e1Var3.f11155b.a(0.0f);
                                    yc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    e1Var3.f11155b.a(0.0f);
                                    bi.o(R.string.UnknownError, yc.a0(e1Var3), null);
                                    return;
                                } else {
                                    e1Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final e1 e1Var2 = this.f11103b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                e1 e1Var22 = e1Var2;
                                e1Var22.f11155b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    yc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    bi.o(R.string.UnknownError, yc.a0(e1Var22), null);
                                    return;
                                } else {
                                    e1Var22.finishFragment();
                                    return;
                                }
                            default:
                                e1 e1Var3 = e1Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    e1Var3.f11155b.a(0.0f);
                                    yc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    e1Var3.f11155b.a(0.0f);
                                    bi.o(R.string.UnknownError, yc.a0(e1Var3), null);
                                    return;
                                } else {
                                    e1Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
