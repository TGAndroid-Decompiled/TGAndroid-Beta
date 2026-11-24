package defpackage;

import android.os.CountDownTimer;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.tgnet.tl.TL_stories;
public final class p19 extends CountDownTimer {
    public final u19 a;

    public p19(u19 u19Var) {
        super(Long.MAX_VALUE, 1000L);
        this.a = u19Var;
    }

    @Override
    public final void onTick(long j) {
        u19 u19Var = this.a;
        o39 o39Var = u19Var.n1;
        ArrayList arrayList = u19Var.T1;
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
            for (int i2 = 0; i2 < o39Var.getChildCount(); i2++) {
                View childAt = o39Var.getChildAt(i2);
                if (childAt instanceof kz9) {
                    kz9 kz9Var = (kz9) childAt;
                    if (arrayList2.contains(kz9Var.getBoost())) {
                        jia jiaVar = kz9Var.e;
                        df0 df0Var = kz9Var.d;
                        int i3 = kz9Var.K.cooldown_until_date;
                        if (i3 > 0) {
                            kz9Var.setSubtitle(k96.a0(null, null, 2131753591, kz9.f((i3 * 1000) - System.currentTimeMillis())));
                            df0Var.setAlpha(0.65f);
                            jiaVar.setAlpha(0.65f);
                            kz9Var.i(false, 0.3f);
                        } else {
                            kz9Var.setSubtitle(k96.a0(null, null, 2131753658, k96.D0().n0().format(new Date(kz9Var.K.expires * 1000))));
                            if (df0Var.getAlpha() < 1.0f) {
                                df0Var.animate().alpha(1.0f).start();
                                jiaVar.animate().alpha(1.0f).start();
                                kz9Var.i(true, 1.0f);
                            } else {
                                df0Var.setAlpha(1.0f);
                                jiaVar.setAlpha(1.0f);
                                kz9Var.i(false, 1.0f);
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
