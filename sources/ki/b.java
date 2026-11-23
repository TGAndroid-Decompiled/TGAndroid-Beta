package ki;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f18607a;
    public final j f18608b;
    public final org.telegram.ui.ActionBar.t1 f18609c;

    public b(j jVar, org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f18607a = i7;
        this.f18608b = jVar;
        this.f18609c = t1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f18607a) {
            case 0:
                final j jVar = this.f18608b;
                final org.telegram.ui.ActionBar.t1 t1Var = this.f18609c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                j.B0(jVar, t1Var, tLObject, tL_error);
                                return;
                            default:
                                j.C0(jVar, t1Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final j jVar2 = this.f18608b;
                final org.telegram.ui.ActionBar.t1 t1Var2 = this.f18609c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                j.B0(jVar2, t1Var2, tLObject, tL_error);
                                return;
                            default:
                                j.C0(jVar2, t1Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
