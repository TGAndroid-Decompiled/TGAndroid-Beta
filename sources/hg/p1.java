package hg;

import android.os.CountDownTimer;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.sl0;
public final class p1 extends CountDownTimer {
    public final w1 f7588a;

    public p1(w1 w1Var) {
        super(Long.MAX_VALUE, 1000L);
        this.f7588a = w1Var;
    }

    @Override
    public final void onTick(long j10) {
        w1 w1Var = this.f7588a;
        sl0 sl0Var = w1Var.d;
        ArrayList arrayList = w1Var.V;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
            if (tL_myBoost.cooldown_until_date > 0) {
                arrayList2.add(tL_myBoost);
            }
            if (tL_myBoost.cooldown_until_date * 1000 < System.currentTimeMillis()) {
                tL_myBoost.cooldown_until_date = 0;
            }
        }
        if (!arrayList2.isEmpty()) {
            for (int i11 = 0; i11 < sl0Var.getChildCount(); i11++) {
                View childAt = sl0Var.getChildAt(i11);
                if (childAt instanceof lg.n) {
                    lg.n nVar = (lg.n) childAt;
                    if (arrayList2.contains(nVar.getBoost())) {
                        l5 l5Var = nVar.f10021e;
                        jg.c cVar = nVar.d;
                        int i12 = nVar.F.cooldown_until_date;
                        if (i12 > 0) {
                            nVar.setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, lg.n.f((i12 * 1000) - System.currentTimeMillis())));
                            cVar.setAlpha(0.65f);
                            l5Var.setAlpha(0.65f);
                            nVar.i(0.3f, false);
                        } else {
                            nVar.setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(nVar.F.expires * 1000))));
                            if (cVar.getAlpha() < 1.0f) {
                                cVar.animate().alpha(1.0f).start();
                                l5Var.animate().alpha(1.0f).start();
                                nVar.i(1.0f, true);
                            } else {
                                cVar.setAlpha(1.0f);
                                l5Var.setAlpha(1.0f);
                                nVar.i(1.0f, false);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onFinish() {
    }
}
