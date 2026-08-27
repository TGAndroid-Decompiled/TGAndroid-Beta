package cg;

import android.os.CountDownTimer;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.zk0;

public final class r1 extends CountDownTimer {

    public final z1 f2811a;

    public r1(z1 z1Var) {
        super(Long.MAX_VALUE, 1000L);
        this.f2811a = z1Var;
    }

    @Override
    public final void onTick(long j10) {
        z1 z1Var = this.f2811a;
        zk0 zk0Var = z1Var.d;
        ArrayList arrayList = z1Var.U;
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
            if (((long) tL_myBoost.cooldown_until_date) * 1000 < System.currentTimeMillis()) {
                tL_myBoost.cooldown_until_date = 0;
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < zk0Var.getChildCount(); i11++) {
            View childAt = zk0Var.getChildAt(i11);
            if (childAt instanceof gg.o) {
                gg.o oVar = (gg.o) childAt;
                if (arrayList2.contains(oVar.getBoost())) {
                    h5 h5Var = oVar.f5395e;
                    eg.c cVar = oVar.d;
                    int i12 = oVar.E.cooldown_until_date;
                    if (i12 > 0) {
                        oVar.setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, gg.o.f((((long) i12) * 1000) - System.currentTimeMillis())));
                        cVar.setAlpha(0.65f);
                        h5Var.setAlpha(0.65f);
                        oVar.i(0.3f, false);
                    } else {
                        oVar.setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(((long) oVar.E.expires) * 1000))));
                        if (cVar.getAlpha() < 1.0f) {
                            cVar.animate().alpha(1.0f).start();
                            h5Var.animate().alpha(1.0f).start();
                            oVar.i(1.0f, true);
                        } else {
                            cVar.setAlpha(1.0f);
                            h5Var.setAlpha(1.0f);
                            oVar.i(1.0f, false);
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
