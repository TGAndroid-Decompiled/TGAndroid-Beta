package c3;

import android.animation.ObjectAnimator;
import bi.ce;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.yl;
public final class s implements tb {
    public long f6092a;

    @Override
    public void Q0(ub ubVar, fb fbVar, pg pgVar, yl ylVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        ylVar.accept(Float.valueOf(ubVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f6092a);
        ofFloat.setInterpolator(ut.d);
        ofFloat.addListener(new ce(fbVar, pgVar, 17));
        ofFloat.addUpdateListener(new bh.b0(14, ylVar, ubVar));
        ofFloat.start();
    }

    public boolean a(of.m mVar) {
        if (mVar.f7735b == this.f6092a && of.a.c(mVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void o(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, ubVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(ut.f33490c);
        ofFloat.addListener(new ce(fbVar, dbVar, 18));
        ofFloat.addUpdateListener(new bh.b0(13, gbVar, ubVar));
        ofFloat.start();
    }
}
