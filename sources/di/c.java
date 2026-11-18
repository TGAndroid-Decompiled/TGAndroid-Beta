package di;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.lq;
public final class c implements Runnable {
    public final int f8581a;
    public final t f8582b;

    public c(t tVar, int i7) {
        this.f8581a = i7;
        this.f8582b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String H;
        int i7 = this.f8581a;
        t tVar = this.f8582b;
        switch (i7) {
            case 0:
                c cVar = tVar.f9776t0;
                int currentTime = tVar.getConnectionsManager().getCurrentTime();
                bi.s sVar = tVar.f9753b0;
                if (tVar.Z <= 0 && tVar.Q <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                sVar.setEnabled(z10);
                if (currentTime < tVar.Q) {
                    tVar.f9753b0.i(gd.M0(2131752957, null), true, true);
                    if (tVar.f9775s0 == null) {
                        tVar.f9775s0 = new SpannableStringBuilder("l");
                        lq lqVar = new lq(2131231977, 0);
                        lqVar.f37197n = 1;
                        tVar.f9775s0.setSpan(lqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) tVar.f9775s0).append((CharSequence) t.x0(tVar.Q - currentTime));
                    tVar.f9753b0.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.gc gcVar = tVar.f9765k0;
                    if (gcVar != null) {
                        org.telegram.ui.Components.lb lbVar = gcVar.f35457e;
                        if ((lbVar instanceof org.telegram.ui.Components.ob) && lbVar.isAttachedToWindow()) {
                            org.telegram.messenger.f3.q(null, null, 2131752941, new Object[]{t.x0(tVar.Q - currentTime)}, ((org.telegram.ui.Components.ob) tVar.f9765k0.f35457e).f38055b);
                        }
                    }
                    org.telegram.messenger.g0.r(cVar);
                    org.telegram.messenger.g0.h3(cVar, 1000L);
                    return;
                }
                tVar.f9753b0.g(null, true);
                bi.s sVar2 = tVar.f9753b0;
                if (tVar.Y) {
                    H = gd.M0(2131752958, null);
                } else {
                    H = gd.H(' ', "BotStarsButtonWithdrawShort", (int) tVar.Z);
                }
                sVar2.i(pb.Z0(false, H, tVar.f9756d0), true, true);
                return;
            case 1:
                t.b0(tVar);
                return;
            case 2:
                vf.c.t(tVar.getParentActivity(), gd.M0(2131752945, null));
                return;
            case 3:
                t.Z(tVar);
                return;
            case 4:
                vf.c.t(tVar.getParentActivity(), gd.M0(2131753018, null));
                return;
            case 5:
                vf.c.t(tVar.getParentActivity(), gd.M0(2131753038, null));
                return;
            default:
                tVar.f9755c0.setLoading(false);
                return;
        }
    }
}
