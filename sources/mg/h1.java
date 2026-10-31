package mg;

import android.os.CountDownTimer;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.cd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.tk0;
public final class h1 extends CountDownTimer {
    public final o1 f13128a;

    public h1(o1 o1Var) {
        super(Long.MAX_VALUE, 1000L);
        this.f13128a = o1Var;
    }

    @Override
    public final void onTick(long j10) {
        o1 o1Var = this.f13128a;
        tk0 tk0Var = o1Var.f26666k1;
        ArrayList arrayList = o1Var.Q1;
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
            for (int i11 = 0; i11 < tk0Var.getChildCount(); i11++) {
                View childAt = tk0Var.getChildAt(i11);
                if (childAt instanceof qg.k) {
                    qg.k kVar = (qg.k) childAt;
                    if (arrayList2.contains(kVar.getBoost())) {
                        u5 u5Var = kVar.e;
                        og.c cVar = kVar.d;
                        int i12 = kVar.J.cooldown_until_date;
                        if (i12 > 0) {
                            kVar.setSubtitle(cd.a0(null, null, 2131753594, qg.k.f((i12 * 1000) - System.currentTimeMillis())));
                            cVar.setAlpha(0.65f);
                            u5Var.setAlpha(0.65f);
                            kVar.i(false, 0.3f);
                        } else {
                            kVar.setSubtitle(cd.a0(null, null, 2131753661, cd.D0().n0().format(new Date(kVar.J.expires * 1000))));
                            if (cVar.getAlpha() < 1.0f) {
                                cVar.animate().alpha(1.0f).start();
                                u5Var.animate().alpha(1.0f).start();
                                kVar.i(true, 1.0f);
                            } else {
                                cVar.setAlpha(1.0f);
                                u5Var.setAlpha(1.0f);
                                kVar.i(false, 1.0f);
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
