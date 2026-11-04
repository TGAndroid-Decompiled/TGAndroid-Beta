package ii;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f14832a;
    public final k f14833b;
    public final org.telegram.ui.ActionBar.s1 f14834c;

    public b(k kVar, org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        this.f14832a = i3;
        this.f14833b = kVar;
        this.f14834c = s1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f14832a) {
            case 0:
                final k kVar = this.f14833b;
                final org.telegram.ui.ActionBar.s1 s1Var = this.f14834c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                k.B0(kVar, s1Var, tLObject, tL_error);
                                return;
                            default:
                                k.C0(kVar, s1Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final k kVar2 = this.f14833b;
                final org.telegram.ui.ActionBar.s1 s1Var2 = this.f14834c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                k.B0(kVar2, s1Var2, tLObject, tL_error);
                                return;
                            default:
                                k.C0(kVar2, s1Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
