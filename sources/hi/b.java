package hi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f14546a;
    public final j f14547b;
    public final org.telegram.ui.ActionBar.u1 f14548c;

    public b(j jVar, org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f14546a = i7;
        this.f14547b = jVar;
        this.f14548c = u1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f14546a) {
            case 0:
                final j jVar = this.f14547b;
                final org.telegram.ui.ActionBar.u1 u1Var = this.f14548c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                j.B0(jVar, u1Var, tLObject, tL_error);
                                return;
                            default:
                                j.C0(jVar, u1Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final j jVar2 = this.f14547b;
                final org.telegram.ui.ActionBar.u1 u1Var2 = this.f14548c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                j.B0(jVar2, u1Var2, tLObject, tL_error);
                                return;
                            default:
                                j.C0(jVar2, u1Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
