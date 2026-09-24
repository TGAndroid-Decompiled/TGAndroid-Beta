package hg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ok;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yc;
public final class b1 implements RequestDelegate {
    public final int f10203a;
    public final f1 f10204b;

    public b1(f1 f1Var, int i10) {
        this.f10203a = i10;
        this.f10204b = f1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f10203a) {
            case 0:
                final f1 f1Var = this.f10204b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                f1 f1Var2 = f1Var;
                                f1Var2.f10258b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    yc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    ok.p(R.string.UnknownError, yc.a0(f1Var2), null);
                                    return;
                                } else {
                                    f1Var2.finishFragment();
                                    return;
                                }
                            default:
                                f1 f1Var3 = f1Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    f1Var3.f10258b.a(0.0f);
                                    yc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    f1Var3.f10258b.a(0.0f);
                                    ok.p(R.string.UnknownError, yc.a0(f1Var3), null);
                                    return;
                                } else {
                                    f1Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final f1 f1Var2 = this.f10204b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                f1 f1Var22 = f1Var2;
                                f1Var22.f10258b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    yc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    ok.p(R.string.UnknownError, yc.a0(f1Var22), null);
                                    return;
                                } else {
                                    f1Var22.finishFragment();
                                    return;
                                }
                            default:
                                f1 f1Var3 = f1Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    f1Var3.f10258b.a(0.0f);
                                    yc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    f1Var3.f10258b.a(0.0f);
                                    ok.p(R.string.UnknownError, yc.a0(f1Var3), null);
                                    return;
                                } else {
                                    f1Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
