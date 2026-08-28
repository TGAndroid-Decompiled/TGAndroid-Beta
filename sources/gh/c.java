package gh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ob;
public final class c implements Runnable {
    public final int f7890a;
    public final r f7891b;

    public c(r rVar, int i9) {
        this.f7890a = i9;
        this.f7891b = rVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i9 = this.f7890a;
        r rVar = this.f7891b;
        switch (i9) {
            case 0:
                c cVar = rVar.f8781j0;
                int currentTime = rVar.getConnectionsManager().getCurrentTime();
                p pVar = rVar.N;
                if (rVar.L <= 0 && rVar.C <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                pVar.setEnabled(z10);
                if (currentTime < rVar.C) {
                    rVar.N.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (rVar.f8780i0 == null) {
                        rVar.f8780i0 = new SpannableStringBuilder("l");
                        eq eqVar = new eq(R.drawable.mini_switch_lock, 0);
                        eqVar.setTopOffset(1);
                        rVar.f8780i0.setSpan(eqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) rVar.f8780i0).append((CharSequence) r.i0(rVar.C - currentTime));
                    rVar.N.f(spannableStringBuilder, true);
                    gc gcVar = rVar.W;
                    if (gcVar != null) {
                        org.telegram.ui.Components.lb lbVar = gcVar.f28733e;
                        if ((lbVar instanceof ob) && lbVar.isAttachedToWindow()) {
                            ll.q(R.string.BotStarsWithdrawalToast, new Object[]{r.i0(rVar.C - currentTime)}, ((ob) rVar.W.f28733e).f31343b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    AndroidUtilities.runOnUIThread(cVar, 1000L);
                    return;
                }
                rVar.N.f(null, true);
                p pVar2 = rVar.N;
                if (rVar.K) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) rVar.L);
                }
                pVar2.g(oa.V0(false, formatPluralStringSpaced, rVar.P), true, true);
                return;
            case 1:
                r.T(rVar);
                return;
            case 2:
                r.U(rVar);
                return;
            case 3:
                ve.e.s(rVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                return;
            case 4:
                ve.e.s(rVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                return;
            default:
                rVar.O.setLoading(false);
                return;
        }
    }
}
