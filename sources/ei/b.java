package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f8918a;
    public final m f8919b;
    public final org.telegram.ui.ActionBar.b2 f8920c;

    public b(m mVar, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f8918a = i10;
        this.f8919b = mVar;
        this.f8920c = b2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f8918a) {
            case 0:
                final m mVar = this.f8919b;
                final org.telegram.ui.ActionBar.b2 b2Var = this.f8920c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                m.D0(mVar, b2Var, tLObject, tL_error);
                                return;
                            default:
                                m.E0(mVar, b2Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final m mVar2 = this.f8919b;
                final org.telegram.ui.ActionBar.b2 b2Var2 = this.f8920c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                m.D0(mVar2, b2Var2, tLObject, tL_error);
                                return;
                            default:
                                m.E0(mVar2, b2Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
