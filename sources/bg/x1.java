package bg;

import android.os.CountDownTimer;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.wk0;
public final class x1 extends CountDownTimer {
    public final g2 f1997a;

    public x1(g2 g2Var) {
        super(Long.MAX_VALUE, 1000L);
        this.f1997a = g2Var;
    }

    @Override
    public final void onTick(long j10) {
        g2 g2Var = this.f1997a;
        wk0 wk0Var = g2Var.d;
        ArrayList arrayList = g2Var.U;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
            if (tL_myBoost.cooldown_until_date > 0) {
                arrayList2.add(tL_myBoost);
            }
            if (tL_myBoost.cooldown_until_date * 1000 < System.currentTimeMillis()) {
                tL_myBoost.cooldown_until_date = 0;
            }
        }
        if (!arrayList2.isEmpty()) {
            for (int i10 = 0; i10 < wk0Var.getChildCount(); i10++) {
                View childAt = wk0Var.getChildAt(i10);
                if (childAt instanceof fg.p) {
                    fg.p pVar = (fg.p) childAt;
                    if (arrayList2.contains(pVar.getBoost())) {
                        h5 h5Var = pVar.f4501e;
                        dg.c cVar = pVar.d;
                        int i11 = pVar.E.cooldown_until_date;
                        if (i11 > 0) {
                            pVar.setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, fg.p.f((i11 * 1000) - System.currentTimeMillis())));
                            cVar.setAlpha(0.65f);
                            h5Var.setAlpha(0.65f);
                            pVar.i(0.3f, false);
                        } else {
                            pVar.setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(pVar.E.expires * 1000))));
                            if (cVar.getAlpha() < 1.0f) {
                                cVar.animate().alpha(1.0f).start();
                                h5Var.animate().alpha(1.0f).start();
                                pVar.i(1.0f, true);
                            } else {
                                cVar.setAlpha(1.0f);
                                h5Var.setAlpha(1.0f);
                                pVar.i(1.0f, false);
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
