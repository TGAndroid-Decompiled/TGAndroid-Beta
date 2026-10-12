package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f9168a;
    public final l f9169b;
    public final org.telegram.ui.ActionBar.a2 f9170c;

    public b(l lVar, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f9168a = i10;
        this.f9169b = lVar;
        this.f9170c = a2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f9168a) {
            case 0:
                final l lVar = this.f9169b;
                final org.telegram.ui.ActionBar.a2 a2Var = this.f9170c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                l.z0(lVar, a2Var, tLObject, tL_error);
                                return;
                            default:
                                l.A0(lVar, a2Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final l lVar2 = this.f9169b;
                final org.telegram.ui.ActionBar.a2 a2Var2 = this.f9170c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                l.z0(lVar2, a2Var2, tLObject, tL_error);
                                return;
                            default:
                                l.A0(lVar2, a2Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
