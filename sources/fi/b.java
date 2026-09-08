package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f9578a;
    public final m f9579b;
    public final org.telegram.ui.ActionBar.b2 f9580c;

    public b(m mVar, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f9578a = i10;
        this.f9579b = mVar;
        this.f9580c = b2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f9578a) {
            case 0:
                final m mVar = this.f9579b;
                final org.telegram.ui.ActionBar.b2 b2Var = this.f9580c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                m.y0(mVar, b2Var, tLObject, tL_error);
                                return;
                            default:
                                m.z0(mVar, b2Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final m mVar2 = this.f9579b;
                final org.telegram.ui.ActionBar.b2 b2Var2 = this.f9580c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                m.y0(mVar2, b2Var2, tLObject, tL_error);
                                return;
                            default:
                                m.z0(mVar2, b2Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
