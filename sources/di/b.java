package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f6527a;
    public final m f6528b;
    public final org.telegram.ui.ActionBar.d2 f6529c;

    public b(m mVar, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f6527a = i10;
        this.f6528b = mVar;
        this.f6529c = d2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f6527a) {
            case 0:
                final m mVar = this.f6528b;
                final org.telegram.ui.ActionBar.d2 d2Var = this.f6529c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                m.y0(mVar, d2Var, tLObject, tL_error);
                                return;
                            default:
                                m.z0(mVar, d2Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final m mVar2 = this.f6528b;
                final org.telegram.ui.ActionBar.d2 d2Var2 = this.f6529c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                m.y0(mVar2, d2Var2, tLObject, tL_error);
                                return;
                            default:
                                m.z0(mVar2, d2Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
