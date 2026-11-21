package di;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.nq;
public final class c implements Runnable {
    public final int f8603a;
    public final t f8604b;

    public c(t tVar, int i7) {
        this.f8603a = i7;
        this.f8604b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String H;
        int i7 = this.f8603a;
        t tVar = this.f8604b;
        switch (i7) {
            case 0:
                c cVar = tVar.f9792t0;
                int currentTime = tVar.getConnectionsManager().getCurrentTime();
                bi.s sVar = tVar.f9769b0;
                if (tVar.Z <= 0 && tVar.Q <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                sVar.setEnabled(z10);
                if (currentTime < tVar.Q) {
                    tVar.f9769b0.i(gd.N0(2131752956, null), true, true);
                    if (tVar.f9791s0 == null) {
                        tVar.f9791s0 = new SpannableStringBuilder("l");
                        nq nqVar = new nq(2131231977, 0);
                        nqVar.f37945n = 1;
                        tVar.f9791s0.setSpan(nqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) tVar.f9791s0).append((CharSequence) t.x0(tVar.Q - currentTime));
                    tVar.f9769b0.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.gc gcVar = tVar.f9781k0;
                    if (gcVar != null) {
                        org.telegram.ui.Components.lb lbVar = gcVar.f35504e;
                        if ((lbVar instanceof org.telegram.ui.Components.ob) && lbVar.isAttachedToWindow()) {
                            org.telegram.messenger.f3.q(null, null, 2131752940, new Object[]{t.x0(tVar.Q - currentTime)}, ((org.telegram.ui.Components.ob) tVar.f9781k0.f35504e).f38164b);
                        }
                    }
                    org.telegram.messenger.g0.r(cVar);
                    org.telegram.messenger.g0.h3(cVar, 1000L);
                    return;
                }
                tVar.f9769b0.g(null, true);
                bi.s sVar2 = tVar.f9769b0;
                if (tVar.Y) {
                    H = gd.N0(2131752957, null);
                } else {
                    H = gd.H(' ', "BotStarsButtonWithdrawShort", (int) tVar.Z);
                }
                sVar2.i(pb.Z0(false, H, tVar.f9772d0), true, true);
                return;
            case 1:
                t.b0(tVar);
                return;
            case 2:
                vf.c.t(tVar.getParentActivity(), gd.N0(2131752944, null));
                return;
            case 3:
                t.Z(tVar);
                return;
            case 4:
                vf.c.t(tVar.getParentActivity(), gd.N0(2131753017, null));
                return;
            case 5:
                vf.c.t(tVar.getParentActivity(), gd.N0(2131753037, null));
                return;
            default:
                tVar.f9771c0.setLoading(false);
                return;
        }
    }
}
