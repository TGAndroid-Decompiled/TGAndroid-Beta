package gg;

import android.os.CountDownTimer;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.rl0;
public final class p1 extends CountDownTimer {
    public final w1 f6722a;

    public p1(w1 w1Var) {
        super(Long.MAX_VALUE, 1000L);
        this.f6722a = w1Var;
    }

    @Override
    public final void onTick(long j10) {
        w1 w1Var = this.f6722a;
        rl0 rl0Var = w1Var.d;
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
            for (int i11 = 0; i11 < rl0Var.getChildCount(); i11++) {
                View childAt = rl0Var.getChildAt(i11);
                if (childAt instanceof kg.n) {
                    kg.n nVar = (kg.n) childAt;
                    if (arrayList2.contains(nVar.getBoost())) {
                        k5 k5Var = nVar.e;
                        ig.c cVar = nVar.d;
                        int i12 = nVar.F.cooldown_until_date;
                        if (i12 > 0) {
                            nVar.setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, kg.n.f((i12 * 1000) - System.currentTimeMillis())));
                            cVar.setAlpha(0.65f);
                            k5Var.setAlpha(0.65f);
                            nVar.i(0.3f, false);
                        } else {
                            nVar.setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(nVar.F.expires * 1000))));
                            if (cVar.getAlpha() < 1.0f) {
                                cVar.animate().alpha(1.0f).start();
                                k5Var.animate().alpha(1.0f).start();
                                nVar.i(1.0f, true);
                            } else {
                                cVar.setAlpha(1.0f);
                                k5Var.setAlpha(1.0f);
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
