package lh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.qb;
public final class d implements Runnable {
    public final int f12288a;
    public final q f12289b;

    public d(q qVar, int i10) {
        this.f12288a = i10;
        this.f12289b = qVar;
    }

    @Override
    public final void run() {
        boolean z4;
        String formatPluralStringSpaced;
        int i10 = this.f12288a;
        q qVar = this.f12289b;
        switch (i10) {
            case 0:
                d dVar = qVar.f12959k0;
                int currentTime = qVar.getConnectionsManager().getCurrentTime();
                o oVar = qVar.O;
                if (qVar.M <= 0 && qVar.D <= currentTime) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                oVar.setEnabled(z4);
                if (currentTime < qVar.D) {
                    qVar.O.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (qVar.f12958j0 == null) {
                        qVar.f12958j0 = new SpannableStringBuilder("l");
                        mq mqVar = new mq(R.drawable.mini_switch_lock, 0);
                        mqVar.setTopOffset(1);
                        qVar.f12958j0.setSpan(mqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) qVar.f12958j0).append((CharSequence) q.j0(qVar.D - currentTime));
                    qVar.O.f(spannableStringBuilder, true);
                    ic icVar = qVar.X;
                    if (icVar != null) {
                        nb nbVar = icVar.e;
                        if ((nbVar instanceof qb) && nbVar.isAttachedToWindow()) {
                            org.telegram.ui.b.o(R.string.BotStarsWithdrawalToast, new Object[]{q.j0(qVar.D - currentTime)}, ((qb) qVar.X.e).f28100b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 1000L);
                    return;
                }
                qVar.O.f(null, true);
                o oVar2 = qVar.O;
                if (qVar.L) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) qVar.M);
                }
                oVar2.g(ja.V0(false, formatPluralStringSpaced, qVar.Q), true, true);
                return;
            case 1:
                q.U(qVar);
                return;
            case 2:
                q.V(qVar);
                return;
            case 3:
                af.g.s(qVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                return;
            case 4:
                af.g.s(qVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                return;
            default:
                qVar.P.setLoading(false);
                return;
        }
    }
}
