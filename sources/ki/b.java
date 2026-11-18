package ki;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f18583a;
    public final k f18584b;
    public final org.telegram.ui.ActionBar.u1 f18585c;

    public b(k kVar, org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f18583a = i7;
        this.f18584b = kVar;
        this.f18585c = u1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f18583a) {
            case 0:
                final k kVar = this.f18584b;
                final org.telegram.ui.ActionBar.u1 u1Var = this.f18585c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                k.B0(kVar, u1Var, tLObject, tL_error);
                                return;
                            default:
                                k.C0(kVar, u1Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final k kVar2 = this.f18584b;
                final org.telegram.ui.ActionBar.u1 u1Var2 = this.f18585c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                k.B0(kVar2, u1Var2, tLObject, tL_error);
                                return;
                            default:
                                k.C0(kVar2, u1Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
