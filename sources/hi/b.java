package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f12867a;
    public final k f12868b;
    public final org.telegram.ui.ActionBar.e2 f12869c;

    public b(k kVar, org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.f12867a = i10;
        this.f12868b = kVar;
        this.f12869c = e2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f12867a) {
            case 0:
                final k kVar = this.f12868b;
                final org.telegram.ui.ActionBar.e2 e2Var = this.f12869c;
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
                final k kVar2 = this.f12868b;
                final org.telegram.ui.ActionBar.e2 e2Var2 = this.f12869c;
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
