package hg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
public final class a1 implements RequestDelegate {
    public final int f10220a;
    public final e1 f10221b;

    public a1(e1 e1Var, int i10) {
        this.f10220a = i10;
        this.f10221b = e1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f10220a) {
            case 0:
                final e1 e1Var = this.f10221b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                e1 e1Var2 = e1Var;
                                e1Var2.f10267b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    xc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    wh.o(R.string.UnknownError, xc.a0(e1Var2), null);
                                    return;
                                } else {
                                    e1Var2.finishFragment();
                                    return;
                                }
                            default:
                                e1 e1Var3 = e1Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    e1Var3.f10267b.a(0.0f);
                                    xc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    e1Var3.f10267b.a(0.0f);
                                    wh.o(R.string.UnknownError, xc.a0(e1Var3), null);
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
                final e1 e1Var2 = this.f10221b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                e1 e1Var22 = e1Var2;
                                e1Var22.f10267b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    xc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    wh.o(R.string.UnknownError, xc.a0(e1Var22), null);
                                    return;
                                } else {
                                    e1Var22.finishFragment();
                                    return;
                                }
                            default:
                                e1 e1Var3 = e1Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    e1Var3.f10267b.a(0.0f);
                                    xc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    e1Var3.f10267b.a(0.0f);
                                    wh.o(R.string.UnknownError, xc.a0(e1Var3), null);
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
