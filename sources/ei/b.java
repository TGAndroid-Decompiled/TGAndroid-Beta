package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f8233a;
    public final l f8234b;
    public final org.telegram.ui.ActionBar.a2 f8235c;

    public b(l lVar, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f8233a = i10;
        this.f8234b = lVar;
        this.f8235c = a2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f8233a) {
            case 0:
                final l lVar = this.f8234b;
                final org.telegram.ui.ActionBar.a2 a2Var = this.f8235c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                l.y0(lVar, a2Var, tLObject, tL_error);
                                return;
                            default:
                                l.z0(lVar, a2Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final l lVar2 = this.f8234b;
                final org.telegram.ui.ActionBar.a2 a2Var2 = this.f8235c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                l.y0(lVar2, a2Var2, tLObject, tL_error);
                                return;
                            default:
                                l.z0(lVar2, a2Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
