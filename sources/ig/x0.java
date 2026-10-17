package ig;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
public final class x0 implements RequestDelegate {
    public final int f13078a;
    public final b1 f13079b;

    public x0(b1 b1Var, int i10) {
        this.f13078a = i10;
        this.f13079b = b1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f13078a) {
            case 0:
                final b1 b1Var = this.f13079b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                b1 b1Var2 = b1Var;
                                b1Var2.f12834b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    xc.d0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    wh.q(R.string.UnknownError, xc.a0(b1Var2), null);
                                    return;
                                } else {
                                    b1Var2.finishFragment();
                                    return;
                                }
                            default:
                                b1 b1Var3 = b1Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    b1Var3.f12834b.a(0.0f);
                                    xc.d0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    b1Var3.f12834b.a(0.0f);
                                    wh.q(R.string.UnknownError, xc.a0(b1Var3), null);
                                    return;
                                } else {
                                    b1Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final b1 b1Var2 = this.f13079b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                b1 b1Var22 = b1Var2;
                                b1Var22.f12834b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    xc.d0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    wh.q(R.string.UnknownError, xc.a0(b1Var22), null);
                                    return;
                                } else {
                                    b1Var22.finishFragment();
                                    return;
                                }
                            default:
                                b1 b1Var3 = b1Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    b1Var3.f12834b.a(0.0f);
                                    xc.d0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    b1Var3.f12834b.a(0.0f);
                                    wh.q(R.string.UnknownError, xc.a0(b1Var3), null);
                                    return;
                                } else {
                                    b1Var3.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
