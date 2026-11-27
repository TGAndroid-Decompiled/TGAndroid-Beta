package defpackage;

import android.os.CountDownTimer;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.tgnet.tl.TL_stories;
public final class e59 extends CountDownTimer {
    public final j59 a;

    public e59(j59 j59Var) {
        super(Long.MAX_VALUE, 1000L);
        this.a = j59Var;
    }

    @Override
    public final void onTick(long j) {
        j59 j59Var = this.a;
        d79 d79Var = j59Var.n1;
        ArrayList arrayList = j59Var.T1;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
            if (tL_myBoost.cooldown_until_date > 0) {
                arrayList2.add(tL_myBoost);
            }
            if (tL_myBoost.cooldown_until_date * 1000 < System.currentTimeMillis()) {
                tL_myBoost.cooldown_until_date = 0;
            }
        }
        if (!arrayList2.isEmpty()) {
            for (int i2 = 0; i2 < d79Var.getChildCount(); i2++) {
                View childAt = d79Var.getChildAt(i2);
                if (childAt instanceof e3a) {
                    e3a e3aVar = (e3a) childAt;
                    if (arrayList2.contains(e3aVar.getBoost())) {
                        ema emaVar = e3aVar.e;
                        ff0 ff0Var = e3aVar.d;
                        int i3 = e3aVar.K.cooldown_until_date;
                        if (i3 > 0) {
                            e3aVar.setSubtitle(ob6.a0(null, null, 2131753587, e3a.f((i3 * 1000) - System.currentTimeMillis())));
                            ff0Var.setAlpha(0.65f);
                            emaVar.setAlpha(0.65f);
                            e3aVar.i(false, 0.3f);
                        } else {
                            e3aVar.setSubtitle(ob6.a0(null, null, 2131753654, ob6.D0().n0().format(new Date(e3aVar.K.expires * 1000))));
                            if (ff0Var.getAlpha() < 1.0f) {
                                ff0Var.animate().alpha(1.0f).start();
                                emaVar.animate().alpha(1.0f).start();
                                e3aVar.i(true, 1.0f);
                            } else {
                                ff0Var.setAlpha(1.0f);
                                emaVar.setAlpha(1.0f);
                                e3aVar.i(false, 1.0f);
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
