package ci;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.wp;
public final class d implements Runnable {
    public final int f4942a;
    public final v f4943b;

    public d(v vVar, int i3) {
        this.f4942a = i3;
        this.f4943b = vVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String H;
        int i3 = this.f4942a;
        v vVar = this.f4943b;
        switch (i3) {
            case 0:
                d dVar = vVar.f6156t0;
                int currentTime = vVar.getConnectionsManager().getCurrentTime();
                ai.x xVar = vVar.f6133b0;
                if (vVar.Z <= 0 && vVar.Q <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                xVar.setEnabled(z10);
                if (currentTime < vVar.Q) {
                    vVar.f6133b0.i(bd.M0(2131752968, null), true, true);
                    if (vVar.f6155s0 == null) {
                        vVar.f6155s0 = new SpannableStringBuilder("l");
                        wp wpVar = new wp(2131231976, 0);
                        wpVar.f40044n = 1;
                        vVar.f6155s0.setSpan(wpVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) vVar.f6155s0).append((CharSequence) v.w0(vVar.Q - currentTime));
                    vVar.f6133b0.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.ac acVar = vVar.f6145k0;
                    if (acVar != null) {
                        org.telegram.ui.Components.fb fbVar = acVar.f31788e;
                        if ((fbVar instanceof org.telegram.ui.Components.ib) && fbVar.isAttachedToWindow()) {
                            org.telegram.messenger.k5.r(null, null, 2131752952, new Object[]{v.w0(vVar.Q - currentTime)}, ((org.telegram.ui.Components.ib) vVar.f6145k0.f31788e).f34651b);
                        }
                    }
                    org.telegram.messenger.g0.r(dVar);
                    org.telegram.messenger.g0.i3(dVar, 1000L);
                    return;
                }
                vVar.f6133b0.g(null, true);
                ai.x xVar2 = vVar.f6133b0;
                if (vVar.Y) {
                    H = bd.M0(2131752969, null);
                } else {
                    H = bd.H(' ', "BotStarsButtonWithdrawShort", (int) vVar.Z);
                }
                xVar2.i(wb.Y0(false, H, vVar.f6136d0), true, true);
                return;
            case 1:
                v.b0(vVar);
                return;
            case 2:
                sf.c.t(vVar.getParentActivity(), bd.M0(2131752956, null));
                return;
            case 3:
                v.Z(vVar);
                return;
            case 4:
                sf.c.t(vVar.getParentActivity(), bd.M0(2131753029, null));
                return;
            case 5:
                sf.c.t(vVar.getParentActivity(), bd.M0(2131753049, null));
                return;
            default:
                vVar.f6135c0.setLoading(false);
                return;
        }
    }
}
