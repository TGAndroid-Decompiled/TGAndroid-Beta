package bi;

import android.text.SpannableStringBuilder;
import org.telegram.ui.Components.wp;
public final class d implements Runnable {
    public final int f3630a;
    public final z f3631b;

    public d(z zVar, int i7) {
        this.f3630a = i7;
        this.f3631b = zVar;
    }

    @Override
    public final void run() {
        boolean z9;
        String H;
        int i7 = this.f3630a;
        z zVar = this.f3631b;
        switch (i7) {
            case 0:
                d dVar = zVar.f5133s0;
                int currentTime = zVar.getConnectionsManager().getCurrentTime();
                w wVar = zVar.f5109a0;
                if (zVar.Y <= 0 && zVar.P <= currentTime) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                wVar.setEnabled(z9);
                if (currentTime < zVar.P) {
                    zVar.f5109a0.i(org.telegram.messenger.hd.M0(2131752968, null), true, true);
                    if (zVar.f5131r0 == null) {
                        zVar.f5131r0 = new SpannableStringBuilder("l");
                        wp wpVar = new wp(2131231976, 0);
                        wpVar.f40061n = 1;
                        zVar.f5131r0.setSpan(wpVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) zVar.f5131r0).append((CharSequence) z.w0(zVar.P - currentTime));
                    zVar.f5109a0.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.cc ccVar = zVar.f5122j0;
                    if (ccVar != null) {
                        org.telegram.ui.Components.gb gbVar = ccVar.f32523e;
                        if ((gbVar instanceof org.telegram.ui.Components.kb) && gbVar.isAttachedToWindow()) {
                            org.telegram.messenger.k5.r(null, null, 2131752952, new Object[]{z.w0(zVar.P - currentTime)}, ((org.telegram.ui.Components.kb) zVar.f5122j0.f32523e).f35252b);
                        }
                    }
                    org.telegram.messenger.g0.r(dVar);
                    org.telegram.messenger.g0.i3(dVar, 1000L);
                    return;
                }
                zVar.f5109a0.g(null, true);
                w wVar2 = zVar.f5109a0;
                if (zVar.X) {
                    H = org.telegram.messenger.hd.M0(2131752969, null);
                } else {
                    H = org.telegram.messenger.hd.H(' ', "BotStarsButtonWithdrawShort", (int) zVar.Y);
                }
                wVar2.i(dd.Y0(false, H, zVar.f5113c0), true, true);
                return;
            case 1:
                z.b0(zVar);
                return;
            case 2:
                vf.c.t(zVar.getParentActivity(), org.telegram.messenger.hd.M0(2131752956, null));
                return;
            case 3:
                z.Z(zVar);
                return;
            case 4:
                vf.c.t(zVar.getParentActivity(), org.telegram.messenger.hd.M0(2131753029, null));
                return;
            case 5:
                vf.c.t(zVar.getParentActivity(), org.telegram.messenger.hd.M0(2131753049, null));
                return;
            default:
                zVar.f5111b0.setLoading(false);
                return;
        }
    }
}
