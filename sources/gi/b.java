package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f11095a;
    public final l f11096b;
    public final org.telegram.ui.ActionBar.c2 f11097c;

    public b(l lVar, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f11095a = i10;
        this.f11096b = lVar;
        this.f11097c = c2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f11095a) {
            case 0:
                final l lVar = this.f11096b;
                final org.telegram.ui.ActionBar.c2 c2Var = this.f11097c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                l.z0(lVar, c2Var, tLObject, tL_error);
                                return;
                            default:
                                l.A0(lVar, c2Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final l lVar2 = this.f11096b;
                final org.telegram.ui.ActionBar.c2 c2Var2 = this.f11097c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                l.z0(lVar2, c2Var2, tLObject, tL_error);
                                return;
                            default:
                                l.A0(lVar2, c2Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
