package bi;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.zq;
public final class d implements Runnable {
    public final int f4474a;
    public final y f4475b;

    public d(y yVar, int i10) {
        this.f4474a = i10;
        this.f4475b = yVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f4474a;
        y yVar = this.f4475b;
        switch (i10) {
            case 0:
                d dVar = yVar.f5738s0;
                int currentTime = yVar.getConnectionsManager().getCurrentTime();
                v vVar = yVar.f5715a0;
                if (yVar.Y <= 0 && yVar.P <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                vVar.setEnabled(z10);
                if (currentTime < yVar.P) {
                    yVar.f5715a0.i(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (yVar.f5736r0 == null) {
                        yVar.f5736r0 = new SpannableStringBuilder("l");
                        zq zqVar = new zq(R.drawable.mini_switch_lock, 0);
                        zqVar.setTopOffset(1);
                        yVar.f5736r0.setSpan(zqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) yVar.f5736r0).append((CharSequence) y.s0(yVar.P - currentTime));
                    yVar.f5715a0.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.qc qcVar = yVar.f5727j0;
                    if (qcVar != null) {
                        org.telegram.ui.Components.ub ubVar = qcVar.e;
                        if ((ubVar instanceof org.telegram.ui.Components.yb) && ubVar.isAttachedToWindow()) {
                            vh.o(R.string.BotStarsWithdrawalToast, new Object[]{y.s0(yVar.P - currentTime)}, ((org.telegram.ui.Components.yb) yVar.f5727j0.e).f34998b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 1000L);
                    return;
                }
                yVar.f5715a0.g(null, true);
                v vVar2 = yVar.f5715a0;
                if (yVar.X) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) yVar.Y);
                }
                vVar2.i(dd.U0(false, formatPluralStringSpaced, yVar.f5719c0), true, true);
                return;
            case 1:
                y.X(yVar);
                return;
            case 2:
                qf.d.r(yVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                return;
            case 3:
                y.V(yVar);
                return;
            case 4:
                qf.d.r(yVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                return;
            default:
                yVar.f5717b0.setLoading(false);
                return;
        }
    }
}
