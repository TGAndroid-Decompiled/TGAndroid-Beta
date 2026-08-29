package jh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.ub;
public final class c implements Runnable {
    public final int f11843a;
    public final q f11844b;

    public c(q qVar, int i10) {
        this.f11843a = i10;
        this.f11844b = qVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f11843a;
        q qVar = this.f11844b;
        switch (i10) {
            case 0:
                c cVar = qVar.f12645j0;
                int currentTime = qVar.getConnectionsManager().getCurrentTime();
                n nVar = qVar.N;
                if (qVar.L <= 0 && qVar.C <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                nVar.setEnabled(z10);
                if (currentTime < qVar.C) {
                    qVar.N.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (qVar.f12644i0 == null) {
                        qVar.f12644i0 = new SpannableStringBuilder("l");
                        iq iqVar = new iq(R.drawable.mini_switch_lock, 0);
                        iqVar.setTopOffset(1);
                        qVar.f12644i0.setSpan(iqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) qVar.f12644i0).append((CharSequence) q.j0(qVar.C - currentTime));
                    qVar.N.f(spannableStringBuilder, true);
                    mc mcVar = qVar.W;
                    if (mcVar != null) {
                        rb rbVar = mcVar.f30648e;
                        if ((rbVar instanceof ub) && rbVar.isAttachedToWindow()) {
                            org.telegram.ui.b.p(R.string.BotStarsWithdrawalToast, new Object[]{q.j0(qVar.C - currentTime)}, ((ub) qVar.W.f30648e).f33185b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    AndroidUtilities.runOnUIThread(cVar, 1000L);
                    return;
                }
                qVar.N.f(null, true);
                n nVar2 = qVar.N;
                if (qVar.K) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) qVar.L);
                }
                nVar2.g(ia.V0(false, formatPluralStringSpaced, qVar.P), true, true);
                return;
            case 1:
                q.U(qVar);
                return;
            case 2:
                q.V(qVar);
                return;
            case 3:
                ye.d.s(qVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                return;
            case 4:
                ye.d.s(qVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                return;
            default:
                qVar.O.setLoading(false);
                return;
        }
    }
}
