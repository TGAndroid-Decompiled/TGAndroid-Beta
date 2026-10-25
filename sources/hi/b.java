package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f12868a;
    public final k f12869b;
    public final org.telegram.ui.ActionBar.e2 f12870c;

    public b(k kVar, org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.f12868a = i10;
        this.f12869b = kVar;
        this.f12870c = e2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f12868a) {
            case 0:
                final k kVar = this.f12869b;
                final org.telegram.ui.ActionBar.e2 e2Var = this.f12870c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                k.x0(kVar, e2Var, tLObject, tL_error);
                                return;
                            default:
                                k.y0(kVar, e2Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final k kVar2 = this.f12869b;
                final org.telegram.ui.ActionBar.e2 e2Var2 = this.f12870c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                k.x0(kVar2, e2Var2, tLObject, tL_error);
                                return;
                            default:
                                k.y0(kVar2, e2Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
