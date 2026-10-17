package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f11077a;
    public final l f11078b;
    public final org.telegram.ui.ActionBar.b2 f11079c;

    public b(l lVar, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f11077a = i10;
        this.f11078b = lVar;
        this.f11079c = b2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f11077a) {
            case 0:
                final l lVar = this.f11078b;
                final org.telegram.ui.ActionBar.b2 b2Var = this.f11079c;
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
                final l lVar2 = this.f11078b;
                final org.telegram.ui.ActionBar.b2 b2Var2 = this.f11079c;
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
