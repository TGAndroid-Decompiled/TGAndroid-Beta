package ai;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.tl;
import org.telegram.ui.Components.vq;
public final class d implements Runnable {
    public final int f1115a;
    public final x f1116b;

    public d(x xVar, int i10) {
        this.f1115a = i10;
        this.f1116b = xVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f1115a;
        x xVar = this.f1116b;
        switch (i10) {
            case 0:
                d dVar = xVar.f2417n0;
                int currentTime = xVar.getConnectionsManager().getCurrentTime();
                v vVar = xVar.R;
                if (xVar.P <= 0 && xVar.G <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                vVar.setEnabled(z10);
                if (currentTime < xVar.G) {
                    xVar.R.i(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (xVar.m0 == null) {
                        xVar.m0 = new SpannableStringBuilder("l");
                        vq vqVar = new vq(R.drawable.mini_switch_lock, 0);
                        vqVar.setTopOffset(1);
                        xVar.m0.setSpan(vqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) xVar.m0).append((CharSequence) x.j0(xVar.G - currentTime));
                    xVar.R.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.oc ocVar = xVar.f2401a0;
                    if (ocVar != null) {
                        org.telegram.ui.Components.sb sbVar = ocVar.e;
                        if ((sbVar instanceof org.telegram.ui.Components.wb) && sbVar.isAttachedToWindow()) {
                            tl.r(R.string.BotStarsWithdrawalToast, new Object[]{x.j0(xVar.G - currentTime)}, ((org.telegram.ui.Components.wb) xVar.f2401a0.e).f32176b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 1000L);
                    return;
                }
                xVar.R.g(null, true);
                v vVar2 = xVar.R;
                if (xVar.O) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) xVar.P);
                }
                vVar2.i(nd.W0(false, formatPluralStringSpaced, xVar.T), true, true);
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
