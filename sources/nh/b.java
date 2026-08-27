package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class b implements RequestDelegate {

    public final int f18554a;

    public final k f18555b;

    public final org.telegram.ui.ActionBar.b2 f18556c;

    public b(k kVar, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f18554a = i10;
        this.f18555b = kVar;
        this.f18556c = b2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f18554a) {
            case 0:
                final int i10 = 1;
                final k kVar = this.f18555b;
                final org.telegram.ui.ActionBar.b2 b2Var = this.f18556c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k.y0(kVar, b2Var, tLObject, tL_error);
                                break;
                            default:
                                k.z0(kVar, b2Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final k kVar2 = this.f18555b;
                final org.telegram.ui.ActionBar.b2 b2Var2 = this.f18556c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                k.y0(kVar2, b2Var2, tLObject, tL_error);
                                break;
                            default:
                                k.z0(kVar2, b2Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
