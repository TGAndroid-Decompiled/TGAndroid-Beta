package ki;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f18199a;
    public final k f18200b;
    public final org.telegram.ui.ActionBar.t1 f18201c;

    public b(k kVar, org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f18199a = i7;
        this.f18200b = kVar;
        this.f18201c = t1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f18199a) {
            case 0:
                final k kVar = this.f18200b;
                final org.telegram.ui.ActionBar.t1 t1Var = this.f18201c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                k.B0(kVar, t1Var, tLObject, tL_error);
                                return;
                            default:
                                k.C0(kVar, t1Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final k kVar2 = this.f18200b;
                final org.telegram.ui.ActionBar.t1 t1Var2 = this.f18201c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                k.B0(kVar2, t1Var2, tLObject, tL_error);
                                return;
                            default:
                                k.C0(kVar2, t1Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
