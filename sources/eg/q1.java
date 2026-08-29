package eg;

import android.os.CountDownTimer;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.jl0;
public final class q1 extends CountDownTimer {
    public final x1 f6119a;

    public q1(x1 x1Var) {
        super(Long.MAX_VALUE, 1000L);
        this.f6119a = x1Var;
    }

    @Override
    public final void onTick(long j10) {
        x1 x1Var = this.f6119a;
        jl0 jl0Var = x1Var.d;
        ArrayList arrayList = x1Var.U;
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
            for (int i11 = 0; i11 < jl0Var.getChildCount(); i11++) {
                View childAt = jl0Var.getChildAt(i11);
                if (childAt instanceof ig.n) {
                    ig.n nVar = (ig.n) childAt;
                    if (arrayList2.contains(nVar.getBoost())) {
                        h5 h5Var = nVar.f7291e;
                        gg.c cVar = nVar.d;
                        int i12 = nVar.E.cooldown_until_date;
                        if (i12 > 0) {
                            nVar.setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, ig.n.f((i12 * 1000) - System.currentTimeMillis())));
                            cVar.setAlpha(0.65f);
                            h5Var.setAlpha(0.65f);
                            nVar.i(0.3f, false);
                        } else {
                            nVar.setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(nVar.E.expires * 1000))));
                            if (cVar.getAlpha() < 1.0f) {
                                cVar.animate().alpha(1.0f).start();
                                h5Var.animate().alpha(1.0f).start();
                                nVar.i(1.0f, true);
                            } else {
                                cVar.setAlpha(1.0f);
                                h5Var.setAlpha(1.0f);
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
