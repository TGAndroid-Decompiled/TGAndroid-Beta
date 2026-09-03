package mh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qb;
public final class c implements Runnable {
    public final int f13787a;
    public final p f13788b;

    public c(p pVar, int i10) {
        this.f13787a = i10;
        this.f13788b = pVar;
    }

    @Override
    public final void run() {
        boolean z4;
        String formatPluralStringSpaced;
        int i10 = this.f13787a;
        p pVar = this.f13788b;
        switch (i10) {
            case 0:
                c cVar = pVar.f14569k0;
                int currentTime = pVar.getConnectionsManager().getCurrentTime();
                n nVar = pVar.O;
                if (pVar.M <= 0 && pVar.D <= currentTime) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                nVar.setEnabled(z4);
                if (currentTime < pVar.D) {
                    pVar.O.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (pVar.f14568j0 == null) {
                        pVar.f14568j0 = new SpannableStringBuilder("l");
                        oq oqVar = new oq(R.drawable.mini_switch_lock, 0);
                        oqVar.setTopOffset(1);
                        pVar.f14568j0.setSpan(oqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) pVar.f14568j0).append((CharSequence) p.j0(pVar.D - currentTime));
                    pVar.O.f(spannableStringBuilder, true);
                    ic icVar = pVar.X;
                    if (icVar != null) {
                        nb nbVar = icVar.f27774e;
                        if ((nbVar instanceof qb) && nbVar.isAttachedToWindow()) {
                            org.telegram.ui.b.o(R.string.BotStarsWithdrawalToast, new Object[]{p.j0(pVar.D - currentTime)}, ((qb) pVar.X.f27774e).f30375b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    AndroidUtilities.runOnUIThread(cVar, 1000L);
                    return;
                }
                pVar.O.f(null, true);
                n nVar2 = pVar.O;
                if (pVar.L) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) pVar.M);
                }
                nVar2.g(ja.V0(false, formatPluralStringSpaced, pVar.Q), true, true);
                return;
            case 1:
                p.U(pVar);
                return;
            case 2:
                p.V(pVar);
                return;
            case 3:
                af.g.s(pVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                return;
            case 4:
                af.g.s(pVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                return;
            default:
                pVar.P.setLoading(false);
                return;
        }
    }
}
