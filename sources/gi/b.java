package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f11078a;
    public final l f11079b;
    public final org.telegram.ui.ActionBar.b2 f11080c;

    public b(l lVar, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f11078a = i10;
        this.f11079b = lVar;
        this.f11080c = b2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f11078a) {
            case 0:
                final l lVar = this.f11079b;
                final org.telegram.ui.ActionBar.b2 b2Var = this.f11080c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                l.z0(lVar, b2Var, tLObject, tL_error);
                                return;
                            default:
                                l.A0(lVar, b2Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final l lVar2 = this.f11079b;
                final org.telegram.ui.ActionBar.b2 b2Var2 = this.f11080c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                l.z0(lVar2, b2Var2, tLObject, tL_error);
                                return;
                            default:
                                l.A0(lVar2, b2Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
