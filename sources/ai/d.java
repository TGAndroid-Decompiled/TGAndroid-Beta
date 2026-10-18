package ai;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.lk;
import org.telegram.ui.Components.yq;
public final class d implements Runnable {
    public final int f1119a;
    public final x f1120b;

    public d(x xVar, int i10) {
        this.f1119a = i10;
        this.f1120b = xVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f1119a;
        x xVar = this.f1120b;
        switch (i10) {
            case 0:
                d dVar = xVar.f2412n0;
                int currentTime = xVar.getConnectionsManager().getCurrentTime();
                v vVar = xVar.R;
                if (xVar.P <= 0 && xVar.G <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                vVar.setEnabled(z10);
                if (currentTime < xVar.G) {
                    xVar.R.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (xVar.m0 == null) {
                        xVar.m0 = new SpannableStringBuilder("l");
                        yq yqVar = new yq(R.drawable.mini_switch_lock, 0);
                        yqVar.setTopOffset(1);
                        xVar.m0.setSpan(yqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) xVar.m0).append((CharSequence) x.j0(xVar.G - currentTime));
                    xVar.R.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.qc qcVar = xVar.f2396a0;
                    if (qcVar != null) {
                        org.telegram.ui.Components.ub ubVar = qcVar.e;
                        if ((ubVar instanceof org.telegram.ui.Components.yb) && ubVar.isAttachedToWindow()) {
                            lk.r(R.string.BotStarsWithdrawalToast, new Object[]{x.j0(xVar.G - currentTime)}, ((org.telegram.ui.Components.yb) xVar.f2396a0.e).f32599b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 1000L);
                    return;
                }
                xVar.R.f(null, true);
                v vVar2 = xVar.R;
                if (xVar.O) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) xVar.P);
                }
                vVar2.g(md.W0(false, formatPluralStringSpaced, xVar.T), true, true);
                return;
            case 1:
                x.U(xVar);
                return;
            case 2:
                x.V(xVar);
                return;
            case 3:
                pf.d.r(xVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                return;
            case 4:
                pf.d.r(xVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                return;
            default:
                xVar.S.setLoading(false);
                return;
        }
    }
}
