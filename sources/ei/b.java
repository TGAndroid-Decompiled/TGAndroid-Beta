package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f8238a;
    public final l f8239b;
    public final org.telegram.ui.ActionBar.b2 f8240c;

    public b(l lVar, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f8238a = i10;
        this.f8239b = lVar;
        this.f8240c = b2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f8238a) {
            case 0:
                final l lVar = this.f8239b;
                final org.telegram.ui.ActionBar.b2 b2Var = this.f8240c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                l.y0(lVar, b2Var, tLObject, tL_error);
                                return;
                            default:
                                l.z0(lVar, b2Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final l lVar2 = this.f8239b;
                final org.telegram.ui.ActionBar.b2 b2Var2 = this.f8240c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                l.y0(lVar2, b2Var2, tLObject, tL_error);
                                return;
                            default:
                                l.z0(lVar2, b2Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
