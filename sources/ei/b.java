package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f8239a;
    public final l f8240b;
    public final org.telegram.ui.ActionBar.c2 f8241c;

    public b(l lVar, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f8239a = i10;
        this.f8240b = lVar;
        this.f8241c = c2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f8239a) {
            case 0:
                final l lVar = this.f8240b;
                final org.telegram.ui.ActionBar.c2 c2Var = this.f8241c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                l.y0(lVar, c2Var, tLObject, tL_error);
                                return;
                            default:
                                l.z0(lVar, c2Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final l lVar2 = this.f8240b;
                final org.telegram.ui.ActionBar.c2 c2Var2 = this.f8241c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                l.y0(lVar2, c2Var2, tLObject, tL_error);
                                return;
                            default:
                                l.z0(lVar2, c2Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
