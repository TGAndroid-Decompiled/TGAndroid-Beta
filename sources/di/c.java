package di;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.eq;
public final class c implements Runnable {
    public final int f8279a;
    public final t f8280b;

    public c(t tVar, int i7) {
        this.f8279a = i7;
        this.f8280b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String H;
        int i7 = this.f8279a;
        t tVar = this.f8280b;
        switch (i7) {
            case 0:
                c cVar = tVar.f9437t0;
                int currentTime = tVar.getConnectionsManager().getCurrentTime();
                bi.s sVar = tVar.f9414b0;
                if (tVar.Z <= 0 && tVar.Q <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                sVar.setEnabled(z10);
                if (currentTime < tVar.Q) {
                    tVar.f9414b0.i(hd.M0(2131752968, null), true, true);
                    if (tVar.f9436s0 == null) {
                        tVar.f9436s0 = new SpannableStringBuilder("l");
                        eq eqVar = new eq(2131231976, 0);
                        eqVar.f34414n = 1;
                        tVar.f9436s0.setSpan(eqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) tVar.f9436s0).append((CharSequence) t.w0(tVar.Q - currentTime));
                    tVar.f9414b0.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.xb xbVar = tVar.f9426k0;
                    if (xbVar != null) {
                        org.telegram.ui.Components.cb cbVar = xbVar.f41639e;
                        if ((cbVar instanceof org.telegram.ui.Components.fb) && cbVar.isAttachedToWindow()) {
                            org.telegram.messenger.k5.q(null, null, 2131752952, new Object[]{t.w0(tVar.Q - currentTime)}, ((org.telegram.ui.Components.fb) tVar.f9426k0.f41639e).f34552b);
                        }
                    }
                    org.telegram.messenger.g0.r(cVar);
                    org.telegram.messenger.g0.i3(cVar, 1000L);
                    return;
                }
                tVar.f9414b0.g(null, true);
                bi.s sVar2 = tVar.f9414b0;
                if (tVar.Y) {
                    H = hd.M0(2131752969, null);
                } else {
                    H = hd.H(' ', "BotStarsButtonWithdrawShort", (int) tVar.Z);
                }
                sVar2.i(mb.Y0(false, H, tVar.f9417d0), true, true);
                return;
            case 1:
                t.b0(tVar);
                return;
            case 2:
                vf.c.t(tVar.getParentActivity(), hd.M0(2131752956, null));
                return;
            case 3:
                t.Z(tVar);
                return;
            case 4:
                vf.c.t(tVar.getParentActivity(), hd.M0(2131753029, null));
                return;
            case 5:
                vf.c.t(tVar.getParentActivity(), hd.M0(2131753049, null));
                return;
            default:
                tVar.f9416c0.setLoading(false);
                return;
        }
    }
}
