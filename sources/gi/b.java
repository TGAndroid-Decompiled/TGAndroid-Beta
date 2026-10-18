package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f11079a;
    public final l f11080b;
    public final org.telegram.ui.ActionBar.b2 f11081c;

    public b(l lVar, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f11079a = i10;
        this.f11080b = lVar;
        this.f11081c = b2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f11079a) {
            case 0:
                final l lVar = this.f11080b;
                final org.telegram.ui.ActionBar.b2 b2Var = this.f11081c;
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
                final l lVar2 = this.f11080b;
                final org.telegram.ui.ActionBar.b2 b2Var2 = this.f11081c;
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
