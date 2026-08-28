package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f17703a;
    public final l f17704b;
    public final org.telegram.ui.ActionBar.c2 f17705c;

    public b(l lVar, org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        this.f17703a = i9;
        this.f17704b = lVar;
        this.f17705c = c2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f17703a) {
            case 0:
                final l lVar = this.f17704b;
                final org.telegram.ui.ActionBar.c2 c2Var = this.f17705c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                l.x0(lVar, c2Var, tLObject, tL_error);
                                return;
                            default:
                                l.y0(lVar, c2Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final l lVar2 = this.f17704b;
                final org.telegram.ui.ActionBar.c2 c2Var2 = this.f17705c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                l.x0(lVar2, c2Var2, tLObject, tL_error);
                                return;
                            default:
                                l.y0(lVar2, c2Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
